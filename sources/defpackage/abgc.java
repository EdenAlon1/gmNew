package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abgc {
    public static final void a(final abfu abfuVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1960437657);
        if (i3 == 0) {
            i2 = (true != b.D(abfuVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            b.v(-1907846000);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(Integer.valueOf(abfuVar.b), hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            final hho hhoVar = (hho) R;
            hfmVar.Z();
            ebe h = eba.h(0.0f, 26.0f, 0.0f, 24.0f, 5);
            b.v(-1907840731);
            boolean E = b.E(false) | ((i2 & 14) == 4);
            Object R2 = hfmVar.R();
            if (E || R2 == hfc.a) {
                R2 = new ffji() { // from class: abfv
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        edp edpVar = (edp) obj;
                        edpVar.getClass();
                        abfu abfuVar2 = abfu.this;
                        String str = abfuVar2.c;
                        if (str != null) {
                            eek.a(edpVar, null, new hpw(-1526219694, true, new abfx(str)), 3);
                        }
                        String str2 = abfuVar2.d;
                        if (str2 != null) {
                            eek.a(edpVar, null, new hpw(-1564310533, true, new abfy(str2)), 3);
                        }
                        hho hhoVar2 = hhoVar;
                        List list = abfuVar2.a;
                        edpVar.a(list.size(), null, new abga(list), new hpw(-1091073711, true, new abgb(list, hhoVar2)));
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            edh.a(null, null, h, false, null, null, null, false, null, (ffji) R2, b, 384, 507);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abfw
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    abgc.a(abfu.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
