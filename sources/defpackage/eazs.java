package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eazs extends eazh {
    public final eawd a;
    public final eave b;
    public final eayo c;
    public final ebtw d;
    public final emxc e;
    public final emxc f;

    public eazs(eawd eawdVar, eave eaveVar, eayo eayoVar, ebtw ebtwVar, emxc emxcVar, emxc emxcVar2) {
        this.a = eawdVar;
        this.b = eaveVar;
        this.c = eayoVar;
        this.d = ebtwVar;
        this.e = emxcVar;
        this.f = emxcVar2;
    }

    @Override // defpackage.eazh
    public final eave a() {
        return this.b;
    }

    @Override // defpackage.eazh
    public final eawd b() {
        return this.a;
    }

    @Override // defpackage.eazh
    public final eayo c() {
        return this.c;
    }

    @Override // defpackage.eazh
    public final ebtw d() {
        return this.d;
    }

    @Override // defpackage.eazh
    public final emxc e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eazh) {
            eazh eazhVar = (eazh) obj;
            if (this.a.equals(eazhVar.b()) && this.b.equals(eazhVar.a()) && this.c.equals(eazhVar.c())) {
                eazhVar.g();
                if (this.d.equals(eazhVar.d()) && this.e.equals(eazhVar.e()) && this.f.equals(eazhVar.f())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.eazh
    public final emxc f() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * (-721379959)) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        emxc emxcVar = this.f;
        emxc emxcVar2 = this.e;
        ebtw ebtwVar = this.d;
        eayo eayoVar = this.c;
        eave eaveVar = this.b;
        return "AccountManagementSpec{avatarImageLoader=" + this.a.toString() + ", accountConverter=" + eaveVar.toString() + ", accountsModel=" + eayoVar.toString() + ", accountClass=null, oneGoogleEventLogger=" + ebtwVar.toString() + ", deactivatedAccountsFeature=" + String.valueOf(emxcVar2) + ", launcherAppDialogTracker=" + String.valueOf(emxcVar) + "}";
    }

    @Override // defpackage.eazh
    @Deprecated
    public final void g() {
    }
}
