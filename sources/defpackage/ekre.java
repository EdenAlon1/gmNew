package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekre extends ekrj {
    private final ekrk a;
    private final long b;

    public ekre(ekrk ekrkVar, long j) {
        if (ekrkVar == null) {
            throw new NullPointerException("Null constraintType");
        }
        this.a = ekrkVar;
        this.b = j;
    }

    @Override // defpackage.ekrj
    public final long a() {
        return this.b;
    }

    @Override // defpackage.ekrj
    public final ekrk b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ekrj) {
            ekrj ekrjVar = (ekrj) obj;
            if (this.a.equals(ekrjVar.b()) && this.b == ekrjVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "SyncConstraint{constraintType=" + this.a.toString() + ", applicablePeriod=" + this.b + "}";
    }
}
