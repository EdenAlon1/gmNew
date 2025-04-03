package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ycd {
    public final xhu a;
    private final boolean b;

    public ycd(xhu xhuVar, boolean z) {
        this.a = xhuVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ycd)) {
            return false;
        }
        ycd ycdVar = (ycd) obj;
        return ffkj.e(this.a, ycdVar.a) && this.b == ycdVar.b;
    }

    public final int hashCode() {
        xhu xhuVar = this.a;
        return ((xhuVar == null ? 0 : xhuVar.hashCode()) * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "Result(draft=" + this.a + ", persist=" + this.b + ")";
    }
}
