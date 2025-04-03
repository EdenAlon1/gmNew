package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class euwd extends Service {
    private Binder a;
    private final Object b;
    private int c;
    private int d;
    final ExecutorService g;

    public euwd() {
        dgxv dgxvVar = dgxw.a;
        this.g = dgxv.c(new dfze("Firebase-Messaging-Intent-Handle"));
        this.b = new Object();
        this.d = 0;
    }

    public final dhre d(final Intent intent) {
        final dhri dhriVar = new dhri();
        this.g.execute(new Runnable() { // from class: euwb
            @Override // java.lang.Runnable
            public final void run() {
                euwd euwdVar = euwd.this;
                Intent intent2 = intent;
                dhri dhriVar2 = dhriVar;
                try {
                    euwdVar.f(intent2);
                } finally {
                    dhriVar2.b(null);
                }
            }
        });
        return dhriVar.a;
    }

    public final void e(Intent intent) {
        if (intent != null) {
            euxz.b(intent);
        }
        synchronized (this.b) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                stopSelfResult(this.c);
            }
        }
    }

    public abstract void f(Intent intent);

    protected Intent g() {
        throw null;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.a == null) {
            this.a = new euyc(new euwc(this));
        }
        return this.a;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.g.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.b) {
            this.c = i2;
            this.d++;
        }
        Intent g = g();
        if (g == null) {
            e(intent);
            return 2;
        }
        dhre d = d(g);
        if (d.l()) {
            e(intent);
            return 2;
        }
        d.o(new Executor() { // from class: euvz
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new dhqs() { // from class: euwa
            @Override // defpackage.dhqs
            public final void a(dhre dhreVar) {
                euwd.this.e(intent);
            }
        });
        return 3;
    }
}
