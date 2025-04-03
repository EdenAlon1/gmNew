package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djrz {
    public final djrm a;
    public final djrj b;
    public final int c;

    public djrz(djrm djrmVar, djrj djrjVar, int i) {
        this.a = djrmVar;
        this.b = djrjVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djrz)) {
            return false;
        }
        djrz djrzVar = (djrz) obj;
        return ffkj.e(this.a, djrzVar.a) && ffkj.e(this.b, djrzVar.b) && djrq.b(this.c, djrzVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        djrj djrjVar = this.b;
        return ((hashCode + (djrjVar == null ? 0 : djrjVar.hashCode())) * 31) + this.c;
    }

    public final String toString() {
        return "IdentityMappingInfo(rcsProvisioningId=" + this.a + ", phoneNumber=" + this.b + ", subscriptionId=" + djrq.a(this.c) + ")";
    }
}
