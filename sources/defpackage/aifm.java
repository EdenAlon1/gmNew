package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aifm {
    public static final void a(final aidv aidvVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hvi b;
        ebe ebfVar;
        hfm hfmVar;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-2711155);
        if (i3 == 0) {
            i2 = (true != b2.D(aidvVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b2.I()) {
            b2.s();
        } else {
            eey a = efb.a(0, b2, 3);
            if (aidvVar.b.isEmpty()) {
                b = ebs.d(hvi.e, 1.0f);
            } else {
                d = ebs.d(hvi.e, 1.0f);
                b = ebs.b(d, 1.0f);
            }
            b2.v(-168027658);
            if (!aidvVar.d.a || aidvVar.b.isEmpty()) {
                ebfVar = new ebf(0.0f, 0.0f, 0.0f, 0.0f);
            } else {
                jzn jznVar = (jzn) b2.e(jdr.e);
                ebfVar = eba.h(0.0f, 0.0f, 0.0f, jznVar.ek(ecv.f(b2).a(jznVar)), 7);
            }
            hfm hfmVar2 = (hfm) b2;
            hfmVar2.Z();
            b2.v(-168017566);
            int i4 = i2 & 14;
            Object R = hfmVar2.R();
            if (i4 == 4 || R == hfc.a) {
                R = new ffji() { // from class: aiey
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        edp edpVar = (edp) obj;
                        edpVar.getClass();
                        aidv aidvVar2 = aidv.this;
                        if (!aidvVar2.b.isEmpty()) {
                            eek.a(edpVar, aidvVar2.a, aidg.a, 2);
                        }
                        List list = aidvVar2.b;
                        edpVar.a(list.size(), new aifj(new ffji() { // from class: aifa
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj2) {
                                aiex aiexVar = (aiex) obj2;
                                aiexVar.getClass();
                                return aiexVar.b();
                            }
                        }, list), new aifk(list), new hpw(-632812321, true, new aifl(list)));
                        return ffcu.a;
                    }
                };
                hfmVar2.ad(R);
            }
            hfmVar2.Z();
            boolean z = true;
            edh.a(b, a, ebfVar, false, null, null, null, false, null, (ffji) R, b2, 0, 504);
            String str = aidvVar.a;
            b2.v(-167998863);
            if (i4 != 4) {
                z = false;
            }
            boolean D = z | b2.D(a);
            Object R2 = hfmVar2.R();
            if (D || R2 == hfc.a) {
                R2 = new aifi(aidvVar, a, null);
                hfmVar = hfmVar2;
                hfmVar.ad(R2);
            } else {
                hfmVar = hfmVar2;
            }
            hfmVar.Z();
            hgs.g(str, (ffjm) R2, b2);
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: aiez
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    aifm.a(aidv.this, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
