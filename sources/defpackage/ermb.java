package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ermb {
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final emvz c = emvz.l("-_.*").g(new emvo('0', '9')).g(new emvo('A', 'Z')).g(new emvo('a', 'z'));
    public static final Charset a = StandardCharsets.UTF_8;

    public static String a(String str, Charset charset) {
        char c2;
        char c3;
        int i;
        int i2;
        char[] cArr;
        if (charset.equals(a)) {
            enra enraVar = erlv.a;
            str.getClass();
            int i3 = 0;
            while (i3 < str.length()) {
                char charAt = str.charAt(i3);
                erlz erlzVar = (erlz) enraVar;
                boolean[] zArr = erlzVar.d;
                if (charAt >= zArr.length || !zArr[charAt]) {
                    int length = str.length();
                    char[] a2 = enre.a();
                    int i4 = 0;
                    int i5 = 0;
                    while (i3 < length) {
                        if (i3 >= length) {
                            throw new IndexOutOfBoundsException("Index exceeds specified range");
                        }
                        int i6 = i3 + 1;
                        char charAt2 = str.charAt(i3);
                        if (charAt2 < 55296 || charAt2 > 57343) {
                            c3 = '%';
                            i = 0;
                            i2 = charAt2;
                        } else {
                            c3 = '%';
                            i = 0;
                            if (charAt2 > 56319) {
                                throw new IllegalArgumentException("Unexpected low surrogate character '" + charAt2 + "' with value " + ((int) charAt2) + " at index " + i3 + " in '" + str + "'");
                            }
                            if (i6 == length) {
                                i2 = -charAt2;
                            } else {
                                char charAt3 = str.charAt(i6);
                                if (!Character.isLowSurrogate(charAt3)) {
                                    throw new IllegalArgumentException("Expected low surrogate but got char '" + charAt3 + "' with value " + ((int) charAt3) + " at index " + i6 + " in '" + str + "'");
                                }
                                i2 = Character.toCodePoint(charAt2, charAt3);
                            }
                        }
                        if (i2 < 0) {
                            throw new IllegalArgumentException("Trailing high surrogate at end of input");
                        }
                        boolean[] zArr2 = erlzVar.d;
                        if (i2 < zArr2.length && zArr2[i2]) {
                            cArr = null;
                        } else if (i2 == 32 && erlzVar.c) {
                            cArr = erlz.a;
                        } else if (i2 <= 127) {
                            cArr = new char[3];
                            cArr[i] = c3;
                            char[] cArr2 = erlz.b;
                            cArr[2] = cArr2[i2 & 15];
                            cArr[1] = cArr2[i2 >>> 4];
                        } else if (i2 <= 2047) {
                            cArr = new char[6];
                            cArr[i] = c3;
                            cArr[3] = c3;
                            char[] cArr3 = erlz.b;
                            cArr[5] = cArr3[i2 & 15];
                            cArr[4] = cArr3[(3 & (i2 >>> 4)) | 8];
                            cArr[2] = cArr3[(i2 >>> 6) & 15];
                            cArr[1] = cArr3[(i2 >>> 10) | 12];
                        } else if (i2 <= 65535) {
                            cArr = new char[9];
                            cArr[i] = c3;
                            cArr[1] = 'E';
                            cArr[3] = c3;
                            cArr[6] = c3;
                            char[] cArr4 = erlz.b;
                            cArr[8] = cArr4[i2 & 15];
                            cArr[7] = cArr4[((i2 >>> 4) & 3) | 8];
                            cArr[5] = cArr4[(i2 >>> 6) & 15];
                            cArr[4] = cArr4[((i2 >>> 10) & 3) | 8];
                            cArr[2] = cArr4[i2 >>> 12];
                        } else {
                            if (i2 > 1114111) {
                                throw new IllegalArgumentException(a.h(i2, "Invalid unicode character value "));
                            }
                            cArr = new char[12];
                            cArr[i] = c3;
                            cArr[1] = 'F';
                            cArr[3] = c3;
                            cArr[6] = c3;
                            cArr[9] = c3;
                            char[] cArr5 = erlz.b;
                            cArr[11] = cArr5[i2 & 15];
                            cArr[10] = cArr5[((i2 >>> 4) & 3) | 8];
                            cArr[8] = cArr5[(i2 >>> 6) & 15];
                            cArr[7] = cArr5[((i2 >>> 10) & 3) | 8];
                            cArr[5] = cArr5[(i2 >>> 12) & 15];
                            cArr[4] = cArr5[((i2 >>> 16) & 3) | 8];
                            cArr[2] = cArr5[i2 >>> 18];
                        }
                        int i7 = (true != Character.isSupplementaryCodePoint(i2) ? 1 : 2) + i3;
                        if (cArr != null) {
                            int i8 = i3 - i4;
                            int i9 = i5 + i8;
                            int length2 = a2.length;
                            int length3 = cArr.length;
                            int i10 = i9 + length3;
                            if (length2 < i10) {
                                a2 = enrf.a(a2, i5, i10 + (length - i3) + 32);
                            }
                            if (i8 > 0) {
                                str.getChars(i4, i3, a2, i5);
                                i5 = i9;
                            }
                            System.arraycopy(cArr, i, a2, i5, length3);
                            i5 += length3;
                            i4 = i7;
                        }
                        i3 = i7;
                        while (i3 < length) {
                            char charAt4 = str.charAt(i3);
                            boolean[] zArr3 = erlzVar.d;
                            if (charAt4 < zArr3.length && zArr3[charAt4]) {
                                i3++;
                            }
                        }
                    }
                    int i11 = length - i4;
                    if (i11 > 0) {
                        int i12 = i11 + i5;
                        if (a2.length < i12) {
                            a2 = enrf.a(a2, i5, i12);
                        }
                        str.getChars(i4, length, a2, i5);
                        i5 = i12;
                    }
                    return new String(a2, 0, i5);
                }
                i3++;
            }
        } else {
            int i13 = 0;
            char c4 = '%';
            int length4 = str.length();
            StringBuilder sb = new StringBuilder(length4 + length4);
            byte[] bytes = str.getBytes(charset);
            int length5 = bytes.length;
            boolean z = false;
            int i14 = 0;
            while (i13 < length5) {
                int b2 = ermu.b(bytes[i13]);
                char c5 = (char) b2;
                if (c.c(c5)) {
                    sb.append(c5);
                    i14++;
                } else if (b2 == 32) {
                    sb.append('+');
                    i14++;
                    z = true;
                } else {
                    c2 = c4;
                    sb.append(c2);
                    char[] cArr6 = b;
                    sb.append(cArr6[b2 >> 4]);
                    sb.append(cArr6[b2 & 15]);
                    i14 += 3;
                    i13++;
                    c4 = c2;
                }
                c2 = c4;
                i13++;
                c4 = c2;
            }
            if (z || i14 != str.length()) {
                return sb.toString();
            }
        }
        return str;
    }
}
