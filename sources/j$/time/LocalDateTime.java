package j$.time;

import j$.time.chrono.AbstractC0028g;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class LocalDateTime implements Temporal, TemporalAdjuster, ChronoLocalDateTime<LocalDate>, Serializable {
    public static final LocalDateTime MIN = d0(LocalDate.d, LocalTime.e);
    public static final LocalDateTime c = d0(LocalDate.e, LocalTime.f);
    private static final long serialVersionUID = 6207766400415563566L;
    private final LocalDate a;
    private final LocalTime b;

    private LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.a = localDate;
        this.b = localTime;
    }

    private int Z(LocalDateTime localDateTime) {
        int Z = this.a.Z(localDateTime.b());
        return Z == 0 ? this.b.compareTo(localDateTime.toLocalTime()) : Z;
    }

    public static LocalDateTime a0(Temporal temporal) {
        if (temporal instanceof LocalDateTime) {
            return (LocalDateTime) temporal;
        }
        if (temporal instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporal).L();
        }
        if (temporal instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporal).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.b0(temporal), LocalTime.b0(temporal));
        } catch (DateTimeException e) {
            throw new DateTimeException(d.d("Unable to obtain LocalDateTime from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
        }
    }

    public static LocalDateTime d0(LocalDate localDate, LocalTime localTime) {
        Objects.a(localDate, "date");
        Objects.a(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    public static LocalDateTime e0(long j, int i, ZoneOffset zoneOffset) {
        Objects.a(zoneOffset, "offset");
        long j2 = i;
        ChronoField.NANO_OF_SECOND.b0(j2);
        return new LocalDateTime(LocalDate.k0(j$.nio.file.attribute.p.f(j + zoneOffset.getTotalSeconds(), 86400)), LocalTime.j0((((int) j$.nio.file.attribute.p.g(r5, r7)) * 1000000000) + j2));
    }

    private LocalDateTime i0(LocalDate localDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        LocalTime localTime = this.b;
        if (j5 == 0) {
            return m0(localDate, localTime);
        }
        long j6 = j / 24;
        long j7 = j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long j8 = 1;
        long j9 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long r0 = localTime.r0();
        long j10 = (j9 * j8) + r0;
        long f = j$.nio.file.attribute.p.f(j10, 86400000000000L) + (j7 * j8);
        long g = j$.nio.file.attribute.p.g(j10, 86400000000000L);
        if (g != r0) {
            localTime = LocalTime.j0(g);
        }
        return m0(localDate.plusDays(f), localTime);
    }

    private LocalDateTime m0(LocalDate localDate, LocalTime localTime) {
        return (this.a == localDate && this.b == localTime) ? this : new LocalDateTime(localDate, localTime);
    }

    public static LocalDateTime of(int i, Month month, int i2, int i3, int i4, int i5) {
        return new LocalDateTime(LocalDate.j0(i, month, i2), LocalTime.h0(i3, i4, i5));
    }

    public static LocalDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.a(instant, "instant");
        Objects.a(zoneId, "zone");
        return e0(instant.getEpochSecond(), instant.getNano(), zoneId.getRules().d(instant));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 5, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(j$.time.temporal.m mVar) {
        return mVar == j$.time.temporal.j.f() ? this.a : AbstractC0028g.k(this, mVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal G(Temporal temporal) {
        return temporal.c(b().toEpochDay(), ChronoField.EPOCH_DAY).c(toLocalTime().r0(), ChronoField.NANO_OF_DAY);
    }

    @Override // java.lang.Comparable
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return chronoLocalDateTime instanceof LocalDateTime ? Z((LocalDateTime) chronoLocalDateTime) : AbstractC0028g.c(this, chronoLocalDateTime);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final Chronology a() {
        return ((LocalDate) b()).a();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* renamed from: atZone, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime q(ZoneId zoneId) {
        return ZonedDateTime.d0(this, zoneId, null);
    }

    public final int b0() {
        return this.b.f0();
    }

    public final int c0() {
        return this.b.g0();
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        LocalDate localDate;
        long j;
        long j2;
        LocalDateTime a0 = a0(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, a0);
        }
        boolean z = ((ChronoUnit) temporalUnit).compareTo(ChronoUnit.DAYS) < 0;
        LocalTime localTime = this.b;
        LocalDate localDate2 = this.a;
        if (!z) {
            LocalDate localDate3 = a0.a;
            localDate3.getClass();
            boolean z2 = localDate2 instanceof LocalDate;
            LocalTime localTime2 = a0.b;
            if (!z2 ? localDate3.toEpochDay() > localDate2.toEpochDay() : localDate3.Z(localDate2) > 0) {
                if (localTime2.isBefore(localTime)) {
                    localDate = localDate3.plusDays(-1L);
                    return localDate2.e(localDate, temporalUnit);
                }
            }
            boolean f0 = localDate3.f0(localDate2);
            localDate = localDate3;
            if (f0) {
                localDate = localDate3;
                if (localTime2.isAfter(localTime)) {
                    localDate = localDate3.plusDays(1L);
                }
            }
            return localDate2.e(localDate, temporalUnit);
        }
        LocalDate localDate4 = a0.a;
        localDate2.getClass();
        long epochDay = localDate4.toEpochDay() - localDate2.toEpochDay();
        LocalTime localTime3 = a0.b;
        if (epochDay == 0) {
            return localTime.e(localTime3, temporalUnit);
        }
        long r0 = localTime3.r0() - localTime.r0();
        if (epochDay > 0) {
            j = epochDay - 1;
            j2 = r0 + 86400000000000L;
        } else {
            j = epochDay + 1;
            j2 = r0 - 86400000000000L;
        }
        switch (g.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                j = b.d(j, 86400000000000L);
                break;
            case 2:
                j = b.d(j, 86400000000L);
                j2 /= 1000;
                break;
            case 3:
                j = b.d(j, 86400000L);
                j2 /= 1000000;
                break;
            case 4:
                j = b.d(j, 86400);
                j2 /= 1000000000;
                break;
            case 5:
                j = b.d(j, 1440);
                j2 /= 60000000000L;
                break;
            case 6:
                j = b.d(j, 24);
                j2 /= 3600000000000L;
                break;
            case 7:
                j = b.d(j, 2);
                j2 /= 43200000000000L;
                break;
        }
        return b.c(j, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField != null && temporalField.y(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        return chronoField.Z() || chronoField.c0();
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime d(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDateTime) temporalUnit.o(this, j);
        }
        switch (g.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return i0(this.a, 0L, 0L, 0L, j);
            case 2:
                LocalDateTime plusDays = plusDays(j / 86400000000L);
                return plusDays.i0(plusDays.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                LocalDateTime plusDays2 = plusDays(j / 86400000);
                return plusDays2.i0(plusDays2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return h0(j);
            case 5:
                return i0(this.a, 0L, j, 0L, 0L);
            case 6:
                return g0(j);
            case 7:
                return plusDays(j / 256).g0((j % 256) * 12);
            default:
                return m0(this.a.d(j, temporalUnit), this.b);
        }
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.a(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    public final LocalDateTime g0(long j) {
        return i0(this.a, j, 0L, 0L, 0L);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).c0() ? this.b.get(temporalField) : this.a.get(temporalField) : j$.time.temporal.j.a(this, temporalField);
    }

    public int getDayOfMonth() {
        return this.a.getDayOfMonth();
    }

    public DayOfWeek getDayOfWeek() {
        return this.a.getDayOfWeek();
    }

    public int getHour() {
        return this.b.d0();
    }

    public int getMinute() {
        return this.b.e0();
    }

    public int getMonthValue() {
        return this.a.getMonthValue();
    }

    public int getYear() {
        return this.a.getYear();
    }

    public final LocalDateTime h0(long j) {
        return i0(this.a, 0L, 0L, j, 0L);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public boolean isAfter(ChronoLocalDateTime<?> chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return Z((LocalDateTime) chronoLocalDateTime) > 0;
        }
        long epochDay = b().toEpochDay();
        long epochDay2 = chronoLocalDateTime.b().toEpochDay();
        return epochDay > epochDay2 || (epochDay == epochDay2 && toLocalTime().r0() > chronoLocalDateTime.toLocalTime().r0());
    }

    public boolean isBefore(ChronoLocalDateTime<?> chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return Z((LocalDateTime) chronoLocalDateTime) < 0;
        }
        long epochDay = b().toEpochDay();
        long epochDay2 = chronoLocalDateTime.b().toEpochDay();
        return epochDay < epochDay2 || (epochDay == epochDay2 && toLocalTime().r0() < chronoLocalDateTime.toLocalTime().r0());
    }

    public final LocalDateTime j0(long j) {
        return m0(this.a.o0(j), this.b);
    }

    public final LocalDateTime k0(TemporalUnit temporalUnit) {
        LocalTime localTime = this.b;
        localTime.getClass();
        if (temporalUnit != ChronoUnit.NANOS) {
            Duration duration = temporalUnit.getDuration();
            if (duration.getSeconds() > 86400) {
                throw new j$.time.temporal.n("Unit is too large to be used for truncation");
            }
            long nanos = duration.toNanos();
            if (86400000000000L % nanos != 0) {
                throw new j$.time.temporal.n("Unit must divide into a standard day without remainder");
            }
            localTime = LocalTime.j0((localTime.r0() / nanos) * nanos);
        }
        return m0(this.a, localTime);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalDateTime) temporalField.D(this, j);
        }
        boolean c0 = ((ChronoField) temporalField).c0();
        LocalTime localTime = this.b;
        LocalDate localDate = this.a;
        return c0 ? m0(localDate, localTime.c(j, temporalField)) : m0(localDate.c(j, temporalField), localTime);
    }

    public LocalDateTime minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1L) : plusDays(-j);
    }

    public final LocalDateTime n0(int i) {
        return m0(this.a.s0(i), this.b);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal o(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j, chronoUnit);
    }

    public final LocalDateTime o0(int i) {
        return m0(this.a, this.b.w0(i));
    }

    public final LocalDateTime p0(int i) {
        return m0(this.a, this.b.x0(i));
    }

    public LocalDateTime plusDays(long j) {
        return m0(this.a.plusDays(j), this.b);
    }

    final void q0(DataOutput dataOutput) {
        this.a.v0(dataOutput);
        this.b.y0(dataOutput);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public /* synthetic */ long toEpochSecond(ZoneOffset zoneOffset) {
        return AbstractC0028g.n(this, zoneOffset);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* renamed from: toLocalDate, reason: merged with bridge method [inline-methods] */
    public LocalDate b() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public LocalTime toLocalTime() {
        return this.b;
    }

    public String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o v(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.G(this);
        }
        if (!((ChronoField) temporalField).c0()) {
            return this.a.v(temporalField);
        }
        LocalTime localTime = this.b;
        localTime.getClass();
        return j$.time.temporal.j.d(localTime, temporalField);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: with, reason: merged with bridge method [inline-methods] */
    public LocalDateTime u(TemporalAdjuster temporalAdjuster) {
        return temporalAdjuster instanceof LocalDate ? m0((LocalDate) temporalAdjuster, this.b) : temporalAdjuster instanceof LocalTime ? m0(this.a, (LocalTime) temporalAdjuster) : temporalAdjuster instanceof LocalDateTime ? (LocalDateTime) temporalAdjuster : (LocalDateTime) temporalAdjuster.G(this);
    }

    public LocalDateTime withHour(int i) {
        return m0(this.a, this.b.u0(i));
    }

    public LocalDateTime withMinute(int i) {
        return m0(this.a, this.b.v0(i));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).c0() ? this.b.y(temporalField) : this.a.y(temporalField) : temporalField.v(this);
    }

    public static LocalDateTime of(int i, int i2, int i3, int i4, int i5) {
        return new LocalDateTime(LocalDate.of(i, i2, i3), LocalTime.of(i4, i5));
    }

    public static LocalDateTime of(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new LocalDateTime(LocalDate.of(i, i2, i3), LocalTime.i0(i4, i5, i6, i7));
    }
}
