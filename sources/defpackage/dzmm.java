package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzmm extends dzot {
    public final dzrw a;
    public final engw b;

    public dzmm(dzrw dzrwVar, engw engwVar) {
        this.a = dzrwVar;
        this.b = engwVar;
    }

    @Override // defpackage.dzot
    public final dzrw a() {
        return this.a;
    }

    @Override // defpackage.dzot
    public final engw b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzot) {
            dzot dzotVar = (dzot) obj;
            if (this.a.equals(dzotVar.a()) && enkr.h(this.b, dzotVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        engw engwVar = this.b;
        return "ButtonPrompt{promptText=" + this.a.toString() + ", buttons=" + engwVar.toString() + "}";
    }
}
