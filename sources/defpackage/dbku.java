package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbku {
    public final dbjw a;
    public final List b = ffdx.g("Overview", "Tools");
    private final ffbz c;

    public dbku(dbjw dbjwVar) {
        this.a = dbjwVar;
        ffbz b = ffca.b(3, new dbkq(new dbkp(dbjwVar)));
        int i = fflc.a;
        this.c = new lmn(new ffkb(dbjv.class), new dbkr(b), new dbkt(dbjwVar, b), new dbks(b));
    }

    public static final boolean d(hkx hkxVar) {
        return ((Boolean) hkxVar.a()).booleanValue();
    }

    private final dbjv g() {
        return (dbjv) this.c.a();
    }

    public final void a(final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1170585426);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(this) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            gpa.c(hviVar, null, gft.a(b).p, 0L, 0.0f, 0.0f, null, hpx.d(1980449929, new dbkj(this), b), b, 122);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dbkb
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dbku dbkuVar = dbku.this;
                    int i4 = i;
                    dbkuVar.a(hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public final void b(hfd hfdVar, final int i) {
        int i2 = i & 1;
        hfd b = hfdVar.b(-479562167);
        if (i2 == 0 && b.I()) {
            b.s();
        } else {
            dwjt.b("This is the overview tab", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, b, 6, 0, 131070);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dbka
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i3 = i;
                    dbku.this.b((hfd) obj, hip.a(i3 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public final void c(hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1502958748);
        if (i3 == 0) {
            i2 = (true != b.F(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            dweu.a(dbiy.a, null, hpx.d(1994526122, new dbkl(this), b), null, 0.0f, null, null, null, b, 390, 250);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dbjx
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dbku.this.c((hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public final void e(hvi hviVar, final boolean z, final String str, final String str2, final ffix ffixVar, hfd hfdVar, final int i) {
        hfd hfdVar2;
        final hvi hviVar2;
        hfd b = hfdVar.b(865086422);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(str) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(str2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.F(ffixVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && b.I()) {
            b.s();
            hviVar2 = hviVar;
            hfdVar2 = b;
        } else {
            hve hveVar = hvi.e;
            hfdVar2 = b;
            gpa.c(eba.e(hveVar, 8.0f, 4.0f), null, gft.a(b).a, 0L, 0.0f, 0.0f, null, hpx.d(-1494242255, new dbke(str, ffixVar, z, str2), b), hfdVar2, 122);
            hviVar2 = hveVar;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dbkc
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dbku dbkuVar = dbku.this;
                    hvi hviVar3 = hviVar2;
                    boolean z2 = z;
                    String str3 = str;
                    String str4 = str2;
                    dbkuVar.e(hviVar3, z2, str3, str4, ffixVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public final void f(hvi hviVar, hfd hfdVar, final int i) {
        hfd b = hfdVar.b(1448283308);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= true != b.F(this) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            hve hveVar = hvi.e;
            final hkx a = hkf.a(g().g, b);
            final olu a2 = olz.a(g().h, null, b, 1);
            int i3 = huo.a;
            ipn a3 = dyc.a(hum.a, false);
            int a4 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hveVar);
            int i4 = ist.a;
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
            dyi dyiVar = dyi.a;
            hvi d = eba.d(hvi.e, 4.0f);
            b.v(-554469182);
            boolean F = b.F(a2) | b.F(this) | b.D(a);
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new ffji() { // from class: dbjy
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        edp edpVar = (edp) obj;
                        edpVar.getClass();
                        olu oluVar = olu.this;
                        eek.b(edpVar, oluVar.a(), null, new hpw(-859686008, true, new dbkm(oluVar, this, a)), 6);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hviVar = hveVar;
            edh.a(d, null, null, false, null, null, null, false, null, (ffji) R, b, 6, 510);
            b.v(-554450895);
            if (d(a)) {
                dwij.a(dyiVar.a(hvi.e, hum.e), gft.a(b).f, 0.0f, gft.a(b).r, 0, 0.0f, b, 0, 52);
                b = b;
            }
            hfmVar.Z();
            b.n();
        }
        final hvi hviVar2 = hviVar;
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dbjz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dbku dbkuVar = dbku.this;
                    int i5 = i;
                    dbkuVar.f(hviVar2, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
