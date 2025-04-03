package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ficw {
    public static int a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i + 1] & 255) << 16) | (bArr[i] << 24) | ((bArr[i + 2] & 255) << 8);
    }

    public static int b(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16);
    }

    public static long c(byte[] bArr, int i) {
        int i2 = i + 4;
        return (b(bArr, i) & 4294967295L) | ((b(bArr, i2) & 4294967295L) << 32);
    }

    public static short d(byte[] bArr, int i) {
        return (short) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
    }

    public static void e(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static void f(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
    }

    public static void g(long j, byte[] bArr, int i) {
        e((int) (j >>> 32), bArr, i);
        e((int) (j & 4294967295L), bArr, i + 4);
    }

    public static void h(long j, byte[] bArr, int i) {
        f((int) (4294967295L & j), bArr, i);
        f((int) (j >>> 32), bArr, i + 4);
    }
}
