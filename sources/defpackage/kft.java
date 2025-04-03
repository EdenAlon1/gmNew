package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kft {
    public final Object a;
    public final int b;
    private final kgp c;

    public kft(Object obj, int i, kgp kgpVar) {
        this.a = obj;
        this.b = i;
        this.c = kgpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kft)) {
            return false;
        }
        kft kftVar = (kft) obj;
        return ffkj.e(this.a, kftVar.a) && this.b == kftVar.b && ffkj.e(this.c, kftVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "HorizontalAnchor(id=" + this.a + ", index=" + this.b + ", reference=" + this.c + ')';
    }
}
