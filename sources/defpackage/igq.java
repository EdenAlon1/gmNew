package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class igq {
    private ibx a;
    private float b = 1.0f;
    private kah c = kah.a;

    public abstract long a();

    protected abstract void b(ifr ifrVar);

    protected void c(float f) {
        throw null;
    }

    protected void d(ibx ibxVar) {
        throw null;
    }

    public final void e(ifr ifrVar, long j, float f, ibx ibxVar) {
        if (this.b != f) {
            c(f);
            this.b = f;
        }
        if (!ffkj.e(this.a, ibxVar)) {
            d(ibxVar);
            this.a = ibxVar;
        }
        kah q = ifrVar.q();
        if (this.c != q) {
            f(q);
            this.c = q;
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (ifrVar.b() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (ifrVar.b() & 4294967295L)) - Float.intBitsToFloat(i2);
        ifrVar.t().c.f(intBitsToFloat, intBitsToFloat2);
        float f2 = -intBitsToFloat;
        float f3 = -intBitsToFloat2;
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    b(ifrVar);
                }
            } finally {
                ifrVar.t().c.f(f2, f3);
            }
        }
    }

    protected void f(kah kahVar) {
    }
}
