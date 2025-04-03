package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqs {
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        lvf.N(0);
        lvf.N(1);
        lvf.N(2);
        lvf.N(3);
        lvf.N(4);
    }

    public lqs(lqr lqrVar) {
        long j = lqrVar.a;
        long j2 = lqrVar.b;
        long j3 = lqrVar.c;
        float f = lqrVar.d;
        float f2 = lqrVar.e;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = f;
        this.e = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqs)) {
            return false;
        }
        lqs lqsVar = (lqs) obj;
        return this.a == lqsVar.a && this.b == lqsVar.b && this.c == lqsVar.c && this.d == lqsVar.d && this.e == lqsVar.e;
    }

    public final int hashCode() {
        float f = this.d;
        int floatToIntBits = f != 0.0f ? Float.floatToIntBits(f) : 0;
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        float f2 = this.e;
        return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + floatToIntBits) * 31) + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }
}
