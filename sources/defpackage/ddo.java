package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class ddo extends ffkh implements ffji {
    public ddo(Object obj) {
        super(1, obj, ddx.class, "onFocusChange", "onFocusChange(Z)V", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ddx ddxVar = (ddx) this.g;
        if (booleanValue) {
            ddxVar.j();
        } else {
            if (ddxVar.h != null) {
                coc cocVar = ddxVar.g;
                Object[] objArr = cocVar.c;
                long[] jArr = cocVar.a;
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
                                    ffqy.d(ddxVar.D(), null, null, new ddr(ddxVar, (dwp) objArr[(i2 << 3) + i4], null), 3);
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
            }
            ddxVar.g.e();
            ddxVar.k();
        }
        return ffcu.a;
    }
}
