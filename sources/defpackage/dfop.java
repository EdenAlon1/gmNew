package defpackage;

import android.app.BroadcastOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfop {
    public static final Executor a = new Executor() { // from class: dfoi
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };
    public static final Pattern b = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    private static int h;
    private static PendingIntent i;
    public final Context d;
    public final dfoh e;
    public Messenger f;
    public CloudMessagingMessengerCompat g;
    private final ScheduledExecutorService j;
    public final cpn c = new cpn();
    private final Messenger k = new Messenger(new dfoo(this, Looper.getMainLooper()));

    public dfop(Context context) {
        this.d = context;
        this.e = new dfoh(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.j = scheduledThreadPoolExecutor;
    }

    public static boolean d(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    private static synchronized String e() {
        String num;
        synchronized (dfop.class) {
            int i2 = h;
            h = i2 + 1;
            num = Integer.toString(i2);
        }
        return num;
    }

    private static synchronized void f(Context context, Intent intent) {
        synchronized (dfop.class) {
            if (i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                i = dgxs.a(context, intent2, dgxs.a);
            }
            intent.putExtra("app", i);
        }
    }

    public final dhre a(Bundle bundle) {
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle2;
        final String e = e();
        final dhri dhriVar = new dhri();
        synchronized (this.c) {
            this.c.put(e, dhriVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.e.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        f(this.d, intent);
        intent.putExtra("kid", a.a(e, "|ID|", "|"));
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(String.valueOf(intent.getExtras()))));
        }
        intent.putExtra("google.messenger", this.k);
        if (this.f != null || this.g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.g.b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.j.schedule(new Runnable() { // from class: dfom
                @Override // java.lang.Runnable
                public final void run() {
                    Executor executor = dfop.a;
                    if (dhri.this.c(new IOException("TIMEOUT"))) {
                        Log.w("Rpc", "No response");
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            dhriVar.a.o(a, new dhqs() { // from class: dfon
                @Override // defpackage.dhqs
                public final void a(dhre dhreVar) {
                    String str = e;
                    dfop dfopVar = dfop.this;
                    synchronized (dfopVar.c) {
                        dfopVar.c.remove(str);
                    }
                    schedule.cancel(false);
                }
            });
            return dhriVar.a;
        }
        if (this.e.b() == 2) {
            Context context = this.d;
            if (Build.VERSION.SDK_INT < 34) {
                context.sendBroadcast(intent);
            } else {
                makeBasic = BroadcastOptions.makeBasic();
                shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                bundle2 = shareIdentityEnabled.toBundle();
                context.sendBroadcast(intent, null, bundle2);
            }
        } else {
            this.d.startService(intent);
        }
        final ScheduledFuture schedule2 = this.j.schedule(new Runnable() { // from class: dfom
            @Override // java.lang.Runnable
            public final void run() {
                Executor executor = dfop.a;
                if (dhri.this.c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        dhriVar.a.o(a, new dhqs() { // from class: dfon
            @Override // defpackage.dhqs
            public final void a(dhre dhreVar) {
                String str = e;
                dfop dfopVar = dfop.this;
                synchronized (dfopVar.c) {
                    dfopVar.c.remove(str);
                }
                schedule2.cancel(false);
            }
        });
        return dhriVar.a;
    }

    public final dhre b(final Bundle bundle) {
        if (this.e.a() < 12000000) {
            return this.e.b() != 0 ? a(bundle).e(a, new dhqh() { // from class: dfoj
                @Override // defpackage.dhqh
                public final Object a(dhre dhreVar) {
                    if (!dhreVar.m() || !dfop.d((Bundle) dhreVar.i())) {
                        return dhreVar;
                    }
                    return dfop.this.a(bundle).g(dfop.a, new dhrd() { // from class: dfol
                        @Override // defpackage.dhrd
                        public final dhre a(Object obj) {
                            Bundle bundle2 = (Bundle) obj;
                            return dfop.d(bundle2) ? dhrt.c(null) : dhrt.c(bundle2);
                        }
                    });
                }
            }) : dhrt.b(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        dfog b2 = dfog.b(this.d);
        return b2.d(new dfof(b2.a(), bundle)).c(a, new dhqh() { // from class: dfok
            @Override // defpackage.dhqh
            public final Object a(dhre dhreVar) {
                Executor executor = dfop.a;
                if (dhreVar.m()) {
                    return (Bundle) dhreVar.i();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(String.valueOf(dhreVar.h()))));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", dhreVar.h());
            }
        });
    }

    public final void c(String str, Bundle bundle) {
        synchronized (this.c) {
            dhri dhriVar = (dhri) this.c.remove(str);
            if (dhriVar == null) {
                Log.w("Rpc", a.t(str, "Missing callback for "));
            } else {
                dhriVar.b(bundle);
            }
        }
    }
}
