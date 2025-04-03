package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;

/* loaded from: classes9.dex */
public interface ChronoLocalDate extends Temporal, TemporalAdjuster, Comparable<ChronoLocalDate> {
    ChronoLocalDateTime B(LocalTime localTime);

    l H();

    boolean N();

    ChronoLocalDate O(TemporalAmount temporalAmount);

    /* renamed from: S */
    ChronoLocalDate o(long j, TemporalUnit temporalUnit);

    int U();

    Chronology a();

    @Override // j$.time.temporal.Temporal
    ChronoLocalDate c(long j, TemporalField temporalField);

    int compareTo(ChronoLocalDate chronoLocalDate);

    @Override // j$.time.temporal.Temporal
    ChronoLocalDate d(long j, TemporalUnit temporalUnit);

    @Override // j$.time.temporal.Temporal
    long e(Temporal temporal, TemporalUnit temporalUnit);

    boolean equals(Object obj);

    @Override // j$.time.temporal.TemporalAccessor
    boolean f(TemporalField temporalField);

    int hashCode();

    /* renamed from: l */
    ChronoLocalDate u(TemporalAdjuster temporalAdjuster);

    long toEpochDay();

    String toString();
}
