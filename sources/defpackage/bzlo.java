package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzlo {
    public final boolean a;
    private final String b;

    public bzlo(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzlo)) {
            return false;
        }
        bzlo bzloVar = (bzlo) obj;
        return this.a == bzloVar.a && ffkj.e(this.b, bzloVar.b);
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ThrottleResult(shouldThrottle=" + this.a + ", reason=" + this.b + ")";
    }
}
