package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwol extends dwxc {
    public final emxc a;
    public final emxc b;

    public dwol(emxc emxcVar, emxc emxcVar2) {
        this.a = emxcVar;
        this.b = emxcVar2;
    }

    @Override // defpackage.dwxc
    public final emxc a() {
        return this.b;
    }

    @Override // defpackage.dwxc
    public final emxc b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwxc) {
            dwxc dwxcVar = (dwxc) obj;
            if (this.a.equals(dwxcVar.b()) && this.b.equals(dwxcVar.a())) {
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
        return "RemoveFileGroupsByFilterRequest{sourceOptional=" + this.a.toString() + ", accountOptional=" + emxcVar.toString() + "}";
    }
}
