package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkba extends dkbh {
    public final ezez a;
    public final String b;
    public final String c;
    public final eyyq d;
    public final int e;

    public dkba(ezez ezezVar, int i, String str, String str2, eyyq eyyqVar) {
        this.a = ezezVar;
        this.e = i;
        this.b = str;
        this.c = str2;
        this.d = eyyqVar;
    }

    @Override // defpackage.dkbh
    public final eyyq a() {
        return this.d;
    }

    @Override // defpackage.dkbh
    public final ezez b() {
        return this.a;
    }

    @Override // defpackage.dkbh
    public final String c() {
        return this.c;
    }

    @Override // defpackage.dkbh
    public final String d() {
        return this.b;
    }

    @Override // defpackage.dkbh
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dkbh) {
            dkbh dkbhVar = (dkbh) obj;
            if (this.a.equals(dkbhVar.b()) && this.e == dkbhVar.e() && this.b.equals(dkbhVar.d()) && this.c.equals(dkbhVar.c()) && this.d.equals(dkbhVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.e) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        eyyq eyyqVar = this.d;
        int i = this.e;
        return "ProvisioningHttpFailure{requestState=" + this.a.toString() + ", provisioningEngineWorker=" + ezew.a(i) + ", requestId=" + this.b + ", provisioningSessionId=" + this.c + ", httpFailureEvent=" + String.valueOf(eyyqVar) + "}";
    }
}
