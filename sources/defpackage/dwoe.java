package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwoe extends dwqp {
    public final String a;
    public final emxc b;
    public final emxc c;
    public final emxc d;
    public final emxc e;
    public final boolean f;
    public final int g;
    private final emxc h;
    private final emxc i;
    private final emxc j;

    public dwoe(String str, emxc emxcVar, emxc emxcVar2, emxc emxcVar3, emxc emxcVar4, emxc emxcVar5, emxc emxcVar6, emxc emxcVar7, int i, boolean z) {
        this.a = str;
        this.b = emxcVar;
        this.c = emxcVar2;
        this.h = emxcVar3;
        this.i = emxcVar4;
        this.j = emxcVar5;
        this.d = emxcVar6;
        this.e = emxcVar7;
        this.g = i;
        this.f = z;
    }

    @Override // defpackage.dwqp
    public final emxc a() {
        return this.b;
    }

    @Override // defpackage.dwqp
    public final emxc b() {
        return this.j;
    }

    @Override // defpackage.dwqp
    public final emxc c() {
        return this.i;
    }

    @Override // defpackage.dwqp
    public final emxc d() {
        return this.h;
    }

    @Override // defpackage.dwqp
    public final emxc e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwqp) {
            dwqp dwqpVar = (dwqp) obj;
            if (this.a.equals(dwqpVar.h()) && this.b.equals(dwqpVar.a()) && this.c.equals(dwqpVar.g()) && this.h.equals(dwqpVar.d()) && this.i.equals(dwqpVar.c()) && this.j.equals(dwqpVar.b()) && this.d.equals(dwqpVar.e()) && this.e.equals(dwqpVar.f())) {
                dwqpVar.k();
                dwqpVar.l();
                if (this.g == dwqpVar.j()) {
                    dwqpVar.m();
                    if (this.f == dwqpVar.i()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.dwqp
    public final emxc f() {
        return this.e;
    }

    @Override // defpackage.dwqp
    public final emxc g() {
        return this.c;
    }

    @Override // defpackage.dwqp
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 2040732332) * 583896283) ^ this.g) * 1000003) ^ 1237) * 1000003) ^ (true != this.f ? 1237 : 1231);
    }

    @Override // defpackage.dwqp
    public final boolean i() {
        return this.f;
    }

    @Override // defpackage.dwqp
    public final int j() {
        return this.g;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.d);
        String str = this.g != 1 ? "ALL" : "NONE";
        return "DownloadFileGroupRequest{groupName=" + this.a + ", accountOptional=" + valueOf + ", variantIdOptional=Optional.absent(), contentTitleOptional=Optional.absent(), contentTextOptional=Optional.absent(), contentIntentOptional=Optional.absent(), downloadConditionsOptional=" + valueOf2 + ", listenerOptional=Optional.absent(), groupSizeBytes=0, groupSizeBytesLong=0, showNotifications=" + str + ", preserveZipDirectories=false, verifyIsolatedStructure=" + this.f + "}";
    }

    @Override // defpackage.dwqp
    @Deprecated
    public final void k() {
    }

    @Override // defpackage.dwqp
    public final void l() {
    }

    @Override // defpackage.dwqp
    public final void m() {
    }
}
