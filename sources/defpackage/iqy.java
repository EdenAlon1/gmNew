package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iqy extends ffkk implements ffix {
    final /* synthetic */ irf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqy(irf irfVar) {
        super(0);
        this.a = irfVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        int i;
        ipa a = this.a.a();
        if (a.m != a.a.I().size()) {
            cop copVar = a.f;
            Object[] objArr = copVar.c;
            long[] jArr = copVar.a;
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
                                ((ior) objArr[(i2 << 3) + i4]).d = true;
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
            if (!a.a.ao()) {
                iui.az(a.a, false, 7);
            }
        }
        return ffcu.a;
    }
}
