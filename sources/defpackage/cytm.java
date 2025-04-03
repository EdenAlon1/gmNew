package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cytm {
    public final engw a;
    public final cytl b;

    public cytm(engw engwVar, cytl cytlVar) {
        this.a = engwVar;
        this.b = cytlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cytm)) {
            return false;
        }
        cytm cytmVar = (cytm) obj;
        return ffkj.e(this.a, cytmVar.a) && ffkj.e(this.b, cytmVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "HeaderActionsUiData(actions=" + this.a + ", flags=" + this.b + ")";
    }
}
