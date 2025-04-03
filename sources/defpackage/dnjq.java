package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnjq {
    public static final void a(final String str, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1014465960);
        if (i3 == 0) {
            i2 = i | (true != b.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            dwjt.b(str, null, gft.a(b).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(b).k, hfdVar2, i2 & 14, 0, 65530);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnjk
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dnjq.a(str, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final String str, final boolean z, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-456817754);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            b.v(594473987);
            jlj jljVar = new jlj((byte[]) null);
            int a = jljVar.a(gft.d(b).j.b);
            try {
                jljVar.f(str);
                jljVar.h(a);
                b.v(594477453);
                if (z) {
                    a = jljVar.a(gft.d(b).o.b);
                    try {
                        jljVar.f(" " + jii.a(R.string.sim_default_subtitle, b));
                    } finally {
                    }
                }
                hfm hfmVar = (hfm) b;
                hfmVar.Z();
                jlm b2 = jljVar.b();
                hfmVar.Z();
                hfdVar2 = b;
                dwjt.a(b2, null, 0L, 0L, 0L, null, 0L, 0, false, 0, null, null, null, hfdVar2, 0, 0, 131070);
            } finally {
            }
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnjj
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i4 = i;
                    dnjq.b(str2, z, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final hvi hviVar, final dwn dwnVar, final ffix ffixVar, final ffjn ffjnVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(1850257016);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dwnVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffixVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffjnVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            d = ebs.d(hviVar, 1.0f);
            hvi e = eba.e(dfb.c(hxo.a(eba.i(d, 0.0f, 2.0f, 1), eqm.b(24.0f)), dwnVar, gkw.a(false, 0.0f, 0L, 7), false, null, null, ffixVar, 28), 16.0f, 6.0f);
            int i4 = huo.a;
            int i5 = (i2 & 7168) | 384;
            ipn a = ebm.a(dxu.a, hum.n, b, 48);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, e);
            int i6 = ist.a;
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
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
            ffjnVar.a(ebr.a, b, Integer.valueOf(((i5 >> 6) & 112) | 6));
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnji
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    dwn dwnVar2 = dwnVar;
                    ffix ffixVar3 = ffixVar;
                    dnjq.c(hviVar2, dwnVar2, ffixVar3, ffjnVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final dnjs dnjsVar, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        final hvi hviVar2 = hviVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(-992495957);
        if (i3 == 0) {
            i2 = (true != b.D(dnjsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar2) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else if (((Boolean) dooy.b(b).s.invoke()).booleanValue()) {
            b.v(1703602855);
            b.v(332051947);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new dwn();
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hvi c = dfb.c(hviVar2, (dwn) R, gkw.a(false, 0.0f, 0L, 7), false, null, null, dnjsVar.e, 28);
            String str = dnjsVar.b;
            b.v(332061567);
            hpn d = str == null ? null : hpx.d(-892869015, new dnjl(str), b);
            hfmVar.Z();
            dwhr.a(hpx.d(-1535365742, new dnjm(dnjsVar), b), c, null, d, hpx.d(-2073696498, new dnjn(dnjsVar), b), hpx.d(2086688109, new dnjo(dnjsVar), b), dwhp.a(ibw.g, b, 510), b, 221190, 388);
            hfdVar2 = b;
            hfmVar.Z();
            hviVar2 = hviVar;
        } else {
            hfdVar2 = b;
            hfdVar2.v(1704205247);
            hfdVar2.v(332069355);
            hfm hfmVar2 = (hfm) hfdVar2;
            Object R2 = hfmVar2.R();
            if (R2 == hfc.a) {
                R2 = new dwn();
                hfmVar2.ad(R2);
            }
            dwn dwnVar = (dwn) R2;
            hfmVar2.Z();
            hviVar2 = hviVar;
            c(hviVar2, dwnVar, dnjsVar.e, hpx.d(-1490450057, new dnjp(dnjsVar, dwnVar), hfdVar2), hfdVar2, ((i2 >> 3) & 14) | 3120);
            hfmVar2.Z();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnjh
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnjs dnjsVar2 = dnjs.this;
                    int i4 = i;
                    dnjq.d(dnjsVar2, hviVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
