package defpackage;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahvv {
    public static final void a(final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(2145760288);
        if (i3 == 0) {
            i2 = (true != b.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            final ahvt ahvtVar = new ahvt(ffixVar);
            final lkr lkrVar = (lkr) b.e(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            int i4 = acz.a;
            acd a = acz.a(b);
            if (a == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            final aca gE = a.gE();
            b.v(1353868177);
            boolean F = b.F(gE) | b.F(lkrVar) | b.D(ahvtVar);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new ffji() { // from class: ahvq
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((hgp) obj).getClass();
                        aca acaVar = aca.this;
                        lkr lkrVar2 = lkrVar;
                        ahvt ahvtVar2 = ahvtVar;
                        acaVar.b(lkrVar2, ahvtVar2);
                        return new ahvs(ahvtVar2);
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hgs.c(ahvtVar, (ffji) R, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: ahvr
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    ahvv.a(ffix.this, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final fgdj fgdjVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        hviVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(605007432);
        if (i3 == 0) {
            i2 = (true != b.F(fgdjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            ahvn ahvnVar = (ahvn) hkf.a(fgdjVar, b).a();
            if (!ahvnVar.a) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: ahvo
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            fgdj fgdjVar2 = fgdj.this;
                            int i4 = i;
                            ahvv.b(fgdjVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            b.v(2070608271);
            c = ebs.c(hviVar, 1.0f);
            if (ahvnVar.e.a) {
                c = c.a(ecm.b(hvi.e, new eat(ecv.f(b), 32)));
            }
            ((hfm) b).Z();
            C0001for.a(c, null, 0L, 0L, 0.0f, hpx.d(-1261529972, new ahvu(ahvnVar), b), b, 1572864, 62);
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: ahvp
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fgdj fgdjVar2 = fgdj.this;
                    int i4 = i;
                    ahvv.b(fgdjVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
