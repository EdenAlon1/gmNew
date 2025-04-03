package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ifn {
    public final /* synthetic */ ifl a;

    public ifn(ifl iflVar) {
        this.a = iflVar;
    }

    public final long a() {
        return this.a.a();
    }

    public final void b(float f, float f2, float f3, float f4, int i) {
        this.a.b().a(f, f2, f3, f4, i);
    }

    public final void c(float f, long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        ibt b = this.a.b();
        b.o(Float.intBitsToFloat(i2), Float.intBitsToFloat(i));
        b.k(f);
        b.o(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i));
    }

    public final void d(float f, float f2, long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        ibt b = this.a.b();
        b.o(Float.intBitsToFloat(i2), Float.intBitsToFloat(i));
        b.n(f, f2);
        b.o(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i));
    }

    public final void e(float f, float f2) {
        this.a.b().o(f, f2);
    }

    public final void f(float f, float f2) {
        ibt b = this.a.b();
        float intBitsToFloat = Float.intBitsToFloat((int) (a() >> 32)) - (f + 0.0f);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (a() & 4294967295L)) - (f2 + 0.0f);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) < 0.0f) {
            ick.a("Width and height must be greater than or equal to zero");
        }
        this.a.h(floatToRawIntBits);
        b.o(0.0f, 0.0f);
    }

    public final void g(icv icvVar) {
        this.a.b().r(icvVar);
    }
}
