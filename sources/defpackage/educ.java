package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class educ extends edvg {
    private final emto a;
    private final engw b;

    public educ(emto emtoVar, engw engwVar) {
        this.a = emtoVar;
        if (engwVar == null) {
            throw new NullPointerException("Null eventRecords");
        }
        this.b = engwVar;
    }

    @Override // defpackage.edvg
    public final emto a() {
        return this.a;
    }

    @Override // defpackage.edvg
    public final engw b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edvg) {
            edvg edvgVar = (edvg) obj;
            if (this.a.equals(edvgVar.a()) && enkr.h(this.b, edvgVar.b())) {
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
        return "EventData{systemProfile=" + this.a.toString() + ", eventRecords=" + engwVar.toString() + "}";
    }
}
