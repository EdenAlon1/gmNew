package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpo {
    public static final lpo a = new lpo(1, 2, 3, null, -1, -1);
    public static final lpo b = new lpo(1, 1, 2, null, -1, -1);
    public final int c;
    public final int d;
    public final int e;
    public final byte[] f;
    public final int g;
    public final int h;
    private int i;

    static {
        lvf.N(0);
        lvf.N(1);
        lvf.N(2);
        lvf.N(3);
        lvf.N(4);
        lvf.N(5);
    }

    public lpo(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = bArr;
        this.g = i4;
        this.h = i5;
    }

    public static int a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int b(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public static String c(int i) {
        return i != -1 ? i != 1 ? i != 2 ? a.h(i, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    public static String d(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? a.h(i, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String e(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? a.h(i, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean h(lpo lpoVar) {
        if (lpoVar == null) {
            return true;
        }
        int i = lpoVar.c;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = lpoVar.d;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = lpoVar.e;
        if ((i3 != -1 && i3 != 3) || lpoVar.f != null) {
            return false;
        }
        int i4 = lpoVar.h;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = lpoVar.g;
        return i5 == -1 || i5 == 8;
    }

    public static boolean i(lpo lpoVar) {
        if (lpoVar == null) {
            return false;
        }
        int i = lpoVar.e;
        return i == 7 || i == 6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lpo lpoVar = (lpo) obj;
            if (this.c == lpoVar.c && this.d == lpoVar.d && this.e == lpoVar.e && Arrays.equals(this.f, lpoVar.f) && this.g == lpoVar.g && this.h == lpoVar.h) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return (this.g == -1 || this.h == -1) ? false : true;
    }

    public final boolean g() {
        return (this.c == -1 || this.d == -1 || this.e == -1) ? false : true;
    }

    public final int hashCode() {
        int i = this.i;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((((((this.c + 527) * 31) + this.d) * 31) + this.e) * 31) + Arrays.hashCode(this.f)) * 31) + this.g) * 31) + this.h;
        this.i = hashCode;
        return hashCode;
    }

    public final String toString() {
        int i = this.g;
        int i2 = this.e;
        int i3 = this.d;
        String d = d(this.c);
        String c = c(i3);
        String e = e(i2);
        String B = i != -1 ? a.B(i, "bit Luma") : "NA";
        int i4 = this.h;
        String B2 = i4 != -1 ? a.B(i4, "bit Chroma") : "NA";
        return "ColorInfo(" + d + ", " + c + ", " + e + ", " + (this.f != null) + ", " + B + ", " + B2 + ")";
    }
}
