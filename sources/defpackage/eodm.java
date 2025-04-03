package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eodm {
    private static final eodj a;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        r0 = defpackage.eodi.a;
     */
    static {
        /*
            java.lang.String r0 = "os.arch"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "amd64"
            boolean r0 = j$.util.Objects.equals(r0, r1)     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L20
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()     // Catch: java.lang.Throwable -> L20
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L1d
            eodl r0 = defpackage.eodl.UNSAFE_LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L20
            goto L22
        L1d:
            eodl r0 = defpackage.eodl.UNSAFE_BIG_ENDIAN     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            eodi r0 = defpackage.eodi.a
        L22:
            defpackage.eodm.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eodm.<clinit>():void");
    }

    static int a(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static long b(byte[] bArr, int i) {
        return a.a(bArr, i);
    }
}
