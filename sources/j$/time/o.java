package j$.time;

import j$.time.chrono.AbstractC0028g;
import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.E;
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
import java.util.Locale;

/* loaded from: classes9.dex */
public final class o implements Temporal, TemporalAdjuster, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    private final int a;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.q(ChronoField.YEAR, 4, 10, E.EXCEEDS_PAD);
        dateTimeFormatterBuilder.A(Locale.getDefault());
    }

    private o(int i) {
        this.a = i;
    }

    public static o Z(int i) {
        ChronoField.YEAR.b0(i);
        return new o(i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 11, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(j$.time.temporal.m mVar) {
        return mVar == j$.time.temporal.j.e() ? j$.time.chrono.r.e : mVar == j$.time.temporal.j.j() ? ChronoUnit.YEARS : j$.time.temporal.j.c(this, mVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal G(Temporal temporal) {
        if (!Chronology.CC.a(temporal).equals(j$.time.chrono.r.e)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return temporal.c(this.a, ChronoField.YEAR);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final o d(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (o) temporalUnit.o(this, j);
        }
        int i = n.b[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return b0(j);
        }
        if (i == 2) {
            return b0(b.d(j, 10));
        }
        if (i == 3) {
            return b0(b.d(j, 100));
        }
        if (i == 4) {
            return b0(b.d(j, 1000));
        }
        if (i != 5) {
            throw new j$.time.temporal.n("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
        ChronoField chronoField = ChronoField.ERA;
        return c(b.c(y(chronoField), j), chronoField);
    }

    public final o b0(long j) {
        return j == 0 ? this : Z(ChronoField.YEAR.a0(this.a + j));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final o c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (o) temporalField.D(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.b0(j);
        int i = n.a[chronoField.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                j = 1 - j;
            }
            return Z((int) j);
        }
        if (i == 2) {
            return Z((int) j);
        }
        if (i == 3) {
            return y(ChronoField.ERA) == j ? this : Z(1 - i2);
        }
        throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(temporalField)));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((o) obj).a;
    }

    final void d0(DataOutput dataOutput) {
        dataOutput.writeInt(this.a);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        o Z;
        if (temporal instanceof o) {
            Z = (o) temporal;
        } else {
            Objects.a(temporal, "temporal");
            try {
                if (!j$.time.chrono.r.e.equals(Chronology.CC.a(temporal))) {
                    temporal = LocalDate.b0(temporal);
                }
                Z = Z(temporal.get(ChronoField.YEAR));
            } catch (DateTimeException e) {
                throw new DateTimeException(d.d("Unable to obtain Year from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, Z);
        }
        long j = Z.a - this.a;
        int i = n.b[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return j;
        }
        if (i == 2) {
            return j / 10;
        }
        if (i == 3) {
            return j / 100;
        }
        if (i == 4) {
            return j / 1000;
        }
        if (i != 5) {
            throw new j$.time.temporal.n("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
        ChronoField chronoField = ChronoField.ERA;
        return Z.y(chronoField) - y(chronoField);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            if (this.a == ((o) obj).a) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.YEAR || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA : temporalField != null && temporalField.y(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return v(temporalField).a(y(temporalField), temporalField);
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal o(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j, chronoUnit);
    }

    public final String toString() {
        return Integer.toString(this.a);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal u(LocalDate localDate) {
        localDate.getClass();
        return (o) AbstractC0028g.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o v(TemporalField temporalField) {
        if (temporalField == ChronoField.YEAR_OF_ERA) {
            return j$.time.temporal.o.j(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.j.d(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.v(this);
        }
        int i = n.a[((ChronoField) temporalField).ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 2) {
            return i2;
        }
        if (i == 3) {
            return i2 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(temporalField)));
    }
}
