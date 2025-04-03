package defpackage;

import j$.time.Duration;
import j$.time.temporal.ChronoUnit;
import java.math.BigDecimal;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erne {
    public static final /* synthetic */ int a = 0;
    private static final Duration b;
    private static final Duration c;
    private static final Duration d;
    private static final Duration e;

    static {
        Duration.ofSeconds(Long.MIN_VALUE);
        Duration.ofSeconds(Long.MAX_VALUE, 999999999L);
        b = Duration.ofMillis(Long.MAX_VALUE);
        c = Duration.ofMillis(Long.MIN_VALUE);
        c(Long.MAX_VALUE);
        c(Long.MIN_VALUE);
        d = Duration.ofNanos(Long.MAX_VALUE);
        e = Duration.ofNanos(Long.MIN_VALUE);
        BigDecimal.valueOf(9.223372036854776E18d);
        BigDecimal.valueOf(-9.223372036854776E18d);
    }

    public static long a(Duration duration) {
        if (duration.compareTo(b) >= 0) {
            return Long.MAX_VALUE;
        }
        if (duration.compareTo(c) <= 0) {
            return Long.MIN_VALUE;
        }
        try {
            return duration.toMillis();
        } catch (ArithmeticException unused) {
            return duration.isNegative() ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
    }

    public static long b(Duration duration) {
        if (duration.compareTo(d) >= 0) {
            return Long.MAX_VALUE;
        }
        if (duration.compareTo(e) <= 0) {
            return Long.MIN_VALUE;
        }
        try {
            return duration.toNanos();
        } catch (ArithmeticException unused) {
            return duration.isNegative() ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
    }

    public static void c(long j) {
        Duration.of(j, ChronoUnit.MICROS);
    }
}
