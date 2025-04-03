package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ewzc {
    static {
        int i = ewyz.a;
    }

    public static void c() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Must not be on main thread");
        }
    }

    public ewyx a(ewyw ewywVar) {
        c();
        return ewyx.a;
    }

    public exap b(exal exalVar) {
        throw null;
    }
}
