package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xpq {
    public final drnm a;
    public final xhi b;

    public xpq(drnm drnmVar, xhi xhiVar) {
        this.a = drnmVar;
        this.b = xhiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xpq)) {
            return false;
        }
        xpq xpqVar = (xpq) obj;
        return ffkj.e(this.a, xpqVar.a) && ffkj.e(this.b, xpqVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MediaWithInstanceId(media=" + this.a + ", instanceId=" + this.b + ")";
    }
}
