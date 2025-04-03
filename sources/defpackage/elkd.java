package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elkd extends elkp {
    public final long a;
    public final emxc b;

    public elkd(long j, emxc emxcVar) {
        this.a = j;
        this.b = emxcVar;
    }

    @Override // defpackage.elkp
    public final long a() {
        return this.a;
    }

    @Override // defpackage.elkp
    public final emxc b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof elkp) {
            elkp elkpVar = (elkp) obj;
            if (this.a == elkpVar.a() && this.b.equals(elkpVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ParentInfo{ancestorRegionId=" + this.a + ", asyncInfo=" + this.b.toString() + "}";
    }
}
