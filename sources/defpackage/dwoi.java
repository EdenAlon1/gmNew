package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwoi extends dwrs {
    public final boolean a;
    public final boolean b;
    private final emxc c;
    private final emxc d;
    private final emxc e;
    private final emxc f;

    public dwoi(boolean z, emxc emxcVar, emxc emxcVar2, emxc emxcVar3, emxc emxcVar4, boolean z2) {
        this.a = z;
        this.c = emxcVar;
        this.d = emxcVar2;
        this.e = emxcVar3;
        this.f = emxcVar4;
        this.b = z2;
    }

    @Override // defpackage.dwrs
    public final emxc a() {
        return this.e;
    }

    @Override // defpackage.dwrs
    public final emxc b() {
        return this.c;
    }

    @Override // defpackage.dwrs
    public final emxc c() {
        return this.d;
    }

    @Override // defpackage.dwrs
    public final emxc d() {
        return this.f;
    }

    @Override // defpackage.dwrs
    public final boolean e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwrs) {
            dwrs dwrsVar = (dwrs) obj;
            if (this.a == dwrsVar.e()) {
                dwrsVar.g();
                if (this.c.equals(dwrsVar.b()) && this.d.equals(dwrsVar.c()) && this.e.equals(dwrsVar.a()) && this.f.equals(dwrsVar.d())) {
                    dwrsVar.h();
                    if (this.b == dwrsVar.f()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.dwrs
    public final boolean f() {
        return this.b;
    }

    public final int hashCode() {
        return (((((((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 1237) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "GetFileGroupsByFilterRequest{includeAllGroups=" + this.a + ", groupWithNoAccountOnly=false, groupNameOptional=Optional.absent(), groupNamePrefixOptional=Optional.absent(), accountOptional=Optional.absent(), sourceOptional=Optional.absent(), preserveZipDirectories=false, verifyIsolatedStructure=" + this.b + "}";
    }

    @Override // defpackage.dwrs
    public final void g() {
    }

    @Override // defpackage.dwrs
    public final void h() {
    }
}
