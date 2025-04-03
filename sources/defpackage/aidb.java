package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aidb {
    public static final void a(final List list, final boolean z, hfd hfdVar, final int i, final int i2) {
        int i3;
        List list2;
        int i4 = i2 & 1;
        hfd b = hfdVar.b(1830594674);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.F(list) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        boolean z2 = i5 == 0;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != b.E(false) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
        } else {
            z &= z2;
            boolean z3 = !list.isEmpty();
            if (z && list.size() == 1) {
                dmyy dmyyVar = (dmyy) list.get(0);
                list2 = ffdx.b(new dmyy(dmyyVar.a, dmyyVar.b, dmyyVar.c, null));
            } else {
                list2 = list;
            }
            cru.b(z3, null, ctt.k(null, null, 15).a(ctt.l(null, 3)), ctt.q(null, null, 15).a(ctt.m(null, 3)), null, hpx.d(636712266, new aida(list2), b), b, 200064, 18);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: aicv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    List list3 = list;
                    int i6 = i;
                    aidb.a(list3, z, (hfd) obj, hip.a(i6 | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }
}
