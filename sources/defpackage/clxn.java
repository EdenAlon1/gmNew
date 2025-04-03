package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clxn extends clys {
    private final long a;
    private final long b;

    public clxn(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.clys
    public final long a() {
        return this.b;
    }

    @Override // defpackage.clys
    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof clys) {
            clys clysVar = (clys) obj;
            if (this.a == clysVar.b() && this.b == clysVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return ((int) (j ^ (j >>> 32))) ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "GoogleTosImpressionsCountHolder{repromptCount=" + this.a + ", impressionsCount=" + this.b + "}";
    }
}
