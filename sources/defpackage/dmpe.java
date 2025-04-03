package defpackage;

import com.google.android.apps.messaging.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmpe {
    public static final void a(final dmpf dmpfVar, final ibw ibwVar, final boolean z, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        dmpfVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-577445018);
        if (i3 == 0) {
            i2 = (true != b.D(dmpfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(ibwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else if (z) {
            b.v(1655804871);
            dmna.a(new dmnb(dmpfVar.a, null, dmpfVar.e, dmpfVar.f, 2), new ibw(ibw.g), new ibw(gft.a(b).q), true, b, 3120, 0);
            ((hfm) b).Z();
        } else {
            b.v(1656214257);
            if (ibwVar != null) {
                b.v(1656246373);
                d = ebs.d(hvi.e, 1.0f);
                gpa.c(hxo.a(d, eqm.d(24.0f, 24.0f, 0.0f, 0.0f, 12)), null, ibwVar.i, 0L, 0.0f, 0.0f, null, hpx.d(-317247680, new dmpc(dmpfVar), b), b, 122);
                b = b;
                ((hfm) b).Z();
            } else {
                b.v(1656464954);
                d(dmpfVar, b, i2 & 14);
                ((hfm) b).Z();
            }
            ((hfm) b).Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmoz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmpf dmpfVar2 = dmpf.this;
                    ibw ibwVar2 = ibwVar;
                    int i4 = i;
                    dmpe.a(dmpfVar2, ibwVar2, z, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final String str, final ffji ffjiVar, ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        final ffix ffixVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1066983511);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjiVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffixVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            ffixVar2 = ffixVar;
        } else {
            d = ebs.d(hvi.e, 1.0f);
            hvi j = eba.j(d, 16.0f, 0.0f, 4.0f, 0.0f, 10);
            int i4 = huo.a;
            ipn a = ebm.a(dxu.a, hum.n, b, 48);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, j);
            int i5 = ist.a;
            ffix ffixVar3 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar3);
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
            int i6 = i2 << 3;
            c(ebr.a, str, ffjiVar, b, (i6 & 896) | (i6 & 112) | 6);
            ffixVar2 = ffixVar;
            dwhl.b(ffixVar2, null, false, null, null, dmko.a, b, ((i2 >> 6) & 14) | 1572864, 62);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmpb
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    ffji ffjiVar2 = ffjiVar;
                    int i7 = i;
                    dmpe.b(str2, ffjiVar2, ffixVar2, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final ebq ebqVar, final String str, final ffji ffjiVar, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        hvi a2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1642521056);
        if (i3 == 0) {
            i2 = (true != b.D(ebqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffjiVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            long j = gft.a(b).q;
            b.v(692229712);
            boolean C = b.C(j);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (C || R == hfc.a) {
                R = new hic(new idl(j), hla.a);
                hfmVar.ad(R);
            }
            hfmVar.Z();
            a = ebqVar.a(hvi.e, 1.0f, true);
            a2 = dlsj.a(a, jii.a(R.string.compose_subject_placeholder, b), true);
            int i4 = i2 >> 3;
            hfdVar2 = b;
            eri.d(str, ffjiVar, a2, false, jpo.y(gft.d(b).k, gft.a(b).q, 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214), new euw(3, null, 0, 0, 126), null, false, 2, 0, null, null, null, (idl) ((hho) R).a(), hpx.d(1091585923, new dmpd(str), b), hfdVar2, (i4 & 14) | 806879232 | (i4 & 112), 196608, 15768);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmpa
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ebq ebqVar2 = ebq.this;
                    String str2 = str;
                    int i5 = i;
                    dmpe.c(ebqVar2, str2, ffjiVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final dmpf dmpfVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-263108111);
        if (i3 == 0) {
            i2 = (true != b.D(dmpfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            hvi i4 = eba.i(hvi.e, 0.0f, 8.0f, 1);
            int i5 = huo.a;
            ipn a = dyo.a(dxu.c, hum.l, b, 48);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, i4);
            int i6 = ist.a;
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
            e(dmpfVar.b, dmpfVar.d, b, 0);
            b(dmpfVar.a, dmpfVar.c, dmpfVar.f, b, 0);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmoy
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i7 = i;
                    dmpe.d(dmpf.this, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final boolean z, final ffji ffjiVar, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1392555399);
        if (i3 == 0) {
            i2 = (true != b.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjiVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            final String a = jii.a(R.string.compose_urgent_checked, b);
            final String a2 = jii.a(R.string.compose_urgent_unchecked, b);
            hvi g = huz.g(eba.j(hvi.e, 0.0f, 0.0f, 14.0f, 0.0f, 11), new epv(z, ffjiVar));
            b.v(-1815212592);
            boolean D = b.D(a) | ((i2 & 14) == 4) | b.D(a2);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = new ffji() { // from class: dmow
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jkv jkvVar = (jkv) obj;
                        jkvVar.getClass();
                        jkr.t(jkvVar, true != z ? a2 : a);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            c = jjs.c(g, false, (ffji) R);
            dxi dxiVar = dxu.b;
            int i4 = huo.a;
            ipn a3 = ebm.a(dxiVar, hum.n, b, 54);
            int a4 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, c);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
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
            String upperCase = jii.a(R.string.compose_urgent_label, b).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            dwjt.b(upperCase, null, gft.a(b).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(b).n, b, 0, 0, 65530);
            ebv.a(ebs.o(hvi.e, 4.0f), b);
            dmkb.b(new dmke(z, ffjiVar, 9), ebs.k(hvi.e, 28.0f), b, 48, 0);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmox
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z2 = z;
                    int i6 = i;
                    dmpe.e(z2, ffjiVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
