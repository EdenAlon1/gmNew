package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abhw {
    public static final void a(final abhr abhrVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1685954793);
        if (i3 == 0) {
            i2 = (true != b.D(abhrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            ebe h = eba.h(0.0f, 30.0f, 0.0f, 20.0f, 5);
            b.v(1572464740);
            int i4 = i2 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new ffji() { // from class: abhs
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        edp edpVar = (edp) obj;
                        edpVar.getClass();
                        eek.a(edpVar, null, abhq.a, 3);
                        List list = abhr.this.a;
                        edpVar.a(list.size(), null, new abhu(list), new hpw(-632812321, true, new abhv(list)));
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            edh.a(null, null, h, false, null, null, null, false, null, (ffji) R, b, 384, 507);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abht
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    abhw.a(abhr.this, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
