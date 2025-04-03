package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class biw {
    public static Handler a() {
        return new Handler(Looper.getMainLooper());
    }

    public static void b() {
        ksw.d(d(), "Not in application's main thread");
    }

    public static void c(Runnable runnable) {
        if (d()) {
            runnable.run();
        } else {
            ksw.d(a().post(runnable), "Unable to post to main thread");
        }
    }

    public static boolean d() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
