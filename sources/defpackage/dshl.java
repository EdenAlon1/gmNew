package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.v4.app.FragmentContainerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.compose.ui.composable.HugoHostFragment;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dshl {
    public static final void a(final ixm ixmVar, final Object obj, final ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-848504160);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? b.D(ixmVar) : b.F(ixmVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? b.D(obj) : b.F(obj)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffjmVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            Object obj2 = ixmVar.a;
            b.v(-864938955);
            boolean z2 = (i2 & 14) == 4 || ((i2 & 8) != 0 && b.F(ixmVar));
            boolean z3 = (i2 & 896) == 256;
            if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !b.F(obj))) {
                z = false;
            }
            boolean z4 = z2 | z3;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if ((z4 | z) || R == hfc.a) {
                R = new dshk(ixmVar, ffjmVar, obj, null);
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hgs.f(obj2, obj, (ffjm) R, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dsgy
                @Override // defpackage.ffjm
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    ixm ixmVar2 = ixm.this;
                    Object obj5 = obj;
                    int i4 = i;
                    dshl.a(ixmVar2, obj5, ffjmVar, (hfd) obj3, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dsho dshoVar, final hvi hviVar, boolean z, hfd hfdVar, final int i) {
        int i2;
        boolean z2;
        final dsjz dsjzVar;
        hvi g;
        final boolean z3;
        int i3 = i & 6;
        hfd b = hfdVar.b(-783662198);
        if (i3 == 0) {
            i2 = (true != b.D(dshoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        int i4 = i2 | 3456;
        if ((i4 & 1171) == 1170 && b.I()) {
            b.s();
            z3 = z;
        } else {
            b.v(928482382);
            if (dshoVar.d) {
                fxz a = gft.a(b);
                boolean g2 = dooy.g(b);
                a.getClass();
                long j = g2 ? a.J : a.p;
                z2 = true;
                long j2 = a.a;
                int b2 = iby.b(j);
                int b3 = iby.b(j2);
                long j3 = g2 ? a.I : a.v;
                long j4 = a.a;
                long j5 = a.s;
                int b4 = iby.b(j3);
                int b5 = iby.b(j4);
                int b6 = iby.b(j5);
                dsjzVar = new dsjz(a, b5, b6, b2, b3, new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[]{-16842913}}, new int[]{b5, b6}), b4, iby.b(a.a), iby.b(a.b), b2, ColorStateList.valueOf(b6));
            } else {
                z2 = true;
                dsjzVar = null;
            }
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            hviVar.getClass();
            g = huz.g(hviVar, dsgf.a);
            hvi a2 = jfw.a(g, "hugo");
            if (dshoVar.e) {
                b.v(-1281517489);
                b.v(928492217);
                Object R = hfmVar.R();
                if (R == hfc.a) {
                    R = new ixm();
                    hfmVar.ad(R);
                }
                final ixm ixmVar = (ixm) R;
                hfmVar.Z();
                b.v(928496462);
                boolean F = b.F(ixmVar);
                Object R2 = hfmVar.R();
                if (F || R2 == hfc.a) {
                    R2 = new ffji() { // from class: dsha
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            HugoHostFragment hugoHostFragment = (HugoHostFragment) obj;
                            hugoHostFragment.getClass();
                            ixm.this.a = hugoHostFragment;
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R2);
                }
                hfmVar.Z();
                b.w(1765406104);
                b.w(-496803845);
                ljg ljgVar = (ljg) hqr.c(new Object[0], new hrk(ljh.a, lji.a), ljj.a, b, 3072, 4);
                hfmVar.Z();
                lje.a(HugoHostFragment.class, a2, ljgVar, Bundle.EMPTY, (ffji) R2, b, 0);
                b = b;
                hfmVar.Z();
                b.v(928498021);
                b.v(58419866);
                Object R3 = hfmVar.R();
                if (R3 == hfc.a) {
                    R3 = new ffjm() { // from class: dshb
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            HugoHostFragment hugoHostFragment = (HugoHostFragment) obj;
                            dsjz dsjzVar2 = (dsjz) obj2;
                            hugoHostFragment.getClass();
                            if (dsjzVar2 != null) {
                                hugoHostFragment.q(dsjzVar2);
                            }
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R3);
                }
                hfmVar.Z();
                a(ixmVar, dsjzVar, (ffjm) R3, b, 392);
                b.v(58422518);
                Object R4 = hfmVar.R();
                if (R4 == hfc.a) {
                    R4 = new ffjm() { // from class: dshc
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            HugoHostFragment hugoHostFragment = (HugoHostFragment) obj;
                            hugoHostFragment.getClass();
                            hugoHostFragment.ak = (dsgx) obj2;
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R4);
                }
                hfmVar.Z();
                a(ixmVar, null, (ffjm) R4, b, ((i4 >> 6) & 112) | 392);
                dqls dqlsVar = dshoVar.b;
                b.v(58425067);
                Object R5 = hfmVar.R();
                if (R5 == hfc.a) {
                    R5 = new ffjm() { // from class: dshd
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            HugoHostFragment hugoHostFragment = (HugoHostFragment) obj;
                            dqls dqlsVar2 = (dqls) obj2;
                            hugoHostFragment.getClass();
                            dqlsVar2.getClass();
                            hugoHostFragment.ah = dqlsVar2;
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R5);
                }
                hfmVar.Z();
                a(ixmVar, dqlsVar, (ffjm) R5, b, 392);
                dtbg dtbgVar = dshoVar.c;
                b.v(58427242);
                Object R6 = hfmVar.R();
                if (R6 == hfc.a) {
                    R6 = new ffjm() { // from class: dshe
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            HugoHostFragment hugoHostFragment = (HugoHostFragment) obj;
                            dtbg dtbgVar2 = (dtbg) obj2;
                            hugoHostFragment.getClass();
                            dtbgVar2.getClass();
                            hugoHostFragment.ai = dtbgVar2;
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R6);
                }
                hfmVar.Z();
                a(ixmVar, dtbgVar, (ffjm) R6, b, 392);
                dtbv dtbvVar = dshoVar.a;
                b.v(58429314);
                Object R7 = hfmVar.R();
                if (R7 == hfc.a) {
                    R7 = new ffjm() { // from class: dshf
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            HugoHostFragment hugoHostFragment = (HugoHostFragment) obj;
                            dtbv dtbvVar2 = (dtbv) obj2;
                            hugoHostFragment.getClass();
                            dtbvVar2.getClass();
                            hugoHostFragment.r(dtbvVar2);
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R7);
                }
                hfmVar.Z();
                a(ixmVar, dtbvVar, (ffjm) R7, b, 392);
                hfmVar.Z();
                ffcu ffcuVar = ffcu.a;
                b.v(928510430);
                boolean F2 = b.F(ixmVar);
                Object R8 = hfmVar.R();
                if (F2 || R8 == hfc.a) {
                    R8 = new ffji() { // from class: dshg
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            ((hgp) obj).getClass();
                            return new dshj(ixm.this);
                        }
                    };
                    hfmVar.ad(R8);
                }
                hfmVar.Z();
                hgs.c(ffcuVar, (ffji) R8, b);
                hfmVar.Z();
            } else {
                b.v(-1280871635);
                b.v(928517490);
                Object R9 = hfmVar.R();
                if (R9 == hfc.a) {
                    R9 = new ffjn() { // from class: dshh
                        @Override // defpackage.ffjn
                        public final Object a(Object obj, Object obj2, Object obj3) {
                            LayoutInflater layoutInflater = (LayoutInflater) obj;
                            ViewGroup viewGroup = (ViewGroup) obj2;
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            layoutInflater.getClass();
                            viewGroup.getClass();
                            View inflate = layoutInflater.inflate(com.google.android.apps.messaging.R.layout.hugo_host_fragment, viewGroup, booleanValue);
                            inflate.getClass();
                            return (FragmentContainerView) inflate;
                        }
                    };
                    hfmVar.ad(R9);
                }
                ffjn ffjnVar = (ffjn) R9;
                hfmVar.Z();
                b.v(928527203);
                boolean F3 = b.F(dsjzVar) | b.F(null);
                boolean z4 = (i4 & 14) == 4 ? z2 : false;
                Object R10 = hfmVar.R();
                if ((z4 | F3) || R10 == hfc.a) {
                    R10 = new ffji() { // from class: dshi
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            FragmentContainerView fragmentContainerView = (FragmentContainerView) obj;
                            fragmentContainerView.getClass();
                            HugoHostFragment hugoHostFragment = (HugoHostFragment) fr.m(fragmentContainerView).g(fragmentContainerView.getId());
                            if (hugoHostFragment != null) {
                                dsjz dsjzVar2 = dsjz.this;
                                if (dsjzVar2 != null) {
                                    hugoHostFragment.q(dsjzVar2);
                                }
                                dsho dshoVar2 = dshoVar;
                                hugoHostFragment.ak = null;
                                hugoHostFragment.ah = dshoVar2.b;
                                hugoHostFragment.ai = dshoVar2.c;
                                hugoHostFragment.r(dshoVar2.a);
                            }
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R10);
                }
                hfmVar.Z();
                dshv.b(ffjnVar, a2, null, (ffji) R10, b, 6);
                b = b;
                hfmVar.Z();
            }
            dsgg.a(b, 0);
            z3 = z2;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dsgz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dsho dshoVar2 = dsho.this;
                    hvi hviVar2 = hviVar;
                    int i5 = i;
                    dshl.b(dshoVar2, hviVar2, z3, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
