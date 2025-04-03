package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ffly {
    public static final fflx a = new fflx();
    public static final ffly b;

    static {
        b = (ffie.a == null || ffie.a.intValue() >= 34) ? new ffmb() : new fflv();
    }

    public abstract int a(int i);

    public int b() {
        throw null;
    }

    public int c(int i) {
        throw null;
    }

    public long d() {
        return (b() << 32) + b();
    }

    public int f(int i) {
        int b2;
        int i2;
        if (i <= 0) {
            throw new IllegalArgumentException(fflz.c(0, Integer.valueOf(i)));
        }
        if (((-i) & i) == i) {
            return a(fflz.a(i));
        }
        do {
            b2 = b() >>> 1;
            i2 = b2 % i;
        } while ((b2 - i2) + (i - 1) < 0);
        return i2;
    }

    public long g(long j) {
        long d;
        long j2;
        if (j <= 0) {
            throw new IllegalArgumentException(fflz.c(0L, Long.valueOf(j)));
        }
        if (((-j) & j) != j) {
            do {
                d = d() >>> 1;
                j2 = d % j;
            } while ((d - j2) + (-1) + j < 0);
            return j2;
        }
        long j3 = j >>> 32;
        if (((int) j) != 0) {
            return a(fflz.a(r11)) & 4294967295L;
        }
        return ((int) j3) == 1 ? b() & 4294967295L : (a(fflz.a(r11)) << 32) + (b() & 4294967295L);
    }

    public long hL(long j) {
        return g(j);
    }
}
