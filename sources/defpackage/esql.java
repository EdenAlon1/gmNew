package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esql extends esqy {
    private final fcek a;
    private final esqx b;

    public esql(fcek fcekVar, esqx esqxVar) {
        this.a = fcekVar;
        this.b = esqxVar;
    }

    @Override // defpackage.esqy
    public final esqx a() {
        return this.b;
    }

    @Override // defpackage.esqy
    public final fcek b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof esqy) {
            esqy esqyVar = (esqy) obj;
            if (this.a.equals(esqyVar.b()) && this.b.equals(esqyVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        esqx esqxVar = this.b;
        return "GroupMember{id=" + this.a.toString() + ", role=" + esqxVar.toString() + "}";
    }
}
