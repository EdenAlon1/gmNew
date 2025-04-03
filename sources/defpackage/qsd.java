package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qsd {
    public final qsu a;
    public final hvi b;

    public qsd(qsu qsuVar, hvi hviVar) {
        hviVar.getClass();
        this.a = qsuVar;
        this.b = hviVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsd)) {
            return false;
        }
        qsd qsdVar = (qsd) obj;
        return ffkj.e(this.a, qsdVar.a) && ffkj.e(this.b, qsdVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SizeAndModifier(size=" + this.a + ", modifier=" + this.b + ")";
    }
}
