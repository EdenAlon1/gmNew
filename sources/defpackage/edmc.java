package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class edmc extends edqk {
    public final edpb a;
    public final boolean b;

    public edmc(edpb edpbVar, boolean z) {
        if (edpbVar == null) {
            throw new NullPointerException("Null date");
        }
        this.a = edpbVar;
        this.b = z;
    }

    @Override // defpackage.edqk
    public final edpb a() {
        return this.a;
    }

    @Override // defpackage.edqk
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edqk) {
            edqk edqkVar = (edqk) obj;
            if (this.a.equals(edqkVar.a()) && this.b == edqkVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "SpecialDay{date=" + this.a.toString() + ", exceptional=" + this.b + "}";
    }
}
