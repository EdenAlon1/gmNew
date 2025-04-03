package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.Temporal;

/* renamed from: j$.time.chrono.i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC0030i extends Temporal, Comparable {
    ChronoLocalDateTime L();

    long Y();

    Chronology a();

    ChronoLocalDate b();

    ZoneId getZone();

    ZoneOffset i();

    InterfaceC0030i j(ZoneId zoneId);

    InterfaceC0030i k(ZoneId zoneId);

    LocalTime toLocalTime();
}
