package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfu {
    public final Object a;
    public final int b;
    private final kgp c;

    public kfu(Object obj, int i, kgp kgpVar) {
        this.a = obj;
        this.b = i;
        this.c = kgpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfu)) {
            return false;
        }
        kfu kfuVar = (kfu) obj;
        return ffkj.e(this.a, kfuVar.a) && this.b == kfuVar.b && ffkj.e(this.c, kfuVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "VerticalAnchor(id=" + this.a + ", index=" + this.b + ", reference=" + this.c + ')';
    }
}
