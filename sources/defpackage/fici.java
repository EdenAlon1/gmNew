package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fici {
    public int a;
    public int b;

    public fici(byte[] bArr) {
        this.a = 0;
        if (bArr.length != 4) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        int i = bArr[0] & 255;
        int i2 = bArr[1] & 255;
        int i3 = 2;
        int i4 = bArr[2] & 255;
        int i5 = ((bArr[3] & 255) << 24) | i | (i2 << 8) | (i4 << 16);
        this.b = i5;
        if (i5 != 0) {
            int a = ficp.a(i5) >>> 1;
            for (int i6 = 0; i6 < a; i6++) {
                i3 = ficp.b(i3, i3, i5);
                int i7 = i3 ^ 2;
                int i8 = i5;
                while (i8 != 0) {
                    int c = ficp.c(i7, i8);
                    i7 = i8;
                    i8 = c;
                }
                if (i7 == 1) {
                }
            }
            this.a = ficp.a(this.b);
            return;
        }
        throw new IllegalArgumentException("byte array is not an encoded finite field");
    }

    public final int a(int i) {
        int i2 = (1 << this.a) - 2;
        if (i2 == 0) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i2 < 0) {
            i = a(i);
            i2 = -i2;
        }
        int i3 = 1;
        while (i2 != 0) {
            if ((i2 & 1) == 1) {
                i3 = b(i3, i);
            }
            i = b(i, i);
            i2 >>>= 1;
        }
        return i3;
    }

    public final int b(int i, int i2) {
        return ficp.b(i, i2, this.b);
    }

    public final boolean c(int i) {
        int i2 = this.a;
        return i2 == 31 ? i >= 0 : i >= 0 && i < (1 << i2);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof fici)) {
            fici ficiVar = (fici) obj;
            if (this.a == ficiVar.a && this.b == ficiVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        String str;
        int i = this.a;
        int i2 = this.b;
        if (i2 == 0) {
            str = "0";
        } else {
            int i3 = i2 & 1;
            int i4 = i2 >>> 1;
            String str2 = 1 != i3 ? "" : "1";
            int i5 = 1;
            while (i4 != 0) {
                if ((i4 & 1) == 1) {
                    str2 = a.g(i5, str2, "+x^");
                }
                i4 >>>= 1;
                i5++;
            }
            str = str2;
        }
        return "Finite Field GF(2^" + i + ") = GF(2)[X]/<" + str + "> ";
    }
}
