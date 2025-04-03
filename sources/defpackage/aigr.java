package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aigr {
    public static final void a(final dlsr dlsrVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-751004654);
        if (i3 == 0) {
            i2 = (true != b.D(dlsrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            final lkr lkrVar = (lkr) b.e(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            int i4 = acz.a;
            acd a = acz.a(b);
            if (a == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            final aca gE = a.gE();
            b.v(-765499196);
            boolean F = b.F(gE) | ((i2 & 14) == 4) | b.F(lkrVar);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new ffji() { // from class: aigj
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((hgp) obj).getClass();
                        dlsr dlsrVar2 = dlsr.this;
                        aigm aigmVar = new aigm(dlsrVar2, dlsrVar2.f);
                        gE.b(lkrVar, aigmVar);
                        return new aign(aigmVar);
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hgs.c(dlsrVar, (ffji) R, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: aigk
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    aigr.a(dlsr.this, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final fgdj fgdjVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-383786493);
        if (i3 == 0) {
            i2 = (true != b.F(fgdjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            hkx a = hkf.a(fgdjVar, b);
            dotb dotbVar = d(a).a;
            List list = d(a).c;
            aidv aidvVar = d(a).b;
            b.v(-2094516160);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new hzi();
                hfmVar.ad(R);
            }
            hzi hziVar = (hzi) R;
            hfmVar.Z();
            a(d(a).a.b, b, 0);
            hve hveVar = hvi.e;
            dxq dxqVar = dxu.c;
            int i4 = huo.a;
            ipn a2 = dyo.a(dxqVar, hum.j, b, 0);
            int a3 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hveVar);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a2, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            b.v(-801801042);
            aige aigeVar = d(a).d;
            hfmVar.Z();
            doti.b(dotbVar, null, null, hziVar, false, b, 3072, 22);
            b.v(-801795095);
            if (aidvVar.b.isEmpty()) {
                aige aigeVar2 = d(a).d;
                aidb.a(list, false, b, 0, 2);
            }
            hfmVar.Z();
            aifm.a(aidvVar, b, 0);
            b.n();
            if (dotbVar.a instanceof dosi) {
                d(a);
                c(hziVar, b, 6);
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: aigl
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    aigr.b(fgdj.this, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(hzi hziVar, hfd hfdVar, final int i) {
        int i2;
        final hzi hziVar2;
        hziVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-1689991980);
        if (i3 == 0) {
            i2 = (true != b.D(hziVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hziVar2 = hziVar;
        } else {
            View view = (View) b.e(AndroidCompositionLocals_androidKt.g);
            dsma dsmaVar = (dsma) b.e(dsmp.a);
            b.v(1987724521);
            boolean z = (i2 & 14) == 4;
            boolean F = b.F(dsmaVar) | z | b.F(view);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new aigo(hziVar, dsmaVar, view, null);
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hgs.g(hziVar, (ffjm) R, b);
            b.v(-988684931);
            final lkr lkrVar = (lkr) b.e(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            b.v(-1465750272);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                hic hicVar = new hic(lki.ON_ANY, hla.a);
                hfmVar.ad(hicVar);
                R2 = hicVar;
            }
            final hho hhoVar = (hho) R2;
            hfmVar.Z();
            b.v(-1465747338);
            boolean F2 = b.F(lkrVar);
            Object R3 = hfmVar.R();
            if (F2 || R3 == hfc.a) {
                R3 = new ffji() { // from class: aigi
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((hgp) obj).getClass();
                        final hho hhoVar2 = hhoVar;
                        lkp lkpVar = new lkp() { // from class: aigh
                            @Override // defpackage.lkp
                            public final void hg(lkr lkrVar2, lki lkiVar) {
                                hho.this.b(lkiVar);
                            }
                        };
                        lkr lkrVar2 = lkr.this;
                        lkrVar2.P().c(lkpVar);
                        return new aigq(lkrVar2, lkpVar);
                    }
                };
                hfmVar.ad(R3);
            }
            hfmVar.Z();
            hgs.c(lkrVar, (ffji) R3, b);
            lki lkiVar = (lki) hhoVar.a();
            hfmVar.Z();
            b.v(1987734537);
            boolean D = b.D(lkiVar) | z | b.F(dsmaVar) | b.F(view);
            Object R4 = hfmVar.R();
            if (D || R4 == hfc.a) {
                hziVar2 = hziVar;
                aigp aigpVar = new aigp(lkiVar, hziVar2, dsmaVar, view, null);
                hfmVar.ad(aigpVar);
                R4 = aigpVar;
            } else {
                hziVar2 = hziVar;
            }
            hfmVar.Z();
            hgs.g(lkiVar, (ffjm) R4, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: aigg
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    aigr.c(hzi.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    private static final aigf d(hkx hkxVar) {
        return (aigf) hkxVar.a();
    }
}
