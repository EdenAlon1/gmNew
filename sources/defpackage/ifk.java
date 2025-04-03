package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ifk {
    public jzn a;
    public kah b;
    public ibt c;
    public long d = 0;

    public ifk(jzn jznVar, kah kahVar, ibt ibtVar) {
        this.a = jznVar;
        this.b = kahVar;
        this.c = ibtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifk)) {
            return false;
        }
        ifk ifkVar = (ifk) obj;
        return ffkj.e(this.a, ifkVar.a) && this.b == ifkVar.b && ffkj.e(this.c, ifkVar.c) && iar.f(this.d, ifkVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + iaq.a(this.d);
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) iar.d(this.d)) + ')';
    }
}
