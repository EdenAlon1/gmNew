package defpackage;

import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class ibw {
    public static final long a = iby.d(4278190080L);
    public static final long b = iby.d(4282664004L);
    public static final long c = iby.d(4287137928L);
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public final long i;

    static {
        iby.d(4291611852L);
        d = iby.d(4294967295L);
        e = iby.d(4294901760L);
        iby.d(4278255360L);
        f = iby.d(4278190335L);
        iby.d(4294967040L);
        iby.d(4278255615L);
        iby.d(4294902015L);
        g = iby.c(0);
        float[] fArr = ieg.a;
        h = iby.f(0.0f, 0.0f, 0.0f, 0.0f, ieg.u);
    }

    public /* synthetic */ ibw(long j) {
        this.i = j;
    }

    public static final float a(long j) {
        float a2;
        float f2;
        if ((63 & j) == 0) {
            a2 = (float) ffcw.a(j >>> 56);
            f2 = 255.0f;
        } else {
            a2 = (float) ffcw.a((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return a2 / f2;
    }

    public static final float b(long j) {
        int i;
        int i2;
        if ((63 & j) == 0) {
            return ((float) ffcw.a((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        char c2 = (char) s;
        int i3 = c2 & 1023;
        int i4 = (s >>> 10) & 31;
        int i5 = c2 & 32768;
        if (i4 != 0) {
            i = i3 << 13;
            if (i4 == 31) {
                i2 = PrivateKeyType.INVALID;
                if (i != 0) {
                    i |= 4194304;
                }
            } else {
                i2 = i4 + 112;
            }
        } else {
            if (i3 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i3 + 1056964608) - ice.a;
                return i5 != 0 ? -intBitsToFloat : intBitsToFloat;
            }
            i2 = 0;
            i = 0;
        }
        return Float.intBitsToFloat((i2 << 23) | (i5 << 16) | i);
    }

    public static final float c(long j) {
        int i;
        int i2;
        if ((63 & j) == 0) {
            return ((float) ffcw.a((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        char c2 = (char) s;
        int i3 = c2 & 1023;
        int i4 = (s >>> 10) & 31;
        int i5 = c2 & 32768;
        if (i4 != 0) {
            i = i3 << 13;
            if (i4 == 31) {
                i2 = PrivateKeyType.INVALID;
                if (i != 0) {
                    i |= 4194304;
                }
            } else {
                i2 = i4 + 112;
            }
        } else {
            if (i3 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i3 + 1056964608) - ice.a;
                return i5 != 0 ? -intBitsToFloat : intBitsToFloat;
            }
            i2 = 0;
            i = 0;
        }
        return Float.intBitsToFloat((i2 << 23) | (i5 << 16) | i);
    }

    public static final float d(long j) {
        int i;
        int i2;
        long j2 = 63 & j;
        long j3 = j >>> 48;
        if (j2 == 0) {
            return ((float) ffcw.a(j3 & 255)) / 255.0f;
        }
        short s = (short) j3;
        char c2 = (char) s;
        int i3 = c2 & 1023;
        int i4 = (s >>> 10) & 31;
        int i5 = c2 & 32768;
        if (i4 != 0) {
            i = i3 << 13;
            if (i4 == 31) {
                i2 = PrivateKeyType.INVALID;
                if (i != 0) {
                    i |= 4194304;
                }
            } else {
                i2 = i4 + 112;
            }
        } else {
            if (i3 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i3 + 1056964608) - ice.a;
                return i5 != 0 ? -intBitsToFloat : intBitsToFloat;
            }
            i2 = 0;
            i = 0;
        }
        return Float.intBitsToFloat((i2 << 23) | (i5 << 16) | i);
    }

    public static final long e(long j, idy idyVar) {
        iej iejVar;
        idy f2 = f(j);
        int i = f2.c;
        int i2 = idyVar.c;
        if ((i | i2) < 0) {
            iejVar = idz.i(f2, idyVar);
        } else {
            int i3 = i | (i2 << 6);
            cnw cnwVar = iek.a;
            Object a2 = cnwVar.a(i3);
            if (a2 == null) {
                a2 = idz.i(f2, idyVar);
                cnwVar.f(i3, a2);
            }
            iejVar = (iej) a2;
        }
        return iejVar.a(j);
    }

    public static final idy f(long j) {
        float[] fArr = ieg.a;
        return ieg.y[(int) (j & 63)];
    }

    public static String g(long j) {
        return "Color(" + d(j) + ", " + c(j) + ", " + b(j) + ", " + a(j) + ", " + f(j).a + ')';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ibw) && this.i == ((ibw) obj).i;
    }

    public final int hashCode() {
        return ffco.a(this.i);
    }

    public final String toString() {
        return g(this.i);
    }
}
