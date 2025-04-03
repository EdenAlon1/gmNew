package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.Month;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class r extends AbstractC0022a implements Serializable {
    public static final r e = new r();
    private static final long serialVersionUID = -1440403870442975015L;

    private r() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate A(int i, int i2) {
        return LocalDate.l0(i, i2);
    }

    @Override // j$.time.chrono.AbstractC0022a, j$.time.chrono.Chronology
    public final InterfaceC0030i C(Temporal temporal) {
        return ZonedDateTime.Z(temporal);
    }

    @Override // j$.time.chrono.AbstractC0022a, j$.time.chrono.Chronology
    public final ChronoLocalDateTime F(Temporal temporal) {
        return LocalDateTime.a0(temporal);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate M(int i, int i2, int i3) {
        return LocalDate.of(i, i2, i3);
    }

    @Override // j$.time.chrono.AbstractC0022a, j$.time.chrono.Chronology
    public final ChronoLocalDate P(Map map, j$.time.format.D d) {
        return (LocalDate) super.P(map, d);
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.o Q(ChronoField chronoField) {
        return chronoField.o();
    }

    @Override // j$.time.chrono.Chronology
    public final InterfaceC0030i R(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.c0(instant, zoneId);
    }

    @Override // j$.time.chrono.Chronology
    public final List T() {
        return j$.desugar.sun.nio.fs.g.b(s.values());
    }

    @Override // j$.time.chrono.Chronology
    public final boolean V(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.Chronology
    public final l W(int i) {
        if (i == 0) {
            return s.BCE;
        }
        if (i == 1) {
            return s.CE;
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    @Override // j$.time.chrono.AbstractC0022a
    final void a0(Map map, j$.time.format.D d) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (d != j$.time.format.D.LENIENT) {
                chronoField.b0(l.longValue());
            }
            AbstractC0022a.o(map, ChronoField.MONTH_OF_YEAR, ((int) j$.nio.file.attribute.p.g(l.longValue(), r4)) + 1);
            AbstractC0022a.o(map, ChronoField.YEAR, j$.nio.file.attribute.p.f(l.longValue(), 12));
        }
    }

    @Override // j$.time.chrono.AbstractC0022a
    final ChronoLocalDate b0(Map map, j$.time.format.D d) {
        ChronoField chronoField = ChronoField.YEAR;
        int a0 = chronoField.a0(((Long) map.remove(chronoField)).longValue());
        boolean z = true;
        if (d == j$.time.format.D.LENIENT) {
            return LocalDate.of(a0, 1, 1).plusMonths(j$.time.b.e(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L)).plusDays(j$.time.b.e(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L));
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int a02 = chronoField2.a0(((Long) map.remove(chronoField2)).longValue());
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int a03 = chronoField3.a0(((Long) map.remove(chronoField3)).longValue());
        if (d == j$.time.format.D.SMART) {
            if (a02 == 4 || a02 == 6 || a02 == 9 || a02 == 11) {
                a03 = Math.min(a03, 30);
            } else if (a02 == 2) {
                Month month = Month.FEBRUARY;
                long j = a0;
                int i = j$.time.o.b;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z = false;
                }
                a03 = Math.min(a03, month.a0(z));
            }
        }
        return LocalDate.of(a0, a02, a03);
    }

    @Override // j$.time.chrono.AbstractC0022a
    final ChronoLocalDate c0(Map map, j$.time.format.D d) {
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l = (Long) map.remove(chronoField);
        if (l == null) {
            ChronoField chronoField2 = ChronoField.ERA;
            if (!map.containsKey(chronoField2)) {
                return null;
            }
            chronoField2.b0(((Long) map.get(chronoField2)).longValue());
            return null;
        }
        if (d != j$.time.format.D.LENIENT) {
            chronoField.b0(l.longValue());
        }
        Long l2 = (Long) map.remove(ChronoField.ERA);
        if (l2 != null) {
            if (l2.longValue() == 1) {
                AbstractC0022a.o(map, ChronoField.YEAR, l.longValue());
                return null;
            }
            if (l2.longValue() == 0) {
                AbstractC0022a.o(map, ChronoField.YEAR, j$.time.b.e(1L, l.longValue()));
                return null;
            }
            throw new DateTimeException("Invalid value for era: " + l2);
        }
        ChronoField chronoField3 = ChronoField.YEAR;
        Long l3 = (Long) map.get(chronoField3);
        if (d != j$.time.format.D.STRICT) {
            AbstractC0022a.o(map, chronoField3, (l3 == null || l3.longValue() > 0) ? l.longValue() : j$.time.b.e(1L, l.longValue()));
            return null;
        }
        if (l3 == null) {
            map.put(chronoField, l);
            return null;
        }
        long longValue = l3.longValue();
        long longValue2 = l.longValue();
        if (longValue <= 0) {
            longValue2 = j$.time.b.e(1L, longValue2);
        }
        AbstractC0022a.o(map, chronoField3, longValue2);
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final int h(l lVar, int i) {
        if (lVar instanceof s) {
            return lVar == s.CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate m(long j) {
        return LocalDate.k0(j);
    }

    @Override // j$.time.chrono.Chronology
    public final String n() {
        return "ISO";
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate r(TemporalAccessor temporalAccessor) {
        return LocalDate.b0(temporalAccessor);
    }

    @Override // j$.time.chrono.AbstractC0022a
    public final ChronoLocalDate u() {
        return LocalDate.b0(LocalDate.i0(j$.time.b.g()));
    }

    Object writeReplace() {
        return new D((byte) 1, this);
    }

    @Override // j$.time.chrono.Chronology
    public final String x() {
        return "iso8601";
    }
}
