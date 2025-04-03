package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eodt extends eocr implements Serializable {
    public static final eodc a = new eodt();
    private static final long serialVersionUID = 0;
    private final int b = 0;
    private final boolean c = true;

    static {
        int i = eodh.a;
    }

    public static int h(byte[] bArr, int i) {
        return ermn.d(bArr[i + 3], bArr[i + 2], bArr[i + 1], bArr[i]);
    }

    public static int i(int i, int i2) {
        return (Integer.rotateLeft(i ^ i2, 13) * 5) - 430675100;
    }

    public static int j(int i) {
        return Integer.rotateLeft(i * (-862048943), 15) * 461845907;
    }

    public static long k(char c) {
        int i = ((c >>> 6) & 63) | 128;
        return (i << 8) | (c >>> '\f') | 224 | (((c & '?') | 128) << 16);
    }

    public static long l(char c) {
        return (c >>> 6) | 192 | (((c & '?') | 128) << 8);
    }

    public static long m(int i) {
        return (((i & 63) | 128) << 24) | ((((i >>> 12) & 63) | 128) << 8) | (i >>> 18) | 240 | ((((i >>> 6) & 63) | 128) << 16);
    }

    public static eodb n(int i, int i2) {
        int i3 = eodb.b;
        int i4 = i ^ i2;
        int i5 = (i4 ^ (i4 >>> 16)) * (-2048144789);
        int i6 = (i5 ^ (i5 >>> 13)) * (-1028477387);
        return new eocz(i6 ^ (i6 >>> 16));
    }

    @Override // defpackage.eocr, defpackage.eodc
    public final eodb c(CharSequence charSequence, Charset charset) {
        long j;
        if (!charset.equals(StandardCharsets.UTF_8)) {
            return b(charSequence.toString().getBytes(charset));
        }
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i2 + 4;
            j = 0;
            if (i5 > length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            char charAt2 = charSequence.charAt(i2 + 1);
            char charAt3 = charSequence.charAt(i2 + 2);
            char charAt4 = charSequence.charAt(i2 + 3);
            if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                break;
            }
            i3 = i(i3, j((charAt2 << '\b') | charAt | (charAt3 << 16) | (charAt4 << 24)));
            i4 += 4;
            i2 = i5;
        }
        while (i2 < length) {
            char charAt5 = charSequence.charAt(i2);
            if (charAt5 < 128) {
                j |= charAt5 << i;
                i4++;
                i += 8;
            } else if (charAt5 < 2048) {
                j |= l(charAt5) << i;
                i4 += 2;
                i += 16;
            } else if (charAt5 < 55296 || charAt5 > 57343) {
                j |= k(charAt5) << i;
                i4 += 3;
                i += 24;
            } else {
                int codePointAt = Character.codePointAt(charSequence, i2);
                if (codePointAt == charAt5) {
                    return b(charSequence.toString().getBytes(charset));
                }
                j |= m(codePointAt) << i;
                i4 += 4;
                i += 32;
                i2++;
            }
            if (i >= 32) {
                i3 = i(i3, j((int) j));
                j >>>= 32;
                i -= 32;
            }
            i2++;
        }
        return n(j((int) j) ^ i3, i4);
    }

    @Override // defpackage.eocr
    public final eodb e(byte[] bArr, int i) {
        int i2 = 0;
        emxf.k(0, i, bArr.length);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i3 + 4;
            if (i5 > i) {
                break;
            }
            i4 = i(i4, j(h(bArr, i3)));
            i3 = i5;
        }
        int i6 = 0;
        while (i3 < i) {
            i2 ^= ermu.b(bArr[i3]) << i6;
            i3++;
            i6 += 8;
        }
        return n(j(i2) ^ i4, i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eodt)) {
            return false;
        }
        eodt eodtVar = (eodt) obj;
        int i = eodtVar.b;
        boolean z = eodtVar.c;
        return true;
    }

    @Override // defpackage.eodc
    public final eodd f() {
        return new eods();
    }

    @Override // defpackage.eodc
    public final int g() {
        throw null;
    }

    public final int hashCode() {
        return getClass().hashCode();
    }

    public final String toString() {
        return "Hashing.murmur3_32(0)";
    }
}
