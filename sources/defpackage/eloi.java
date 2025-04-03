package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eloi extends elov {
    private final elws a;

    public eloi(elws elwsVar) {
        this.a = elwsVar;
    }

    @Override // defpackage.elov
    public final elws a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof elov) {
            return this.a.equals(((elov) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Property{softwareInstruction=" + this.a.toString() + "}";
    }
}
