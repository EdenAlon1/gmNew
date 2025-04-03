package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efya extends efxw {
    private final engw a;
    private final engw b;
    private final engw c;
    private final emxc d;
    private final engw e;

    public efya(engw engwVar, engw engwVar2, engw engwVar3, emxc emxcVar, engw engwVar4) {
        this.a = engwVar;
        this.b = engwVar2;
        this.c = engwVar3;
        this.d = emxcVar;
        this.e = engwVar4;
    }

    @Override // defpackage.efxw
    public final emxc a() {
        return this.d;
    }

    @Override // defpackage.efxw
    public final engw b() {
        return this.c;
    }

    @Override // defpackage.efxw
    public final engw c() {
        return this.e;
    }

    @Override // defpackage.efxw
    public final engw d() {
        return this.b;
    }

    @Override // defpackage.efxw
    public final engw e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efxw) {
            efxw efxwVar = (efxw) obj;
            if (enkr.h(this.a, efxwVar.e()) && enkr.h(this.b, efxwVar.d()) && enkr.h(this.c, efxwVar.b()) && this.d.equals(efxwVar.a()) && enkr.h(this.e, efxwVar.c())) {
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
        return "ArtHomeData{suggestedImages=" + this.a.toString() + ", suggestedCollections=" + engwVar3.toString() + ", categories=" + engwVar2.toString() + ", errorState=" + emxcVar.toString() + ", events=" + engwVar.toString() + "}";
    }
}
