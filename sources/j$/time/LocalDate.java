package j$.time;

import j$.time.chrono.AbstractC0028g;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class LocalDate implements Temporal, TemporalAdjuster, ChronoLocalDate, Serializable {
    private static final long serialVersionUID = 2942565459149668126L;
    private final int a;
    private final short b;
    private final short c;
    public static final LocalDate d = of(-999999999, 1, 1);
    public static final LocalDate e = of(999999999, 12, 31);
    public static final LocalDate EPOCH = of(1970, 1, 1);

    private LocalDate(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    private static LocalDate a0(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (j$.time.chrono.r.e.V(i)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new DateTimeException("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new DateTimeException("Invalid date '" + Month.c0(i2).name() + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate b0(TemporalAccessor temporalAccessor) {
        Objects.a(temporalAccessor, "temporal");
        LocalDate localDate = (LocalDate) temporalAccessor.D(j$.time.temporal.j.f());
        if (localDate != null) {
            return localDate;
        }
        throw new DateTimeException(d.d("Unable to obtain LocalDate from TemporalAccessor: ", String.valueOf(temporalAccessor), " of type ", temporalAccessor.getClass().getName()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int c0(ChronoField chronoField) {
        int i;
        int i2 = f.a[chronoField.ordinal()];
        short s = this.c;
        int i3 = this.a;
        switch (i2) {
            case 1:
                return s;
            case 2:
                return d0();
            case 3:
                i = (s - 1) / 7;
                return i + 1;
            case 4:
                if (i3 < 1) {
                    return 1 - i3;
                }
                return i3;
            case 5:
                return getDayOfWeek().getValue();
            case 6:
                i = (s - 1) % 7;
                return i + 1;
            case 7:
                return ((d0() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.n("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((d0() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new j$.time.temporal.n("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i3;
            case 13:
                return i3 >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(chronoField)));
        }
    }

    private long e0() {
        return ((this.a * 12) + this.b) - 1;
    }

    private long h0(LocalDate localDate) {
        return (((localDate.e0() * 32) + localDate.getDayOfMonth()) - ((e0() * 32) + getDayOfMonth())) / 32;
    }

    public static LocalDate i0(b bVar) {
        Objects.a(bVar, "clock");
        Instant ofEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        ZoneId a = bVar.a();
        Objects.a(ofEpochMilli, "instant");
        Objects.a(a, "zone");
        return k0(j$.nio.file.attribute.p.f(ofEpochMilli.getEpochSecond() + a.getRules().d(ofEpochMilli).getTotalSeconds(), 86400));
    }

    public static LocalDate j0(int i, Month month, int i2) {
        ChronoField.YEAR.b0(i);
        Objects.a(month, "month");
        ChronoField.DAY_OF_MONTH.b0(i2);
        return a0(i, month.getValue(), i2);
    }

    public static LocalDate k0(long j) {
        long j2;
        ChronoField.EPOCH_DAY.b0(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        return new LocalDate(ChronoField.YEAR.a0(j5 + j2 + (i2 / 10)), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    public static LocalDate l0(int i, int i2) {
        long j = i;
        ChronoField.YEAR.b0(j);
        ChronoField.DAY_OF_YEAR.b0(i2);
        boolean V = j$.time.chrono.r.e.V(j);
        if (i2 == 366 && !V) {
            throw new DateTimeException("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
        }
        Month c0 = Month.c0(((i2 - 1) / 31) + 1);
        if (i2 > (c0.a0(V) + c0.Z(V)) - 1) {
            c0 = c0.d0();
        }
        return new LocalDate(i, c0.getValue(), (i2 - c0.Z(V)) + 1);
    }

    public static LocalDate now() {
        return i0(b.g());
    }

    public static LocalDate of(int i, int i2, int i3) {
        ChronoField.YEAR.b0(i);
        ChronoField.MONTH_OF_YEAR.b0(i2);
        ChronoField.DAY_OF_MONTH.b0(i3);
        return a0(i, i2, i3);
    }

    private static LocalDate p0(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, j$.time.chrono.r.e.V((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.a(dateTimeFormatter, "formatter");
        return (LocalDate) dateTimeFormatter.e(charSequence, new j$.desugar.sun.nio.fs.n(2));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 3, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(j$.time.temporal.m mVar) {
        return mVar == j$.time.temporal.j.f() ? this : AbstractC0028g.j(this, mVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal G(Temporal temporal) {
        return AbstractC0028g.a(this, temporal);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.l H() {
        return getYear() >= 1 ? j$.time.chrono.s.CE : j$.time.chrono.s.BCE;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean N() {
        return j$.time.chrono.r.e.V(this.a);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate O(TemporalAmount temporalAmount) {
        if (temporalAmount instanceof Period) {
            return plusMonths(((Period) temporalAmount).d()).plusDays(r4.a());
        }
        Objects.a(temporalAmount, "amountToAdd");
        return (LocalDate) temporalAmount.o(this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int U() {
        return N() ? 366 : 365;
    }

    final int Z(LocalDate localDate) {
        int i = this.a - localDate.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - localDate.b;
        return i2 == 0 ? this.c - localDate.c : i2;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology a() {
        return j$.time.chrono.r.e;
    }

    public LocalDateTime atStartOfDay() {
        return LocalDateTime.d0(this, LocalTime.MIDNIGHT);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: atTime, reason: merged with bridge method [inline-methods] */
    public LocalDateTime B(LocalTime localTime) {
        return LocalDateTime.d0(this, localTime);
    }

    public final int d0() {
        return (getMonth().Z(N()) + this.c) - 1;
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        LocalDate b0 = b0(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, b0);
        }
        switch (f.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return b0.toEpochDay() - toEpochDay();
            case 2:
                return (b0.toEpochDay() - toEpochDay()) / 7;
            case 3:
                return h0(b0);
            case 4:
                return h0(b0) / 12;
            case 5:
                return h0(b0) / 120;
            case 6:
                return h0(b0) / 1200;
            case 7:
                return h0(b0) / 12000;
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return b0.y(chronoField) - y(chronoField);
            default:
                throw new j$.time.temporal.n("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && Z((LocalDate) obj) == 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        return AbstractC0028g.h(this, temporalField);
    }

    public final boolean f0(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? Z((LocalDate) chronoLocalDate) < 0 : toEpochDay() < chronoLocalDate.toEpochDay();
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.a(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: g0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate o(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? c0((ChronoField) temporalField) : j$.time.temporal.j.a(this, temporalField);
    }

    public int getDayOfMonth() {
        return this.c;
    }

    public DayOfWeek getDayOfWeek() {
        return DayOfWeek.of(((int) j$.nio.file.attribute.p.g(toEpochDay() + 3, 7)) + 1);
    }

    public Month getMonth() {
        return Month.c0(this.b);
    }

    public int getMonthValue() {
        return this.b;
    }

    public int getYear() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        int i = this.a;
        return (((i << 11) + (this.b << 6)) + this.c) ^ (i & (-2048));
    }

    public int lengthOfMonth() {
        short s = this.b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : N() ? 29 : 28;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public final LocalDate d(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDate) temporalUnit.o(this, j);
        }
        switch (f.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return plusDays(j);
            case 2:
                return n0(j);
            case 3:
                return plusMonths(j);
            case 4:
                return o0(j);
            case 5:
                return o0(b.d(j, 10));
            case 6:
                return o0(b.d(j, 100));
            case 7:
                return o0(b.d(j, 1000));
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return c(b.c(y(chronoField), j), chronoField);
            default:
                throw new j$.time.temporal.n("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final LocalDate n0(long j) {
        return plusDays(b.d(j, 7));
    }

    public final LocalDate o0(long j) {
        return j == 0 ? this : p0(ChronoField.YEAR.a0(this.a + j), this.b, this.c);
    }

    public LocalDate plusDays(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.c + j;
        if (j2 > 0) {
            short s = this.b;
            int i = this.a;
            if (j2 <= 28) {
                return new LocalDate(i, s, (int) j2);
            }
            if (j2 <= 59) {
                long lengthOfMonth = lengthOfMonth();
                if (j2 <= lengthOfMonth) {
                    return new LocalDate(i, s, (int) j2);
                }
                if (s < 12) {
                    return new LocalDate(i, s + 1, (int) (j2 - lengthOfMonth));
                }
                int i2 = i + 1;
                ChronoField.YEAR.b0(i2);
                return new LocalDate(i2, 1, (int) (j2 - lengthOfMonth));
            }
        }
        return k0(b.c(toEpochDay(), j));
    }

    public LocalDate plusMonths(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        long j3 = 12;
        return p0(ChronoField.YEAR.a0(j$.nio.file.attribute.p.f(j2, j3)), ((int) j$.nio.file.attribute.p.g(j2, j3)) + 1, this.c);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public final LocalDate c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalDate) temporalField.D(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.b0(j);
        int i = f.a[chronoField.ordinal()];
        int i2 = this.a;
        switch (i) {
            case 1:
                return s0((int) j);
            case 2:
                return t0((int) j);
            case 3:
                return n0(j - y(ChronoField.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (i2 < 1) {
                    j = 1 - j;
                }
                return u0((int) j);
            case 5:
                return plusDays(j - getDayOfWeek().getValue());
            case 6:
                return plusDays(j - y(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return plusDays(j - y(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return k0(j);
            case 9:
                return n0(j - y(ChronoField.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i3 = (int) j;
                if (this.b != i3) {
                    ChronoField.MONTH_OF_YEAR.b0(i3);
                    return p0(i2, i3, this.c);
                }
                return this;
            case 11:
                return plusMonths(j - e0());
            case 12:
                return u0((int) j);
            case 13:
                if (y(ChronoField.ERA) != j) {
                    return u0(1 - i2);
                }
                return this;
            default:
                throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: r0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate u(TemporalAdjuster temporalAdjuster) {
        return temporalAdjuster instanceof LocalDate ? (LocalDate) temporalAdjuster : (LocalDate) temporalAdjuster.G(this);
    }

    public final LocalDate s0(int i) {
        return this.c == i ? this : of(this.a, this.b, i);
    }

    public final LocalDate t0(int i) {
        return d0() == i ? this : l0(this.a, i);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        long j = this.a;
        long j2 = this.b;
        long j3 = 365 * j;
        long j4 = (((367 * j2) - 362) / 12) + (j >= 0 ? ((j + 399) / 400) + (((3 + j) / 4) - ((99 + j) / 100)) + j3 : j3 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (this.c - 1);
        if (j2 > 2) {
            j4 = !N() ? j4 - 2 : j4 - 1;
        }
        return j4 - 719528;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public String toString() {
        int i = this.a;
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (abs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        short s = this.b;
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        short s2 = this.c;
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    public final LocalDate u0(int i) {
        if (this.a == i) {
            return this;
        }
        ChronoField.YEAR.b0(i);
        return p0(i, this.b, this.c);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o v(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.G(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        if (!chronoField.Z()) {
            throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
        int i = f.a[chronoField.ordinal()];
        if (i == 1) {
            return j$.time.temporal.o.j(1L, lengthOfMonth());
        }
        if (i == 2) {
            return j$.time.temporal.o.j(1L, U());
        }
        if (i != 3) {
            return i != 4 ? ((ChronoField) temporalField).o() : getYear() <= 0 ? j$.time.temporal.o.j(1L, 1000000000L) : j$.time.temporal.o.j(1L, 999999999L);
        }
        return j$.time.temporal.o.j(1L, (getMonth() != Month.FEBRUARY || N()) ? 5L : 4L);
    }

    final void v0(DataOutput dataOutput) {
        dataOutput.writeInt(this.a);
        dataOutput.writeByte(this.b);
        dataOutput.writeByte(this.c);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.EPOCH_DAY ? toEpochDay() : temporalField == ChronoField.PROLEPTIC_MONTH ? e0() : c0((ChronoField) temporalField) : temporalField.v(this);
    }

    public static LocalDate now(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        return i0(zoneId == ZoneOffset.UTC ? a.b : new a(zoneId));
    }

    public ZonedDateTime atStartOfDay(ZoneId zoneId) {
        j$.time.zone.b f;
        Objects.a(zoneId, "zone");
        LocalDateTime B = B(LocalTime.MIDNIGHT);
        if (!(zoneId instanceof ZoneOffset) && (f = zoneId.getRules().f(B)) != null && f.Z()) {
            B = f.o();
        }
        return ZonedDateTime.d0(B, zoneId, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    public int compareTo(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? Z((LocalDate) chronoLocalDate) : AbstractC0028g.b(this, chronoLocalDate);
    }
}
