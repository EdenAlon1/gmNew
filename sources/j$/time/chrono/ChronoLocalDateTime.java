package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;

/* loaded from: classes9.dex */
public interface ChronoLocalDateTime<D extends ChronoLocalDate> extends Temporal, TemporalAdjuster, Comparable<ChronoLocalDateTime<?>> {
    /* renamed from: K */
    int compareTo(ChronoLocalDateTime chronoLocalDateTime);

    Chronology a();

    ChronoLocalDate b();

    InterfaceC0030i q(ZoneId zoneId);

    long toEpochSecond(ZoneOffset zoneOffset);

    LocalTime toLocalTime();
}
