package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edue extends edvk {
    public final engw a;

    public edue(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null eventCodes");
        }
        this.a = engwVar;
    }

    @Override // defpackage.edvk
    public final engw a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edvk) {
            return enkr.h(this.a, ((edvk) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "EventVector{eventCodes=" + this.a.toString() + "}";
    }
}
