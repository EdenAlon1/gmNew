package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kac {
    public static final kac a = new kac(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public kac(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final int a() {
        return this.e - this.c;
    }

    public final int b() {
        return this.d - this.b;
    }

    public final long c() {
        int b = b() / 2;
        int a2 = a() / 2;
        return ((this.c + a2) & 4294967295L) | ((this.b + b) << 32);
    }

    public final long d() {
        return (this.b << 32) | (this.c & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kac)) {
            return false;
        }
        kac kacVar = (kac) obj;
        return this.b == kacVar.b && this.c == kacVar.c && this.d == kacVar.d && this.e == kacVar.e;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "IntRect.fromLTRB(" + this.b + ", " + this.c + ", " + this.d + ", " + this.e + ')';
    }
}
