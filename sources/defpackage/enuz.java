package defpackage;

import android.os.Build;
import android.util.Log;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enuz extends enuq {
    static final boolean a;
    static final boolean b;
    static final boolean c;
    public static final AtomicReference d;
    private static final AtomicLong e;
    private static final ConcurrentLinkedQueue f;
    private volatile ento g;

    static {
        a = Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT);
        b = "goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE);
        c = "eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE);
        d = new AtomicReference();
        e = new AtomicLong();
        f = new ConcurrentLinkedQueue();
    }

    public enuz(String str) {
        super(str);
        if (a || b) {
            this.g = new enur().a(d());
            return;
        }
        if (!c) {
            this.g = null;
            return;
        }
        envb envbVar = envd.c;
        String str2 = envbVar.a;
        int i = envbVar.f;
        this.g = new envb(2, Level.OFF, envbVar.c, envbVar.d, envbVar.e).a(d());
    }

    public static void e() {
        while (true) {
            enuz enuzVar = (enuz) enux.a.poll();
            if (enuzVar == null) {
                f();
                return;
            }
            enuzVar.g = ((enus) d.get()).a(enuzVar.d());
        }
    }

    private static void f() {
        while (true) {
            enuy enuyVar = (enuy) f.poll();
            if (enuyVar == null) {
                return;
            }
            e.getAndDecrement();
            entl entlVar = enuyVar.b;
            ento entoVar = enuyVar.a;
            if (entlVar.S() || entoVar.c(entlVar.m())) {
                entoVar.b(entlVar);
            }
        }
    }

    @Override // defpackage.ento
    public final void b(entl entlVar) {
        if (this.g != null) {
            this.g.b(entlVar);
            return;
        }
        if (e.incrementAndGet() > 20) {
            f.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f.offer(new enuy(this, entlVar));
        if (this.g != null) {
            f();
        }
    }

    @Override // defpackage.ento
    public final boolean c(Level level) {
        return this.g == null || this.g.c(level);
    }

    @Override // defpackage.enuq, defpackage.ento
    public final void g(RuntimeException runtimeException, entl entlVar) {
        if (this.g != null) {
            this.g.g(runtimeException, entlVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }
}
