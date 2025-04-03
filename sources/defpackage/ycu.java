package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ycu {
    public final xhu a;
    public final xid b;

    public ycu(xhu xhuVar, xid xidVar) {
        this.a = xhuVar;
        this.b = xidVar;
        if (xhuVar == null && xidVar == null) {
            throw new yco();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ycu)) {
            return false;
        }
        ycu ycuVar = (ycu) obj;
        return ffkj.e(this.a, ycuVar.a) && ffkj.e(this.b, ycuVar.b);
    }

    public final int hashCode() {
        xhu xhuVar = this.a;
        int hashCode = xhuVar == null ? 0 : xhuVar.hashCode();
        xid xidVar = this.b;
        return (hashCode * 31) + (xidVar != null ? xidVar.hashCode() : 0);
    }

    public final String toString() {
        return "IncomingState(draft=" + this.a + ", input=" + this.b + ")";
    }
}
