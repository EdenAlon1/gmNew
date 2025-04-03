package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekls extends eklx {
    private final long a;
    private final long b;

    public ekls(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.eklx
    public final long a() {
        return this.b;
    }

    @Override // defpackage.eklx
    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eklx) {
            eklx eklxVar = (eklx) obj;
            if (this.a == eklxVar.b() && this.b == eklxVar.a()) {
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
        return "LogReport{timestampMillis=" + this.a + ", size=" + this.b + "}";
    }
}
