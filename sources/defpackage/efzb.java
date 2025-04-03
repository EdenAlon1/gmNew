package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efzb extends efyx {
    private final engw a;
    private final engw b;
    private final engw c;
    private final emxc d;
    private final engw e;

    public efzb(engw engwVar, engw engwVar2, engw engwVar3, emxc emxcVar, engw engwVar4) {
        this.a = engwVar;
        this.b = engwVar2;
        this.c = engwVar3;
        this.d = emxcVar;
        this.e = engwVar4;
    }

    @Override // defpackage.efyx
    public final emxc a() {
        return this.d;
    }

    @Override // defpackage.efyx
    public final engw b() {
        return this.b;
    }

    @Override // defpackage.efyx
    public final engw c() {
        return this.e;
    }

    @Override // defpackage.efyx
    public final engw d() {
        return this.c;
    }

    @Override // defpackage.efyx
    public final engw e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efyx) {
            efyx efyxVar = (efyx) obj;
            if (enkr.h(this.a, efyxVar.e()) && enkr.h(this.b, efyxVar.b()) && enkr.h(this.c, efyxVar.d()) && this.d.equals(efyxVar.a()) && enkr.h(this.e, efyxVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        engw engwVar = this.e;
        emxc emxcVar = this.d;
        engw engwVar2 = this.c;
        engw engwVar3 = this.b;
        return "ArtSearchResultsData{topResults=" + this.a.toString() + ", artCollections=" + engwVar3.toString() + ", moreResults=" + engwVar2.toString() + ", errorState=" + String.valueOf(emxcVar) + ", events=" + engwVar.toString() + "}";
    }
}
