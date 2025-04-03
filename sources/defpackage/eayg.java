package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eayg extends eayi {
    public final ksz a;
    public final ebtw b;
    public final ezoo c;
    public final ebvw d;
    public final eavd e;
    public final eavd f;
    public final ebny g;
    private final emxc h;
    private final emxc i;

    public eayg(ksz kszVar, ebtw ebtwVar, ezoo ezooVar, ebvw ebvwVar, eavd eavdVar, eavd eavdVar2, emxc emxcVar, emxc emxcVar2, ebny ebnyVar) {
        this.a = kszVar;
        this.b = ebtwVar;
        this.c = ezooVar;
        this.d = ebvwVar;
        this.e = eavdVar;
        this.f = eavdVar2;
        this.h = emxcVar;
        this.i = emxcVar2;
        this.g = ebnyVar;
    }

    @Override // defpackage.eayi
    public final ksz a() {
        return this.a;
    }

    @Override // defpackage.eayi
    public final eavd b() {
        return this.e;
    }

    @Override // defpackage.eayi
    public final eavd c() {
        return this.f;
    }

    @Override // defpackage.eayi
    public final ebny d() {
        return this.g;
    }

    @Override // defpackage.eayi
    public final ebtw e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eayi) {
            eayi eayiVar = (eayi) obj;
            if (this.a.equals(eayiVar.a()) && this.b.equals(eayiVar.e()) && this.c.equals(eayiVar.i()) && this.d.equals(eayiVar.f()) && this.e.equals(eayiVar.b()) && this.f.equals(eayiVar.c()) && this.h.equals(eayiVar.h()) && this.i.equals(eayiVar.g()) && this.g.equals(eayiVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.eayi
    public final ebvw f() {
        return this.d;
    }

    @Override // defpackage.eayi
    public final emxc g() {
        return this.i;
    }

    @Override // defpackage.eayi
    public final emxc h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.g.hashCode();
    }

    @Override // defpackage.eayi
    public final ezoo i() {
        return this.c;
    }

    public final String toString() {
        ebny ebnyVar = this.g;
        emxc emxcVar = this.i;
        emxc emxcVar2 = this.h;
        eavd eavdVar = this.f;
        eavd eavdVar2 = this.e;
        ebvw ebvwVar = this.d;
        ezoo ezooVar = this.c;
        ebtw ebtwVar = this.b;
        return "PolicyFooterSpec{accountSupplier=" + this.a.toString() + ", eventLogger=" + ebtwVar.toString() + ", logContext=" + ezooVar.toString() + ", visualElements=" + ebvwVar.toString() + ", privacyPolicyClickListener=" + eavdVar2.toString() + ", termsOfServiceClickListener=" + eavdVar.toString() + ", customItemLabelStringId=" + String.valueOf(emxcVar2) + ", customItemClickListener=" + String.valueOf(emxcVar) + ", clickRunnables=" + ebnyVar.toString() + "}";
    }
}
