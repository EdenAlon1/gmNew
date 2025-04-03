package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwap {
    public static final cvzr a(hkx hkxVar) {
        return (cvzr) hkxVar.a();
    }

    public static final void b(final abo aboVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-615875323);
        if (i3 == 0) {
            i2 = (true != b.F(aboVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            if (aboVar == null) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: cwac
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            cwap.b(null, (hfd) obj, hip.a(i | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            final lkr lkrVar = (lkr) b.e(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            int i4 = acz.a;
            acd a = acz.a(b);
            if (a == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            final aca gE = a.gE();
            b.v(-1390597356);
            boolean F = b.F(gE) | b.F(lkrVar) | b.F(aboVar);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new ffji() { // from class: cwad
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((hgp) obj).getClass();
                        aca acaVar = aca.this;
                        lkr lkrVar2 = lkrVar;
                        abo aboVar2 = aboVar;
                        acaVar.b(lkrVar2, aboVar2);
                        return new cwaf(aboVar2);
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hgs.c(aboVar, (ffji) R, b);
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: cwae
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    cwap.b(abo.this, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final cvyo cvyoVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1689376971);
        if (i3 == 0) {
            i2 = (true != b.D(cvyoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            dwjt.b(jii.a(R.string.group_rename_choose_unique_group_name_notice, b), eba.j(hvi.e, 0.0f, 16.0f, 0.0f, 0.0f, 13), gft.a(b).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(b).n, b, 48, 0, 65528);
            b = b;
            String a = jii.a(R.string.group_rename_duplicate_legacy_group_link, b);
            b.v(1632920646);
            jlj jljVar = new jlj((byte[]) null);
            jljVar.a(new jou(gft.a(b).a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
            jljVar.f(a);
            jljVar.b();
            jlm b2 = jljVar.b();
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            jpo jpoVar = gft.d(b).l;
            b.v(-1864906238);
            int i4 = i2 & 14;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new ffji() { // from class: cvzv
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((Integer) obj).intValue();
                        cvyo.this.a.invoke();
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            esg.a(b2, null, jpoVar, false, 0, 0, null, (ffji) R, b, 0, 122);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cvzw
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    cwap.c(cvyo.this, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final cvzr cvzrVar, final hzi hziVar, final String str, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(49404435);
        if (i3 == 0) {
            i2 = (true != b.D(cvzrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hziVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(str) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            String str2 = cvzrVar.e;
            b.v(831130123);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                String str3 = cvzrVar.e;
                int length = str3.length();
                long a = jpn.a(length, length);
                long j = jpm.a;
                hic hicVar = new hic(new jvu(str3, a, 4), hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            final hho hhoVar = (hho) R;
            hfmVar.Z();
            jvu jvuVar = (jvu) hhoVar.a();
            d = ebs.d(hvi.e, 1.0f);
            hvi a2 = hzk.a(eba.e(d, 24.0f, 16.0f), hziVar);
            euw euwVar = new euw(3, null, 0, 0, 126);
            boolean z = cvzrVar.l;
            b.v(831143103);
            int i4 = i2 & 14;
            Object R2 = hfmVar.R();
            if (i4 == 4 || R2 == hfc.a) {
                R2 = new ffji() { // from class: cvzz
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jvu jvuVar2 = (jvu) obj;
                        jvuVar2.getClass();
                        cvzr.this.m.invoke(jvuVar2.a());
                        cwap.e(hhoVar, jvuVar2);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            hfdVar2 = b;
            dwif.b(jvuVar, (ffji) R2, a2, false, null, hpx.d(1074266797, new cwag(cvzrVar), b), hpx.d(1377154188, new cwah(cvzrVar), b), hpx.d(1982928970, new cwaj(cvzrVar, hhoVar), b), hpx.d(-1189852612, new cwal(str, str2), b), z, null, euwVar, null, 0, 0, null, null, hfdVar2, 819462144, 199686, 0);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cwaa
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cvzr cvzrVar2 = cvzr.this;
                    hzi hziVar2 = hziVar;
                    int i5 = i;
                    cwap.d(cvzrVar2, hziVar2, str, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(hho hhoVar, jvu jvuVar) {
        hhoVar.b(jvuVar);
    }

    public static final void f(final cvzr cvzrVar, final hzi hziVar, hfd hfdVar, final int i) {
        int i2;
        String a;
        int i3 = i & 6;
        hfd b = hfdVar.b(1660979504);
        if (i3 == 0) {
            i2 = (true != b.D(cvzrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hziVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            String str = cvzrVar.e;
            if (str.length() <= 100) {
                b.v(-2020026920);
                a = jii.b(R.string.group_rename_remaining_text_count_text, new Object[]{Integer.valueOf(100 - str.length())}, b);
                ((hfm) b).Z();
            } else {
                b.v(-2019879763);
                a = jii.a(R.string.group_rename_remaining_text_characters_limit_reached, b);
                ((hfm) b).Z();
            }
            cvzq cvzqVar = cvzrVar.p;
            b.v(-2019641931);
            d(cvzrVar, hziVar, a, b, i2 & 126);
            ((hfm) b).Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cwab
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cvzr cvzrVar2 = cvzr.this;
                    int i4 = i;
                    cwap.f(cvzrVar2, hziVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void g(final hzi hziVar, hfd hfdVar, final int i) {
        int i2;
        hziVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(2034368354);
        if (i3 == 0) {
            i2 = (true != b.D(hziVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            View view = (View) b.e(AndroidCompositionLocals_androidKt.g);
            dsma dsmaVar = (dsma) b.e(dsmp.a);
            b.v(-713133648);
            boolean F = b.F(dsmaVar) | ((i2 & 14) == 4) | b.F(view);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new cwao(hziVar, dsmaVar, view, null);
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hgs.g(hziVar, (ffjm) R, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cvzs
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cwap.g(hzi.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void h(final String str, final abo aboVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-776363181);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(aboVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(false) ? 128 : 256;
        }
        int i4 = i2;
        if ((i4 & 147) == 146 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            dosk doskVar = new dosk(str, null, null, false, null, null, null, 254);
            String a = jii.a(R.string.action_back, b);
            dmzz dmzzVar = dmzz.p;
            b.v(476155565);
            boolean F = b.F(aboVar);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new ffix() { // from class: cvzx
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        abo aboVar2 = abo.this;
                        if (aboVar2 != null) {
                            aboVar2.b();
                        }
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            doti.b(new dotb(doskVar, new dlsr(a, dmzzVar, false, false, false, false, null, false, null, (ffix) R, 1020), null, true, false, null, null, 116), null, null, null, false, b, 0, 62);
            hfdVar2 = b;
            b(aboVar, hfdVar2, (i4 >> 3) & 14);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cvzy
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i5 = i;
                    cwap.h(str2, aboVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void i(final fgdj fgdjVar, final hvi hviVar, final dji djiVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        hfd b = hfdVar.b(-48244357);
        if ((i & 6) == 0) {
            i2 = (true != b.F(fgdjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            hviVar2 = hviVar;
        } else {
            b.t();
            if ((i & 1) == 0 || b.G()) {
                djiVar = dix.a(0, b, 0, 1);
            } else {
                b.s();
            }
            b.l();
            hkx a = hkf.a(fgdjVar, b);
            if (!a(a).k) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: cvzt
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            fgdj fgdjVar2 = fgdj.this;
                            hvi hviVar3 = hviVar;
                            int i3 = i;
                            cwap.i(fgdjVar2, hviVar3, djiVar, (hfd) obj, hip.a(i3 | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            hviVar2 = hviVar;
            cru.b(a(a).j, hviVar2, ctt.l(null, 3), ctt.m(null, 3), null, hpx.d(-912458157, new cwan(a, djiVar), b), b, (i2 & 112) | 200064, 16);
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: cvzu
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fgdj fgdjVar2 = fgdj.this;
                    hvi hviVar3 = hviVar2;
                    int i3 = i;
                    cwap.i(fgdjVar2, hviVar3, djiVar, (hfd) obj, hip.a(i3 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
