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
public final class l implements Temporal, TemporalAdjuster, Comparable, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;
    private final LocalTime a;
    private final ZoneOffset b;

    static {
        LocalTime localTime = LocalTime.e;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localTime.getClass();
        Z(localTime, zoneOffset);
        LocalTime localTime2 = LocalTime.f;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localTime2.getClass();
        Z(localTime2, zoneOffset2);
    }

    private l(LocalTime localTime, ZoneOffset zoneOffset) {
        Objects.a(localTime, "time");
        this.a = localTime;
        Objects.a(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    public static l Z(LocalTime localTime, ZoneOffset zoneOffset) {
        return new l(localTime, zoneOffset);
    }

    static l b0(ObjectInput objectInput) {
        return new l(LocalTime.q0(objectInput), ZoneOffset.i0(objectInput));
    }

    private long c0() {
        return this.a.r0() - (this.b.getTotalSeconds() * 1000000000);
    }

    private l d0(LocalTime localTime, ZoneOffset zoneOffset) {
        return (this.a == localTime && this.b.equals(zoneOffset)) ? this : new l(localTime, zoneOffset);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 9, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(j$.time.temporal.m mVar) {
        if (mVar == j$.time.temporal.j.i() || mVar == j$.time.temporal.j.k()) {
            return this.b;
        }
        if (((mVar == j$.time.temporal.j.l()) || (mVar == j$.time.temporal.j.e())) || mVar == j$.time.temporal.j.f()) {
            return null;
        }
        return mVar == j$.time.temporal.j.g() ? this.a : mVar == j$.time.temporal.j.j() ? ChronoUnit.NANOS : mVar.g(this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal G(Temporal temporal) {
        return temporal.c(this.a.r0(), ChronoField.NANO_OF_DAY).c(this.b.getTotalSeconds(), ChronoField.OFFSET_SECONDS);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final l d(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? d0(this.a.d(j, temporalUnit), this.b) : (l) temporalUnit.o(this, j);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (l) temporalField.D(this, j);
        }
        ChronoField chronoField = ChronoField.OFFSET_SECONDS;
        LocalTime localTime = this.a;
        return temporalField == chronoField ? d0(localTime, ZoneOffset.ofTotalSeconds(((ChronoField) temporalField).a0(j))) : d0(localTime.c(j, temporalField), this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l lVar = (l) obj;
        boolean equals = this.b.equals(lVar.b);
        LocalTime localTime = this.a;
        LocalTime localTime2 = lVar.a;
        if (equals) {
            return localTime.compareTo(localTime2);
        }
        int compare = Long.compare(c0(), lVar.c0());
        return compare == 0 ? localTime.compareTo(localTime2) : compare;
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        l lVar;
        if (temporal instanceof l) {
            lVar = (l) temporal;
        } else {
            try {
                lVar = new l(LocalTime.b0(temporal), ZoneOffset.e0(temporal));
            } catch (DateTimeException e) {
                throw new DateTimeException(d.d("Unable to obtain OffsetTime from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, lVar);
        }
        long c0 = lVar.c0() - c0();
        switch (k.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return c0;
            case 2:
                return c0 / 1000;
            case 3:
                return c0 / 1000000;
            case 4:
                return c0 / 1000000000;
            case 5:
                return c0 / 60000000000L;
            case 6:
                return c0 / 3600000000000L;
            case 7:
                return c0 / 43200000000000L;
            default:
                throw new j$.time.temporal.n("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.a.equals(lVar.a) && this.b.equals(lVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).c0() || temporalField == ChronoField.OFFSET_SECONDS : temporalField != null && temporalField.y(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return j$.time.temporal.j.a(this, temporalField);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal o(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j, chronoUnit);
    }

    public final String toString() {
        return this.a.toString() + this.b.toString();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal u(LocalDate localDate) {
        localDate.getClass();
        return (l) AbstractC0028g.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o v(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.G(this);
        }
        if (temporalField == ChronoField.OFFSET_SECONDS) {
            return ((ChronoField) temporalField).o();
        }
        LocalTime localTime = this.a;
        localTime.getClass();
        return j$.time.temporal.j.d(localTime, temporalField);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        this.a.y0(objectOutput);
        this.b.j0(objectOutput);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.OFFSET_SECONDS ? this.b.getTotalSeconds() : this.a.y(temporalField) : temporalField.v(this);
    }
}
