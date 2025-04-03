package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkbc extends dkbn {
    public final String a;
    public final String b;
    private final ezez c;
    private final String d;
    private final Optional e;
    private final eyzd f;
    private final Optional g;
    private final int h;

    public dkbc(ezez ezezVar, int i, String str, String str2, String str3, Optional optional, eyzd eyzdVar, Optional optional2) {
        this.c = ezezVar;
        this.h = i;
        this.a = str;
        this.b = str2;
        this.d = str3;
        this.e = optional;
        this.f = eyzdVar;
        this.g = optional2;
    }

    @Override // defpackage.dkbn
    public final eyzd a() {
        return this.f;
    }

    @Override // defpackage.dkbn
    public final ezez b() {
        return this.c;
    }

    @Override // defpackage.dkbn
    public final Optional c() {
        return this.g;
    }

    @Override // defpackage.dkbn
    public final Optional d() {
        return this.e;
    }

    @Override // defpackage.dkbn
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dkbn) {
            dkbn dkbnVar = (dkbn) obj;
            if (this.c.equals(dkbnVar.b()) && this.h == dkbnVar.h() && this.a.equals(dkbnVar.g()) && this.b.equals(dkbnVar.f()) && this.d.equals(dkbnVar.e()) && this.e.equals(dkbnVar.d()) && this.f.equals(dkbnVar.a()) && this.g.equals(dkbnVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dkbn
    public final String f() {
        return this.b;
    }

    @Override // defpackage.dkbn
    public final String g() {
        return this.a;
    }

    @Override // defpackage.dkbn
    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.h) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        Optional optional = this.g;
        eyzd eyzdVar = this.f;
        Optional optional2 = this.e;
        int i = this.h;
        return "ProvisioningHttpRequest{requestState=" + this.c.toString() + ", provisioningEngineWorker=" + ezew.a(i) + ", requestId=" + this.a + ", provisioningSessionId=" + this.b + ", constructedServerUrl=" + this.d + ", requestPath=" + String.valueOf(optional2) + ", httpRequestEvent=" + String.valueOf(eyzdVar) + ", droidGuardAttestation=" + String.valueOf(optional) + "}";
    }
}
