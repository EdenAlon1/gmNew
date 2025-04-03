package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebla extends eblb {
    private final emxc a;
    private final emxc b;
    private final emxc c;
    private final emxc d;

    public ebla(emxc emxcVar, emxc emxcVar2, emxc emxcVar3, emxc emxcVar4) {
        this.a = emxcVar;
        this.b = emxcVar2;
        this.c = emxcVar3;
        this.d = emxcVar4;
    }

    @Override // defpackage.ebgw
    public final emxc a() {
        return this.d;
    }

    @Override // defpackage.ebgw
    public final emxc b() {
        return this.c;
    }

    @Override // defpackage.ebgw
    public final emxc c() {
        return this.a;
    }

    @Override // defpackage.ebgw
    public final emxc d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eblb) {
            eblb eblbVar = (eblb) obj;
            if (this.a.equals(eblbVar.c()) && this.b.equals(eblbVar.d()) && this.c.equals(eblbVar.b()) && this.d.equals(eblbVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "PolicyFooterCustomizerImpl{privacyPolicyClickListener=" + this.a.toString() + ", termsOfServiceClickListener=" + this.b.toString() + ", customItemLabelStringId=Optional.absent(), customItemClickListener=Optional.absent()}";
    }
}
