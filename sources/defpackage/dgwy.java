package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgwy extends dgxd {
    public final emxc a;
    private final emxc b;

    public dgwy(emxc emxcVar, emxc emxcVar2) {
        this.a = emxcVar;
        this.b = emxcVar2;
    }

    @Override // defpackage.dgxd
    public final emxc a() {
        return this.a;
    }

    @Override // defpackage.dgxd
    public final emxc b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dgxd) {
            dgxd dgxdVar = (dgxd) obj;
            if (this.a.equals(dgxdVar.a()) && this.b.equals(dgxdVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "Identifiers{androidId=" + this.a.toString() + ", ssaidDerivative=Optional.absent()}";
    }
}
