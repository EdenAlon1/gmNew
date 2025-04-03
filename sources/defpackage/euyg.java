package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euyg implements ServiceConnection {
    private final Context a;
    private final Intent b;
    private final ScheduledExecutorService c;
    private final Queue d;
    private euyc e;
    private boolean f;

    public euyg(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new dfze("Firebase-FirebaseInstanceIdServiceConnection"));
        this.d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    private final void b() {
        while (!this.d.isEmpty()) {
            ((euyf) this.d.poll()).b();
        }
    }

    private final synchronized void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.d.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            euyc euycVar = this.e;
            if (euycVar == null || !euycVar.isBinderAlive()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is dead. start connection? " + (!this.f));
                }
                if (!this.f) {
                    this.f = true;
                    try {
                    } catch (SecurityException e) {
                        Log.e("FirebaseMessaging", "Exception while binding the service", e);
                    }
                    if (!dfyh.a().c(this.a, this.b, this, 65)) {
                        Log.e("FirebaseMessaging", "binding to the service failed");
                        this.f = false;
                        b();
                        return;
                    }
                }
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            final euyf euyfVar = (euyf) this.d.poll();
            euyc euycVar2 = this.e;
            if (Binder.getCallingUid() != Process.myUid()) {
                throw new SecurityException("Binding only allowed within app");
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            euycVar2.a.a.d(euyfVar.a).o(new Executor() { // from class: euya
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    runnable.run();
                }
            }, new dhqs() { // from class: euyb
                @Override // defpackage.dhqs
                public final void a(dhre dhreVar) {
                    euyf.this.b();
                }
            });
        }
    }

    final synchronized dhre a(Intent intent) {
        final euyf euyfVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        euyfVar = new euyf(intent);
        ScheduledExecutorService scheduledExecutorService = this.c;
        final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: euyd
            @Override // java.lang.Runnable
            public final void run() {
                euyf euyfVar2 = euyf.this;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + euyfVar2.a.getAction() + " finishing.");
                euyfVar2.b();
            }
        }, 20L, TimeUnit.SECONDS);
        euyfVar.a().o(scheduledExecutorService, new dhqs() { // from class: euye
            @Override // defpackage.dhqs
            public final void a(dhre dhreVar) {
                schedule.cancel(false);
            }
        });
        this.d.add(euyfVar);
        c();
        return euyfVar.a();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: ".concat(String.valueOf(String.valueOf(componentName))));
        }
        this.f = false;
        if (iBinder instanceof euyc) {
            this.e = (euyc) iBinder;
            c();
        } else {
            Log.e("FirebaseMessaging", "Invalid service connection: ".concat(String.valueOf(String.valueOf(iBinder))));
            b();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: ".concat(String.valueOf(String.valueOf(componentName))));
        }
        c();
    }
}
