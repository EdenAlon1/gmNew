package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egpi extends egpn {
    private final emxc a;
    private final emxc b;
    private final emxc c;
    private final engw d;

    public egpi(emxc emxcVar, emxc emxcVar2, emxc emxcVar3, engw engwVar) {
        this.a = emxcVar;
        this.b = emxcVar2;
        this.c = emxcVar3;
        if (engwVar == null) {
            throw new NullPointerException("Null logEvents");
        }
        this.d = engwVar;
    }

    @Override // defpackage.egpn
    public final emxc a() {
        return this.c;
    }

    @Override // defpackage.egpn
    public final emxc b() {
        return this.a;
    }

    @Override // defpackage.egpn
    public final emxc c() {
        return this.b;
    }

    @Override // defpackage.egpn
    public final engw d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egpn) {
            egpn egpnVar = (egpn) obj;
            if (this.a.equals(egpnVar.b()) && this.b.equals(egpnVar.c()) && this.c.equals(egpnVar.a()) && enkr.h(this.d, egpnVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        engw engwVar = this.d;
        emxc emxcVar = this.c;
        emxc emxcVar2 = this.b;
        return "PreviewData{photo=" + this.a.toString() + ", profileState=" + emxcVar2.toString() + ", errorState=" + emxcVar.toString() + ", logEvents=" + engwVar.toString() + "}";
    }
}
