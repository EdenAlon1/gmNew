package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class deup {
    public static deuo c;
    private static final Object d = new Object();
    protected final String a;
    protected final Object b;

    protected deup(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public static void b(Context context) {
        synchronized (d) {
            if (c == null) {
                c = new deuo(context.getContentResolver());
            }
        }
    }

    public abstract Object a();
}
