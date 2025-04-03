package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lsl {
    public static final lsl a = new lsl(0, 0);
    public final int b;
    public final int c;
    public final float d;

    static {
        lvf.N(0);
        lvf.N(1);
        lvf.N(3);
    }

    public lsl(int i, int i2, float f) {
        this.b = i;
        this.c = i2;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lsl) {
            lsl lslVar = (lsl) obj;
            if (this.b == lslVar.b && this.c == lslVar.c && this.d == lslVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b + 217) * 31) + this.c) * 31) + Float.floatToRawIntBits(this.d);
    }

    public lsl(int i, int i2) {
        this(i, i2, 1.0f);
    }
}
