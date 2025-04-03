package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbby implements dazo {
    private final String a;
    private final dbcc b;

    public dbby(String str, dbca dbcaVar) {
        this.a = str;
        this.b = new dbcc(dbcaVar);
    }

    @Override // defpackage.dazo
    public final String a() {
        return this.a;
    }

    @Override // defpackage.dazo
    public final void b(hfd hfdVar) {
        hfdVar.v(1779468213);
        Object f = hfdVar.f();
        if (f == hfc.a) {
            f = hgs.a(ffhe.a, hfdVar);
            hfdVar.y(f);
        }
        dbcc dbccVar = this.b;
        ffsk ffskVar = (ffsk) f;
        hfdVar.v(-164622227);
        boolean F = hfdVar.F(ffskVar);
        Object f2 = hfdVar.f();
        if (F || f2 == hfc.a) {
            f2 = new dbbx(ffskVar, null);
            hfdVar.y(f2);
        }
        hfdVar.o();
        c((ddyq) ddyy.a(dbccVar, (ffjm) f2, hfdVar, 0).a(), hfdVar, 0);
        hfdVar.o();
    }

    public final void c(final ddyq ddyqVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-874764996);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? b.D(ddyqVar) : b.F(ddyqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(this) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            fim.a(eba.d(hvi.e, 10.0f), gft.a(b).r, 0.0f, hpx.d(-1618084615, new dbbw(ddyqVar, this), b), b, 1572870, 58);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dbbu
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dbby dbbyVar = dbby.this;
                    int i4 = i;
                    dbbyVar.c(ddyqVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public final void d(final csgg csggVar, final int i, hfd hfdVar, final int i2) {
        int i3;
        hvi a;
        hfd hfdVar2;
        hvi a2;
        int i4 = i2 & 6;
        hfd b = hfdVar.b(778872385);
        if (i4 == 0) {
            i3 = (true != b.D(csggVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b.B(i) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            int i5 = huo.a;
            hus husVar = hum.n;
            hvi e = ebs.e(hvi.e, 25.0f);
            ipn a3 = ebm.a(dxu.a, husVar, b, 48);
            int a4 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, e);
            int i6 = ist.a;
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
            ebr ebrVar = ebr.a;
            String name = csggVar.name();
            jpo jpoVar = gft.d(b).k;
            long j = gft.a(b).s;
            a = ebrVar.a(jfw.a(hvi.e, "Label for '" + csggVar.name() + "'"), 0.8f, true);
            hfdVar2 = b;
            dwjt.b(name, a, j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jpoVar, hfdVar2, 0, 0, 65528);
            String valueOf2 = String.valueOf(i);
            jpo y = jpo.y(gft.d(hfdVar2).k, 0L, 0L, jsy.h, null, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777211);
            long j2 = gft.a(hfdVar2).s;
            a2 = ebrVar.a(jfw.a(hvi.e, "Count for '" + csggVar.name() + "'"), 0.19999999f, true);
            dwjt.b(valueOf2, a2, j2, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, y, hfdVar2, 0, 0, 65528);
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dbbv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dbby dbbyVar = dbby.this;
                    csgg csggVar2 = csggVar;
                    int i7 = i2;
                    dbbyVar.d(csggVar2, i, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
