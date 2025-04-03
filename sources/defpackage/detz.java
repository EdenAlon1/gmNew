package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class detz {
    private static volatile detz b;
    public final Context a;

    private detz(Context context) {
        this.a = context;
    }

    public static detz a() {
        detz detzVar = b;
        if (detzVar != null) {
            return detzVar;
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (b == null) {
            synchronized (detz.class) {
                if (b == null) {
                    b = new detz(context);
                }
            }
        }
    }

    public final detv c() {
        return new dety(this.a);
    }
}
