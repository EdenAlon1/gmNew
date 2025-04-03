package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ficp {
    public static int a(int i) {
        int i2 = -1;
        while (i != 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static int b(int i, int i2, int i3) {
        int c = c(i, i3);
        int c2 = c(i2, i3);
        int i4 = 0;
        if (c2 != 0) {
            int a = a(i3);
            while (c != 0) {
                if ((c & 1) == 1) {
                    i4 ^= c2;
                }
                c >>>= 1;
                c2 += c2;
                if (c2 >= (1 << a)) {
                    c2 ^= i3;
                }
            }
        }
        return i4;
    }

    public static int c(int i, int i2) {
        if (i2 == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        while (a(i) >= a(i2)) {
            i ^= i2 << (a(i) - a(i2));
        }
        return i;
    }
}
