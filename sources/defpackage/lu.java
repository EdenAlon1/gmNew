package defpackage;

import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lu {
    public static byte[] a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < bArr.length) {
            byte b = bArr[i];
            if (b == 61) {
                try {
                    char c = (char) bArr[i + 1];
                    if (c == '\r') {
                        int i2 = i + 2;
                        if (((char) bArr[i2]) == '\n') {
                            i = i2;
                        } else {
                            c = '\r';
                        }
                    }
                    int digit = Character.digit(c, 16);
                    i += 2;
                    int digit2 = Character.digit((char) bArr[i], 16);
                    if (digit != -1 && digit2 != -1) {
                        byteArrayOutputStream.write((char) ((digit << 4) + digit2));
                    }
                    return null;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    return null;
                }
            }
            byteArrayOutputStream.write(b);
            i++;
        }
        return byteArrayOutputStream.toByteArray();
    }
}
