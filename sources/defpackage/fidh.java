package defpackage;

import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fidh {
    private static final fidi a = new fidi();

    public static String a(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public static String b(byte[] bArr, int i, int i2) {
        return fidb.a(e(bArr, i, i2));
    }

    public static byte[] c(String str) {
        try {
            return a.a(str, 0, str.length());
        } catch (Exception e) {
            throw new fide("exception decoding Hex string: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    public static byte[] d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static byte[] e(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            fidi fidiVar = a;
            if (i2 >= 0) {
                byte[] bArr2 = new byte[72];
                while (i2 > 0) {
                    int min = Math.min(36, i2);
                    int i3 = i + min;
                    int i4 = 0;
                    while (i < i3) {
                        int i5 = i + 1;
                        byte b = bArr[i];
                        int i6 = i4 + 1;
                        byte[] bArr3 = fidiVar.a;
                        bArr2[i4] = bArr3[(b & 255) >>> 4];
                        i4 += 2;
                        bArr2[i6] = bArr3[b & 15];
                        i = i5;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i4);
                    i2 -= min;
                    i = i3;
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new fidg("exception encoding Hex string: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    public static byte[] f(String str, int i) {
        try {
            return a.a(str, 1, i);
        } catch (Exception e) {
            throw new fide("exception decoding Hex string: ".concat(String.valueOf(e.getMessage())), e);
        }
    }
}
