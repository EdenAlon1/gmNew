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
public final class q implements Temporal, TemporalAdjuster, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 4183400860270640070L;
    private final int a;
    private final int b;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.q(ChronoField.YEAR, 4, 10, E.EXCEEDS_PAD);
        dateTimeFormatterBuilder.e('-');
        dateTimeFormatterBuilder.p(ChronoField.MONTH_OF_YEAR, 2);
        dateTimeFormatterBuilder.A(Locale.getDefault());
    }

    private q(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private long Z() {
        return ((this.a * 12) + this.b) - 1;
    }

    public static q a0(int i, int i2) {
        ChronoField.YEAR.b0(i);
        ChronoField.MONTH_OF_YEAR.b0(i2);
        return new q(i, i2);
    }

    private q e0(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new q(i, i2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 12, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(j$.time.temporal.m mVar) {
        return mVar == j$.time.temporal.j.e() ? j$.time.chrono.r.e : mVar == j$.time.temporal.j.j() ? ChronoUnit.MONTHS : j$.time.temporal.j.c(this, mVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal G(Temporal temporal) {
        if (!Chronology.CC.a(temporal).equals(j$.time.chrono.r.e)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return temporal.c(Z(), ChronoField.PROLEPTIC_MONTH);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final q d(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (q) temporalUnit.o(this, j);
        }
        switch (p.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return c0(j);
            case 2:
                return d0(j);
            case 3:
                return d0(b.d(j, 10));
            case 4:
                return d0(b.d(j, 100));
            case 5:
                return d0(b.d(j, 1000));
            case 6:
                ChronoField chronoField = ChronoField.ERA;
                return c(b.c(y(chronoField), j), chronoField);
            default:
                throw new j$.time.temporal.n("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final q c0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        long j3 = 12;
        return e0(ChronoField.YEAR.a0(j$.nio.file.attribute.p.f(j2, j3)), ((int) j$.nio.file.attribute.p.g(j2, j3)) + 1);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        q qVar = (q) obj;
        int i = this.a - qVar.a;
        return i == 0 ? this.b - qVar.b : i;
    }

    public final q d0(long j) {
        return j == 0 ? this : e0(ChronoField.YEAR.a0(this.a + j), this.b);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        q a0;
        if (temporal instanceof q) {
            a0 = (q) temporal;
        } else {
            Objects.a(temporal, "temporal");
            try {
                if (!j$.time.chrono.r.e.equals(Chronology.CC.a(temporal))) {
                    temporal = LocalDate.b0(temporal);
                }
                a0 = a0(temporal.get(ChronoField.YEAR), temporal.get(ChronoField.MONTH_OF_YEAR));
            } catch (DateTimeException e) {
                throw new DateTimeException(d.d("Unable to obtain YearMonth from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, a0);
        }
        long Z = a0.Z() - Z();
        switch (p.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return Z;
            case 2:
                return Z / 12;
            case 3:
                return Z / 120;
            case 4:
                return Z / 1200;
            case 5:
                return Z / 12000;
            case 6:
                ChronoField chronoField = ChronoField.ERA;
                return a0.y(chronoField) - y(chronoField);
            default:
                throw new j$.time.temporal.n("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.a == qVar.a && this.b == qVar.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.YEAR || temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.PROLEPTIC_MONTH || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA : temporalField != null && temporalField.y(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final q c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (q) temporalField.D(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.b0(j);
        int i = p.a[chronoField.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            int i3 = (int) j;
            ChronoField.MONTH_OF_YEAR.b0(i3);
            return e0(i2, i3);
        }
        if (i == 2) {
            return c0(j - Z());
        }
        int i4 = this.b;
        if (i == 3) {
            if (i2 < 1) {
                j = 1 - j;
            }
            int i5 = (int) j;
            ChronoField.YEAR.b0(i5);
            return e0(i5, i4);
        }
        if (i == 4) {
            int i6 = (int) j;
            ChronoField.YEAR.b0(i6);
            return e0(i6, i4);
        }
        if (i != 5) {
            throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
        if (y(ChronoField.ERA) == j) {
            return this;
        }
        int i7 = 1 - i2;
        ChronoField.YEAR.b0(i7);
        return e0(i7, i4);
    }

    final void g0(DataOutput dataOutput) {
        dataOutput.writeInt(this.a);
        dataOutput.writeByte(this.b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return v(temporalField).a(y(temporalField), temporalField);
    }

    public final int hashCode() {
        return (this.b << 27) ^ this.a;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal o(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j, chronoUnit);
    }

    public final String toString() {
        int i = this.a;
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder(9);
        if (abs >= 1000) {
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal u(LocalDate localDate) {
        localDate.getClass();
        return (q) AbstractC0028g.a(localDate, this);
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
        int i = p.a[((ChronoField) temporalField).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return Z();
        }
        int i2 = this.a;
        if (i == 3) {
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 4) {
            return i2;
        }
        if (i == 5) {
            return i2 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(temporalField)));
    }
}
