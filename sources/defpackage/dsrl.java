package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsrl {
    public static final void a(final hkx hkxVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(735357797);
        if (i3 == 0) {
            i2 = (true != b.D(hkxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            View view = (View) b.e(AndroidCompositionLocals_androidKt.g);
            b.v(1094369204);
            boolean D = b.D(view);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                ViewParent parent = view.getParent();
                kei keiVar = parent instanceof kei ? (kei) parent : null;
                Window a = keiVar != null ? keiVar.a() : null;
                R = a != null ? new kxp(a, view) : null;
                hfmVar.ad(R);
            }
            final kxp kxpVar = (kxp) R;
            hfmVar.Z();
            if (kxpVar == null) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: dsrb
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int i4 = i;
                            dsrl.a(hkx.this, (hfd) obj, hip.a(i4 | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            Boolean valueOf = Boolean.valueOf(b(hkxVar));
            b.v(1094377538);
            boolean F = b.F(kxpVar) | ((i2 & 14) == 4);
            Object R2 = hfmVar.R();
            if (F || R2 == hfc.a) {
                R2 = new dsrj(kxpVar, hkxVar, null);
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            hgs.g(valueOf, (ffjm) R2, b);
            ffcu ffcuVar = ffcu.a;
            b.v(1094383833);
            boolean F2 = b.F(kxpVar);
            Object R3 = hfmVar.R();
            if (F2 || R3 == hfc.a) {
                R3 = new ffji() { // from class: dsrc
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((hgp) obj).getClass();
                        kxp kxpVar2 = kxp.this;
                        boolean d = kxpVar2.d();
                        boolean c = kxpVar2.c();
                        kxpVar2.b(false);
                        kxpVar2.a(false);
                        return new dsrk(kxpVar2, d, c);
                    }
                };
                hfmVar.ad(R3);
            }
            hfmVar.Z();
            hgs.c(ffcuVar, (ffji) R3, b);
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: dsrd
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dsrl.a(hkx.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final boolean b(hkx hkxVar) {
        return ((Boolean) hkxVar.a()).booleanValue();
    }

    public static final void c(final dspo dspoVar, final god godVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1625947891);
        if (i3 == 0) {
            i2 = (true != b.D(dspoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(godVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            dsrs dsrsVar = dspoVar.b;
            b.v(426083793);
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            boolean z2 = (i2 & 112) == 32;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            boolean z3 = z2 | z;
            byte[] bArr = null;
            if (z3 || R == hfc.a) {
                fffs fffsVar = new fffs(7);
                fffsVar.add(new dsqd(bArr));
                fffsVar.add(new dsqe(bArr));
                fffsVar.add(new dsqf(bArr));
                fffsVar.add(new dsqk(bArr));
                fffsVar.add(new dsqh(bArr));
                fffsVar.add(new dsqn(bArr));
                if (godVar != null) {
                    fffsVar.add(new dsqo(new hic(null, hla.a), godVar));
                }
                R = new dsqr(ffdx.a(fffsVar), new hic(false, hla.a));
                hfmVar.ad(R);
            }
            dsqr dsqrVar = (dsqr) R;
            hfmVar.Z();
            ffcu ffcuVar = ffcu.a;
            b.v(426105149);
            Object R2 = hfmVar.R();
            if (i4 == 4 || R2 == hfc.a) {
                R2 = new dsrf(dspoVar, null);
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            hgs.g(ffcuVar, (ffjm) R2, b);
            gpa.c(dsrsVar.a, null, gft.a(b).p, 0L, 0.0f, 0.0f, null, hpx.d(-1649688242, new dsri(dsqrVar, dspoVar), b), b, 122);
            a(dsqrVar.b, b, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dsre
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dspo dspoVar2 = dspo.this;
                    int i5 = i;
                    dsrl.c(dspoVar2, godVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
