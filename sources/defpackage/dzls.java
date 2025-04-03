package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzls extends dzlv {
    private final engw a;

    public dzls(engw engwVar) {
        this.a = engwVar;
    }

    @Override // defpackage.dzrr
    public final dzrt b() {
        return dzrt.TYPEFACE_LIST;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzrr) {
            dzrr dzrrVar = (dzrr) obj;
            if (dzrt.TYPEFACE_LIST == dzrrVar.b() && enkr.h(this.a, dzrrVar.l())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.dzlv, defpackage.dzrr
    public final engw l() {
        return this.a;
    }

    public final String toString() {
        return "TextStyle{typefaceList=" + this.a.toString() + "}";
    }
}
