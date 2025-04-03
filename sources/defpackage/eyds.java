package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eyds {
    public static final /* synthetic */ int a = 0;
    private static volatile int b = 100;

    static long A(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    private static void B(int i) {
        if (i >= b) {
            throw new eygu("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    static double a(byte[] bArr, int i) {
        return Double.longBitsToDouble(A(bArr, i));
    }

    static float b(byte[] bArr, int i) {
        return Float.intBitsToFloat(d(bArr, i));
    }

    static int c(byte[] bArr, int i, eydr eydrVar) {
        int t = t(bArr, i, eydrVar);
        int i2 = eydrVar.a;
        if (i2 < 0) {
            throw new eygu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - t) {
            throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            eydrVar.c = eyee.b;
            return t;
        }
        eydrVar.c = eyee.z(bArr, t, i2);
        return t + i2;
    }

    static int d(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static int e(eyik eyikVar, byte[] bArr, int i, int i2, int i3, eydr eydrVar) {
        Object e = eyikVar.e();
        int x = x(e, eyikVar, bArr, i, i2, i3, eydrVar);
        eyikVar.g(e);
        eydrVar.c = e;
        return x;
    }

    static int f(eyik eyikVar, byte[] bArr, int i, int i2, eydr eydrVar) {
        Object e = eyikVar.e();
        int y = y(e, eyikVar, bArr, i, i2, eydrVar);
        eyikVar.g(e);
        eydrVar.c = e;
        return y;
    }

    static int g(eyik eyikVar, int i, byte[] bArr, int i2, int i3, eygr eygrVar, eydr eydrVar) {
        int f = f(eyikVar, bArr, i2, i3, eydrVar);
        eygrVar.add(eydrVar.c);
        while (f < i3) {
            int t = t(bArr, f, eydrVar);
            if (i != eydrVar.a) {
                break;
            }
            f = f(eyikVar, bArr, t, i3, eydrVar);
            eygrVar.add(eydrVar.c);
        }
        return f;
    }

    static int h(byte[] bArr, int i, eygr eygrVar, eydr eydrVar) {
        eydu eyduVar = (eydu) eygrVar;
        int t = t(bArr, i, eydrVar);
        int i2 = eydrVar.a + t;
        while (t < i2) {
            t = w(bArr, t, eydrVar);
            eyduVar.f(eydrVar.b != 0);
        }
        if (t == i2) {
            return t;
        }
        throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int i(byte[] bArr, int i, eygr eygrVar, eydr eydrVar) {
        eyet eyetVar = (eyet) eygrVar;
        int t = t(bArr, i, eydrVar);
        int i2 = eydrVar.a;
        int i3 = t + i2;
        if (i3 > bArr.length) {
            throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i4 = eyetVar.d + (i2 / 8);
        int length = eyetVar.c.length;
        if (i4 > length) {
            if (length == 0) {
                eyetVar.c = new double[Math.max(i4, 10)];
            } else {
                while (length < i4) {
                    length = eyet.f(length);
                }
                eyetVar.c = Arrays.copyOf(eyetVar.c, length);
            }
        }
        while (t < i3) {
            eyetVar.h(a(bArr, t));
            t += 8;
        }
        if (t == i3) {
            return t;
        }
        throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int j(byte[] bArr, int i, eygr eygrVar, eydr eydrVar) {
        eygb eygbVar = (eygb) eygrVar;
        int t = t(bArr, i, eydrVar);
        int i2 = eydrVar.a;
        int i3 = t + i2;
        if (i3 > bArr.length) {
            throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i4 = eygbVar.c + (i2 / 4);
        int length = eygbVar.b.length;
        if (i4 > length) {
            if (length == 0) {
                eygbVar.b = new int[Math.max(i4, 10)];
            } else {
                while (length < i4) {
                    length = eygb.f(length);
                }
                eygbVar.b = Arrays.copyOf(eygbVar.b, length);
            }
        }
        while (t < i3) {
            eygbVar.h(d(bArr, t));
            t += 4;
        }
        if (t == i3) {
            return t;
        }
        throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int k(byte[] bArr, int i, eygr eygrVar, eydr eydrVar) {
        eyhg eyhgVar = (eyhg) eygrVar;
        int t = t(bArr, i, eydrVar);
        int i2 = eydrVar.a;
        int i3 = t + i2;
        if (i3 > bArr.length) {
            throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i4 = eyhgVar.c + (i2 / 8);
        int length = eyhgVar.b.length;
        if (i4 > length) {
            if (length == 0) {
                eyhgVar.b = new long[Math.max(i4, 10)];
            } else {
                while (length < i4) {
                    length = eyhg.h(length);
                }
                eyhgVar.b = Arrays.copyOf(eyhgVar.b, length);
            }
        }
        while (t < i3) {
            eyhgVar.g(A(bArr, t));
            t += 8;
        }
        if (t == i3) {
            return t;
        }
        throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int l(byte[] bArr, int i, eygr eygrVar, eydr eydrVar) {
        eyfl eyflVar = (eyfl) eygrVar;
        int t = t(bArr, i, eydrVar);
        int i2 = eydrVar.a;
        int i3 = t + i2;
        if (i3 > bArr.length) {
            throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i4 = eyflVar.d + (i2 / 4);
        int length = eyflVar.c.length;
        if (i4 > length) {
            if (length == 0) {
                eyflVar.c = new float[Math.max(i4, 10)];
            } else {
                while (length < i4) {
                    length = eyfl.f(length);
                }
                eyflVar.c = Arrays.copyOf(eyflVar.c, length);
            }
        }
        while (t < i3) {
            eyflVar.h(b(bArr, t));
            t += 4;
        }
        if (t == i3) {
            return t;
        }
        throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int m(byte[] bArr, int i, eygr eygrVar, eydr eydrVar) {
        eygb eygbVar = (eygb) eygrVar;
        int t = t(bArr, i, eydrVar);
        int i2 = eydrVar.a + t;
        while (t < i2) {
            t = t(bArr, t, eydrVar);
            eygbVar.h(eyel.H(eydrVar.a));
        }
        if (t == i2) {
            return t;
        }
        throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int n(byte[] bArr, int i, eygr eygrVar, eydr eydrVar) {
        eyhg eyhgVar = (eyhg) eygrVar;
        int t = t(bArr, i, eydrVar);
        int i2 = eydrVar.a + t;
        while (t < i2) {
            t = w(bArr, t, eydrVar);
            eyhgVar.g(eyel.J(eydrVar.b));
        }
        if (t == i2) {
            return t;
        }
        throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int o(byte[] bArr, int i, eygr eygrVar, eydr eydrVar) {
        eygb eygbVar = (eygb) eygrVar;
        int t = t(bArr, i, eydrVar);
        int i2 = eydrVar.a + t;
        while (t < i2) {
            t = t(bArr, t, eydrVar);
            eygbVar.h(eydrVar.a);
        }
        if (t == i2) {
            return t;
        }
        throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int p(byte[] bArr, int i, eygr eygrVar, eydr eydrVar) {
        eyhg eyhgVar = (eyhg) eygrVar;
        int t = t(bArr, i, eydrVar);
        int i2 = eydrVar.a + t;
        while (t < i2) {
            t = w(bArr, t, eydrVar);
            eyhgVar.g(eydrVar.b);
        }
        if (t == i2) {
            return t;
        }
        throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int q(byte[] bArr, int i, eydr eydrVar) {
        int t = t(bArr, i, eydrVar);
        int i2 = eydrVar.a;
        if (i2 < 0) {
            throw new eygu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            eydrVar.c = "";
            return t;
        }
        eydrVar.c = new String(bArr, t, i2, eygs.a);
        return t + i2;
    }

    static int r(byte[] bArr, int i, eydr eydrVar) {
        int t = t(bArr, i, eydrVar);
        int i2 = eydrVar.a;
        if (i2 < 0) {
            throw new eygu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            eydrVar.c = "";
            return t;
        }
        eydrVar.c = eyjo.g(bArr, t, i2);
        return t + i2;
    }

    static int s(int i, byte[] bArr, int i2, int i3, eyjd eyjdVar, eydr eydrVar) {
        if (eyjt.a(i) == 0) {
            throw new eygu("Protocol message contained an invalid tag (zero).");
        }
        int b2 = eyjt.b(i);
        if (b2 == 0) {
            int w = w(bArr, i2, eydrVar);
            eyjdVar.f(i, Long.valueOf(eydrVar.b));
            return w;
        }
        if (b2 == 1) {
            eyjdVar.f(i, Long.valueOf(A(bArr, i2)));
            return i2 + 8;
        }
        if (b2 == 2) {
            int t = t(bArr, i2, eydrVar);
            int i4 = eydrVar.a;
            if (i4 < 0) {
                throw new eygu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i4 > bArr.length - t) {
                throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i4 == 0) {
                eyjdVar.f(i, eyee.b);
            } else {
                eyjdVar.f(i, eyee.z(bArr, t, i4));
            }
            return t + i4;
        }
        if (b2 != 3) {
            if (b2 != 5) {
                throw new eygu("Protocol message contained an invalid tag (zero).");
            }
            eyjdVar.f(i, Integer.valueOf(d(bArr, i2)));
            return i2 + 4;
        }
        eyjd eyjdVar2 = new eyjd();
        int i5 = (i & (-8)) | 4;
        int i6 = eydrVar.e + 1;
        eydrVar.e = i6;
        B(i6);
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int t2 = t(bArr, i2, eydrVar);
            int i8 = eydrVar.a;
            if (i8 == i5) {
                i7 = i8;
                i2 = t2;
                break;
            }
            i2 = s(i8, bArr, t2, i3, eyjdVar2, eydrVar);
            i7 = i8;
        }
        eydrVar.e--;
        if (i2 > i3 || i7 != i5) {
            throw new eygu("Failed to parse the message.");
        }
        eyjdVar.f(i, eyjdVar2);
        return i2;
    }

    static int t(byte[] bArr, int i, eydr eydrVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return u(b2, bArr, i2, eydrVar);
        }
        eydrVar.a = b2;
        return i2;
    }

    static int u(int i, byte[] bArr, int i2, eydr eydrVar) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b2 >= 0) {
            eydrVar.a = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            eydrVar.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            eydrVar.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            eydrVar.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                eydrVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int v(int i, byte[] bArr, int i2, int i3, eygr eygrVar, eydr eydrVar) {
        eygb eygbVar = (eygb) eygrVar;
        int t = t(bArr, i2, eydrVar);
        eygbVar.h(eydrVar.a);
        while (t < i3) {
            int t2 = t(bArr, t, eydrVar);
            if (i != eydrVar.a) {
                break;
            }
            t = t(bArr, t2, eydrVar);
            eygbVar.h(eydrVar.a);
        }
        return t;
    }

    static int w(byte[] bArr, int i, eydr eydrVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            eydrVar.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        eydrVar.b = j2;
        return i3;
    }

    static int x(Object obj, eyik eyikVar, byte[] bArr, int i, int i2, int i3, eydr eydrVar) {
        int i4 = eydrVar.e + 1;
        eydrVar.e = i4;
        B(i4);
        int c = ((eyhv) eyikVar).c(obj, bArr, i, i2, i3, eydrVar);
        eydrVar.e--;
        eydrVar.c = obj;
        return c;
    }

    static int y(Object obj, eyik eyikVar, byte[] bArr, int i, int i2, eydr eydrVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = u(i4, bArr, i3, eydrVar);
            i4 = eydrVar.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = eydrVar.e + 1;
        eydrVar.e = i6;
        B(i6);
        int i7 = i5 + i4;
        eyikVar.j(obj, bArr, i5, i7, eydrVar);
        eydrVar.e--;
        eydrVar.c = obj;
        return i7;
    }

    static int z(int i, byte[] bArr, int i2, int i3, eydr eydrVar) {
        if (eyjt.a(i) == 0) {
            throw new eygu("Protocol message contained an invalid tag (zero).");
        }
        int b2 = eyjt.b(i);
        if (b2 == 0) {
            return w(bArr, i2, eydrVar);
        }
        if (b2 == 1) {
            return i2 + 8;
        }
        if (b2 == 2) {
            return t(bArr, i2, eydrVar) + eydrVar.a;
        }
        if (b2 != 3) {
            if (b2 == 5) {
                return i2 + 4;
            }
            throw new eygu("Protocol message contained an invalid tag (zero).");
        }
        int i4 = (i & (-8)) | 4;
        int i5 = 0;
        while (i2 < i3) {
            i2 = t(bArr, i2, eydrVar);
            i5 = eydrVar.a;
            if (i5 == i4) {
                break;
            }
            i2 = z(i5, bArr, i2, i3, eydrVar);
        }
        if (i2 > i3 || i5 != i4) {
            throw new eygu("Failed to parse the message.");
        }
        return i2;
    }
}
