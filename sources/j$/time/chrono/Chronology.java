package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes9.dex */
public interface Chronology extends Comparable<Chronology> {

    /* renamed from: j$.time.chrono.Chronology$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Chronology a(TemporalAccessor temporalAccessor) {
            Objects.a(temporalAccessor, "temporal");
            return (Chronology) Objects.requireNonNullElse((Chronology) temporalAccessor.D(j$.time.temporal.j.e()), r.e);
        }

        public static Chronology ofLocale(Locale locale) {
            return AbstractC0022a.D(locale);
        }
    }

    ChronoLocalDate A(int i, int i2);

    InterfaceC0030i C(Temporal temporal);

    ChronoLocalDateTime F(Temporal temporal);

    ChronoLocalDate M(int i, int i2, int i3);

    ChronoLocalDate P(Map map, j$.time.format.D d);

    j$.time.temporal.o Q(ChronoField chronoField);

    InterfaceC0030i R(Instant instant, ZoneId zoneId);

    List T();

    boolean V(long j);

    l W(int i);

    boolean equals(Object obj);

    /* renamed from: g */
    int compareTo(Chronology chronology);

    int h(l lVar, int i);

    int hashCode();

    ChronoLocalDate m(long j);

    String n();

    ChronoLocalDate r(TemporalAccessor temporalAccessor);

    String toString();

    String x();
}
