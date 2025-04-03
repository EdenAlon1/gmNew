package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ydx {
    public final xhu a;
    public final xhu b;

    public ydx(xhu xhuVar, xhu xhuVar2) {
        xhuVar.getClass();
        this.a = xhuVar;
        this.b = xhuVar2;
    }

    public final boolean a(ffji ffjiVar) {
        return !ffkj.e(ffjiVar.invoke(this.a), ffjiVar.invoke(this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydx)) {
            return false;
        }
        ydx ydxVar = (ydx) obj;
        return ffkj.e(this.a, ydxVar.a) && ffkj.e(this.b, ydxVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DraftDiff(curr=" + this.a + ", prev=" + this.b + ")";
    }
}
