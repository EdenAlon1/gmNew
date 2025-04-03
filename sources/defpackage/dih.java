package defpackage;

/* compiled from: PG */
@ffbs
/* loaded from: classes.dex */
public final class dih {
    public final long a;
    public final ebe b;

    public dih(long j, ebe ebeVar) {
        this.a = j;
        this.b = ebeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ffkj.e(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        long j = this.a;
        dih dihVar = (dih) obj;
        long j2 = dihVar.a;
        long j3 = ibw.a;
        return ffcp.a(j, j2) && ffkj.e(this.b, dihVar.b);
    }

    public final int hashCode() {
        long j = ibw.a;
        return (ffco.a(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) ibw.g(this.a)) + ", drawPadding=" + this.b + ')';
    }
}
