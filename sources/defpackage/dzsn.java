package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzsn extends dzsq {
    private final String a;
    private final int b;

    public dzsn(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.dzsq
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dzsq
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzsq) {
            dzsq dzsqVar = (dzsq) obj;
            if (this.a.equals(dzsqVar.b()) && this.b == dzsqVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "LighterMediaId{resourceId=" + this.a + ", resourceRegion=" + this.b + "}";
    }
}
