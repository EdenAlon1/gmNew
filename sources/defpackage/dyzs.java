package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyzs extends dzap {
    public final dzpk a;
    public final emxc b;

    public dyzs(dzpk dzpkVar, emxc emxcVar) {
        this.a = dzpkVar;
        this.b = emxcVar;
    }

    @Override // defpackage.dzap
    public final dzpk a() {
        return this.a;
    }

    @Override // defpackage.dzap
    public final emxc b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzap) {
            dzap dzapVar = (dzap) obj;
            if (this.a.equals(dzapVar.a()) && this.b.equals(dzapVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        emxc emxcVar = this.b;
        return "CreateGroup{conversation=" + this.a.toString() + ", groupInfo=" + emxcVar.toString() + "}";
    }
}
