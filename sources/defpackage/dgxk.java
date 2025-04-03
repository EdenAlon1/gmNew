package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgxk extends dgxn {
    public final emxc a;
    private final emxc b;
    private final emxc c;
    private final emxc d;
    private final emxc e;

    public dgxk(emxc emxcVar, emxc emxcVar2, emxc emxcVar3, emxc emxcVar4, emxc emxcVar5) {
        this.b = emxcVar;
        this.a = emxcVar2;
        this.c = emxcVar3;
        this.d = emxcVar4;
        this.e = emxcVar5;
    }

    @Override // defpackage.dgxn
    public final emxc a() {
        return this.a;
    }

    @Override // defpackage.dgxn
    public final emxc b() {
        return this.c;
    }

    @Override // defpackage.dgxn
    public final emxc c() {
        return this.b;
    }

    @Override // defpackage.dgxn
    public final emxc d() {
        return this.e;
    }

    @Override // defpackage.dgxn
    public final emxc e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dgxn) {
            dgxn dgxnVar = (dgxn) obj;
            if (this.b.equals(dgxnVar.c()) && this.a.equals(dgxnVar.a()) && this.c.equals(dgxnVar.b()) && this.d.equals(dgxnVar.e()) && this.e.equals(dgxnVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        emxc emxcVar = this.e;
        emxc emxcVar2 = this.d;
        emxc emxcVar3 = this.c;
        emxc emxcVar4 = this.a;
        return "ValidatedEnforcementDecision{failureReason=" + String.valueOf(this.b) + ", enforcementDecision=" + String.valueOf(emxcVar4) + ", enforcementResponse=" + String.valueOf(emxcVar3) + ", responseUuid=" + String.valueOf(emxcVar2) + ", provisionalState=" + String.valueOf(emxcVar) + "}";
    }
}
