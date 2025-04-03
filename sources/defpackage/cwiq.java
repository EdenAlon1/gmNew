package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwiq {
    public static final void a(final dlsr dlsrVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-262230002);
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
            b.v(992021306);
            boolean F = b.F(gE) | ((i2 & 14) == 4) | b.F(lkrVar);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new ffji() { // from class: cwid
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((hgp) obj).getClass();
                        dlsr dlsrVar2 = dlsr.this;
                        cwij cwijVar = new cwij(dlsrVar2, dlsrVar2.f);
                        gE.b(lkrVar, cwijVar);
                        return new cwik(cwijVar);
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hgs.c(dlsrVar, (ffji) R, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cwie
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    cwiq.a(dlsr.this, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(hzi hziVar, hfd hfdVar, final int i) {
        int i2;
        final hzi hziVar2;
        hziVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(1947308496);
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
            jgp jgpVar = (jgp) b.e(jdr.o);
            b.v(1508304599);
            boolean D = b.D(jgpVar) | ((i2 & 14) == 4) | b.F(dsmaVar) | b.F(view);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                hziVar2 = hziVar;
                cwin cwinVar = new cwin(jgpVar, hziVar2, dsmaVar, view, null);
                hfmVar.ad(cwinVar);
                R = cwinVar;
            } else {
                hziVar2 = hziVar;
            }
            hfmVar.Z();
            hgs.g(jgpVar, (ffjm) R, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cwif
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cwiq.b(hzi.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.cwic r16, defpackage.hfd r17, final int r18) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwiq.c(cwic, hfd, int):void");
    }

    private static final cwhb d(hkx hkxVar) {
        return (cwhb) hkxVar.a();
    }

    private static final cwhf e(hkx hkxVar) {
        return (cwhf) hkxVar.a();
    }
}
