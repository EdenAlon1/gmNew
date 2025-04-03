package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dngs {
    public final int a;
    public final int b;

    public dngs(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dngs)) {
            return false;
        }
        dngs dngsVar = (dngs) obj;
        return this.a == dngsVar.a && this.b == dngsVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "Position(x=" + this.a + ", y=" + this.b + ")";
    }
}
