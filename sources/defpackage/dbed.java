package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbed {
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/debug/cloudstore/d2d/D2dToolsPage");
    public final babf b;
    public final Context c;
    public final ffss d;
    public final ffss e;
    private final ffsk f;

    /* compiled from: PG */
    public interface a {
        dbdp fu();
    }

    public dbed(babf babfVar, ffsk ffskVar, Context context) {
        babfVar.getClass();
        ffskVar.getClass();
        context.getClass();
        this.b = babfVar;
        this.f = ffskVar;
        this.c = context;
        this.d = ffra.b(ffskVar, ekxi.a(ffhe.a), ffsm.b, new dbeg(null, this));
        this.e = ffra.b(ffskVar, ekxi.a(ffhe.a), ffsm.b, new dbeh(null, this));
    }

    public final void a(hho hhoVar, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        final hho hhoVar2;
        hhoVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-1810785934);
        if (i3 == 0) {
            i2 = (true != b.D(hhoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(this) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hhoVar2 = hhoVar;
        } else {
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = hgs.a(ffhe.a, b);
                hfmVar.ad(R);
            }
            ffsk ffskVar = (ffsk) R;
            int i4 = huo.a;
            hun hunVar = hum.k;
            c = dix.c(hvi.e, dix.a(0, b, 0, 1), false & ((r6 & 8) == 0), (r6 & 2) != 0, true);
            ipn a2 = dyo.a(dxu.c, hunVar, b, 48);
            int a3 = hey.a(b);
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
            hlc.b(b, a2, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a3))) {
                Object valueOf = Integer.valueOf(a3);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            b.v(279514303);
            boolean F = b.F(this);
            Object R2 = hfmVar.R();
            if (F || R2 == hfc.a) {
                R2 = new dbec(this, null);
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            hhoVar2 = hhoVar;
            d(ffskVar, hhoVar2, (ffji) R2, b, ((i2 << 3) & 112) | 384 | ((i2 << 9) & 57344));
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dbdz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dbed dbedVar = dbed.this;
                    int i6 = i;
                    dbedVar.a(hhoVar2, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public final void b(hfd hfdVar, final int i) {
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(964275751);
        if (i3 == 0) {
            i2 = (true != b.F(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            b.v(1855687098);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic("", hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            hho hhoVar = (hho) R;
            hfmVar.Z();
            d = ebs.d(eba.j(hvi.e, 0.0f, 10.0f, 0.0f, 0.0f, 13), 1.0f);
            int i4 = huo.a;
            ipn a2 = dyo.a(dxu.c, hum.k, b, 48);
            int a3 = hey.a(b);
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
            hlc.b(b, a2, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            int i6 = (i2 << 3) & 112;
            a(hhoVar, b, i6);
            fjp.a(null, 0L, 0.0f, b, 0, 15);
            c((String) hhoVar.a(), b, i6);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dbdw
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i7 = i;
                    dbed.this.b((hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public final void c(final String str, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        str.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-1925167882);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            fnd.a(eba.f(hvi.e, 20.0f, 10.0f, 20.0f, 10.0f), null, dbdm.b, null, null, null, 0, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, hpx.d(1231822968, new dbef(str), b), hfdVar2, 384, 12582912, 131066);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dbdv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dbed dbedVar = dbed.this;
                    int i4 = i;
                    dbedVar.c(str, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public final void d(final ffsk ffskVar, final hho hhoVar, final ffji ffjiVar, hfd hfdVar, final int i) {
        int i2;
        ffskVar.getClass();
        ffjiVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(1626415649);
        if (i3 == 0) {
            i2 = (true != b.F(ffskVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hhoVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D("getDeltaSyncEligibility") ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffjiVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            b.v(-281272933);
            boolean F = b.F(ffjiVar) | ((i2 & 896) == 256) | b.F(ffskVar) | ((i2 & 112) == 32);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new ffix() { // from class: dbdx
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        axol.k(ffsk.this, null, new dbea(hhoVar, ffjiVar, null), 3);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            dwfj.a((ffix) R, jfw.a(hvi.e, "getDeltaSyncEligibilityButton"), false, null, null, null, null, null, hpx.d(-226498511, new dbeb(), b), b, 805306368, 508);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dbdy
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dbed dbedVar = dbed.this;
                    ffsk ffskVar2 = ffskVar;
                    hho hhoVar2 = hhoVar;
                    dbedVar.d(ffskVar2, hhoVar2, ffjiVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
