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
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes9.dex */
public final class B extends AbstractC0024c {
    private static final long serialVersionUID = 1300372329181994526L;
    private final transient LocalDate a;

    B(LocalDate localDate) {
        Objects.a(localDate, "isoDate");
        this.a = localDate;
    }

    private int e0() {
        return this.a.getYear() - 1911;
    }

    private B g0(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new B(localDate);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new D((byte) 7, this);
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime B(LocalTime localTime) {
        return C0026e.a0(this, localTime);
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate
    public final l H() {
        return e0() >= 1 ? C.ROC : C.BEFORE_ROC;
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate O(TemporalAmount temporalAmount) {
        return (B) super.O(temporalAmount);
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate
    /* renamed from: S */
    public final ChronoLocalDate o(long j, TemporalUnit temporalUnit) {
        return (B) super.o(j, temporalUnit);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology a() {
        return z.e;
    }

    @Override // j$.time.chrono.AbstractC0024c
    final ChronoLocalDate b0(long j) {
        return g0(this.a.plusDays(j));
    }

    @Override // j$.time.chrono.AbstractC0024c
    final ChronoLocalDate c0(long j) {
        return g0(this.a.plusMonths(j));
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate d(long j, TemporalUnit temporalUnit) {
        return (B) super.d(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0024c
    final ChronoLocalDate d0(long j) {
        return g0(this.a.o0(j));
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof B) {
            return this.a.equals(((B) obj).a);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r2 != 7) goto L20;
     */
    @Override // j$.time.chrono.AbstractC0024c, j$.time.temporal.Temporal
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.chrono.B c(long r9, j$.time.temporal.TemporalField r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof j$.time.temporal.ChronoField
            if (r0 == 0) goto L9a
            r0 = r11
            j$.time.temporal.ChronoField r0 = (j$.time.temporal.ChronoField) r0
            long r1 = r8.y(r0)
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 != 0) goto L10
            return r8
        L10:
            int[] r1 = j$.time.chrono.A.a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            j$.time.LocalDate r3 = r8.a
            r4 = 7
            r5 = 6
            r6 = 4
            if (r2 == r6) goto L4c
            r7 = 5
            if (r2 == r7) goto L27
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L4c
            goto L62
        L27:
            j$.time.chrono.z r11 = j$.time.chrono.z.e
            j$.time.temporal.o r11 = r11.Q(r0)
            r11.b(r9, r0)
            int r11 = r8.e0()
            long r0 = (long) r11
            r4 = 12
            long r0 = r0 * r4
            int r11 = r3.getMonthValue()
            long r4 = (long) r11
            long r0 = r0 + r4
            r4 = 1
            long r0 = r0 - r4
            long r9 = r9 - r0
            j$.time.LocalDate r9 = r3.plusMonths(r9)
            j$.time.chrono.B r9 = r8.g0(r9)
            return r9
        L4c:
            j$.time.chrono.z r2 = j$.time.chrono.z.e
            j$.time.temporal.o r2 = r2.Q(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r6) goto L85
            if (r0 == r5) goto L7a
            if (r0 == r4) goto L6b
        L62:
            j$.time.LocalDate r9 = r3.c(r9, r11)
            j$.time.chrono.B r9 = r8.g0(r9)
            return r9
        L6b:
            int r9 = r8.e0()
            int r9 = 1912 - r9
            j$.time.LocalDate r9 = r3.u0(r9)
            j$.time.chrono.B r9 = r8.g0(r9)
            return r9
        L7a:
            int r2 = r2 + 1911
            j$.time.LocalDate r9 = r3.u0(r2)
            j$.time.chrono.B r9 = r8.g0(r9)
            return r9
        L85:
            int r9 = r8.e0()
            r10 = 1
            if (r9 < r10) goto L8f
            int r2 = r2 + 1911
            goto L91
        L8f:
            int r2 = 1912 - r2
        L91:
            j$.time.LocalDate r9 = r3.u0(r2)
            j$.time.chrono.B r9 = r8.g0(r9)
            return r9
        L9a:
            j$.time.chrono.ChronoLocalDate r9 = super.c(r9, r11)
            j$.time.chrono.B r9 = (j$.time.chrono.B) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.B.c(long, j$.time.temporal.TemporalField):j$.time.chrono.B");
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        z.e.getClass();
        return this.a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate
    /* renamed from: l */
    public final ChronoLocalDate u(TemporalAdjuster temporalAdjuster) {
        return (B) super.u(temporalAdjuster);
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.temporal.Temporal
    public final Temporal o(long j, ChronoUnit chronoUnit) {
        return (B) super.o(j, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.a.toEpochDay();
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.temporal.Temporal
    public final Temporal u(LocalDate localDate) {
        return (B) super.u(localDate);
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
        int i = A.a[chronoField.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.v(temporalField);
        }
        if (i != 4) {
            return z.e.Q(chronoField);
        }
        j$.time.temporal.o o = ChronoField.YEAR.o();
        return j$.time.temporal.o.j(1L, e0() <= 0 ? (-o.e()) + 1912 : o.d() - 1911);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.v(this);
        }
        int i = A.a[((ChronoField) temporalField).ordinal()];
        if (i == 4) {
            int e0 = e0();
            if (e0 < 1) {
                e0 = 1 - e0;
            }
            return e0;
        }
        LocalDate localDate = this.a;
        if (i == 5) {
            return ((e0() * 12) + localDate.getMonthValue()) - 1;
        }
        if (i == 6) {
            return e0();
        }
        if (i != 7) {
            return localDate.y(temporalField);
        }
        return e0() < 1 ? 0 : 1;
    }

    @Override // j$.time.chrono.AbstractC0024c, j$.time.temporal.Temporal
    public final Temporal d(long j, TemporalUnit temporalUnit) {
        return (B) super.d(j, temporalUnit);
    }
}
