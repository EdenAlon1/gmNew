package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.Serializable;

/* renamed from: j$.time.chrono.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
abstract class AbstractC0024c implements ChronoLocalDate, Temporal, TemporalAdjuster, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    AbstractC0024c() {
    }

    static ChronoLocalDate Z(Chronology chronology, Temporal temporal) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) temporal;
        if (chronology.equals(chronoLocalDate.a())) {
            return chronoLocalDate;
        }
        throw new ClassCastException(j$.time.d.d("Chronology mismatch, expected: ", chronology.n(), ", actual: ", chronoLocalDate.a().n()));
    }

    private long a0(ChronoLocalDate chronoLocalDate) {
        if (a().Q(ChronoField.MONTH_OF_YEAR).d() != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        long y = y(chronoField) * 32;
        ChronoField chronoField2 = ChronoField.DAY_OF_MONTH;
        return (((chronoLocalDate.y(chronoField) * 32) + chronoLocalDate.get(chronoField2)) - (y + j$.time.temporal.j.a(this, chronoField2))) / 32;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public ChronoLocalDateTime B(LocalTime localTime) {
        return C0026e.a0(this, localTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object D(j$.time.temporal.m mVar) {
        return AbstractC0028g.j(this, mVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final /* synthetic */ Temporal G(Temporal temporal) {
        return AbstractC0028g.a(this, temporal);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public l H() {
        return a().W(get(ChronoField.ERA));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean N() {
        return a().V(y(ChronoField.YEAR));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public ChronoLocalDate O(TemporalAmount temporalAmount) {
        return Z(a(), temporalAmount.o(this));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: S */
    public ChronoLocalDate o(long j, TemporalUnit temporalUnit) {
        return Z(a(), j$.time.temporal.j.b(this, j, temporalUnit));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int U() {
        return N() ? 366 : 365;
    }

    abstract ChronoLocalDate b0(long j);

    abstract ChronoLocalDate c0(long j);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoLocalDate chronoLocalDate) {
        return AbstractC0028g.b(this, chronoLocalDate);
    }

    abstract ChronoLocalDate d0(long j);

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public long e(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.a(temporal, "endExclusive");
        ChronoLocalDate r = a().r(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.a(temporalUnit, "unit");
            return temporalUnit.between(this, r);
        }
        switch (AbstractC0023b.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return r.toEpochDay() - toEpochDay();
            case 2:
                return (r.toEpochDay() - toEpochDay()) / 7;
            case 3:
                return a0(r);
            case 4:
                return a0(r) / 12;
            case 5:
                return a0(r) / 120;
            case 6:
                return a0(r) / 1200;
            case 7:
                return a0(r) / 12000;
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return r.y(chronoField) - y(chronoField);
            default:
                throw new j$.time.temporal.n("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDate) && AbstractC0028g.b(this, (ChronoLocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.TemporalAccessor
    public /* synthetic */ boolean f(TemporalField temporalField) {
        return AbstractC0028g.h(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int get(TemporalField temporalField) {
        return j$.time.temporal.j.a(this, temporalField);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        long epochDay = toEpochDay();
        return a().hashCode() ^ ((int) (epochDay ^ (epochDay >>> 32)));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: l */
    public ChronoLocalDate u(TemporalAdjuster temporalAdjuster) {
        return Z(a(), temporalAdjuster.G(this));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        return y(ChronoField.EPOCH_DAY);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public String toString() {
        long y = y(ChronoField.YEAR_OF_ERA);
        long y2 = y(ChronoField.MONTH_OF_YEAR);
        long y3 = y(ChronoField.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(a().toString());
        sb.append(" ");
        sb.append(H());
        sb.append(" ");
        sb.append(y);
        sb.append(y2 < 10 ? "-0" : "-");
        sb.append(y2);
        sb.append(y3 < 10 ? "-0" : "-");
        sb.append(y3);
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ j$.time.temporal.o v(TemporalField temporalField) {
        return j$.time.temporal.j.d(this, temporalField);
    }

    @Override // j$.time.temporal.Temporal
    public ChronoLocalDate c(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
        return Z(a(), temporalField.D(this, j));
    }

    @Override // j$.time.temporal.Temporal
    public ChronoLocalDate d(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        if (!z) {
            if (z) {
                throw new j$.time.temporal.n("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            }
            return Z(a(), temporalUnit.o(this, j));
        }
        switch (AbstractC0023b.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return b0(j);
            case 2:
                return b0(j$.time.b.d(j, 7));
            case 3:
                return c0(j);
            case 4:
                return d0(j);
            case 5:
                return d0(j$.time.b.d(j, 10));
            case 6:
                return d0(j$.time.b.d(j, 100));
            case 7:
                return d0(j$.time.b.d(j, 1000));
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return c(j$.time.b.c(y(chronoField), j), (TemporalField) chronoField);
            default:
                throw new j$.time.temporal.n("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }
}
