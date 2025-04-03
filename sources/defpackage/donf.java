package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class donf {
    public final long a;
    public final long b;
    public final long c;

    public donf(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof donf)) {
            return false;
        }
        donf donfVar = (donf) obj;
        long j = this.a;
        long j2 = donfVar.a;
        long j3 = ibw.a;
        return ffcp.a(j, j2) && ffcp.a(this.b, donfVar.b) && ffcp.a(this.c, donfVar.c);
    }

    public final int hashCode() {
        long j = ibw.a;
        return (((ffco.a(this.a) * 31) + ffco.a(this.b)) * 31) + ffco.a(this.c);
    }

    public final String toString() {
        long j = this.c;
        long j2 = this.b;
        return "AbcBackgroundColors(background=" + ibw.g(this.a) + ", decoration=" + ibw.g(j2) + ", decorationAccent=" + ibw.g(j) + ")";
    }
}
