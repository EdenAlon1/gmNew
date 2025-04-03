package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtw {
    private final dqs a;
    private long b;

    public dtw(dqs dqsVar, long j) {
        this.a = dqsVar;
        this.b = j;
    }

    public final float a(long j) {
        return Float.intBitsToFloat((int) (this.a == dqs.b ? j >> 32 : j & 4294967295L));
    }

    public final long b(iku ikuVar, float f) {
        long f2 = iak.f(this.b, iak.e(ikuVar.c, ikuVar.g));
        this.b = f2;
        if ((this.a == null ? iak.a(f2) : Math.abs(a(f2))) < f) {
            return 9205357640488583168L;
        }
        if (this.a == null) {
            long j = this.b;
            return iak.e(this.b, iak.g(iak.d(j, iak.a(j)), f));
        }
        float a = a(this.b) - (Math.signum(a(this.b)) * f);
        long j2 = this.b;
        float intBitsToFloat = Float.intBitsToFloat((int) (this.a == dqs.b ? j2 & 4294967295L : j2 >> 32));
        if (this.a == dqs.b) {
            return (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(a) << 32);
        }
        return (Float.floatToRawIntBits(a) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final void c() {
        this.b = 0L;
    }
}
