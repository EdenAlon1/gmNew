package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekc {
    public static final void a(Object obj, int i, ekd ekdVar, ffjm ffjmVar, hfd hfdVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        hfd b = hfdVar.b(-2079116560);
        if (i4 == 0) {
            i3 = (true != b.F(obj) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b.B(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != b.F(ekdVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != b.F(ffjmVar) ? 1024 : 2048;
        }
        if (b.J((i3 & 1171) != 1170, i3 & 1)) {
            boolean D = b.D(obj) | b.D(ekdVar);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = new ejy(obj, ekdVar);
                hfmVar.ad(R);
            }
            ejy ejyVar = (ejy) R;
            ejyVar.b = i;
            ejy ejyVar2 = (ejy) b.e(iqi.a);
            hrw a = hrv.a();
            ffji k = a != null ? a.k() : null;
            hrw b2 = hrv.b(a);
            try {
                if (ejyVar2 != ejyVar.b()) {
                    ejyVar.e.b(ejyVar2);
                    if (ejyVar.c > 0) {
                        ejy ejyVar3 = ejyVar.f;
                        if (ejyVar3 != null) {
                            ejyVar3.a();
                        }
                        if (ejyVar2 != null) {
                            ejyVar2.c();
                        } else {
                            ejyVar2 = null;
                        }
                        ejyVar.f = ejyVar2;
                    }
                }
                hrv.e(a, b2, k);
                boolean D2 = b.D(ejyVar);
                Object R2 = hfmVar.R();
                if (D2 || R2 == hfc.a) {
                    R2 = new eka(ejyVar);
                    hfmVar.ad(R2);
                }
                hgs.c(ejyVar, (ffji) R2, b);
                hfz.a(iqi.a.c(ejyVar), ffjmVar, b, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                hrv.e(a, b2, k);
                throw th;
            }
        } else {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ekb(obj, i, ekdVar, ffjmVar, i2);
        }
    }
}
