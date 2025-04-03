package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehuo {
    private static ehvm a;

    public static synchronized ehvm a(Context context) {
        ehvm ehvmVar;
        synchronized (ehuo.class) {
            if (a == null) {
                a = new ehvm(new ehuv(ehwt.a(context)));
            }
            ehvmVar = a;
        }
        return ehvmVar;
    }
}
