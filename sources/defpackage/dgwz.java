package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgwz extends dgxe {
    public final dgxb a;
    public final dgxd b;
    public final long c;
    private final dgxh d;
    private final dgxc e;

    public dgwz(dgxb dgxbVar, dgxh dgxhVar, dgxd dgxdVar, dgxc dgxcVar, long j) {
        this.a = dgxbVar;
        this.d = dgxhVar;
        this.b = dgxdVar;
        this.e = dgxcVar;
        this.c = j;
    }

    @Override // defpackage.dgxe
    public final long a() {
        return this.c;
    }

    @Override // defpackage.dgxe
    public final dgxb b() {
        return this.a;
    }

    @Override // defpackage.dgxe
    public final dgxc c() {
        return this.e;
    }

    @Override // defpackage.dgxe
    public final dgxd d() {
        return this.b;
    }

    @Override // defpackage.dgxe
    public final dgxh e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dgxe) {
            dgxe dgxeVar = (dgxe) obj;
            if (this.a.equals(dgxeVar.b()) && this.d.equals(dgxeVar.e()) && this.b.equals(dgxeVar.d()) && this.e.equals(dgxeVar.c()) && this.c == dgxeVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.e.hashCode();
        long j = this.c;
        return (hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        dgxc dgxcVar = this.e;
        dgxd dgxdVar = this.b;
        dgxh dgxhVar = this.d;
        return "Signals{buildInfo=" + this.a.toString() + ", systemProperties=" + dgxhVar.toString() + ", identifiers=" + dgxdVar.toString() + ", callerInfo=" + dgxcVar.toString() + ", signalCollectionTimeMillis=" + this.c + "}";
    }
}
