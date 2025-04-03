package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejnv extends ejof {
    public final ejog a;
    public final emxc b;

    public ejnv(ejog ejogVar, emxc emxcVar) {
        if (ejogVar == null) {
            throw new NullPointerException("Null repeatInterval");
        }
        this.a = ejogVar;
        this.b = emxcVar;
    }

    @Override // defpackage.ejof
    public final ejog a() {
        return this.a;
    }

    @Override // defpackage.ejof
    public final emxc b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejof) {
            ejof ejofVar = (ejof) obj;
            if (this.a.equals(ejofVar.a()) && this.b.equals(ejofVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        emxc emxcVar = this.b;
        return "PeriodicWorkSpec{repeatInterval=" + this.a.toString() + ", flexInterval=" + emxcVar.toString() + "}";
    }
}
