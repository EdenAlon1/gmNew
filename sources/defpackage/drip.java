package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drip {
    public static final void a(final ffix ffixVar, final ffix ffixVar2, final ffix ffixVar3, hfd hfdVar, final int i) {
        int i2;
        hvi b;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-1878492767);
        if (i3 == 0) {
            i2 = (true != b2.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.F(ffixVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.F(ffixVar3) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b2.I()) {
            b2.s();
        } else {
            b = ebs.b(hvi.e, 1.0f);
            hvi a = jfw.a(eba.j(b, 16.0f, 0.0f, 0.0f, 16.0f, 6), "magic_compose_feedback");
            dxq dxqVar = dxu.d;
            int i4 = huo.a;
            ipn a2 = dyo.a(dxqVar, hum.j, b2, 6);
            int a3 = hey.a(b2);
            hfm hfmVar = (hfm) b2;
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b2, a);
            int i5 = ist.a;
            ffix ffixVar4 = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar4);
            } else {
                b2.z();
            }
            hlc.b(b2, a2, iss.e);
            hlc.b(b2, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfmVar.ad(valueOf);
                b2.h(valueOf, ffjmVar);
            }
            hlc.b(b2, b3, iss.c);
            d(true, ffixVar, b2, ((i2 << 3) & 112) | 6);
            d(false, ffixVar2, b2, (i2 & 112) | 6);
            ebv.a(ebs.e(hvi.e, 8.0f), b2);
            e(ffixVar3, b2, (i2 >> 6) & 14);
            b2.n();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: drik
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffix ffixVar5 = ffix.this;
                    ffix ffixVar6 = ffixVar2;
                    int i6 = i;
                    drip.a(ffixVar5, ffixVar6, ffixVar3, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final ffix ffixVar, final ffix ffixVar2, final ffix ffixVar3, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(674846285);
        if (i3 == 0) {
            i2 = (true != b.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffixVar3) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            int i4 = i2 & 1022;
            if (((Configuration) b.e(AndroidCompositionLocals_androidKt.a)).orientation == 2) {
                b.v(-497620835);
                c(ffixVar, ffixVar2, ffixVar3, b, i4);
                ((hfm) b).Z();
            } else {
                b.v(-497447142);
                a(ffixVar, ffixVar2, ffixVar3, b, i4);
                ((hfm) b).Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: drim
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffix ffixVar4 = ffix.this;
                    ffix ffixVar5 = ffixVar2;
                    int i5 = i;
                    drip.b(ffixVar4, ffixVar5, ffixVar3, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final ffix ffixVar, final ffix ffixVar2, final ffix ffixVar3, hfd hfdVar, final int i) {
        int i2;
        hvi b;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(570639077);
        if (i3 == 0) {
            i2 = (true != b2.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.F(ffixVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.F(ffixVar3) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b2.I()) {
            b2.s();
        } else {
            b = ebs.b(hvi.e, 1.0f);
            hvi a = jfw.a(eba.d(b, 8.0f), "magic_compose_feedback");
            int i4 = huo.a;
            ipn a2 = ebm.a(dxu.a, hum.o, b2, 48);
            int a3 = hey.a(b2);
            hfm hfmVar = (hfm) b2;
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b2, a);
            int i5 = ist.a;
            ffix ffixVar4 = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar4);
            } else {
                b2.z();
            }
            hlc.b(b2, a2, iss.e);
            hlc.b(b2, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfmVar.ad(valueOf);
                b2.h(valueOf, ffjmVar);
            }
            hlc.b(b2, b3, iss.c);
            d(true, ffixVar, b2, ((i2 << 3) & 112) | 6);
            d(false, ffixVar2, b2, (i2 & 112) | 6);
            ebv.a(ebs.o(hvi.e, 8.0f), b2);
            e(ffixVar3, b2, (i2 >> 6) & 14);
            b2.n();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: drif
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffix ffixVar5 = ffix.this;
                    ffix ffixVar6 = ffixVar2;
                    int i6 = i;
                    drip.c(ffixVar5, ffixVar6, ffixVar3, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final boolean z, ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        final ffix ffixVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1288631374);
        if (i3 == 0) {
            i2 = (true != b.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            ffixVar2 = ffixVar;
        } else {
            igq a = jie.a(z ? R.drawable.gs_thumb_up_vd_theme_48 : R.drawable.gs_thumb_down_vd_theme_48, b, 0);
            ffixVar2 = ffixVar;
            dwhl.b(ffixVar2, null, false, dwhi.b(gft.a(b).D, gft.a(b).s, 0L, b, 12), gft.c(b).b, hpx.d(909326416, new drin(a, jii.a(z ? R.string.magic_compose_thumbs_up_button_content_description : R.string.magic_compose_thumbs_down_button_content_description, b)), b), b, ((i2 >> 3) & 14) | 1572864, 22);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: drig
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z2 = z;
                    int i4 = i;
                    drip.d(z2, ffixVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        final ffix ffixVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(605243205);
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
            dwhl.b(ffixVar2, null, false, dwhi.b(gft.a(b).D, gft.a(b).s, 0L, b, 12), gft.c(b).b, drhc.b, b, (i2 & 14) | 1572864, 22);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dril
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    drip.e(ffix.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void f(final fgdj fgdjVar, final ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hvi b;
        long j;
        ffjmVar.getClass();
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-1140356141);
        if (i3 == 0) {
            i2 = (true != b2.F(fgdjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.F(ffjmVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b2.I()) {
            b2.s();
        } else {
            d = ebs.d(hvi.e, 1.0f);
            b = ebs.b(d, 1.0f);
            hvi a = jfw.a(eba.d(b, 8.0f), "magic_compose");
            eql b3 = eqm.b(24.0f);
            if (((Boolean) b2.e(fyc.b)).booleanValue()) {
                b2.v(-852725152);
                j = gft.a(b2).p;
                ((hfm) b2).Z();
            } else {
                b2.v(-852668329);
                j = gft.a(b2).F;
                ((hfm) b2).Z();
            }
            gpa.c(a, b3, j, 0L, true != ((Boolean) b2.e(fyc.b)).booleanValue() ? 0.0f : 2.0f, 0.0f, null, hpx.d(1079257368, new drio(fgdjVar, ffjmVar), b2), b2, 104);
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: drih
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fgdj fgdjVar2 = fgdj.this;
                    int i4 = i;
                    drip.f(fgdjVar2, ffjmVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void g(final hkx hkxVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hvi d2;
        hvi c;
        hvi d3;
        int i3 = i & 6;
        hfd b = hfdVar.b(-399502333);
        if (i3 == 0) {
            i2 = (true != b.D(hkxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            boolean isEmpty = ((drja) hkxVar.a()).a.isEmpty();
            int i4 = huo.a;
            hun hunVar = hum.l;
            dxq dxqVar = dxu.c;
            d = ebs.d(hvi.e, 1.0f);
            ipn a = dyo.a(dxqVar, hunVar, b, 54);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, d);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            dys dysVar = dys.a;
            b.v(-1213282778);
            if (((drja) hkxVar.a()).p == 2 && !((drja) hkxVar.a()).b.isEmpty()) {
                drht drhtVar = ((drja) hkxVar.a()).c;
                int i6 = drht.g;
                if (!ffkj.e(drhtVar, drhr.h)) {
                    List list = ((drja) hkxVar.a()).b;
                    int i7 = ((drja) hkxVar.a()).n;
                    b.v(-1213266269);
                    Object R = hfmVar.R();
                    if (R == hfc.a) {
                        R = new ffji() { // from class: drii
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj) {
                                dokl doklVar = (dokl) obj;
                                doklVar.getClass();
                                doklVar.c.invoke();
                                return ffcu.a;
                            }
                        };
                        hfmVar.ad(R);
                    }
                    hfmVar.Z();
                    dokk.b(new dojy(list, i7, (ffji) R), null, b, 0);
                }
            }
            hfmVar.Z();
            drht drhtVar2 = ((drja) hkxVar.a()).c;
            if (drhtVar2 != null) {
                b.v(1043603351);
                drhp.f(drhtVar2, ((drja) hkxVar.a()).d, ((drja) hkxVar.a()).e, dys.a(hvi.e, hum.k), b, 0);
                hfmVar.Z();
            } else {
                b.v(1043834084);
                cru.f(dysVar, isEmpty, null, null, ctt.m(cxu.c(250, 0, null, 6), 2), null, drhc.a, b, 1597446, 22);
                b = b;
                if (!isEmpty) {
                    if (((drja) hkxVar.a()).k) {
                        b.v(1044184539);
                        hus husVar = hum.m;
                        dxi dxiVar = dxu.a;
                        c = ebs.c(hvi.e, 1.0f);
                        ipn a3 = ebm.a(dxiVar, husVar, b, 54);
                        int a4 = hey.a(b);
                        hqb ai2 = hfmVar.ai();
                        hvi b3 = huz.b(b, c);
                        ffix ffixVar2 = iss.a;
                        b.x();
                        if (hfmVar.z) {
                            b.j(ffixVar2);
                        } else {
                            b.z();
                        }
                        hlc.b(b, a3, iss.e);
                        hlc.b(b, ai2, iss.d);
                        ffjm ffjmVar2 = iss.f;
                        if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                            Integer valueOf2 = Integer.valueOf(a4);
                            hfmVar.ad(valueOf2);
                            b.h(valueOf2, ffjmVar2);
                        }
                        hlc.b(b, b3, iss.c);
                        b(((drja) hkxVar.a()).h, ((drja) hkxVar.a()).i, ((drja) hkxVar.a()).j, b, 0);
                        dojh dojhVar = new dojh(((drja) hkxVar.a()).a);
                        d3 = ebs.d(hvi.e, 1.0f);
                        doiu.b(dojhVar, eba.j(d3, 48.0f, 0.0f, 16.0f, 0.0f, 10), b, 432);
                        b.n();
                        hfmVar.Z();
                    } else {
                        b.v(1044839817);
                        dojh dojhVar2 = new dojh(((drja) hkxVar.a()).a);
                        d2 = ebs.d(hvi.e, 1.0f);
                        doiu.b(dojhVar2, eba.j(d2, 48.0f, 0.0f, 16.0f, 0.0f, 10), b, 432);
                        hfmVar.Z();
                    }
                }
                hfmVar.Z();
            }
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: drij
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i8 = i;
                    drip.g(hkx.this, (hfd) obj, hip.a(i8 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
