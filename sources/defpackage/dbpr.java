package defpackage;

import j$.time.Instant;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbpr {
    public final ffbr a;
    public final ffbr b;
    private final ffbr c;

    public dbpr(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.c = ffbrVar;
        this.a = ffbrVar2;
        this.b = ffbrVar3;
    }

    public static final Instant a(hho hhoVar) {
        return (Instant) hhoVar.a();
    }

    private static final ddyq f(hkx hkxVar) {
        return (ddyq) hkxVar.a();
    }

    private final Instant g(hfd hfdVar) {
        hfdVar.v(1637942445);
        hfdVar.v(-1812704796);
        hfm hfmVar = (hfm) hfdVar;
        Object R = hfmVar.R();
        if (R == hfc.a) {
            hic hicVar = new hic(Instant.ofEpochMilli(((cqoh) this.c.b()).f().toEpochMilli()), hla.a);
            hfmVar.ad(hicVar);
            R = hicVar;
        }
        hho hhoVar = (hho) R;
        hfmVar.Z();
        ffcu ffcuVar = ffcu.a;
        hfdVar.v(-1812700567);
        Object R2 = hfmVar.R();
        if (R2 == hfc.a) {
            R2 = new dbpl(hhoVar, null);
            hfmVar.ad(R2);
        }
        hfmVar.Z();
        hgs.g(ffcuVar, (ffjm) R2, hfdVar);
        Instant a = a(hhoVar);
        hfmVar.Z();
        return a;
    }

    public final void b(final dboj dbojVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1434031489);
        if (i3 == 0) {
            i2 = (true != b.D(dbojVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(this) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            b.v(1714042403);
            if (!dbojVar.a.isEmpty()) {
                d("Running", b, (i2 & 112) | 6);
                Iterator it = dbojVar.a.iterator();
                while (it.hasNext()) {
                    dbqa.e(g(b), (dbqc) it.next(), b, 0);
                }
            }
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            b.v(1714048393);
            if (!dbojVar.b.isEmpty()) {
                d("Scheduled", b, (i2 & 112) | 6);
                Iterator it2 = dbojVar.b.iterator();
                while (it2.hasNext()) {
                    dbqa.e(g(b), (dbqd) it2.next(), b, 0);
                }
            }
            hfmVar.Z();
            b.v(1714054566);
            if (!dbojVar.c.isEmpty()) {
                d("Finished", b, (i2 & 112) | 6);
                Iterator it3 = dbojVar.c.iterator();
                while (it3.hasNext()) {
                    dbqa.e(g(b), (dbqb) it3.next(), b, 0);
                }
            }
            hfmVar.Z();
            if (dbojVar.a.isEmpty() && dbojVar.b.isEmpty() && dbojVar.c.isEmpty()) {
                e("No PWQ Items", b, (i2 & 112) | 6);
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dbph
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dbpr dbprVar = dbpr.this;
                    int i4 = i;
                    dbprVar.b(dbojVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public final void c(hfd hfdVar, final int i) {
        int i2;
        hvi c;
        int i3;
        int i4 = i & 6;
        hfd b = hfdVar.b(-873097025);
        if (i4 == 0) {
            i2 = (true != b.F(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            c = dix.c(hvi.e, dix.a(0, b, 0, 1), false & ((r6 & 8) == 0), (r6 & 2) != 0, true);
            hvi a = jfw.a(c, "scrollview");
            dxq dxqVar = dxu.c;
            int i5 = huo.a;
            ipn a2 = dyo.a(dxqVar, hum.j, b, 0);
            int a3 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, a);
            i3 = ist.a;
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
            b.v(-1127718874);
            boolean F = b.F(this);
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new dbpk(this, null);
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hkx c2 = ddyy.c((ffji) R, b);
            ddyq f = f(c2);
            if (f instanceof ddyn) {
                b.v(-1127714963);
                e("Could not load data", b, ((i2 << 3) & 112) | 6);
                hfmVar.Z();
            } else if (f instanceof ddyo) {
                b.v(-1127712570);
                e("Loading Data", b, ((i2 << 3) & 112) | 6);
                hfmVar.Z();
            } else {
                if (!(f instanceof ddyp)) {
                    b.v(-1127716365);
                    hfmVar.Z();
                    throw new ffcd();
                }
                b.v(-1127710049);
                ddyq f2 = f(c2);
                f2.getClass();
                b((dboj) ((ddyp) f2).a, b, (i2 << 3) & 112);
                hfmVar.Z();
            }
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dbpj
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    dbpr.this.c((hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public final void d(final String str, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1054100247);
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
            dwjt.b(str, eba.e(hvi.e, 28.0f, 10.0f), gft.a(b).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(b).m, hfdVar2, (i2 & 14) | 48, 0, 65528);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dbpi
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dbpr dbprVar = dbpr.this;
                    int i4 = i;
                    dbprVar.d(str, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public final void e(final String str, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1570942307);
        if (i3 == 0) {
            i2 = i | (true != b.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            c = ebs.c(hvi.e, 1.0f);
            hvi e = eba.e(c, 0.0f, 40.0f);
            int i4 = huo.a;
            ipn a = dyo.a(dxu.c, hum.k, b, 48);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, e);
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
            hfdVar2 = b;
            dwjt.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(b).k, hfdVar2, i2 & 14, 0, 65534);
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dbpg
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dbpr dbprVar = dbpr.this;
                    int i6 = i;
                    dbprVar.e(str, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
