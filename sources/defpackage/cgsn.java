package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgsn {
    public static final boolean a(fipy fipyVar) {
        fipy b = fipyVar.b();
        if ((b instanceof fiqc) || (b instanceof fiph)) {
            return true;
        }
        if (b == null) {
            return false;
        }
        fipy b2 = fipyVar.b();
        b2.getClass();
        return a(b2);
    }

    public static final boolean b(dltq dltqVar) {
        dltqVar.getClass();
        return (dltqVar instanceof dlto) && c(((dlto) dltqVar).a);
    }

    public static final boolean c(dlus dlusVar) {
        return dlusVar == dlus.i || dlusVar == dlus.j;
    }

    public static final boolean d(List list) {
        if (list.isEmpty()) {
            return false;
        }
        dltq dltqVar = (dltq) ffdx.P(list);
        if (b(dltqVar)) {
            return true;
        }
        if (list.size() >= 2) {
            for (int size = list.size() - 2; size >= 0; size--) {
                dltq dltqVar2 = (dltq) list.get(size);
                if (b(dltqVar2) && dltqVar2.a() >= dltqVar.a() && dltqVar2.b() <= dltqVar.b()) {
                    return true;
                }
            }
        }
        return false;
    }
}
