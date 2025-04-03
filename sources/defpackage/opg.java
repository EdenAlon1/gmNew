package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class opg {
    static final byte[] a = {112, 114, 111, 0};
    static final byte[] b = {112, 114, 109, 0};

    public static int a(int i) {
        return (i + 7) & (-8);
    }

    public static String b(String str, String str2, byte[] bArr) {
        String a2 = opk.a(bArr);
        if (str.length() <= 0) {
            return i(str2, a2);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return i(str2, a2);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + opk.a(bArr) + str2;
    }

    public static void c(OutputStream outputStream, oov oovVar) {
        int[] iArr = oovVar.h;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            Integer valueOf = Integer.valueOf(i3);
            valueOf.getClass();
            oow.j(outputStream, i3 - i2);
            valueOf.getClass();
            i++;
            i2 = i3;
        }
    }

    public static void d(OutputStream outputStream, oov oovVar) {
        int i = 0;
        for (Map.Entry entry : oovVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                oow.j(outputStream, intValue - i);
                oow.j(outputStream, 0);
                i = intValue;
            }
        }
    }

    public static byte[] e(oov[] oovVarArr, byte[] bArr) {
        int length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = oovVarArr.length;
            if (i2 >= length) {
                break;
            }
            oov oovVar = oovVarArr[i2];
            int c = oow.c(b(oovVar.a, oovVar.b, bArr)) + 16;
            int i4 = oovVar.e;
            i3 += c + i4 + i4 + oovVar.f + h(oovVar.g);
            i2++;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, opk.c)) {
            while (i < length) {
                oov oovVar2 = oovVarArr[i];
                l(byteArrayOutputStream, oovVar2, b(oovVar2.a, oovVar2.b, bArr));
                k(byteArrayOutputStream, oovVar2);
                i++;
            }
        } else {
            for (oov oovVar3 : oovVarArr) {
                l(byteArrayOutputStream, oovVar3, b(oovVar3.a, oovVar3.b, bArr));
            }
            int length2 = oovVarArr.length;
            while (i < length2) {
                k(byteArrayOutputStream, oovVarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    static byte[] f(InputStream inputStream, byte[] bArr) {
        if (!Arrays.equals(bArr, oow.n(inputStream, 4))) {
            throw new IllegalStateException("Invalid magic");
        }
        int i = opk.h;
        return oow.n(inputStream, 4);
    }

    public static int[] g(InputStream inputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += oow.a(inputStream);
            iArr[i3] = i2;
        }
        return iArr;
    }

    private static int h(int i) {
        return a(i + i) / 8;
    }

    private static String i(String str, String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    private static void j(byte[] bArr, int i, int i2, oov oovVar) {
        int i3 = oovVar.g;
        if (i != 2) {
            if (i != 4) {
                throw new IllegalStateException(a.h(i, "Unexpected flag: "));
            }
            i2 += i3;
        }
        int i4 = i2 / 8;
        bArr[i4] = (byte) ((1 << (i2 % 8)) | bArr[i4]);
    }

    private static void k(OutputStream outputStream, oov oovVar) {
        d(outputStream, oovVar);
        c(outputStream, oovVar);
        byte[] bArr = new byte[h(oovVar.g)];
        for (Map.Entry entry : oovVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                j(bArr, 2, intValue, oovVar);
            }
            if ((intValue2 & 4) != 0) {
                j(bArr, 4, intValue, oovVar);
            }
        }
        outputStream.write(bArr);
    }

    private static void l(OutputStream outputStream, oov oovVar, String str) {
        oow.j(outputStream, oow.c(str));
        oow.j(outputStream, oovVar.e);
        oow.k(outputStream, oovVar.f);
        oow.k(outputStream, oovVar.c);
        oow.k(outputStream, oovVar.g);
        oow.h(outputStream, str);
    }
}
