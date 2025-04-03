package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebsc extends ebsj {
    public final emxc a;
    public final emxc b;
    public final emxc c;
    public final emxc d;
    public final emxc e;
    public final emxc f;
    public final ebss g;
    public final boolean h;
    public final ebsh i;

    public ebsc(emxc emxcVar, emxc emxcVar2, emxc emxcVar3, emxc emxcVar4, emxc emxcVar5, emxc emxcVar6, ebss ebssVar, boolean z, ebsh ebshVar) {
        this.a = emxcVar;
        this.b = emxcVar2;
        this.c = emxcVar3;
        this.d = emxcVar4;
        this.e = emxcVar5;
        this.f = emxcVar6;
        this.g = ebssVar;
        this.h = z;
        this.i = ebshVar;
    }

    @Override // defpackage.ebsj
    public final ebsi a() {
        return new ebsb(this);
    }

    @Override // defpackage.ebsj
    public final ebss b() {
        return this.g;
    }

    @Override // defpackage.ebsj
    public final emxc c() {
        return this.e;
    }

    @Override // defpackage.ebsj
    public final emxc d() {
        return this.c;
    }

    @Override // defpackage.ebsj
    public final emxc e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebsj) {
            ebsj ebsjVar = (ebsj) obj;
            if (this.a.equals(ebsjVar.h()) && this.b.equals(ebsjVar.e()) && this.c.equals(ebsjVar.d()) && this.d.equals(ebsjVar.f()) && this.e.equals(ebsjVar.c()) && this.f.equals(ebsjVar.g()) && this.g.equals(ebsjVar.b()) && this.h == ebsjVar.i() && equals(ebsjVar.j())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ebsj
    public final emxc f() {
        return this.d;
    }

    @Override // defpackage.ebsj
    public final emxc g() {
        return this.f;
    }

    @Override // defpackage.ebsj
    public final emxc h() {
        return this.a;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ hashCode();
    }

    @Override // defpackage.ebsj
    public final boolean i() {
        return this.h;
    }

    @Override // defpackage.ebsj
    public final ebsh j() {
        return this.i;
    }

    public final String toString() {
        ebsh ebshVar = this.i;
        ebss ebssVar = this.g;
        emxc emxcVar = this.f;
        emxc emxcVar2 = this.e;
        emxc emxcVar3 = this.d;
        emxc emxcVar4 = this.c;
        emxc emxcVar5 = this.b;
        return "ExpressSignInFeatures{signInWithoutAccountFeature=" + String.valueOf(this.a) + ", disclaimerFeature=" + String.valueOf(emxcVar5) + ", customHeaderContentFeature=" + String.valueOf(emxcVar4) + ", logoViewFeature=" + String.valueOf(emxcVar3) + ", cancelableFeature=" + String.valueOf(emxcVar2) + ", materialVersion=" + String.valueOf(emxcVar) + ", secondaryButtonStyleFeature=" + ebssVar.toString() + ", supportAccountSwitching=" + this.h + ", customContinueButtonTextsFactory=" + ebshVar.toString() + "}";
    }
}
