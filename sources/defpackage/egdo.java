package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egdo extends egdx {
    public final emxc a;
    public final int b;
    private final emxc c;
    private final engw d;

    public egdo(int i, emxc emxcVar, emxc emxcVar2, engw engwVar) {
        this.b = i;
        this.a = emxcVar;
        this.c = emxcVar2;
        if (engwVar == null) {
            throw new NullPointerException("Null events");
        }
        this.d = engwVar;
    }

    @Override // defpackage.egdx
    public final emxc a() {
        return this.c;
    }

    @Override // defpackage.egdx
    public final emxc b() {
        return this.a;
    }

    @Override // defpackage.egdx
    public final engw c() {
        return this.d;
    }

    @Override // defpackage.egdx
    public final int d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egdx) {
            egdx egdxVar = (egdx) obj;
            if (this.b == egdxVar.d() && this.a.equals(egdxVar.b()) && this.c.equals(egdxVar.a()) && enkr.h(this.d, egdxVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        engw engwVar = this.d;
        emxc emxcVar = this.c;
        return "Resource{state=" + egdy.a(this.b) + ", resource=" + this.a.toString() + ", errorState=" + emxcVar.toString() + ", events=" + engwVar.toString() + "}";
    }
}
