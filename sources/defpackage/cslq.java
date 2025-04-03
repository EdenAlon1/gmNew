package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cslq {
    public static final Handler a = new Handler(Looper.getMainLooper());

    @Deprecated
    public static void a(Runnable runnable) {
        a.removeCallbacks(runnable);
    }

    public static void b(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            f(runnable);
        }
    }

    @Deprecated
    public static void c(Runnable runnable, long j) {
        g(runnable, j, false);
    }

    @Deprecated
    public static void d(Runnable runnable, long j) {
        g(runnable, j, true);
    }

    public static void e(Runnable runnable) {
        if (efbd.g()) {
            runnable.run();
        } else {
            efbd.e(runnable);
        }
    }

    @Deprecated
    public static void f(Runnable runnable) {
        if (csix.n()) {
            runnable.run();
        } else {
            a.post(runnable);
        }
    }

    private static void g(Runnable runnable, long j, boolean z) {
        csix.k(j <= 2147483647L);
        Handler handler = a;
        if (z) {
            handler.removeCallbacks(runnable);
        }
        handler.postDelayed(runnable, j);
    }
}
