package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eli implements hrc, hqu {
    public final coq a;
    private final hrc b;
    private final hqu c;

    public eli(hrc hrcVar, Map map, hqu hquVar) {
        eld eldVar = new eld(hrcVar);
        hik hikVar = hrg.a;
        this.b = new hre(map, eldVar);
        this.c = hquVar;
        int i = cpj.a;
        this.a = new coq((byte[]) null);
    }

    @Override // defpackage.hrc
    public final Object a(String str) {
        return this.b.a(str);
    }

    @Override // defpackage.hrc
    public final Map b() {
        int i;
        coq coqVar = this.a;
        Object[] objArr = coqVar.b;
        long[] jArr = coqVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i2 << 3) + i4];
                            hra hraVar = (hra) this.c;
                            if (hraVar.c.b(obj) == null) {
                                hraVar.b.remove(obj);
                            }
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return this.b.b();
    }

    @Override // defpackage.hrc
    public final boolean c(Object obj) {
        return this.b.c(obj);
    }

    @Override // defpackage.hrc
    public final hrd d(String str, ffix ffixVar) {
        return this.b.d(str, ffixVar);
    }

    @Override // defpackage.hqu
    public final void e(Object obj, ffjm ffjmVar, hfd hfdVar) {
        hfdVar.v(-697180401);
        this.c.e(obj, ffjmVar, hfdVar);
        boolean F = hfdVar.F(this) | hfdVar.F(obj);
        hfm hfmVar = (hfm) hfdVar;
        Object R = hfmVar.R();
        if (F || R == hfc.a) {
            R = new elh(this, obj);
            hfmVar.ad(R);
        }
        hgs.c(obj, (ffji) R, hfdVar);
        hfmVar.Z();
    }
}
