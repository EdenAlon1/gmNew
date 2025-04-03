package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djba {
    public static final boolean a(InputStream inputStream, byte[] bArr) {
        inputStream.mark(bArr.length + 4);
        try {
            int read = inputStream.read();
            if (read == 13) {
                read = inputStream.read();
            }
            if (read == 10) {
                read = inputStream.read();
            }
            boolean z = false;
            if (read == 45 && inputStream.read() == 45) {
                int i = 0;
                while (true) {
                    if (i >= bArr.length) {
                        z = true;
                        break;
                    }
                    int read2 = inputStream.read();
                    if (read2 == -1 || bArr[i] != read2) {
                        break;
                    }
                    i++;
                }
            }
            return z;
        } finally {
            inputStream.reset();
        }
    }

    public static final void b(InputStream inputStream) {
        inputStream.mark(1);
        int read = inputStream.read();
        if (read == 13) {
            inputStream.mark(1);
            read = inputStream.read();
        }
        if (read != 10) {
            inputStream.reset();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001e, code lost:
    
        r3.read();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String c(java.io.InputStream r3) {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 1024(0x400, float:1.435E-42)
            r0.<init>(r1)
            int r1 = r3.read()     // Catch: java.lang.Throwable -> L30
        Lb:
            r2 = -1
            if (r1 == r2) goto L21
            r2 = 13
            if (r1 == r2) goto L1e
            r2 = 10
            if (r1 == r2) goto L21
            r0.write(r1)     // Catch: java.lang.Throwable -> L30
            int r1 = r3.read()     // Catch: java.lang.Throwable -> L30
            goto Lb
        L1e:
            r3.read()     // Catch: java.lang.Throwable -> L30
        L21:
            r0.close()
            byte[] r3 = r0.toByteArray()
            java.lang.String r0 = new java.lang.String
            java.lang.String r1 = "utf-8"
            r0.<init>(r3, r1)
            return r0
        L30:
            r3 = move-exception
            r0.close()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djba.c(java.io.InputStream):java.lang.String");
    }
}
