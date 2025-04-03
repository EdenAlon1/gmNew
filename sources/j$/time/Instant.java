package j$.time;

import j$.time.chrono.AbstractC0028g;
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
public final class Instant implements Temporal, TemporalAdjuster, Comparable<Instant>, Serializable {
    private static final long serialVersionUID = -665713676816604388L;
    private final long a;
    private final int b;
    public static final Instant EPOCH = new Instant(0, 0);
    public static final Instant MIN = ofEpochSecond(-31557014167219200L, 0);
    public static final Instant MAX = ofEpochSecond(31556889864403199L, 999999999);

    private Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    private static Instant Z(long j, int i) {
        if ((i | j) == 0) {
            return EPOCH;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new DateTimeException("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    public static Instant a0(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.a(temporalAccessor, "temporal");
        try {
            return ofEpochSecond(temporalAccessor.y(ChronoField.INSTANT_SECONDS), temporalAccessor.get(ChronoField.NANO_OF_SECOND));
        } catch (DateTimeException e) {
            throw new DateTimeException(d.d("Unable to obtain Instant from TemporalAccessor: ", String.valueOf(temporalAccessor), " of type ", temporalAccessor.getClass().getName()), e);
        }
    }

    private Instant b0(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(b.c(b.c(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    private long c0(Instant instant) {
        long e = b.e(instant.a, this.a);
        long j = instant.b - this.b;
        return (e <= 0 || j >= 0) ? (e >= 0 || j <= 0) ? e : e + 1 : e - 1;
    }

    public static Instant now() {
        a.b.getClass();
        return ofEpochMilli(System.currentTimeMillis());
    }

    public static Instant ofEpochMilli(long j) {
        long j2 = 1000;
        return Z(j$.nio.file.attribute.p.f(j, j2), ((int) j$.nio.file.attribute.p.g(j, j2)) * 1000000);
    }

    public static Instant ofEpochSecond(long j) {
        return Z(j, 0);
    }

    public static Instant parse(CharSequence charSequence) {
        return (Instant) DateTimeFormatter.g.e(charSequence, new j$.desugar.sun.nio.fs.n(1));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 2, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(j$.time.temporal.m mVar) {
        if (mVar == j$.time.temporal.j.j()) {
            return ChronoUnit.NANOS;
        }
        if (mVar == j$.time.temporal.j.e() || mVar == j$.time.temporal.j.l() || mVar == j$.time.temporal.j.k() || mVar == j$.time.temporal.j.i() || mVar == j$.time.temporal.j.f() || mVar == j$.time.temporal.j.g()) {
            return null;
        }
        return mVar.g(this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal G(Temporal temporal) {
        return temporal.c(this.a, ChronoField.INSTANT_SECONDS).c(this.b, ChronoField.NANO_OF_SECOND);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.a0(this, zoneOffset);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.c0(this, zoneId);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (Instant) temporalField.D(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.b0(j);
        int i = e.a[chronoField.ordinal()];
        int i2 = this.b;
        long j2 = this.a;
        if (i != 1) {
            if (i == 2) {
                int i3 = ((int) j) * 1000;
                if (i3 != i2) {
                    return Z(j2, i3);
                }
            } else if (i == 3) {
                int i4 = ((int) j) * 1000000;
                if (i4 != i2) {
                    return Z(j2, i4);
                }
            } else {
                if (i != 4) {
                    throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(temporalField)));
                }
                if (j != j2) {
                    return Z(j, i2);
                }
            }
        } else if (j != i2) {
            return Z(j2, (int) j);
        }
        return this;
    }

    final void d0(DataOutput dataOutput) {
        dataOutput.writeLong(this.a);
        dataOutput.writeInt(this.b);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        Instant a0 = a0(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, a0);
        }
        int i = e.b[((ChronoUnit) temporalUnit).ordinal()];
        int i2 = this.b;
        long j = this.a;
        switch (i) {
            case 1:
                return b.c(b.d(b.e(a0.a, j), 1000000000L), a0.b - i2);
            case 2:
                return b.c(b.d(b.e(a0.a, j), 1000000000L), a0.b - i2) / 1000;
            case 3:
                return b.e(a0.toEpochMilli(), toEpochMilli());
            case 4:
                return c0(a0);
            case 5:
                return c0(a0) / 60;
            case 6:
                return c0(a0) / 3600;
            case 7:
                return c0(a0) / 43200;
            case 8:
                return c0(a0) / 86400;
            default:
                throw new j$.time.temporal.n("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.a == instant.a && this.b == instant.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.NANO_OF_SECOND || temporalField == ChronoField.MICRO_OF_SECOND || temporalField == ChronoField.MILLI_OF_SECOND : temporalField != null && temporalField.y(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return j$.time.temporal.j.d(this, temporalField).a(temporalField.v(this), temporalField);
        }
        int i = e.a[((ChronoField) temporalField).ordinal()];
        int i2 = this.b;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            return i2 / 1000;
        }
        if (i == 3) {
            return i2 / 1000000;
        }
        if (i == 4) {
            ChronoField.INSTANT_SECONDS.a0(this.a);
        }
        throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(temporalField)));
    }

    public long getEpochSecond() {
        return this.a;
    }

    public int getNano() {
        return this.b;
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public boolean isAfter(Instant instant) {
        return compareTo(instant) > 0;
    }

    public boolean isBefore(Instant instant) {
        return compareTo(instant) < 0;
    }

    public Instant minus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.u(this);
    }

    public Instant minusMillis(long j) {
        return j == Long.MIN_VALUE ? plusMillis(Long.MAX_VALUE).plusMillis(1L) : plusMillis(-j);
    }

    public Instant minusSeconds(long j) {
        return j == Long.MIN_VALUE ? plusSeconds(Long.MAX_VALUE).plusSeconds(1L) : plusSeconds(-j);
    }

    public Instant plus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.o(this);
    }

    public Instant plusMillis(long j) {
        return b0(j / 1000, (j % 1000) * 1000000);
    }

    public Instant plusNanos(long j) {
        return b0(0L, j);
    }

    public Instant plusSeconds(long j) {
        return b0(j, 0L);
    }

    public long toEpochMilli() {
        int i = this.b;
        long j = this.a;
        return (j >= 0 || i <= 0) ? b.c(b.d(j, 1000), i / 1000000) : b.c(b.d(j + 1, 1000), (i / 1000000) - 1000);
    }

    public String toString() {
        return DateTimeFormatter.g.format(this);
    }

    public Instant truncatedTo(TemporalUnit temporalUnit) {
        if (temporalUnit == ChronoUnit.NANOS) {
            return this;
        }
        Duration duration = temporalUnit.getDuration();
        if (duration.getSeconds() > 86400) {
            throw new j$.time.temporal.n("Unit is too large to be used for truncation");
        }
        long nanos = duration.toNanos();
        if (86400000000000L % nanos != 0) {
            throw new j$.time.temporal.n("Unit must divide into a standard day without remainder");
        }
        long j = ((this.a % 86400) * 1000000000) + this.b;
        return plusNanos((j$.nio.file.attribute.p.f(j, nanos) * nanos) - j);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal u(LocalDate localDate) {
        localDate.getClass();
        return (Instant) AbstractC0028g.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o v(TemporalField temporalField) {
        return j$.time.temporal.j.d(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        int i;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.v(this);
        }
        int i2 = e.a[((ChronoField) temporalField).ordinal()];
        int i3 = this.b;
        if (i2 == 1) {
            return i3;
        }
        if (i2 == 2) {
            i = i3 / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.a;
                }
                throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(temporalField)));
            }
            i = i3 / 1000000;
        }
        return i;
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return Z(b.c(j, j$.nio.file.attribute.p.f(j2, 1000000000L)), (int) j$.nio.file.attribute.p.g(j2, 1000000000L));
    }

    @Override // java.lang.Comparable
    public int compareTo(Instant instant) {
        int compare = Long.compare(this.a, instant.a);
        return compare != 0 ? compare : this.b - instant.b;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: minus, reason: merged with bridge method [inline-methods] */
    public Instant o(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, temporalUnit).d(1L, temporalUnit) : d(-j, temporalUnit);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: plus, reason: merged with bridge method [inline-methods] */
    public Instant d(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.o(this, j);
        }
        switch (e.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return plusNanos(j);
            case 2:
                return b0(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return plusMillis(j);
            case 4:
                return plusSeconds(j);
            case 5:
                return plusSeconds(b.d(j, 60));
            case 6:
                return plusSeconds(b.d(j, 3600));
            case 7:
                return plusSeconds(b.d(j, 43200));
            case 8:
                return plusSeconds(b.d(j, 86400));
            default:
                throw new j$.time.temporal.n("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }
}
