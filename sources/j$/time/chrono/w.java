package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes9.dex */
public final class w extends AbstractC0024c {
    static final LocalDate d = LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    private final transient LocalDate a;
    private transient x b;
    private transient int c;

    w(LocalDate localDate) {
        if (localDate.f0(d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
        }
        x g = x.g(localDate);
        this.b = g;
        this.c = (localDate.getYear() - g.m().getYear()) + 1;
        this.a = localDate;
    }

    private w h0(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new w(localDate);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new D((byte) 4, this);
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime B(LocalTime localTime) {
        return C0026e.a0(this, localTime);
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate
    public final l H() {
        return this.b;
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate O(TemporalAmount temporalAmount) {
        return (w) super.O(temporalAmount);
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate
    /* renamed from: S */
    public final ChronoLocalDate o(long j, TemporalUnit temporalUnit) {
        return (w) super.o(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate
    public final int U() {
        x xVar = this.b;
        x n = xVar.n();
        LocalDate localDate = this.a;
        int U = (n == null || n.m().getYear() != localDate.getYear()) ? localDate.U() : n.m().d0() - 1;
        return this.c == 1 ? U - (xVar.m().d0() - 1) : U;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology a() {
        return u.e;
    }

    @Override // j$.time.chrono.AbstractC0024c
    final ChronoLocalDate b0(long j) {
        return h0(this.a.plusDays(j));
    }

    @Override // j$.time.chrono.AbstractC0024c
    final ChronoLocalDate c0(long j) {
        return h0(this.a.plusMonths(j));
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate d(long j, TemporalUnit temporalUnit) {
        return (w) super.d(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0024c
    final ChronoLocalDate d0(long j) {
        return h0(this.a.o0(j));
    }

    public final x e0() {
        return this.b;
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            return this.a.equals(((w) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        if (temporalField == ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH || temporalField == ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR || temporalField == ChronoField.ALIGNED_WEEK_OF_MONTH || temporalField == ChronoField.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).Z() : temporalField != null && temporalField.y(this);
    }

    public final w f0(long j, ChronoUnit chronoUnit) {
        return (w) super.d(j, (TemporalUnit) chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.temporal.Temporal
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final w c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (w) super.c(j, temporalField);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        if (y(chronoField) == j) {
            return this;
        }
        int[] iArr = v.a;
        int i = iArr[chronoField.ordinal()];
        LocalDate localDate = this.a;
        if (i == 3 || i == 8 || i == 9) {
            u uVar = u.e;
            int a = uVar.Q(chronoField).a(j, chronoField);
            int i2 = iArr[chronoField.ordinal()];
            if (i2 == 3) {
                return h0(localDate.u0(uVar.h(this.b, a)));
            }
            if (i2 == 8) {
                return h0(localDate.u0(uVar.h(x.p(a), this.c)));
            }
            if (i2 == 9) {
                return h0(localDate.u0(a));
            }
        }
        return h0(localDate.c(j, temporalField));
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        u.e.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    public final w i0(j$.time.temporal.l lVar) {
        return (w) super.u(lVar);
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate
    /* renamed from: l */
    public final ChronoLocalDate u(TemporalAdjuster temporalAdjuster) {
        return (w) super.u(temporalAdjuster);
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.temporal.Temporal
    public final Temporal o(long j, ChronoUnit chronoUnit) {
        return (w) super.o(j, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.a.toEpochDay();
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.temporal.Temporal
    public final Temporal u(LocalDate localDate) {
        return (w) super.u(localDate);
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o v(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.G(this);
        }
        if (!f(temporalField)) {
            throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = v.a[chronoField.ordinal()];
        if (i == 1) {
            return j$.time.temporal.o.j(1L, this.a.lengthOfMonth());
        }
        if (i == 2) {
            return j$.time.temporal.o.j(1L, U());
        }
        if (i != 3) {
            return u.e.Q(chronoField);
        }
        x xVar = this.b;
        int year = xVar.m().getYear();
        return xVar.n() != null ? j$.time.temporal.o.j(1L, (r6.m().getYear() - year) + 1) : j$.time.temporal.o.j(1L, 999999999 - year);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.v(this);
        }
        int i = v.a[((ChronoField) temporalField).ordinal()];
        int i2 = this.c;
        x xVar = this.b;
        LocalDate localDate = this.a;
        switch (i) {
            case 2:
                return i2 == 1 ? (localDate.d0() - xVar.m().d0()) + 1 : localDate.d0();
            case 3:
                return i2;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(temporalField)));
            case 8:
                return xVar.getValue();
            default:
                return localDate.y(temporalField);
        }
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.temporal.Temporal
    public final Temporal d(long j, TemporalUnit temporalUnit) {
        return (w) super.d(j, temporalUnit);
    }

    w(x xVar, int i, LocalDate localDate) {
        if (!localDate.f0(d)) {
            this.b = xVar;
            this.c = i;
            this.a = localDate;
            return;
        }
        throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
    }
}
