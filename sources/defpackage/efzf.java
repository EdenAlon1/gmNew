package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efzf extends efzd {
    private final engw a;
    private final engw b;
    private final emxc c;
    private final engw d;
    private final int e;

    public efzf(engw engwVar, engw engwVar2, int i, emxc emxcVar, engw engwVar3) {
        this.a = engwVar;
        this.b = engwVar2;
        this.e = i;
        this.c = emxcVar;
        this.d = engwVar3;
    }

    @Override // defpackage.efzd
    public final emxc a() {
        return this.c;
    }

    @Override // defpackage.efzd
    public final engw b() {
        return this.d;
    }

    @Override // defpackage.efzd
    public final engw c() {
        return this.a;
    }

    @Override // defpackage.efzd
    public final engw d() {
        return this.b;
    }

    @Override // defpackage.efzd
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efzd) {
            efzd efzdVar = (efzd) obj;
            if (enkr.h(this.a, efzdVar.c()) && enkr.h(this.b, efzdVar.d()) && this.e == efzdVar.e() && this.c.equals(efzdVar.a()) && enkr.h(this.d, efzdVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        int i = this.e;
        engw engwVar = this.b;
        String obj = this.a.toString();
        String obj2 = engwVar.toString();
        String str = i != 1 ? i != 2 ? "ERROR" : "SUGGESTIONS" : "ZERO_STATE";
        emxc emxcVar = this.c;
        engw engwVar2 = this.d;
        return "ArtSearchData{searchInterests=" + obj + ", searchSuggestions=" + obj2 + ", searchState=" + str + ", errorState=" + String.valueOf(emxcVar) + ", events=" + engwVar2.toString() + "}";
    }
}
