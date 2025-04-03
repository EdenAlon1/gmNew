package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwog extends dwrq {
    public final String a;
    public final boolean b;
    private final emxc c;
    private final emxc d;

    public dwog(String str, emxc emxcVar, emxc emxcVar2, boolean z) {
        this.a = str;
        this.c = emxcVar;
        this.d = emxcVar2;
        this.b = z;
    }

    @Override // defpackage.dwrq
    public final emxc a() {
        return this.c;
    }

    @Override // defpackage.dwrq
    public final emxc b() {
        return this.d;
    }

    @Override // defpackage.dwrq
    public final String c() {
        return this.a;
    }

    @Override // defpackage.dwrq
    public final boolean d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwrq) {
            dwrq dwrqVar = (dwrq) obj;
            if (this.a.equals(dwrqVar.c()) && this.c.equals(dwrqVar.a()) && this.d.equals(dwrqVar.b())) {
                dwrqVar.e();
                if (this.b == dwrqVar.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 1237) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "GetFileGroupRequest{groupName=" + this.a + ", accountOptional=Optional.absent(), variantIdOptional=Optional.absent(), preserveZipDirectories=false, verifyIsolatedStructure=" + this.b + "}";
    }

    @Override // defpackage.dwrq
    public final void e() {
    }
}
