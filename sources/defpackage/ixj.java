package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ixj implements iwy {
    public final ipo a;
    public final iuv b;

    public ixj(ipo ipoVar, iuv iuvVar) {
        this.a = ipoVar;
        this.b = iuvVar;
    }

    @Override // defpackage.iwy
    public final boolean A() {
        return this.b.J().t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixj)) {
            return false;
        }
        ixj ixjVar = (ixj) obj;
        return ffkj.e(this.a, ixjVar.a) && ffkj.e(this.b, ixjVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PlaceableResult(result=" + this.a + ", placeable=" + this.b + ')';
    }
}
