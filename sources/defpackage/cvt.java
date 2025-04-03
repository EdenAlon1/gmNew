package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cvt extends ffkk implements ffix {
    final /* synthetic */ cwb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvt(cwb cwbVar) {
        super(0);
        this.a = cwbVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        cop copVar = this.a.i;
        Object[] objArr = copVar.b;
        Object[] objArr2 = copVar.c;
        long[] jArr = copVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = i - length;
                    int i3 = 0;
                    while (true) {
                        int i4 = 8 - ((~i2) >>> 31);
                        if (i3 >= i4) {
                            if (i4 != 8) {
                                break;
                            }
                        } else {
                            if ((255 & j) < 128) {
                                int i5 = (i << 3) + i3;
                                Object obj = objArr[i5];
                                if (((cvd) objArr2[i5]).k()) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                            i3++;
                        }
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return ffcu.a;
    }
}
