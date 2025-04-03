package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffb extends ffkk implements ffjo {
    final /* synthetic */ fft a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffb(fft fftVar) {
        super(4);
        this.a = fftVar;
    }

    @Override // defpackage.ffjo
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        float intBitsToFloat;
        float intBitsToFloat2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ioc iocVar = (ioc) obj2;
        long j = ((iak) obj3).a;
        fdh fdhVar = (fdh) obj4;
        long g = iocVar.g();
        iam iamVar = new iam(0.0f, 0.0f, (int) (g >> 32), (int) (g & 4294967295L));
        if (!ffu.c(iamVar, j)) {
            int i = (int) (j >> 32);
            if (Float.intBitsToFloat(i) < iamVar.b) {
                intBitsToFloat = iamVar.b;
            } else {
                intBitsToFloat = Float.intBitsToFloat(i) > iamVar.d ? iamVar.d : Float.intBitsToFloat(i);
            }
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i2) < iamVar.c) {
                intBitsToFloat2 = iamVar.c;
            } else {
                intBitsToFloat2 = Float.intBitsToFloat(i2) > iamVar.e ? iamVar.e : Float.intBitsToFloat(i2);
            }
            j = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        }
        long a = this.a.a(iocVar, j);
        if ((9223372034707292159L & a) != 9205357640488583168L) {
            this.a.s(booleanValue);
            fft fftVar = this.a;
            fftVar.i = null;
            fftVar.E(a, 9205357640488583168L, false, fdhVar);
            this.a.e.b();
            this.a.u(false);
        }
        return ffcu.a;
    }
}
