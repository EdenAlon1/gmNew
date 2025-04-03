package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dywz extends dyxf {
    public final int a;
    public final long b;
    public final long c;
    public final double d;
    public final int e;

    public dywz(int i, long j, long j2, double d, int i2) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = i2;
    }

    @Override // defpackage.dyxf
    public final double a() {
        return this.d;
    }

    @Override // defpackage.dyxf
    public final int b() {
        return this.e;
    }

    @Override // defpackage.dyxf
    public final int c() {
        return this.a;
    }

    @Override // defpackage.dyxf
    public final long d() {
        return this.c;
    }

    @Override // defpackage.dyxf
    public final long e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyxf) {
            dyxf dyxfVar = (dyxf) obj;
            if (this.a == dyxfVar.c() && this.b == dyxfVar.e() && this.c == dyxfVar.d() && Double.doubleToLongBits(this.d) == Double.doubleToLongBits(dyxfVar.a()) && this.e == dyxfVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = (Double.doubleToLongBits(this.d) >>> 32) ^ Double.doubleToLongBits(this.d);
        return ((((int) doubleToLongBits) ^ ((((((this.a ^ 1000003) * 1000003) ^ ((int) this.b)) * 1000003) ^ ((int) this.c)) * 1000003)) * 1000003) ^ this.e;
    }

    public final String toString() {
        return "LighterRetryPolicy{maxRetries=" + this.a + ", maxDelayMs=" + this.b + ", initialDelayMs=" + this.c + ", backoff=" + this.d + ", jitterMs=" + this.e + "}";
    }
}
