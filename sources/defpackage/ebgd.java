package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebgd extends ebga {
    public final emxc a;
    public final emxc b;
    public final emxc c;
    public final emxc d;
    public final ebgw e;
    public final emxc f;
    public final ebgs g;
    public final emxc h;
    public final emxc i;
    public final engw j;
    public final ebgr k;
    public final emxc l;
    public final emxc m;
    public final emxc n;
    public final ebkq o;
    public final boolean p;
    public final Runnable q;

    public ebgd(emxc emxcVar, emxc emxcVar2, emxc emxcVar3, emxc emxcVar4, ebgw ebgwVar, emxc emxcVar5, ebgs ebgsVar, emxc emxcVar6, emxc emxcVar7, engw engwVar, ebgr ebgrVar, emxc emxcVar8, emxc emxcVar9, emxc emxcVar10, ebkq ebkqVar, boolean z, Runnable runnable) {
        this.a = emxcVar;
        this.b = emxcVar2;
        this.c = emxcVar3;
        this.d = emxcVar4;
        this.e = ebgwVar;
        this.f = emxcVar5;
        this.g = ebgsVar;
        this.h = emxcVar6;
        this.i = emxcVar7;
        this.j = engwVar;
        this.k = ebgrVar;
        this.l = emxcVar8;
        this.m = emxcVar9;
        this.n = emxcVar10;
        this.o = ebkqVar;
        this.p = z;
        this.q = runnable;
    }

    @Override // defpackage.ebga
    public final ebgr b() {
        return this.k;
    }

    @Override // defpackage.ebga
    public final ebgs c() {
        return this.g;
    }

    @Override // defpackage.ebga
    public final ebgw d() {
        return this.e;
    }

    @Override // defpackage.ebga
    public final ebkq e() {
        return this.o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebga) {
            ebga ebgaVar = (ebga) obj;
            if (this.a.equals(ebgaVar.j()) && this.b.equals(ebgaVar.l()) && this.c.equals(ebgaVar.i()) && this.d.equals(ebgaVar.n()) && this.e.equals(ebgaVar.d()) && this.f.equals(ebgaVar.o()) && this.g.equals(ebgaVar.c()) && this.h.equals(ebgaVar.h()) && this.i.equals(ebgaVar.f()) && enkr.h(this.j, ebgaVar.p()) && this.k.equals(ebgaVar.b()) && this.l.equals(ebgaVar.g()) && this.m.equals(ebgaVar.k()) && this.n.equals(ebgaVar.m())) {
                ebgaVar.s();
                ebgaVar.t();
                if (this.o.equals(ebgaVar.e()) && this.p == ebgaVar.r() && this.q.equals(ebgaVar.q())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ebga
    public final emxc f() {
        return this.i;
    }

    @Override // defpackage.ebga
    public final emxc g() {
        return this.l;
    }

    @Override // defpackage.ebga
    public final emxc h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 1237) * 1000003) ^ 1) * 1000003) ^ this.o.hashCode()) * 1000003) ^ (true == this.p ? 1231 : 1237)) * 1000003) ^ this.q.hashCode();
    }

    @Override // defpackage.ebga
    public final emxc i() {
        return this.c;
    }

    @Override // defpackage.ebga
    public final emxc j() {
        return this.a;
    }

    @Override // defpackage.ebga
    public final emxc k() {
        return this.m;
    }

    @Override // defpackage.ebga
    public final emxc l() {
        return this.b;
    }

    @Override // defpackage.ebga
    public final emxc m() {
        return this.n;
    }

    @Override // defpackage.ebga
    public final emxc n() {
        return this.d;
    }

    @Override // defpackage.ebga
    public final emxc o() {
        return this.f;
    }

    @Override // defpackage.ebga
    public final engw p() {
        return this.j;
    }

    @Override // defpackage.ebga
    public final Runnable q() {
        return this.q;
    }

    @Override // defpackage.ebga
    public final boolean r() {
        return this.p;
    }

    public final String toString() {
        return "AccountMenuFeatures{deactivatedAccountsFeature=" + String.valueOf(this.a) + ", incognitoFeature=" + String.valueOf(this.b) + ", customIncognitoActionFeature=" + String.valueOf(this.c) + ", obakeFeature=" + String.valueOf(this.d) + ", policyFooterCustomizer=" + this.e.toString() + ", useWithoutAnAccountActionFeature=" + String.valueOf(this.f) + ", flavorsFeature=" + this.g.toString() + ", criticalAlertFeature=" + String.valueOf(this.h) + ", accountMessagesFeature=" + String.valueOf(this.i) + ", commonActions=" + this.j.toString() + ", educationManager=" + this.k.toString() + ", countDecorationGenerator=" + String.valueOf(this.l) + ", disableAccountSwitchingFeature=" + String.valueOf(this.m) + ", launcherAppSpec=" + String.valueOf(this.n) + ", isExperimental=false, largeScreenDialogAlignment=ALIGN_CENTER, materialVersion=" + this.o.toString() + ", enableQuickProfileSwitching=" + this.p + ", onSlowAccountSwitchingRunnable=" + this.q.toString() + "}";
    }

    @Override // defpackage.ebga
    public final void s() {
    }

    @Override // defpackage.ebga
    public final void t() {
    }
}
