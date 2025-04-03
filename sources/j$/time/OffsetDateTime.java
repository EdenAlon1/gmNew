package j$.time;

import j$.time.chrono.AbstractC0028g;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class OffsetDateTime implements Temporal, TemporalAdjuster, Comparable<OffsetDateTime>, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;
    private final LocalDateTime a;
    private final ZoneOffset b;

    static {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localDateTime.getClass();
        Z(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.c;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localDateTime2.getClass();
        Z(localDateTime2, zoneOffset2);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.a(localDateTime, "dateTime");
        this.a = localDateTime;
        Objects.a(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    public static OffsetDateTime Z(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime a0(Instant instant, ZoneId zoneId) {
        Objects.a(instant, "instant");
        Objects.a(zoneId, "zone");
        ZoneOffset d = zoneId.getRules().d(instant);
        return new OffsetDateTime(LocalDateTime.e0(instant.getEpochSecond(), instant.getNano(), d), d);
    }

    static OffsetDateTime c0(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        LocalDate localDate = LocalDate.d;
        return new OffsetDateTime(LocalDateTime.d0(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.q0(objectInput)), ZoneOffset.i0(objectInput));
    }

    private OffsetDateTime d0(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.a == localDateTime && this.b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime of(LocalDate localDate, LocalTime localTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(LocalDateTime.d0(localDate, localTime), zoneOffset);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 10, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(j$.time.temporal.m mVar) {
        if (mVar == j$.time.temporal.j.i() || mVar == j$.time.temporal.j.k()) {
            return this.b;
        }
        if (mVar == j$.time.temporal.j.l()) {
            return null;
        }
        j$.time.temporal.m f = j$.time.temporal.j.f();
        LocalDateTime localDateTime = this.a;
        return mVar == f ? localDateTime.b() : mVar == j$.time.temporal.j.g() ? localDateTime.toLocalTime() : mVar == j$.time.temporal.j.e() ? j$.time.chrono.r.e : mVar == j$.time.temporal.j.j() ? ChronoUnit.NANOS : mVar.g(this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal G(Temporal temporal) {
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        LocalDateTime localDateTime = this.a;
        return temporal.c(localDateTime.b().toEpochDay(), chronoField).c(localDateTime.toLocalTime().r0(), ChronoField.NANO_OF_DAY).c(this.b.getTotalSeconds(), ChronoField.OFFSET_SECONDS);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime d(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? d0(this.a.d(j, temporalUnit), this.b) : (OffsetDateTime) temporalUnit.o(this, j);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (OffsetDateTime) temporalField.D(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = j.a[chronoField.ordinal()];
        ZoneOffset zoneOffset = this.b;
        LocalDateTime localDateTime = this.a;
        return i != 1 ? i != 2 ? d0(localDateTime.c(j, temporalField), zoneOffset) : d0(localDateTime, ZoneOffset.ofTotalSeconds(chronoField.a0(j))) : a0(Instant.ofEpochSecond(j, localDateTime.b0()), zoneOffset);
    }

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int f0;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.b;
        ZoneOffset zoneOffset2 = this.b;
        if (zoneOffset2.equals(zoneOffset)) {
            f0 = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.a;
            long epochSecond = localDateTime.toEpochSecond(zoneOffset2);
            ZoneOffset zoneOffset3 = offsetDateTime2.b;
            LocalDateTime localDateTime2 = offsetDateTime2.a;
            int compare = Long.compare(epochSecond, localDateTime2.toEpochSecond(zoneOffset3));
            f0 = compare == 0 ? localDateTime.toLocalTime().f0() - localDateTime2.toLocalTime().f0() : compare;
        }
        return f0 == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : f0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16, types: [j$.time.OffsetDateTime] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        if (temporal instanceof OffsetDateTime) {
            temporal = (OffsetDateTime) temporal;
        } else {
            try {
                ZoneOffset e0 = ZoneOffset.e0(temporal);
                LocalDate localDate = (LocalDate) temporal.D(j$.time.temporal.j.f());
                LocalTime localTime = (LocalTime) temporal.D(j$.time.temporal.j.g());
                temporal = (localDate == null || localTime == null) ? a0(Instant.a0(temporal), e0) : of(localDate, localTime, e0);
            } catch (DateTimeException e) {
                throw new DateTimeException(d.d("Unable to obtain OffsetDateTime from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, temporal);
        }
        ZoneOffset zoneOffset = temporal.b;
        ZoneOffset zoneOffset2 = this.b;
        OffsetDateTime offsetDateTime = temporal;
        if (!zoneOffset2.equals(zoneOffset)) {
            offsetDateTime = new OffsetDateTime(temporal.a.h0(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()), zoneOffset2);
        }
        return this.a.e(offsetDateTime.a, temporalUnit);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.a.equals(offsetDateTime.a) && this.b.equals(offsetDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return true;
        }
        return temporalField != null && temporalField.y(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return j$.time.temporal.j.a(this, temporalField);
        }
        int i = j.a[((ChronoField) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.get(temporalField) : this.b.getTotalSeconds();
        }
        throw new j$.time.temporal.n("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public DayOfWeek getDayOfWeek() {
        return this.a.getDayOfWeek();
    }

    public int getHour() {
        return this.a.getHour();
    }

    public int getMinute() {
        return this.a.getMinute();
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final ZoneOffset i() {
        return this.b;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal o(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j, chronoUnit);
    }

    public Instant toInstant() {
        LocalDateTime localDateTime = this.a;
        localDateTime.getClass();
        return AbstractC0028g.p(localDateTime, this.b);
    }

    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    public String toString() {
        return this.a.toString() + this.b.toString();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal u(LocalDate localDate) {
        boolean z = localDate instanceof LocalDate;
        LocalDateTime localDateTime = this.a;
        ZoneOffset zoneOffset = this.b;
        if (z) {
            return d0(localDateTime.u(localDate), zoneOffset);
        }
        localDate.getClass();
        return (OffsetDateTime) AbstractC0028g.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o v(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) ? ((ChronoField) temporalField).o() : this.a.v(temporalField) : temporalField.G(this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        this.a.q0(objectOutput);
        this.b.j0(objectOutput);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.v(this);
        }
        int i = j.a[((ChronoField) temporalField).ordinal()];
        ZoneOffset zoneOffset = this.b;
        LocalDateTime localDateTime = this.a;
        return i != 1 ? i != 2 ? localDateTime.y(temporalField) : zoneOffset.getTotalSeconds() : localDateTime.toEpochSecond(zoneOffset);
    }
}
