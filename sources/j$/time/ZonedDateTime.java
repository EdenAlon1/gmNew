package j$.time;

import j$.time.chrono.AbstractC0028g;
import j$.time.chrono.Chronology;
import j$.time.chrono.InterfaceC0030i;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public final class ZonedDateTime implements Temporal, InterfaceC0030i, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    private final LocalDateTime a;
    private final ZoneOffset b;
    private final ZoneId c;

    private ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneId;
    }

    private static ZonedDateTime G(long j, int i, ZoneId zoneId) {
        ZoneOffset d = zoneId.getRules().d(Instant.ofEpochSecond(j, i));
        return new ZonedDateTime(LocalDateTime.e0(j, i, d), zoneId, d);
    }

    public static ZonedDateTime Z(Temporal temporal) {
        if (temporal instanceof ZonedDateTime) {
            return (ZonedDateTime) temporal;
        }
        try {
            ZoneId Z = ZoneId.Z(temporal);
            ChronoField chronoField = ChronoField.INSTANT_SECONDS;
            return temporal.f(chronoField) ? G(temporal.y(chronoField), temporal.get(ChronoField.NANO_OF_SECOND), Z) : d0(LocalDateTime.d0(LocalDate.b0(temporal), LocalTime.b0(temporal)), Z, null);
        } catch (DateTimeException e) {
            throw new DateTimeException(d.d("Unable to obtain ZonedDateTime from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
        }
    }

    public static ZonedDateTime c0(Instant instant, ZoneId zoneId) {
        Objects.a(instant, "instant");
        Objects.a(zoneId, "zone");
        return G(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    public static ZonedDateTime d0(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.a(localDateTime, "localDateTime");
        Objects.a(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        ZoneRules rules = zoneId.getRules();
        List g = rules.g(localDateTime);
        if (g.size() == 1) {
            zoneOffset = (ZoneOffset) g.get(0);
        } else if (g.size() == 0) {
            j$.time.zone.b f = rules.f(localDateTime);
            localDateTime = localDateTime.h0(f.v().getSeconds());
            zoneOffset = f.y();
        } else if (zoneOffset == null || !g.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) g.get(0);
            Objects.a(zoneOffset, "offset");
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    static ZonedDateTime f0(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        LocalDate localDate = LocalDate.d;
        LocalDateTime d0 = LocalDateTime.d0(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.q0(objectInput));
        ZoneOffset i0 = ZoneOffset.i0(objectInput);
        ZoneId zoneId = (ZoneId) m.a(objectInput);
        Objects.a(i0, "offset");
        Objects.a(zoneId, "zone");
        if (!(zoneId instanceof ZoneOffset) || i0.equals(zoneId)) {
            return new ZonedDateTime(d0, zoneId, i0);
        }
        throw new IllegalArgumentException("ZoneId must match ZoneOffset");
    }

    private ZonedDateTime g0(LocalDateTime localDateTime) {
        Objects.a(localDateTime, "localDateTime");
        ZoneOffset zoneOffset = this.b;
        Objects.a(zoneOffset, "offset");
        ZoneId zoneId = this.c;
        Objects.a(zoneId, "zone");
        return zoneId.getRules().g(localDateTime).contains(zoneOffset) ? new ZonedDateTime(localDateTime, zoneId, zoneOffset) : G(localDateTime.toEpochSecond(zoneOffset), localDateTime.b0(), zoneId);
    }

    private ZonedDateTime h0(LocalDateTime localDateTime) {
        return d0(localDateTime, this.c, this.b);
    }

    public static ZonedDateTime of(int i, int i2, int i3, int i4, int i5, int i6, int i7, ZoneId zoneId) {
        return d0(LocalDateTime.of(i, i2, i3, i4, i5, i6, i7), zoneId, null);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 6, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(j$.time.temporal.m mVar) {
        return mVar == j$.time.temporal.j.f() ? b() : AbstractC0028g.l(this, mVar);
    }

    @Override // j$.time.chrono.InterfaceC0030i
    public final /* synthetic */ long Y() {
        return AbstractC0028g.o(this);
    }

    @Override // j$.time.chrono.InterfaceC0030i
    public final Chronology a() {
        return ((LocalDate) b()).a();
    }

    public final int a0() {
        return this.a.b0();
    }

    public final int b0() {
        return this.a.c0();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (ZonedDateTime) temporalField.D(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = t.a[chronoField.ordinal()];
        ZoneId zoneId = this.c;
        LocalDateTime localDateTime = this.a;
        if (i == 1) {
            return G(j, localDateTime.b0(), zoneId);
        }
        if (i != 2) {
            return h0(localDateTime.c(j, temporalField));
        }
        ZoneOffset ofTotalSeconds = ZoneOffset.ofTotalSeconds(chronoField.a0(j));
        return (ofTotalSeconds.equals(this.b) || !zoneId.getRules().g(localDateTime).contains(ofTotalSeconds)) ? this : new ZonedDateTime(localDateTime, zoneId, ofTotalSeconds);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC0028g.d(this, (InterfaceC0030i) obj);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        ZonedDateTime Z = Z(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, Z);
        }
        Z.getClass();
        ZoneId zoneId = this.c;
        Objects.a(zoneId, "zone");
        if (!Z.c.equals(zoneId)) {
            ZoneOffset zoneOffset = Z.b;
            LocalDateTime localDateTime = Z.a;
            Z = G(localDateTime.toEpochSecond(zoneOffset), localDateTime.b0(), zoneId);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        return (chronoUnit.compareTo(ChronoUnit.DAYS) < 0 || chronoUnit == ChronoUnit.FOREVER) ? toOffsetDateTime().e(Z.toOffsetDateTime(), temporalUnit) : this.a.e(Z.a, temporalUnit);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime d(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (ZonedDateTime) temporalUnit.o(this, j);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        boolean z = chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER;
        LocalDateTime localDateTime = this.a;
        return z ? h0(localDateTime.d(j, temporalUnit)) : g0(localDateTime.d(j, temporalUnit));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.a.equals(zonedDateTime.a) && this.b.equals(zonedDateTime.b) && this.c.equals(zonedDateTime.c)) {
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
            return AbstractC0028g.e(this, temporalField);
        }
        int i = t.a[((ChronoField) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.get(temporalField) : this.b.getTotalSeconds();
        }
        throw new j$.time.temporal.n("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public int getDayOfMonth() {
        return this.a.getDayOfMonth();
    }

    public int getHour() {
        return this.a.getHour();
    }

    public int getMinute() {
        return this.a.getMinute();
    }

    public int getMonthValue() {
        return this.a.getMonthValue();
    }

    public int getYear() {
        return this.a.getYear();
    }

    @Override // j$.time.chrono.InterfaceC0030i
    public ZoneId getZone() {
        return this.c;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.chrono.InterfaceC0030i
    public final ZoneOffset i() {
        return this.b;
    }

    final void i0(DataOutput dataOutput) {
        this.a.q0(dataOutput);
        this.b.j0(dataOutput);
        this.c.c0((ObjectOutput) dataOutput);
    }

    @Override // j$.time.chrono.InterfaceC0030i
    public final InterfaceC0030i j(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        ZoneOffset zoneOffset = this.b;
        LocalDateTime localDateTime = this.a;
        return G(localDateTime.toEpochSecond(zoneOffset), localDateTime.b0(), zoneId);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal o(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j, chronoUnit);
    }

    public ZonedDateTime plusDays(long j) {
        return h0(this.a.plusDays(j));
    }

    public ZonedDateTime plusHours(long j) {
        return g0(this.a.g0(j));
    }

    public ZonedDateTime plusYears(long j) {
        return d0(this.a.j0(j), this.c, this.b);
    }

    public Instant toInstant() {
        return Instant.ofEpochSecond(Y(), toLocalTime().f0());
    }

    @Override // j$.time.chrono.InterfaceC0030i
    /* renamed from: toLocalDate, reason: merged with bridge method [inline-methods] */
    public LocalDate b() {
        return this.a.b();
    }

    @Override // j$.time.chrono.InterfaceC0030i
    /* renamed from: toLocalDateTime, reason: merged with bridge method [inline-methods] */
    public LocalDateTime L() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC0030i
    public LocalTime toLocalTime() {
        return this.a.toLocalTime();
    }

    public OffsetDateTime toOffsetDateTime() {
        return OffsetDateTime.Z(this.a, this.b);
    }

    public final String toString() {
        String localDateTime = this.a.toString();
        ZoneOffset zoneOffset = this.b;
        String str = localDateTime + zoneOffset.toString();
        ZoneId zoneId = this.c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    public ZonedDateTime truncatedTo(TemporalUnit temporalUnit) {
        return d0(this.a.k0(temporalUnit), this.c, this.b);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal u(LocalDate localDate) {
        boolean z = localDate instanceof LocalDate;
        ZoneOffset zoneOffset = this.b;
        LocalDateTime localDateTime = this.a;
        ZoneId zoneId = this.c;
        if (z) {
            return d0(LocalDateTime.d0(localDate, localDateTime.toLocalTime()), zoneId, zoneOffset);
        }
        localDate.getClass();
        return (ZonedDateTime) AbstractC0028g.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o v(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) ? ((ChronoField) temporalField).o() : this.a.v(temporalField) : temporalField.G(this);
    }

    public ZonedDateTime withDayOfMonth(int i) {
        return d0(this.a.n0(i), this.c, this.b);
    }

    public ZonedDateTime withHour(int i) {
        return h0(this.a.withHour(i));
    }

    public ZonedDateTime withMinute(int i) {
        return h0(this.a.withMinute(i));
    }

    public ZonedDateTime withNano(int i) {
        return d0(this.a.o0(i), this.c, this.b);
    }

    public ZonedDateTime withSecond(int i) {
        return d0(this.a.p0(i), this.c, this.b);
    }

    @Override // j$.time.chrono.InterfaceC0030i
    /* renamed from: withZoneSameLocal, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime k(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        return this.c.equals(zoneId) ? this : d0(this.a, zoneId, this.b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.v(this);
        }
        int i = t.a[((ChronoField) temporalField).ordinal()];
        return i != 1 ? i != 2 ? this.a.y(temporalField) : this.b.getTotalSeconds() : AbstractC0028g.o(this);
    }
}
