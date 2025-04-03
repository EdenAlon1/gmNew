package j$.time;

import j$.time.chrono.AbstractC0028g;
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
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class LocalTime implements Temporal, TemporalAdjuster, Comparable<LocalTime>, Serializable {
    public static final LocalTime MIDNIGHT;
    public static final LocalTime e;
    public static final LocalTime f;
    private static final LocalTime[] g = new LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;
    private final byte a;
    private final byte b;
    private final byte c;
    private final int d;

    static {
        int i = 0;
        while (true) {
            LocalTime[] localTimeArr = g;
            if (i >= localTimeArr.length) {
                LocalTime localTime = localTimeArr[0];
                MIDNIGHT = localTime;
                LocalTime localTime2 = localTimeArr[12];
                e = localTime;
                f = new LocalTime(23, 59, 59, 999999999);
                return;
            }
            localTimeArr[i] = new LocalTime(i, 0, 0, 0);
            i++;
        }
    }

    private LocalTime(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    private static LocalTime a0(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? g[i] : new LocalTime(i, i2, i3, i4);
    }

    public static LocalTime b0(Temporal temporal) {
        Objects.a(temporal, "temporal");
        LocalTime localTime = (LocalTime) temporal.D(j$.time.temporal.j.g());
        if (localTime != null) {
            return localTime;
        }
        throw new DateTimeException(d.d("Unable to obtain LocalTime from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()));
    }

    private int c0(TemporalField temporalField) {
        int i = h.a[((ChronoField) temporalField).ordinal()];
        byte b = this.b;
        int i2 = this.d;
        byte b2 = this.a;
        switch (i) {
            case 1:
                return i2;
            case 2:
                throw new j$.time.temporal.n("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i2 / 1000;
            case 4:
                throw new j$.time.temporal.n("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i2 / 1000000;
            case 6:
                return (int) (r0() / 1000000);
            case 7:
                return this.c;
            case 8:
                return s0();
            case 9:
                return b;
            case 10:
                return (b2 * 60) + b;
            case 11:
                return b2 % 12;
            case 12:
                int i3 = b2 % 12;
                if (i3 % 12 == 0) {
                    return 12;
                }
                return i3;
            case 14:
                if (b2 == 0) {
                    return 24;
                }
            case 13:
                return b2;
            case 15:
                return b2 / 12;
            default:
                throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
    }

    public static LocalTime h0(int i, int i2, int i3) {
        ChronoField.HOUR_OF_DAY.b0(i);
        if ((i2 | i3) == 0) {
            return g[i];
        }
        ChronoField.MINUTE_OF_HOUR.b0(i2);
        ChronoField.SECOND_OF_MINUTE.b0(i3);
        return new LocalTime(i, i2, i3, 0);
    }

    public static LocalTime i0(int i, int i2, int i3, int i4) {
        ChronoField.HOUR_OF_DAY.b0(i);
        ChronoField.MINUTE_OF_HOUR.b0(i2);
        ChronoField.SECOND_OF_MINUTE.b0(i3);
        ChronoField.NANO_OF_SECOND.b0(i4);
        return a0(i, i2, i3, i4);
    }

    public static LocalTime j0(long j) {
        ChronoField.NANO_OF_DAY.b0(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return a0(i, i2, i3, (int) (j3 - (i3 * 1000000000)));
    }

    public static LocalTime k0(long j) {
        ChronoField.SECOND_OF_DAY.b0(j);
        int i = (int) (j / 3600);
        long j2 = j - (i * 3600);
        return a0(i, (int) (j2 / 60), (int) (j2 - (r0 * 60)), 0);
    }

    public static LocalTime of(int i, int i2) {
        ChronoField.HOUR_OF_DAY.b0(i);
        if (i2 == 0) {
            return g[i];
        }
        ChronoField.MINUTE_OF_HOUR.b0(i2);
        return new LocalTime(i, i2, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    static LocalTime q0(ObjectInput objectInput) {
        int readInt;
        int i;
        int readByte = objectInput.readByte();
        byte b = 0;
        if (readByte >= 0) {
            byte readByte2 = objectInput.readByte();
            if (readByte2 < 0) {
                ?? r4 = ~readByte2;
                readInt = 0;
                b = r4;
                i = 0;
            } else {
                byte readByte3 = objectInput.readByte();
                if (readByte3 < 0) {
                    i = ~readByte3;
                    b = readByte2;
                } else {
                    readInt = objectInput.readInt();
                    b = readByte2;
                    i = readByte3;
                }
            }
            return i0(readByte, b, i, readInt);
        }
        readByte = ~readByte;
        i = 0;
        readInt = 0;
        return i0(readByte, b, i, readInt);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 4, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(j$.time.temporal.m mVar) {
        if (mVar == j$.time.temporal.j.e() || mVar == j$.time.temporal.j.l() || mVar == j$.time.temporal.j.k() || mVar == j$.time.temporal.j.i()) {
            return null;
        }
        if (mVar == j$.time.temporal.j.g()) {
            return this;
        }
        if (mVar == j$.time.temporal.j.f()) {
            return null;
        }
        return mVar == j$.time.temporal.j.j() ? ChronoUnit.NANOS : mVar.g(this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal G(Temporal temporal) {
        return temporal.c(r0(), ChronoField.NANO_OF_DAY);
    }

    @Override // java.lang.Comparable
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final int compareTo(LocalTime localTime) {
        int compare = Integer.compare(this.a, localTime.a);
        return (compare == 0 && (compare = Integer.compare(this.b, localTime.b)) == 0 && (compare = Integer.compare(this.c, localTime.c)) == 0) ? Integer.compare(this.d, localTime.d) : compare;
    }

    public final int d0() {
        return this.a;
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        LocalTime b0 = b0(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, b0);
        }
        long r0 = b0.r0() - r0();
        switch (h.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return r0;
            case 2:
                return r0 / 1000;
            case 3:
                return r0 / 1000000;
            case 4:
                return r0 / 1000000000;
            case 5:
                return r0 / 60000000000L;
            case 6:
                return r0 / 3600000000000L;
            case 7:
                return r0 / 43200000000000L;
            default:
                throw new j$.time.temporal.n("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final int e0() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.a == localTime.a && this.b == localTime.b && this.c == localTime.c && this.d == localTime.d) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).c0() : temporalField != null && temporalField.y(this);
    }

    public final int f0() {
        return this.d;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.a(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    public final int g0() {
        return this.c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? c0(temporalField) : j$.time.temporal.j.a(this, temporalField);
    }

    public final int hashCode() {
        long r0 = r0();
        return (int) (r0 ^ (r0 >>> 32));
    }

    public boolean isAfter(LocalTime localTime) {
        return compareTo(localTime) > 0;
    }

    public boolean isBefore(LocalTime localTime) {
        return compareTo(localTime) < 0;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final LocalTime d(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalTime) temporalUnit.o(this, j);
        }
        switch (h.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return o0(j);
            case 2:
                return o0((j % 86400000000L) * 1000);
            case 3:
                return o0((j % 86400000) * 1000000);
            case 4:
                return p0(j);
            case 5:
                return n0(j);
            case 6:
                return m0(j);
            case 7:
                return m0((j % 2) * 12);
            default:
                throw new j$.time.temporal.n("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final LocalTime m0(long j) {
        if (j == 0) {
            return this;
        }
        return a0(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final LocalTime n0(long j) {
        if (j != 0) {
            int i = (this.a * 60) + this.b;
            int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i2) {
                return a0(i2 / 60, i2 % 60, this.c, this.d);
            }
        }
        return this;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal o(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j, chronoUnit);
    }

    public final LocalTime o0(long j) {
        if (j != 0) {
            long r0 = r0();
            long j2 = (((j % 86400000000000L) + r0) + 86400000000000L) % 86400000000000L;
            if (r0 != j2) {
                return a0((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
            }
        }
        return this;
    }

    public final LocalTime p0(long j) {
        if (j != 0) {
            int i = (this.b * 60) + (this.a * 3600) + this.c;
            int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i2) {
                return a0(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
            }
        }
        return this;
    }

    public final long r0() {
        return (this.c * 1000000000) + (this.b * 60000000000L) + (this.a * 3600000000000L) + this.d;
    }

    public final int s0() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public final LocalTime c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalTime) temporalField.D(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.b0(j);
        int i = h.a[chronoField.ordinal()];
        byte b = this.a;
        switch (i) {
            case 1:
                return w0((int) j);
            case 2:
                return j0(j);
            case 3:
                return w0(((int) j) * 1000);
            case 4:
                return j0(j * 1000);
            case 5:
                return w0(((int) j) * 1000000);
            case 6:
                return j0(j * 1000000);
            case 7:
                return x0((int) j);
            case 8:
                return p0(j - s0());
            case 9:
                return v0((int) j);
            case 10:
                return n0(j - ((b * 60) + this.b));
            case 11:
                return m0(j - (b % 12));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return m0(j - (b % 12));
            case 13:
                return u0((int) j);
            case 14:
                if (j == 24) {
                    j = 0;
                }
                return u0((int) j);
            case 15:
                return m0((j - (b / 12)) * 12);
            default:
                throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        byte b2 = this.b;
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        byte b3 = this.c;
        int i = this.d;
        if (b3 > 0 || i > 0) {
            sb.append(b3 < 10 ? ":0" : ":");
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % 1000000 == 0) {
                    sb.append(Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal u(LocalDate localDate) {
        localDate.getClass();
        return (LocalTime) AbstractC0028g.a(localDate, this);
    }

    public final LocalTime u0(int i) {
        if (this.a == i) {
            return this;
        }
        ChronoField.HOUR_OF_DAY.b0(i);
        return a0(i, this.b, this.c, this.d);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o v(TemporalField temporalField) {
        return j$.time.temporal.j.d(this, temporalField);
    }

    public final LocalTime v0(int i) {
        if (this.b == i) {
            return this;
        }
        ChronoField.MINUTE_OF_HOUR.b0(i);
        return a0(this.a, i, this.c, this.d);
    }

    public final LocalTime w0(int i) {
        if (this.d == i) {
            return this;
        }
        ChronoField.NANO_OF_SECOND.b0(i);
        return a0(this.a, this.b, this.c, i);
    }

    public final LocalTime x0(int i) {
        if (this.c == i) {
            return this;
        }
        ChronoField.SECOND_OF_MINUTE.b0(i);
        return a0(this.a, this.b, i, this.d);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.NANO_OF_DAY ? r0() : temporalField == ChronoField.MICRO_OF_DAY ? r0() / 1000 : c0(temporalField) : temporalField.v(this);
    }

    final void y0(DataOutput dataOutput) {
        byte b = this.c;
        byte b2 = this.a;
        byte b3 = this.b;
        int i = this.d;
        if (i != 0) {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(b);
            dataOutput.writeInt(i);
            return;
        }
        if (b != 0) {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(~b);
        } else if (b3 == 0) {
            dataOutput.writeByte(~b2);
        } else {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(~b3);
        }
    }
}
