package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lvc {
    private long a;
    private long b;
    private long c;
    private final ThreadLocal d = new ThreadLocal();

    public lvc(long j) {
        i(j);
    }

    public static long g(long j) {
        return lvf.w(j, 1000000L, 90000L);
    }

    public static long h(long j) {
        return lvf.w(j, 90000L, 1000000L);
    }

    public final synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (!j()) {
            long j2 = this.a;
            if (j2 == 9223372036854775806L) {
                Long l = (Long) this.d.get();
                lti.f(l);
                j2 = l.longValue();
            }
            this.b = j2 - j;
            notifyAll();
        }
        this.c = j;
        return j + this.b;
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.c;
        if (j2 != -9223372036854775807L) {
            long h = h(j2);
            long j3 = (4294967296L + h) / 8589934592L;
            long j4 = (((-1) + j3) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - h) < Math.abs(j - h)) {
                j = j4;
            }
        }
        return a(g(j));
    }

    public final synchronized long c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.c;
        if (j2 != -9223372036854775807L) {
            long h = h(j2);
            long j3 = h / 8589934592L;
            Long.signum(j3);
            long j4 = (j3 * 8589934592L) + j;
            j += (j3 + 1) * 8589934592L;
            if (j4 >= h) {
                j = j4;
            }
        }
        return a(g(j));
    }

    public final synchronized long d() {
        long j = this.a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j;
    }

    public final synchronized long e() {
        long j;
        j = this.c;
        return j != -9223372036854775807L ? j + this.b : d();
    }

    public final synchronized long f() {
        return this.b;
    }

    public final synchronized void i(long j) {
        this.a = j;
        this.b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.c = -9223372036854775807L;
    }

    public final synchronized boolean j() {
        return this.b != -9223372036854775807L;
    }
}
