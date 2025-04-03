package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnvr {
    public final dnvj a;
    public final dnvi b;
    public final dnvh c;
    public final boolean d;
    public final dnvq e;

    public dnvr(dnvj dnvjVar, dnvi dnviVar, dnvh dnvhVar, boolean z, dnvq dnvqVar) {
        this.a = dnvjVar;
        this.b = dnviVar;
        this.c = dnvhVar;
        this.d = z;
        this.e = dnvqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnvr)) {
            return false;
        }
        dnvr dnvrVar = (dnvr) obj;
        return ffkj.e(this.a, dnvrVar.a) && ffkj.e(this.b, dnvrVar.b) && ffkj.e(this.c, dnvrVar.c) && this.d == dnvrVar.d && ffkj.e(this.e, dnvrVar.e);
    }

    public final int hashCode() {
        dnvj dnvjVar = this.a;
        int hashCode = dnvjVar == null ? 0 : dnvjVar.hashCode();
        dnvi dnviVar = this.b;
        int hashCode2 = dnviVar != null ? dnviVar.hashCode() : 0;
        int i = hashCode * 31;
        if (this.c != null) {
            throw null;
        }
        return ((((i + hashCode2) * 961) + (true != this.d ? 1237 : 1231)) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "SeparatorsUiData(text=" + this.a + ", lastReadMarker=" + this.b + ", aiSummary=" + this.c + ", showSeparators=" + this.d + ", flags=" + this.e + ")";
    }

    public dnvr() {
        this(null, null, null, true, new dnvq((byte[]) null));
    }
}
