package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebpn extends ebry {
    public final ebrx a;
    public final ebsj b;

    public ebpn(ebrx ebrxVar, ebsj ebsjVar) {
        this.a = ebrxVar;
        this.b = ebsjVar;
    }

    @Override // defpackage.ebry
    public final ebrx a() {
        return this.a;
    }

    @Override // defpackage.ebry
    public final ebsj b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebry) {
            ebry ebryVar = (ebry) obj;
            if (this.a.equals(ebryVar.a()) && this.b.equals(ebryVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ebsj ebsjVar = this.b;
        return "ExpressSignInSpec{onContinueWithAccountListenerWithAsyncCallback=" + this.a.toString() + ", features=" + ebsjVar.toString() + "}";
    }
}
