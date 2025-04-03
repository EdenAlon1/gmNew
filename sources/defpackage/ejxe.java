package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejxe extends ejyq {
    private final ejxk a;
    private final ejyx b;

    public ejxe(ejxk ejxkVar, ejyx ejyxVar) {
        if (ejxkVar == null) {
            throw new NullPointerException("Null callbacks");
        }
        this.a = ejxkVar;
        this.b = ejyxVar;
    }

    @Override // defpackage.ejyq
    public final ejxk a() {
        return this.a;
    }

    @Override // defpackage.ejyq
    public final ejyx b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejyq) {
            ejyq ejyqVar = (ejyq) obj;
            if (this.a.equals(ejyqVar.a()) && this.b.equals(ejyqVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ejyx ejyxVar = this.b;
        return "CallbackResult{callbacks=" + this.a.toString() + ", result=" + ejyxVar.toString() + "}";
    }
}
