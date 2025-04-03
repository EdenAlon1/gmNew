package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzne extends dzpy {
    private final engw b;
    private final engw c;

    public dzne(engw engwVar, engw engwVar2) {
        this.b = engwVar;
        this.c = engwVar2;
    }

    @Override // defpackage.dzpy
    public final engw a() {
        return this.b;
    }

    @Override // defpackage.dzpy
    public final engw b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzpy) {
            dzpy dzpyVar = (dzpy) obj;
            if (enkr.h(this.b, dzpyVar.a()) && enkr.h(this.c, dzpyVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        engw engwVar = this.c;
        return "DecorationTransitionAction{decorationIdsToAdd=" + String.valueOf(this.b) + ", decorationIdsToRemove=" + String.valueOf(engwVar) + "}";
    }
}
