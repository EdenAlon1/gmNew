package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwoc extends dwnz {
    public final dwpj a;
    public final emxc b;
    public final emxc c;

    public dwoc(dwpj dwpjVar, emxc emxcVar, emxc emxcVar2) {
        this.a = dwpjVar;
        this.b = emxcVar;
        this.c = emxcVar2;
    }

    @Override // defpackage.dwnz
    public final dwpj a() {
        return this.a;
    }

    @Override // defpackage.dwnz
    public final emxc b() {
        return this.b;
    }

    @Override // defpackage.dwnz
    public final emxc c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwnz) {
            dwnz dwnzVar = (dwnz) obj;
            if (this.a.equals(dwnzVar.a()) && this.b.equals(dwnzVar.b()) && this.c.equals(dwnzVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        emxc emxcVar = this.c;
        emxc emxcVar2 = this.b;
        return "AddFileGroupRequest{dataFileGroup=" + this.a.toString() + ", accountOptional=" + String.valueOf(emxcVar2) + ", variantIdOptional=" + String.valueOf(emxcVar) + "}";
    }
}
