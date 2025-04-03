package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ndl {
    public final ndo a;
    public final ndo b;

    public ndl(ndo ndoVar, ndo ndoVar2) {
        this.a = ndoVar;
        this.b = ndoVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ndl ndlVar = (ndl) obj;
            if (this.a.equals(ndlVar.a) && this.b.equals(ndlVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        ndo ndoVar = this.a;
        ndo ndoVar2 = this.b;
        return "[" + ndoVar.toString() + (ndoVar.equals(ndoVar2) ? "" : ", ".concat(this.b.toString())) + "]";
    }
}
