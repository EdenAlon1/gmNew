package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkbe extends dkbq {
    public final ezez a;
    public final String b;
    public final String c;
    public final eyzf d;
    public final int e;

    public dkbe(ezez ezezVar, int i, String str, String str2, eyzf eyzfVar) {
        this.a = ezezVar;
        this.e = i;
        this.b = str;
        this.c = str2;
        this.d = eyzfVar;
    }

    @Override // defpackage.dkbq
    public final eyzf a() {
        return this.d;
    }

    @Override // defpackage.dkbq
    public final ezez b() {
        return this.a;
    }

    @Override // defpackage.dkbq
    public final String c() {
        return this.c;
    }

    @Override // defpackage.dkbq
    public final String d() {
        return this.b;
    }

    @Override // defpackage.dkbq
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dkbq) {
            dkbq dkbqVar = (dkbq) obj;
            if (this.a.equals(dkbqVar.b()) && this.e == dkbqVar.e() && this.b.equals(dkbqVar.d()) && this.c.equals(dkbqVar.c()) && this.d.equals(dkbqVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.e) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        eyzf eyzfVar = this.d;
        int i = this.e;
        return "ProvisioningHttpResponse{requestState=" + this.a.toString() + ", provisioningEngineWorker=" + ezew.a(i) + ", requestId=" + this.b + ", provisioningSessionId=" + this.c + ", httpResponseEvent=" + String.valueOf(eyzfVar) + "}";
    }
}
