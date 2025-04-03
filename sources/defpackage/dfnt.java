package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import j$.util.Objects;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dfnt extends BroadcastReceiver {
    public static SoftReference a;
    private static SoftReference b;

    protected abstract int a(Context context, CloudMessage cloudMessage);

    protected void b(Bundle bundle) {
        throw null;
    }

    public final int c(Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            b(extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        ExecutorService executorService;
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        synchronized (dfnt.class) {
            SoftReference softReference = b;
            ExecutorService executorService2 = softReference != null ? (ExecutorService) softReference.get() : null;
            if (executorService2 == null) {
                dgxv dgxvVar = dgxw.a;
                executorService2 = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new dfze("firebase-iid-executor")));
                b = new SoftReference(executorService2);
            }
            executorService = executorService2;
        }
        executorService.execute(new Runnable() { // from class: dfnq
            @Override // java.lang.Runnable
            public final void run() {
                Executor executor;
                int i;
                Intent intent2 = intent;
                BroadcastReceiver.PendingResult pendingResult = goAsync;
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    Intent intent3 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    final Context context2 = context;
                    dfnt dfntVar = dfnt.this;
                    if (intent3 != null) {
                        i = dfntVar.c(intent3);
                    } else if (intent2.getExtras() == null) {
                        i = 500;
                    } else {
                        final CloudMessage cloudMessage = new CloudMessage(intent2);
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        synchronized (dfnt.class) {
                            SoftReference softReference2 = dfnt.a;
                            executor = softReference2 != null ? (Executor) softReference2.get() : null;
                            if (executor == null) {
                                dgxv dgxvVar2 = dgxw.a;
                                executor = dgxv.c(new dfze("pscm-ack-executor"));
                                dfnt.a = new SoftReference(executor);
                            }
                        }
                        executor.execute(new Runnable() { // from class: dfnp
                            @Override // java.lang.Runnable
                            public final void run() {
                                dhre c;
                                CloudMessage cloudMessage2 = cloudMessage;
                                if (TextUtils.isEmpty(cloudMessage2.b())) {
                                    c = dhrt.c(null);
                                } else {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("google.message_id", cloudMessage2.b());
                                    Integer a2 = cloudMessage2.a();
                                    if (a2 != null) {
                                        bundle.putInt("google.product_id", a2.intValue());
                                    }
                                    Context context3 = context2;
                                    bundle.putBoolean("supports_message_handled", true);
                                    c = dfog.b(context3).c(2, bundle);
                                }
                                final CountDownLatch countDownLatch2 = countDownLatch;
                                c.o(new Executor() { // from class: dfnr
                                    @Override // java.util.concurrent.Executor
                                    public final void execute(Runnable runnable) {
                                        runnable.run();
                                    }
                                }, new dhqs() { // from class: dfns
                                    @Override // defpackage.dhqs
                                    public final void a(dhre dhreVar) {
                                        countDownLatch2.countDown();
                                    }
                                });
                            }
                        });
                        int a2 = dfntVar.a(context2, cloudMessage);
                        try {
                            if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                                Log.w("CloudMessagingReceiver", "Message ack timed out");
                            }
                        } catch (InterruptedException e) {
                            Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e.toString()));
                        }
                        i = a2;
                    }
                    if (isOrderedBroadcast && pendingResult != null) {
                        pendingResult.setResultCode(i);
                    }
                } finally {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                }
            }
        });
    }
}
