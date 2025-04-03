package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvye implements dvwe {
    private final dvvz a;

    public dvye(dvvz dvvzVar) {
        this.a = dvvzVar;
    }

    @Override // defpackage.dvwe
    public final ListenableFuture a(dvwk dvwkVar) {
        eyfw checkIsLite;
        eyfw checkIsLite2;
        if (dvwkVar instanceof dvzx) {
            dvzx dvzxVar = (dvzx) dvwkVar;
            dvxr a = dvzxVar.a();
            checkIsLite = eyfy.checkIsLite(dvyj.a);
            a.b(checkIsLite);
            if (a.r.o(checkIsLite.d)) {
                dvxr a2 = dvzxVar.a();
                checkIsLite2 = eyfy.checkIsLite(dvyj.a);
                a2.b(checkIsLite2);
                Object l = a2.r.l(checkIsLite2.d);
                dvyi dvyiVar = (dvyi) (l == null ? checkIsLite2.b : checkIsLite2.c(l));
                int a3 = dvyh.a(dvyiVar.d);
                if (a3 == 0) {
                    a3 = 1;
                }
                int i = a3 - 1;
                if (i == 1) {
                    if ((dvyiVar.b & 1) != 0) {
                        return erqt.i(dvvz.a(dvyiVar.c));
                    }
                    throw new IllegalArgumentException("GAIA type must have a name");
                }
                if (i == 2) {
                    return erqt.i(new dvvz(3, null));
                }
                if (i == 3) {
                    return erqt.i(new dvvz(2, null));
                }
                if (i == 4) {
                    return erqt.i(this.a);
                }
                throw new IllegalArgumentException("Unknown type");
            }
        }
        return erqt.i(null);
    }
}
