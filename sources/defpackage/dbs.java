package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbs {
    static {
        ffca.b(3, dbg.a);
    }

    public static final dbe a(dbe dbeVar, Object obj, Object obj2, String str, hfd hfdVar, int i) {
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i2 > 4 && hfdVar.D(dbeVar)) || (i & 6) == 4;
        Object f = hfdVar.f();
        if (z2 || f == hfc.a) {
            f = new dbe(new czq(obj), dbeVar, dbeVar.b + " > " + str);
            hfdVar.y(f);
        }
        dbe dbeVar2 = (dbe) f;
        if ((i2 <= 4 || !hfdVar.D(dbeVar)) && (i & 6) != 4) {
            z = false;
        }
        boolean D = hfdVar.D(dbeVar2) | z;
        Object f2 = hfdVar.f();
        if (D || f2 == hfc.a) {
            f2 = new dbj(dbeVar, dbeVar2);
            hfdVar.y(f2);
        }
        hgs.c(dbeVar2, (ffji) f2, hfdVar);
        if (dbeVar.t()) {
            long j = dbeVar.f;
            dbeVar2.v(obj, obj2);
            return dbeVar2;
        }
        dbeVar2.q(obj2);
        dbeVar2.m(false);
        return dbeVar2;
    }

    public static final dbe b(dbt dbtVar, String str, hfd hfdVar, int i, int i2) {
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !hfdVar.D(dbtVar)) && (i & 6) != 4) {
            z = false;
        }
        Object f = hfdVar.f();
        if (z || f == hfc.a) {
            hrw a = hrv.a();
            ffji k = a != null ? a.k() : null;
            hrw b = hrv.b(a);
            try {
                if ((i2 & 2) != 0) {
                    str = null;
                }
                Object dbeVar = new dbe(dbtVar, null, str);
                hrv.e(a, b, k);
                hfdVar.y(dbeVar);
                f = dbeVar;
            } catch (Throwable th) {
                hrv.e(a, b, k);
                throw th;
            }
        }
        dbe dbeVar2 = (dbe) f;
        hfdVar.v(1031559675);
        dbeVar2.g(dbtVar.b(), hfdVar, 0);
        hfdVar.o();
        boolean D = hfdVar.D(dbeVar2);
        Object f2 = hfdVar.f();
        if (D || f2 == hfc.a) {
            f2 = new dbp(dbeVar2);
            hfdVar.y(f2);
        }
        hgs.c(dbeVar2, (ffji) f2, hfdVar);
        return dbeVar2;
    }

    @ffbs
    public static final dbe c(czq czqVar, String str, hfd hfdVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        return b(czqVar, str, hfdVar, i & 126, 0);
    }

    public static final dbe d(Object obj, String str, hfd hfdVar, int i, int i2) {
        hfm hfmVar = (hfm) hfdVar;
        Object R = hfmVar.R();
        if (R == hfc.a) {
            if ((i2 & 2) != 0) {
                str = null;
            }
            dbe dbeVar = new dbe(new czq(obj), null, str);
            hfmVar.ad(dbeVar);
            R = dbeVar;
        }
        dbe dbeVar2 = (dbe) R;
        dbeVar2.g(obj, hfdVar, (i & 8) | 48 | (i & 14));
        Object R2 = hfmVar.R();
        if (R2 == hfc.a) {
            R2 = new dbr(dbeVar2);
            hfmVar.ad(R2);
        }
        hgs.c(dbeVar2, (ffji) R2, hfdVar);
        return dbeVar2;
    }

    public static final void e(dbe dbeVar, daw dawVar, Object obj, Object obj2, cyq cyqVar, hfd hfdVar, int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(867041821);
        if (i3 == 0) {
            i2 = (true != b.D(dbeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dawVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? b.D(obj) : b.F(obj)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? b.D(obj2) : b.F(obj2)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ((32768 & i) == 0 ? b.D(cyqVar) : b.F(cyqVar)) ? 8192 : 16384;
        }
        if (!b.J((i2 & 9363) != 9362, i2 & 1)) {
            b.s();
        } else if (dbeVar.t()) {
            dawVar.j(obj, obj2, cyqVar);
        } else {
            dawVar.k(obj2, cyqVar);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new dbh(dbeVar, dawVar, obj, obj2, cyqVar, i);
        }
    }

    public static final hkx f(dbe dbeVar, Object obj, Object obj2, cyq cyqVar, dbv dbvVar, hfd hfdVar, int i) {
        Object obj3;
        int i2 = i & 14;
        int i3 = i2 ^ 6;
        boolean z = (i3 > 4 && hfdVar.D(dbeVar)) || (i & 6) == 4;
        Object f = hfdVar.f();
        if (z || f == hfc.a) {
            hrw a = hrv.a();
            ffji k = a != null ? a.k() : null;
            hrw b = hrv.b(a);
            try {
                obj3 = obj2;
                Object dawVar = new daw(dbeVar, obj, cxw.a(dbvVar, obj2), dbvVar);
                hrv.e(a, b, k);
                hfdVar.y(dawVar);
                f = dawVar;
            } catch (Throwable th) {
                hrv.e(a, b, k);
                throw th;
            }
        } else {
            obj3 = obj2;
        }
        int i4 = (i >> 3) & 8;
        int i5 = i << 3;
        int i6 = (i4 << 9) | i2 | (i4 << 6) | (i5 & 896) | (i5 & 7168) | (57344 & i5);
        daw dawVar2 = (daw) f;
        e(dbeVar, dawVar2, obj, obj3, cyqVar, hfdVar, i6);
        boolean D = hfdVar.D(dawVar2) | ((i3 > 4 && hfdVar.D(dbeVar)) || (i & 6) == 4);
        Object f2 = hfdVar.f();
        if (D || f2 == hfc.a) {
            f2 = new dbn(dbeVar, dawVar2);
            hfdVar.y(f2);
        }
        hgs.c(dawVar2, (ffji) f2, hfdVar);
        return dawVar2;
    }

    public static final das g(dbe dbeVar, dbv dbvVar, hfd hfdVar, int i) {
        dar a;
        int i2 = (i & 14) ^ 6;
        boolean z = (i2 > 4 && hfdVar.D(dbeVar)) || (i & 6) == 4;
        Object f = hfdVar.f();
        if (z || f == hfc.a) {
            f = new das(dbeVar, dbvVar);
            hfdVar.y(f);
        }
        das dasVar = (das) f;
        boolean F = hfdVar.F(dasVar) | ((i2 > 4 && hfdVar.D(dbeVar)) || (i & 6) == 4);
        Object f2 = hfdVar.f();
        if (F || f2 == hfc.a) {
            f2 = new dbl(dbeVar, dasVar);
            hfdVar.y(f2);
        }
        hgs.c(dasVar, (ffji) f2, hfdVar);
        if (dbeVar.t() && (a = dasVar.a()) != null) {
            dbe dbeVar2 = dasVar.a;
            a.a.j(a.c.invoke(dbeVar2.d().a()), a.c.invoke(dbeVar2.d().b()), (cyq) a.b.invoke(dbeVar2.d()));
        }
        return dasVar;
    }
}
