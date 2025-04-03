package defpackage;

import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fjav {
    public static String a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i < (bArr.length + 2) / 3; i++) {
            short[] sArr = new short[3];
            short[] sArr2 = new short[4];
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = (i * 3) + i2;
                if (i3 < bArr.length) {
                    sArr[i2] = (short) (bArr[i3] & 255);
                } else {
                    sArr[i2] = -1;
                }
            }
            short s = sArr[0];
            int i4 = (s & 3) << 4;
            sArr2[0] = (short) (s >> 2);
            short s2 = sArr[1];
            if (s2 == -1) {
                sArr2[1] = (short) i4;
            } else {
                sArr2[1] = (short) (i4 + (s2 >> 4));
            }
            short s3 = sArr[1];
            if (s3 == -1) {
                sArr2[3] = 64;
                sArr2[2] = 64;
            } else {
                int i5 = (s3 & 15) << 2;
                short s4 = sArr[2];
                if (s4 == -1) {
                    sArr2[2] = (short) i5;
                    sArr2[3] = 64;
                } else {
                    sArr2[2] = (short) (i5 + (s4 >> 6));
                    sArr2[3] = (short) (s4 & 63);
                }
            }
            for (int i6 = 0; i6 < 4; i6++) {
                byteArrayOutputStream.write("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".charAt(sArr2[i6]));
            }
        }
        return new String(byteArrayOutputStream.toByteArray());
    }

    public static String b(byte[] bArr, boolean z) {
        String a = a(bArr);
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (i < a.length()) {
            stringBuffer.append("\t");
            int i2 = i + 64;
            if (i2 >= a.length()) {
                stringBuffer.append(a.substring(i));
                if (z) {
                    stringBuffer.append(" )");
                }
            } else {
                stringBuffer.append(a.substring(i, i2));
                stringBuffer.append("\n");
            }
            i = i2;
        }
        return stringBuffer.toString();
    }
}
