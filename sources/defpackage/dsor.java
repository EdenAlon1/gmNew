package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsor extends dsos {
    private final int a;
    private final int b;

    public dsor(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsor)) {
            return false;
        }
        dsor dsorVar = (dsor) obj;
        return this.a == dsorVar.a && this.b == dsorVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "Opening(currentHeight=" + this.a + ", finalHeight=" + this.b + ")";
    }
}
