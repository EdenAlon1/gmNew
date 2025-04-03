package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes9.dex */
enum f implements TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears", Duration.ofSeconds(31556952)),
    QUARTER_YEARS("QuarterYears", Duration.ofSeconds(7889238));

    private final String a;
    private final Duration b;

    f(String str, Duration duration) {
        this.a = str;
        this.b = duration;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final long between(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.e(temporal2, this);
        }
        int ordinal = ordinal();
        if (ordinal == 0) {
            TemporalField temporalField = g.c;
            return j$.time.b.e(temporal2.y(temporalField), temporal.y(temporalField));
        }
        if (ordinal == 1) {
            return temporal.e(temporal2, ChronoUnit.MONTHS) / 3;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Duration getDuration() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Temporal o(Temporal temporal, long j) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return temporal.c(j$.time.b.c(temporal.get(r0), j), g.c);
        }
        if (ordinal == 1) {
            return temporal.d(j / 4, ChronoUnit.YEARS).d((j % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final boolean u() {
        return true;
    }
}
