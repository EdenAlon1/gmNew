package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbi {
    public final jlm a;
    public jlm b;
    public boolean c = false;
    public fay d = null;

    public fbi(jlm jlmVar, jlm jlmVar2) {
        this.a = jlmVar;
        this.b = jlmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbi)) {
            return false;
        }
        fbi fbiVar = (fbi) obj;
        return ffkj.e(this.a, fbiVar.a) && ffkj.e(this.b, fbiVar.b) && this.c == fbiVar.c && ffkj.e(this.d, fbiVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        int i = true != this.c ? 1237 : 1231;
        fay fayVar = this.d;
        return (((hashCode * 31) + i) * 31) + (fayVar == null ? 0 : fayVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) this.b) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ')';
    }
}
