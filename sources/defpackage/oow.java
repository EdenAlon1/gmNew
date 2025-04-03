package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oow {
    static int a(InputStream inputStream) {
        return (int) d(inputStream, 2);
    }

    static int b(InputStream inputStream) {
        return (int) d(inputStream, 1);
    }

    static int c(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    static long d(InputStream inputStream, int i) {
        byte[] n = n(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (n[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    static long e(InputStream inputStream) {
        return d(inputStream, 4);
    }

    static String f(InputStream inputStream, int i) {
        return new String(n(inputStream, i), StandardCharsets.UTF_8);
    }

    static void g(OutputStream outputStream, byte[] bArr) {
        k(outputStream, bArr.length);
        byte[] m = m(bArr);
        k(outputStream, m.length);
        outputStream.write(m);
    }

    static void h(OutputStream outputStream, String str) {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    static void i(OutputStream outputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    static void j(OutputStream outputStream, int i) {
        i(outputStream, i, 2);
    }

    static void k(OutputStream outputStream, long j) {
        i(outputStream, j, 4);
    }

    static void l(OutputStream outputStream, int i) {
        i(outputStream, i, 1);
    }

    static byte[] m(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    static byte[] n(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                throw new IllegalStateException(a.h(i, "Not enough bytes to read: "));
            }
            i2 += read;
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        if (r0.finished() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static byte[] o(java.io.InputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L69
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L69
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L69
            if (r6 != 0) goto L47
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L69
            if (r6 != 0) goto L47
            if (r4 >= r9) goto L47
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L69
            if (r6 < 0) goto L39
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L69
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.util.zip.DataFormatException -> L2e java.lang.Throwable -> L69
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L69
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L69
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L69
            throw r9     // Catch: java.lang.Throwable -> L69
        L39:
            java.lang.String r8 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            java.lang.String r10 = " bytes"
            java.lang.String r8 = defpackage.a.f(r9, r8, r10)     // Catch: java.lang.Throwable -> L69
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L69
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L69
            throw r9     // Catch: java.lang.Throwable -> L69
        L47:
            if (r4 != r9) goto L5b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L69
            if (r8 == 0) goto L53
            r0.end()
            return r1
        L53:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L69
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L69
            throw r9     // Catch: java.lang.Throwable -> L69
        L5b:
            java.lang.String r8 = "Didn't read enough bytes during decompression. expected="
            java.lang.String r10 = " actual="
            java.lang.String r8 = defpackage.a.r(r4, r9, r8, r10)     // Catch: java.lang.Throwable -> L69
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L69
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L69
            throw r9     // Catch: java.lang.Throwable -> L69
        L69:
            r8 = move-exception
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oow.o(java.io.InputStream, int, int):byte[]");
    }
}
