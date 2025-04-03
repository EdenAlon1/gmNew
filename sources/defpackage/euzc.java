package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euzc {
    static void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (i(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || i(b3) || i(b4)) {
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        int h = ((b & 7) << 18) | (h(b2) << 12) | (h(b3) << 6) | h(b4);
        cArr[i] = (char) ((h >>> 10) + 55232);
        cArr[i + 1] = (char) ((h & 1023) + 56320);
    }

    static void b(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    static void c(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!i(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!i(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | (h(b2) << 6) | h(b3));
                return;
            }
        }
        throw new IllegalArgumentException("Invalid UTF-8");
    }

    static void d(byte b, byte b2, char[] cArr, int i) {
        if (b < -62) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        }
        if (i(b2)) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
        }
        cArr[i] = (char) (((b & 31) << 6) | h(b2));
    }

    static boolean e(byte b) {
        return b >= 0;
    }

    static boolean f(byte b) {
        return b < -16;
    }

    static boolean g(byte b) {
        return b < -32;
    }

    private static int h(byte b) {
        return b & 63;
    }

    private static boolean i(byte b) {
        return b > -65;
    }
}
