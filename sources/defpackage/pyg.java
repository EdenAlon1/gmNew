package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pyg {
    public final String a;
    public final pqp b;

    public pyg(String str, pqp pqpVar) {
        str.getClass();
        pqpVar.getClass();
        this.a = str;
        this.b = pqpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pyg)) {
            return false;
        }
        pyg pygVar = (pyg) obj;
        return ffkj.e(this.a, pygVar.a) && this.b == pygVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "IdAndState(id=" + this.a + ", state=" + this.b + ')';
    }
}
