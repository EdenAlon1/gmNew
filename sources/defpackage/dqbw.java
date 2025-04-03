package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.format.DateUtils;
import androidx.compose.foundation.layout.AspectRatioElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqbw {
    public static final float a(float f) {
        return ffmk.e((f - 0.25f) / 0.75f, 0.0f, 1.0f);
    }

    public static final List b(hkx hkxVar) {
        return (List) hkxVar.a();
    }

    public static final void c(ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        final ffix ffixVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1111066645);
        if (i3 == 0) {
            i2 = (true != b.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            ffixVar2 = ffixVar;
        } else {
            ffixVar2 = ffixVar;
            dwhl.b(ffixVar2, null, false, null, null, dpyv.a, b, (i2 & 14) | 1572864, 62);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dqae
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dqbw.c(ffix.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final ffxx ffxxVar, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        hfd b = hfdVar.b(189195169);
        if ((i & 6) == 0) {
            i2 = (true != b.F(ffxxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            hkx b2 = hkt.b(ffxxVar, ffel.a, null, b, 2);
            if (!b(b2).isEmpty()) {
                hve hveVar = hvi.e;
                ebe ebeVar = dpyw.a;
                hvi e = ebs.e(hveVar, 40.0f);
                ebe ebeVar2 = dpyw.a;
                ebe ebeVar3 = dwfd.a;
                dwfj.a(ffixVar, e, false, null, dwfd.b(gft.a(b).a, gft.a(b).p, b, 12), null, null, ebeVar2, hpx.d(-1758873418, new dqbb(b2), b), b, ((i2 >> 3) & 14) | 817889328, 364);
                b = b;
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dqag
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffxx ffxxVar2 = ffxx.this;
                    int i3 = i;
                    dqbw.d(ffxxVar2, ffixVar, (hfd) obj, hip.a(i3 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final dpzw dpzwVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(786970596);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? b.D(dpzwVar) : b.F(dpzwVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            final String a = jii.a(R.string.folders_button_content_description, b);
            hve hveVar = hvi.e;
            ebe ebeVar = dpyw.a;
            hvi e = ebs.e(hveVar, 40.0f);
            b.v(-49883432);
            boolean D = b.D(a);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = new ffji() { // from class: dpzy
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jkv jkvVar = (jkv) obj;
                        jkvVar.getClass();
                        jkr.k(jkvVar, a);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hvi b2 = jjs.b(e, (ffji) R);
            ebe ebeVar2 = dpyw.a;
            ebe ebeVar3 = dwfd.a;
            fvo b3 = dwfd.b(gft.a(b).H, gft.a(b).q, b, 12);
            b.v(-49873344);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !b.F(dpzwVar))) {
                z = false;
            }
            Object R2 = hfmVar.R();
            if (z || R2 == hfc.a) {
                R2 = new ffix() { // from class: dqaj
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dpzw.this.c.invoke();
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            dwfj.a((ffix) R2, b2, false, null, b3, null, null, ebeVar2, dpyv.c, b, 817889280, 364);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dqat
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dqbw.e(dpzw.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void f(final hvi hviVar, final drnn drnnVar, final int i, hfd hfdVar, final int i2) {
        int i3;
        final String b;
        hvi a;
        hfd hfdVar2;
        int i4 = i2 & 6;
        hfd b2 = hfdVar.b(-1605583583);
        if (i4 == 0) {
            i3 = (true != b2.D(hviVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b2.F(drnnVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != b2.B(i) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && b2.I()) {
            b2.s();
            hfdVar2 = b2;
        } else {
            boolean z = i != -1;
            String a2 = jii.a(drnnVar.l().b().a(), b2);
            if (z) {
                b2.v(-1750629680);
                b = jii.b(R.string.gallery_item_content_description_selected_state, new Object[]{a2, Integer.valueOf(i + 1)}, b2);
                ((hfm) b2).Z();
            } else {
                b2.v(-1750362491);
                b = jii.b(R.string.gallery_item_content_description_unselected_state, new Object[]{a2, dqkr.a(drnnVar.c())}, b2);
                ((hfm) b2).Z();
            }
            b2.v(-887739062);
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new ffji() { // from class: dqao
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((jkv) obj).getClass();
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hvi c = jjs.c(hviVar, true, (ffji) R);
            b2.v(-887737960);
            boolean D = b2.D(b);
            Object R2 = hfmVar.R();
            if (D || R2 == hfc.a) {
                R2 = new ffji() { // from class: dqap
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jkv jkvVar = (jkv) obj;
                        jkvVar.getClass();
                        jkr.k(jkvVar, b);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            hvi b3 = jjs.b(c, (ffji) R2);
            int i5 = huo.a;
            ipn a3 = dyc.a(hum.a, false);
            int a4 = hey.a(b2);
            hqb ai = hfmVar.ai();
            hvi b4 = huz.b(b2, b3);
            int i6 = ist.a;
            ffix ffixVar = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar);
            } else {
                b2.z();
            }
            hlc.b(b2, a3, iss.e);
            hlc.b(b2, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                hfmVar.ad(valueOf);
                b2.h(valueOf, ffjmVar);
            }
            hlc.b(b2, b4, iss.c);
            b2.v(349319014);
            if (z) {
                g(i + 1, b2, 0);
            }
            hfmVar.Z();
            hvi a5 = hxo.a(eba.d(hvi.e, z ? 10.0f : 0.0f), eqm.b(z ? 16.0f : 0.0f));
            ipn a6 = dyc.a(hum.a, false);
            int a7 = hey.a(b2);
            hqb ai2 = hfmVar.ai();
            hvi b5 = huz.b(b2, a5);
            ffix ffixVar2 = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar2);
            } else {
                b2.z();
            }
            hlc.b(b2, a6, iss.e);
            hlc.b(b2, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a7))) {
                Integer valueOf2 = Integer.valueOf(a7);
                hfmVar.ad(valueOf2);
                b2.h(valueOf2, ffjmVar2);
            }
            hlc.b(b2, b5, iss.c);
            dyi dyiVar = dyi.a;
            b2.v(-1748347689);
            if (drnnVar instanceof drnl) {
                j(dyiVar, (drnl) drnnVar, b2, 6);
            }
            hfmVar.Z();
            Uri parse = Uri.parse(drnnVar.f());
            a = hvi.e.a(new AspectRatioElement(1.0f));
            int i7 = inp.a;
            hfdVar2 = b2;
            dnac.a(parse, null, a, null, null, null, ino.a, null, 0.0f, null, null, null, null, null, null, null, hfdVar2, 12583344, 0, 524152);
            hfdVar2.n();
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dqaq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    drnn drnnVar2 = drnnVar;
                    int i8 = i2;
                    dqbw.f(hviVar2, drnnVar2, i, (hfd) obj, hip.a(i8 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void g(final int i, hfd hfdVar, final int i2) {
        int i3;
        hfd hfdVar2;
        int i4 = i2 & 6;
        hfd b = hfdVar.b(1355826047);
        if (i4 == 0) {
            i3 = (true != b.B(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            float ef = ((jzn) b.e(jdr.e)).ef(kal.c(20));
            final long j = gft.a(b).G;
            float f = 10.0f - (ef / 4.0f);
            hvi a = dee.a(icf.b(ebs.k(eba.e(hvr.a(hvi.e, 2.0f), 0.9f * f, f * 1.1f), ef), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, eqm.a, true, 1, 59391), gft.a(b).a, eqm.a);
            b.v(1433305920);
            boolean C = b.C(j);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (C || R == hfc.a) {
                R = new ffji() { // from class: dqaw
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        hxn hxnVar = (hxn) obj;
                        hxnVar.getClass();
                        final ifv ifvVar = new ifv(jzm.d(hxnVar, 2.0f), 0.0f, 0, 0, 30);
                        final long j2 = j;
                        return hxnVar.p(new ffji() { // from class: dqaa
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj2) {
                                ifo ifoVar = (ifo) obj2;
                                ifoVar.getClass();
                                ifoVar.p();
                                ifq.e(ifoVar, j2, 0.0f, 0L, ifvVar, 0, 110);
                                return ffcu.a;
                            }
                        });
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hvi b2 = hxs.b(a, (ffji) R);
            int i5 = huo.a;
            ipn a2 = dyc.a(hum.e, false);
            int a3 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b, b2);
            int i6 = ist.a;
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
            hlc.b(b, b3, iss.c);
            hfdVar2 = b;
            grl.b(String.valueOf(i), null, 0L, kal.c(12), null, null, null, 0L, null, kal.c(14), 0, false, 0, 0, null, jpo.y(gft.d(b).o, gft.a(b).b, 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214), hfdVar2, 3072, 6, 64502);
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dqax
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i7 = i2;
                    dqbw.g(i, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void h(hvi hviVar, final dpzw dpzwVar, boolean z, final ffix ffixVar, hfd hfdVar, final int i, final int i2) {
        int i3;
        hvi hviVar2;
        final hvi hviVar3;
        final boolean z2;
        int i4 = i2 & 1;
        hfd b = hfdVar.b(-584099422);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != ((i & 64) == 0 ? b.D(dpzwVar) : b.F(dpzwVar)) ? 16 : 32;
        }
        int i5 = i2 & 4;
        boolean z3 = i5 == 0;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != b.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != b.F(ffixVar) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && b.I()) {
            b.s();
            hviVar3 = hviVar;
            z2 = z;
        } else {
            int i6 = i3 & 7168;
            int i7 = i3 & 896;
            int i8 = i3 & 112;
            int i9 = (i3 & 14) | 64;
            if (i4 != 0) {
                hviVar = hvi.e;
            }
            int i10 = i9 | i8;
            boolean z4 = (true ^ z3) | z;
            if (dpzwVar.f) {
                b.v(554592808);
                hviVar2 = hviVar;
                o(hviVar2, dpzwVar, z4, ffixVar, b, i10 | i7 | i6);
                ((hfm) b).Z();
            } else {
                hviVar2 = hviVar;
                b.v(554681189);
                p(hviVar2, dpzwVar, z4, ffixVar, b, i10 | i7 | i6);
                ((hfm) b).Z();
            }
            hviVar3 = hviVar2;
            z2 = z4;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dqar
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar4 = hvi.this;
                    dpzw dpzwVar2 = dpzwVar;
                    boolean z5 = z2;
                    dqbw.h(hviVar4, dpzwVar2, z5, ffixVar, (hfd) obj, hip.a(i | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void i(final ffxx ffxxVar, final float f, final ffix ffixVar, final ffji ffjiVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(151603534);
        if (i3 == 0) {
            i2 = (true != b.F(ffxxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.A(f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffixVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffjiVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            final jzn jznVar = (jzn) b.e(jdr.e);
            hpn d = hpx.d(1717962770, new dqbu(ffxxVar), b);
            hvi a = hxe.a(hvi.e, f);
            b.v(-1968205049);
            boolean D = b.D(jznVar) | ((i2 & 7168) == 2048);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = new ffji() { // from class: dqal
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ioc iocVar = (ioc) obj;
                        iocVar.getClass();
                        ffjiVar.invoke(new jzq(jzn.this.ek((int) (iocVar.g() & 4294967295L))));
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            dweu.a(d, ipx.a(a, (ffji) R), hpx.d(-645878892, new dqbv(ffixVar), b), null, 0.0f, null, dwkh.b(gft.a(b).J, 0L, gft.a(b).s, b, 54), null, b, 390, 184);
            b = b;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dqam
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffxx ffxxVar2 = ffxx.this;
                    float f2 = f;
                    ffix ffixVar2 = ffixVar;
                    dqbw.i(ffxxVar2, f2, ffixVar2, ffjiVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void j(final dyh dyhVar, final drnl drnlVar, hfd hfdVar, final int i) {
        int i2;
        hfm hfmVar;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-2106222178);
        if (i3 == 0) {
            i2 = (true != b.D(dyhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(drnlVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hvi a = hvr.a(hvi.e, 2.0f);
            int i4 = huo.a;
            hvi d = eba.d(dyhVar.a(a, hum.c), 4.0f);
            ipn a2 = ebm.a(dxu.a, hum.n, b, 48);
            int a3 = hey.a(b);
            hfm hfmVar2 = (hfm) b;
            hqb ai = hfmVar2.ai();
            hvi b2 = huz.b(b, d);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar2.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a2, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfmVar2.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            b.v(-698916681);
            if (drnlVar.g.getSeconds() > 0) {
                String formatElapsedTime = DateUtils.formatElapsedTime(drnlVar.g.getSeconds());
                formatElapsedTime.getClass();
                hfmVar = hfmVar2;
                grl.b(formatElapsedTime, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, jpo.y(gft.d(b).o, ibw.d, 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214), b, 0, 0, 65534);
                b = b;
            } else {
                hfmVar = hfmVar2;
            }
            hfmVar.Z();
            dwho.a(dnaa.a(dmzz.cW, b), null, null, ibw.d, b, 3120, 4);
            hfdVar2 = b;
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dqas
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dyh dyhVar2 = dyh.this;
                    int i6 = i;
                    dqbw.j(dyhVar2, drnlVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void k(final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        long f;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1634719668);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            ebe ebeVar = dpyw.a;
            hvi i4 = eba.i(hviVar, 0.0f, 16.0f, 1);
            f = iby.f(ibw.d(r2), ibw.c(r2), ibw.b(r2), 0.4f, ibw.f(gft.a(b).s));
            gpa.c(i4, gft.c(b).e, f, 0L, 0.0f, 0.0f, null, dpyv.b, b, 120);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dqan
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    dqbw.k(hvi.this, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f2, code lost:
    
        if (r6.F(r17) != false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final defpackage.hvi r16, final defpackage.dpzw r17, final boolean r18, final defpackage.ffix r19, defpackage.hfd r20, final int r21) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqbw.l(hvi, dpzw, boolean, ffix, hfd, int):void");
    }

    public static final void m(final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1063579030);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            final String a = jii.a(R.string.gallery_empty_state_content_description, b);
            d = ebs.d(hviVar, 1.0f);
            b.v(-1271861175);
            boolean D = b.D(a);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = new ffji() { // from class: dqay
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jkv jkvVar = (jkv) obj;
                        jkvVar.getClass();
                        jkr.k(jkvVar, a);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hvi b2 = jjs.b(d, (ffji) R);
            int i4 = huo.a;
            ipn a2 = dyo.a(dxu.e, hum.k, b, 54);
            int a3 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b, b2);
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
            hlc.b(b, b3, iss.c);
            hvi a4 = dee.a(ebs.k(hvi.e, 56.0f), gft.a(b).D, eqm.a);
            ipn a5 = dyc.a(hum.a, false);
            int a6 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b4 = huz.b(b, a4);
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a5, iss.e);
            hlc.b(b, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a6))) {
                Integer valueOf2 = Integer.valueOf(a6);
                hfmVar.ad(valueOf2);
                b.h(valueOf2, ffjmVar2);
            }
            hlc.b(b, b4, iss.c);
            dwho.a(dnaa.a(dmzz.bI, b), null, dyi.a.a(hvi.e, hum.e), gft.a(b).a, b, 48, 0);
            b.n();
            ebv.a(ebs.e(hvi.e, 24.0f), b);
            grl.b(jii.a(R.string.gallery_empty_state_title, b), null, 0L, 0L, null, null, null, 0L, new jyj(3), 0L, 0, false, 0, 0, null, jpo.y(gft.d(b).g, gft.a(b).q, 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214), b, 0, 0, 65022);
            ebv.a(ebs.e(hvi.e, 8.0f), b);
            grl.b(jii.a(R.string.gallery_empty_state_body, b), null, 0L, 0L, null, null, null, 0L, new jyj(3), 0L, 0, false, 0, 0, null, jpo.y(gft.d(b).k, gft.a(b).s, 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214), b, 0, 0, 65022);
            b = b;
            ebv.a(ebs.e(hvi.e, 8.0f), b);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dqaz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    dqbw.m(hvi.this, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void n(final hvi hviVar, final olu oluVar, final dpzw dpzwVar, hfd hfdVar, final int i) {
        int i2;
        hfd b = hfdVar.b(-1821433156);
        boolean z = true;
        if ((i & 6) == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? b.D(oluVar) : b.F(oluVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? b.D(dpzwVar) : b.F(dpzwVar)) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            final hkx b2 = hkt.b(dpzwVar.a, ffel.a, null, b, 2);
            ebe ebeVar = dpyw.a;
            eff effVar = new eff();
            dxr dxrVar = dxr.a;
            dxn dxnVar = new dxn(3.0f, true, dxrVar);
            dxn dxnVar2 = new dxn(3.0f, true, dxrVar);
            b.v(149248648);
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && b.F(oluVar));
            if ((i2 & 896) != 256 && ((i2 & 512) == 0 || !b.F(dpzwVar))) {
                z = false;
            }
            boolean D = z | z2 | b.D(b2);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = new ffji() { // from class: dqba
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        efr efrVar = (efr) obj;
                        efrVar.getClass();
                        olu oluVar2 = olu.this;
                        egr.a(efrVar, oluVar2.a(), new olq(new ffji() { // from class: dqaf
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj2) {
                                drnm drnmVar = (drnm) obj2;
                                drnmVar.getClass();
                                return drnmVar.f();
                            }
                        }, oluVar2), new hpw(416107585, true, new dqbs(oluVar2, dpzwVar, b2)), 12);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            efo.b(effVar, hviVar, null, null, dxnVar2, dxnVar, null, false, null, (ffji) R, b, ((i2 << 3) & 112) | 1769472, 0, 924);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dpzz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    olu oluVar2 = oluVar;
                    int i3 = i;
                    dqbw.n(hviVar2, oluVar2, dpzwVar, (hfd) obj, hip.a(i3 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void o(final hvi hviVar, final dpzw dpzwVar, final boolean z, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hfd b = hfdVar.b(-848178505);
        if ((i & 6) == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? b.D(dpzwVar) : b.F(dpzwVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffixVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            Context context = (Context) b.e(AndroidCompositionLocals_androidKt.b);
            final olu a = olz.a(dpzwVar.d, null, b, 1);
            b.v(587883935);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                context.getClass();
                hic hicVar = new hic((Build.VERSION.SDK_INT < 33 || !(dpyr.b(context, "android.permission.READ_MEDIA_IMAGES") || dpyr.b(context, "android.permission.READ_MEDIA_VIDEO"))) ? (Build.VERSION.SDK_INT < 34 || !dpyr.b(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED")) ? (Build.VERSION.SDK_INT >= 33 || !dpyr.b(context, "android.permission.READ_EXTERNAL_STORAGE")) ? dpyx.a : dpyx.c : dpyx.b : dpyx.c, hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            final hho hhoVar = (hho) R;
            hfmVar.Z();
            hhoVar.getClass();
            a.getClass();
            b.v(-1485230562);
            aej aejVar = new aej();
            b.v(1948014601);
            boolean F = b.F(a);
            Object R2 = hfmVar.R();
            if (F || R2 == hfc.a) {
                R2 = new ffji() { // from class: dpza
                    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
                    
                        if (((java.lang.Boolean) r1.getValue()).booleanValue() == true) goto L28;
                     */
                    @Override // defpackage.ffji
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r7) {
                        /*
                            Method dump skipped, instructions count: 251
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpza.invoke(java.lang.Object):java.lang.Object");
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            ada a2 = aco.a(aejVar, (ffji) R2, b);
            hfmVar.Z();
            b.v(587888768);
            if (hhoVar.a() == dpyx.a) {
                ffcu ffcuVar = ffcu.a;
                b.v(587891151);
                boolean F2 = b.F(a2);
                Object R3 = hfmVar.R();
                if (F2 || R3 == hfc.a) {
                    R3 = new dqbt(a2, null);
                    hfmVar.ad(R3);
                }
                hfmVar.Z();
                hgs.g(ffcuVar, (ffjm) R3, b);
            }
            hfmVar.Z();
            b.v(587895446);
            Object R4 = hfmVar.R();
            if (R4 == hfc.a) {
                ffix ffixVar2 = new ffix() { // from class: dqah
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return Boolean.valueOf(!(olu.this.b().a instanceof ofv));
                    }
                };
                hqg hqgVar = hkg.a;
                hgk hgkVar = new hgk(ffixVar2, null);
                hfmVar.ad(hgkVar);
                R4 = hgkVar;
            }
            hkx hkxVar = (hkx) R4;
            hfmVar.Z();
            b.v(587901014);
            Object R5 = hfmVar.R();
            if (R5 == hfc.a) {
                ffix ffixVar3 = new ffix() { // from class: dqai
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return Boolean.valueOf(olu.this.a() > 0);
                    }
                };
                hqg hqgVar2 = hkg.a;
                hgk hgkVar2 = new hgk(ffixVar3, null);
                hfmVar.ad(hgkVar2);
                R5 = hgkVar2;
            }
            hkx hkxVar2 = (hkx) R5;
            hfmVar.Z();
            if (hhoVar.a() == dpyx.a) {
                b.v(1045174689);
                dpyr.c(eba.i(hviVar, 0.0f, 29.0f, 1), dpym.b, b, 48);
                hfmVar.Z();
            } else if (((Boolean) hkxVar.a()).booleanValue()) {
                b.v(1045346677);
                d = ebs.d(hviVar, 1.0f);
                dxq dxqVar = dxu.c;
                int i3 = huo.a;
                ipn a3 = dyo.a(dxqVar, hum.j, b, 0);
                int a4 = hey.a(b);
                hqb ai = hfmVar.ai();
                hvi b2 = huz.b(b, d);
                int i4 = ist.a;
                ffix ffixVar4 = iss.a;
                b.x();
                if (hfmVar.z) {
                    b.j(ffixVar4);
                } else {
                    b.z();
                }
                hlc.b(b, a3, iss.e);
                hlc.b(b, ai, iss.d);
                ffjm ffjmVar = iss.f;
                if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                    Integer valueOf = Integer.valueOf(a4);
                    hfmVar.ad(valueOf);
                    b.h(valueOf, ffjmVar);
                }
                hlc.b(b, b2, iss.c);
                b.v(927213491);
                if (hhoVar.a() == dpyx.b) {
                    dpzb.a(a2, b, 8);
                }
                hfmVar.Z();
                hvi b3 = dys.b(hvi.e, 1.0f, z);
                if (r(hkxVar2)) {
                    b.v(-1320944498);
                    n(jfw.a(b3, "GALLERY_GRID"), a, dpzwVar, b, ((i2 << 3) & 896) | 576);
                    hfmVar.Z();
                } else {
                    b.v(-1320758839);
                    m(b3, b, 0);
                    hfmVar.Z();
                }
                l(hvi.e, dpzwVar, r(hkxVar2), ffixVar, b, (i2 & 112) | 70 | (i2 & 7168));
                b.n();
                hfmVar.Z();
            } else {
                b.v(1046016649);
                hfmVar.Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dqak
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    dpzw dpzwVar2 = dpzwVar;
                    boolean z2 = z;
                    dqbw.o(hviVar2, dpzwVar2, z2, ffixVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void p(final hvi hviVar, final dpzw dpzwVar, final boolean z, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        ffix ffixVar2;
        hvi d;
        hfd b = hfdVar.b(704374217);
        if ((i & 6) == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? b.D(dpzwVar) : b.F(dpzwVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            ffixVar2 = ffixVar;
            i2 |= true != b.F(ffixVar2) ? 1024 : 2048;
        } else {
            ffixVar2 = ffixVar;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            final olu a = olz.a(dpzwVar.d, null, b, 1);
            b.v(1785411530);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                ffix ffixVar3 = new ffix() { // from class: dqab
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return Boolean.valueOf(!(olu.this.b().a instanceof ofv));
                    }
                };
                hqg hqgVar = hkg.a;
                hgk hgkVar = new hgk(ffixVar3, null);
                hfmVar.ad(hgkVar);
                R = hgkVar;
            }
            hkx hkxVar = (hkx) R;
            hfmVar.Z();
            b.v(1785417098);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                ffix ffixVar4 = new ffix() { // from class: dqac
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return Boolean.valueOf(olu.this.a() > 0);
                    }
                };
                hqg hqgVar2 = hkg.a;
                hgk hgkVar2 = new hgk(ffixVar4, null);
                hfmVar.ad(hgkVar2);
                R2 = hgkVar2;
            }
            hkx hkxVar2 = (hkx) R2;
            hfmVar.Z();
            if (((Boolean) hkxVar.a()).booleanValue()) {
                d = ebs.d(hviVar, 1.0f);
                dxq dxqVar = dxu.c;
                int i3 = huo.a;
                ipn a2 = dyo.a(dxqVar, hum.j, b, 0);
                int a3 = hey.a(b);
                hqb ai = hfmVar.ai();
                hvi b2 = huz.b(b, d);
                int i4 = ist.a;
                ffix ffixVar5 = iss.a;
                b.x();
                if (hfmVar.z) {
                    b.j(ffixVar5);
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
                hvi b3 = dys.b(hvi.e, 1.0f, z);
                if (s(hkxVar2)) {
                    b.v(1702663002);
                    n(jfw.a(b3, "GALLERY_GRID"), a, dpzwVar, b, ((i2 << 3) & 896) | 576);
                    hfmVar.Z();
                } else {
                    b.v(1702848661);
                    m(b3, b, 0);
                    hfmVar.Z();
                }
                l(hvi.e, dpzwVar, s(hkxVar2), ffixVar2, b, (i2 & 7168) | (i2 & 112) | 70);
                b.n();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dqad
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    dpzw dpzwVar2 = dpzwVar;
                    boolean z2 = z;
                    dqbw.p(hviVar2, dpzwVar2, z2, ffixVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void q(hvi hviVar, final dpzx dpzxVar, final dqbx dqbxVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-447186681);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(dpzxVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? b.D(dqbxVar) : b.F(dqbxVar)) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            hviVar2 = hviVar;
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            hviVar2 = hviVar;
            dym.a(hviVar2, null, hpx.d(800994141, new dqbq(dqbxVar, dpzxVar), b), b, (i2 & 14) | 3072, 6);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dqau
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar3 = hvi.this;
                    dpzx dpzxVar2 = dpzxVar;
                    int i4 = i;
                    dqbw.q(hviVar3, dpzxVar2, dqbxVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    private static final boolean r(hkx hkxVar) {
        return ((Boolean) hkxVar.a()).booleanValue();
    }

    private static final boolean s(hkx hkxVar) {
        return ((Boolean) hkxVar.a()).booleanValue();
    }
}
