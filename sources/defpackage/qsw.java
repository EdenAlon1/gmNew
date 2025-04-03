package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qsw {
    public final int a;
    public final int b;

    public qsw(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (!rkh.o(i)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!rkh.o(i2)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsw)) {
            return false;
        }
        qsw qswVar = (qsw) obj;
        return this.a == qswVar.a && this.b == qswVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ")";
    }
}
