package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwp {
    public final cxj a;
    public long b;

    public cwp(cxj cxjVar, long j) {
        this.a = cxjVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwp)) {
            return false;
        }
        cwp cwpVar = (cwp) obj;
        return ffkj.e(this.a, cwpVar.a) && kaf.e(this.b, cwpVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + kae.a(this.b);
    }

    public final String toString() {
        return "AnimData(anim=" + this.a + ", startSize=" + ((Object) kaf.c(this.b)) + ')';
    }
}
