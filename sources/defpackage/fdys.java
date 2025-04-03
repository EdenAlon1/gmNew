package defpackage;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdys implements Comparable {
    public static final fdyq a = new fdyq();
    private static final long d;
    private static final long e;
    private static final long f;
    public final fdyr b;
    public final long c;
    private volatile boolean g;

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        d = nanos;
        e = -nanos;
        f = TimeUnit.SECONDS.toNanos(1L);
    }

    private fdys(fdyr fdyrVar, long j, long j2) {
        this.b = fdyrVar;
        long min = Math.min(d, Math.max(e, j2));
        this.c = j + min;
        this.g = min <= 0;
    }

    public static fdys c(long j, TimeUnit timeUnit) {
        return d(j, timeUnit, a);
    }

    public static fdys d(long j, TimeUnit timeUnit, fdyr fdyrVar) {
        h(timeUnit, "units");
        return new fdys(fdyrVar, System.nanoTime(), timeUnit.toNanos(j));
    }

    public static void h(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(fdys fdysVar) {
        e(fdysVar);
        long j = this.c - fdysVar.c;
        if (j < 0) {
            return -1;
        }
        return j > 0 ? 1 : 0;
    }

    public final long b(TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        if (!this.g && this.c - nanoTime <= 0) {
            this.g = true;
        }
        return timeUnit.convert(this.c - nanoTime, TimeUnit.NANOSECONDS);
    }

    public final void e(fdys fdysVar) {
        fdyr fdyrVar = this.b;
        if (fdyrVar == fdysVar.b) {
            return;
        }
        throw new AssertionError("Tickers (" + fdyrVar.toString() + " and " + fdysVar.b.toString() + ") don't match. Custom Ticker should only be used in tests!");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fdys)) {
            return false;
        }
        fdys fdysVar = (fdys) obj;
        return this.b == fdysVar.b && this.c == fdysVar.c;
    }

    public final boolean f(fdys fdysVar) {
        e(fdysVar);
        return this.c - fdysVar.c < 0;
    }

    public final boolean g() {
        if (!this.g) {
            if (this.c - System.nanoTime() > 0) {
                return false;
            }
            this.g = true;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.asList(this.b, Long.valueOf(this.c)).hashCode();
    }

    public final String toString() {
        long b = b(TimeUnit.NANOSECONDS);
        long abs = Math.abs(b);
        long j = f;
        long j2 = abs / j;
        long abs2 = Math.abs(b) % j;
        StringBuilder sb = new StringBuilder();
        if (b < 0) {
            sb.append('-');
        }
        sb.append(j2);
        if (abs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        }
        sb.append("s from now");
        fdyr fdyrVar = this.b;
        if (fdyrVar != a) {
            sb.append(a.b(fdyrVar, " (ticker=", ")"));
        }
        return sb.toString();
    }
}
