package j$.time.chrono;

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
import java.io.ObjectOutput;

/* loaded from: classes9.dex */
public final class p extends AbstractC0024c {
    private static final long serialVersionUID = -5207853542612002020L;
    private final transient n a;
    private final transient int b;
    private final transient int c;
    private final transient int d;

    private p(n nVar, int i, int i2, int i3) {
        nVar.i0(i, i2, i3);
        this.a = nVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private int e0() {
        return this.a.h0(this.b, this.c) + this.d;
    }

    static p f0(n nVar, int i, int i2, int i3) {
        return new p(nVar, i, i2, i3);
    }

    static p g0(n nVar, long j) {
        return new p(nVar, j);
    }

    private p j0(int i, int i2, int i3) {
        n nVar = this.a;
        int k0 = nVar.k0(i, i2);
        if (i3 > k0) {
            i3 = k0;
        }
        return new p(nVar, i, i2, i3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new D((byte) 6, this);
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime B(LocalTime localTime) {
        return C0026e.a0(this, localTime);
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate
    public final l H() {
        return q.AH;
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate
    public final boolean N() {
        return this.a.V(this.b);
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate O(TemporalAmount temporalAmount) {
        return (p) super.O(temporalAmount);
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate
    /* renamed from: S */
    public final ChronoLocalDate o(long j, TemporalUnit temporalUnit) {
        return (p) super.o(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate
    public final int U() {
        return this.a.l0(this.b);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology a() {
        return this.a;
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate d(long j, TemporalUnit temporalUnit) {
        return (p) super.d(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0024c
    final ChronoLocalDate d0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.b + ((int) j);
        int i = (int) j2;
        if (j2 == i) {
            return j0(i, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.b == pVar.b && this.c == pVar.c && this.d == pVar.d && this.a.equals(pVar.a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC0024c
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final p b0(long j) {
        return new p(this.a, toEpochDay() + j);
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        this.a.getClass();
        int i = this.b;
        return (((i << 11) + (this.c << 6)) + this.d) ^ ((i & (-2048)) ^ 2100100019);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC0024c
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final p c0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.b * 12) + (this.c - 1) + j;
        return j0(this.a.e0(j$.nio.file.attribute.p.f(j2, 12L)), ((int) j$.nio.file.attribute.p.g(j2, 12L)) + 1, this.d);
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.temporal.Temporal
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public final p c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (p) super.c(j, temporalField);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        n nVar = this.a;
        nVar.Q(chronoField).b(j, chronoField);
        int i = (int) j;
        int i2 = o.a[chronoField.ordinal()];
        int i3 = this.d;
        int i4 = this.c;
        int i5 = this.b;
        switch (i2) {
            case 1:
                return j0(i5, i4, i);
            case 2:
                return b0(Math.min(i, U()) - e0());
            case 3:
                return b0((j - y(ChronoField.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return b0(j - (((int) j$.nio.file.attribute.p.g(toEpochDay() + 3, 7)) + 1));
            case 5:
                return b0(j - y(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return b0(j - y(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new p(nVar, j);
            case 8:
                return b0((j - y(ChronoField.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return j0(i5, i, i3);
            case 10:
                return c0(j - (((i5 * 12) + i4) - 1));
            case 11:
                if (i5 < 1) {
                    i = 1 - i;
                }
                return j0(i, i4, i3);
            case 12:
                return j0(i, i4, i3);
            case 13:
                return j0(1 - i5, i4, i3);
            default:
                throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate
    /* renamed from: l */
    public final ChronoLocalDate u(TemporalAdjuster temporalAdjuster) {
        return (p) super.u(temporalAdjuster);
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.temporal.Temporal
    public final Temporal o(long j, ChronoUnit chronoUnit) {
        return (p) super.o(j, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.a.i0(this.b, this.c, this.d);
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.temporal.Temporal
    public final Temporal u(LocalDate localDate) {
        return (p) super.u(localDate);
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o v(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.G(this);
        }
        if (!AbstractC0028g.h(this, temporalField)) {
            throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = o.a[chronoField.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? this.a.Q(chronoField) : j$.time.temporal.o.j(1L, 5L) : j$.time.temporal.o.j(1L, U()) : j$.time.temporal.o.j(1L, r2.k0(this.b, this.c));
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.a);
        objectOutput.writeInt(j$.time.temporal.j.a(this, ChronoField.YEAR));
        objectOutput.writeByte(j$.time.temporal.j.a(this, ChronoField.MONTH_OF_YEAR));
        objectOutput.writeByte(j$.time.temporal.j.a(this, ChronoField.DAY_OF_MONTH));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.v(this);
        }
        int i = o.a[((ChronoField) temporalField).ordinal()];
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.b;
        switch (i) {
            case 1:
                return i3;
            case 2:
                return e0();
            case 3:
                return ((i3 - 1) / 7) + 1;
            case 4:
                return ((int) j$.nio.file.attribute.p.g(toEpochDay() + 3, 7)) + 1;
            case 5:
                return ((i3 - 1) % 7) + 1;
            case 6:
                return ((e0() - 1) % 7) + 1;
            case 7:
                return toEpochDay();
            case 8:
                return ((e0() - 1) / 7) + 1;
            case 9:
                return i2;
            case 10:
                return ((i4 * 12) + i2) - 1;
            case 11:
                return i4;
            case 12:
                return i4;
            case 13:
                return i4 <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.temporal.Temporal
    public final Temporal d(long j, TemporalUnit temporalUnit) {
        return (p) super.d(j, temporalUnit);
    }

    private p(n nVar, long j) {
        int[] j0 = nVar.j0((int) j);
        this.a = nVar;
        this.b = j0[0];
        this.c = j0[1];
        this.d = j0[2];
    }
}
