package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bim {
    private static volatile Handler a;

    private bim() {
    }

    public static Handler a() {
        if (a == null) {
            synchronized (bim.class) {
                if (a == null) {
                    a = kqv.a(Looper.getMainLooper());
                }
            }
        }
        return a;
    }
}
