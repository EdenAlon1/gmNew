package j$.time.temporal;

import j$.time.LocalDate;

/* loaded from: classes9.dex */
public interface Temporal extends TemporalAccessor {
    Temporal c(long j, TemporalField temporalField);

    Temporal d(long j, TemporalUnit temporalUnit);

    long e(Temporal temporal, TemporalUnit temporalUnit);

    Temporal o(long j, ChronoUnit chronoUnit);

    Temporal u(LocalDate localDate);
}
