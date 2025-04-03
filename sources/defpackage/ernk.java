package defpackage;

import j$.time.Duration;
import j$.time.temporal.ChronoUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ernk {
    public static final Duration a(long j) {
        Duration ofDays = Duration.ofDays(j);
        ofDays.getClass();
        return ofDays;
    }

    public static final Duration b(int i) {
        Duration ofHours = Duration.ofHours(i);
        ofHours.getClass();
        return ofHours;
    }

    public static final Duration c(long j) {
        Duration of = Duration.of(j, ChronoUnit.MICROS);
        of.getClass();
        return of;
    }

    public static final Duration d(int i) {
        Duration ofMillis = Duration.ofMillis(i);
        ofMillis.getClass();
        return ofMillis;
    }

    public static final Duration e(int i) {
        return f(i);
    }

    public static final Duration f(long j) {
        Duration ofMinutes = Duration.ofMinutes(j);
        ofMinutes.getClass();
        return ofMinutes;
    }

    public static final Duration g(int i) {
        return h(i);
    }

    public static final Duration h(long j) {
        Duration ofSeconds = Duration.ofSeconds(j);
        ofSeconds.getClass();
        return ofSeconds;
    }
}
