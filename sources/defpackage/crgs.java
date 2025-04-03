package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crgs {
    public final djro a;
    public final crgf b;

    public crgs(djro djroVar, crgf crgfVar) {
        djroVar.getClass();
        crgfVar.getClass();
        this.a = djroVar;
        this.b = crgfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crgs)) {
            return false;
        }
        crgs crgsVar = (crgs) obj;
        return ffkj.e(this.a, crgsVar.a) && this.b == crgsVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "NonTachygram(simId=" + this.a + ", transport=" + this.b + ")";
    }
}
