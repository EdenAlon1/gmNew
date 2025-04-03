package defpackage;

import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mxw {
    public static final int a(int i) {
        return i == 7 ? 6 : 3;
    }

    public static final long b(mxx mxxVar) {
        Throwable th = mxxVar.a;
        if ((th instanceof lrg) || (th instanceof FileNotFoundException) || (th instanceof lxg) || (th instanceof mye)) {
            return -9223372036854775807L;
        }
        while (th != null) {
            if ((th instanceof lwr) && ((lwr) th).a == 2008) {
                return -9223372036854775807L;
            }
            th = th.getCause();
        }
        return Math.min((mxxVar.b - 1) * 1000, 5000);
    }
}
