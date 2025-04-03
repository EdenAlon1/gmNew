package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaxg {
    public final int a;
    private final int b;

    public aaxg(int i, int i2) {
        this.b = i;
        this.a = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaxg)) {
            return false;
        }
        aaxg aaxgVar = (aaxg) obj;
        return this.b == aaxgVar.b && this.a == aaxgVar.a;
    }

    public final int hashCode() {
        return (this.b * 31) + this.a;
    }

    public final String toString() {
        return "SelectionOffset(x=" + this.b + ", y=" + this.a + ")";
    }

    public aaxg() {
        this(0, 0);
    }
}
