package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edvx extends edvy {
    private final int a;
    private final long b;

    public edvx(int i, long j) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.edvy
    public final int a() {
        return this.a;
    }

    @Override // defpackage.edvy
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edvy) {
            edvy edvyVar = (edvy) obj;
            if (this.a == edvyVar.a() && this.b == edvyVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ProjectId{customerId=" + this.a + ", projectId=" + this.b + "}";
    }
}
