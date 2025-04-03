package j$.time;

import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class MonthDay implements TemporalAccessor, TemporalAdjuster, Comparable<MonthDay>, Serializable {
    private static final DateTimeFormatter c;
    public static final /* synthetic */ int d = 0;
    private static final long serialVersionUID = -939150713474957432L;
    private final int a;
    private final int b;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.f("--");
        dateTimeFormatterBuilder.p(ChronoField.MONTH_OF_YEAR, 2);
        dateTimeFormatterBuilder.e('-');
        dateTimeFormatterBuilder.p(ChronoField.DAY_OF_MONTH, 2);
        c = dateTimeFormatterBuilder.A(Locale.getDefault());
    }

    private MonthDay(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static MonthDay Z(int i, int i2) {
        Month c0 = Month.c0(i);
        Objects.a(c0, "month");
        ChronoField.DAY_OF_MONTH.b0(i2);
        if (i2 <= c0.b0()) {
            return new MonthDay(c0.getValue(), i2);
        }
        throw new DateTimeException("Illegal value for DayOfMonth field, value " + i2 + " is not valid for month " + c0.name());
    }

    public static MonthDay from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof MonthDay) {
            return (MonthDay) temporalAccessor;
        }
        try {
            if (!j$.time.chrono.r.e.equals(Chronology.CC.a(temporalAccessor))) {
                temporalAccessor = LocalDate.b0(temporalAccessor);
            }
            return Z(temporalAccessor.get(ChronoField.MONTH_OF_YEAR), temporalAccessor.get(ChronoField.DAY_OF_MONTH));
        } catch (DateTimeException e) {
            throw new DateTimeException(d.d("Unable to obtain MonthDay from TemporalAccessor: ", String.valueOf(temporalAccessor), " of type ", temporalAccessor.getClass().getName()), e);
        }
    }

    public static MonthDay parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = c;
        Objects.a(dateTimeFormatter, "formatter");
        return (MonthDay) dateTimeFormatter.e(charSequence, new j$.desugar.sun.nio.fs.n(3));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 13, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(j$.time.temporal.m mVar) {
        return mVar == j$.time.temporal.j.e() ? j$.time.chrono.r.e : j$.time.temporal.j.c(this, mVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal G(Temporal temporal) {
        if (!Chronology.CC.a(temporal).equals(j$.time.chrono.r.e)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        Temporal c2 = temporal.c(this.a, ChronoField.MONTH_OF_YEAR);
        ChronoField chronoField = ChronoField.DAY_OF_MONTH;
        return c2.c(Math.min(c2.v(chronoField).d(), this.b), chronoField);
    }

    final void a0(DataOutput dataOutput) {
        dataOutput.writeByte(this.a);
        dataOutput.writeByte(this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(MonthDay monthDay) {
        MonthDay monthDay2 = monthDay;
        int i = this.a - monthDay2.a;
        return i == 0 ? this.b - monthDay2.b : i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MonthDay) {
            MonthDay monthDay = (MonthDay) obj;
            if (this.a == monthDay.a && this.b == monthDay.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.DAY_OF_MONTH : temporalField != null && temporalField.y(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return v(temporalField).a(y(temporalField), temporalField);
    }

    public int getDayOfMonth() {
        return this.b;
    }

    public Month getMonth() {
        return Month.c0(this.a);
    }

    public final int hashCode() {
        return (this.a << 6) + this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        int i = this.a;
        sb.append(i < 10 ? "0" : "");
        sb.append(i);
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o v(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return temporalField.o();
        }
        if (temporalField != ChronoField.DAY_OF_MONTH) {
            return j$.time.temporal.j.d(this, temporalField);
        }
        int ordinal = getMonth().ordinal();
        return j$.time.temporal.o.k(1L, ordinal != 1 ? (ordinal == 3 || ordinal == 5 || ordinal == 8 || ordinal == 10) ? 30 : 31 : 28, getMonth().b0());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        int i;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.v(this);
        }
        int i2 = i.a[((ChronoField) temporalField).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 != 2) {
                throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(temporalField)));
            }
            i = this.a;
        }
        return i;
    }
}
