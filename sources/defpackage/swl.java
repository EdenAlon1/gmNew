package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class swl {
    public static final void a(final sxf sxfVar, final fnx fnxVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(618433333);
        if (i3 == 0) {
            i2 = (true != b.D(sxfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(fnxVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            eey a = efb.a(0, b, 3);
            b.v(-1650679304);
            boolean z = (i2 & 14) == 4;
            boolean z2 = (i2 & 112) == 32;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if ((z2 | z) || R == hfc.a) {
                R = new ffji() { // from class: svx
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        edp edpVar = (edp) obj;
                        edpVar.getClass();
                        List list = sxf.this.a;
                        edpVar.a(list.size(), null, new swj(list), new hpw(-632812321, true, new swk(list, fnxVar)));
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            edh.a(null, a, null, false, null, null, null, false, null, (ffji) R, b, 0, 509);
            if (sxfVar.b) {
                b.v(-1650670091);
                boolean D = z | b.D(a);
                Object R2 = hfmVar.R();
                if (D || R2 == hfc.a) {
                    R2 = new swi(a, sxfVar, null);
                    hfmVar.ad(R2);
                }
                hfmVar.Z();
                hgs.g(a, (ffjm) R2, b);
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: svy
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    sxf sxfVar2 = sxf.this;
                    int i4 = i;
                    swl.a(sxfVar2, fnxVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final sxg sxgVar, final fnx fnxVar, hfd hfdVar, final int i) {
        int i2;
        sxgVar.getClass();
        fnxVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-1169255637);
        if (i3 == 0) {
            i2 = (true != b.D(sxgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(fnxVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else if (sxgVar instanceof sxf) {
            a((sxf) sxgVar, fnxVar, b, i2 & 112);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: svz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    sxg sxgVar2 = sxg.this;
                    int i4 = i;
                    swl.b(sxgVar2, fnxVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
