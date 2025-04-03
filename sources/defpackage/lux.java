package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lux {
    public static final lux a = new lux(-1, -1);
    public static final lux b = new lux(0, 0);
    public final int c;
    public final int d;

    public lux(int i, int i2) {
        boolean z = false;
        if ((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0)) {
            z = true;
        }
        lti.a(z);
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof lux) {
            lux luxVar = (lux) obj;
            if (this.c == luxVar.c && this.d == luxVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        return ((i >>> 16) | (i << 16)) ^ this.d;
    }

    public final String toString() {
        return this.c + "x" + this.d;
    }
}
