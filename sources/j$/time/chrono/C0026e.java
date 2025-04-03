package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* renamed from: j$.time.chrono.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0026e implements ChronoLocalDateTime, Temporal, TemporalAdjuster, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    private final transient ChronoLocalDate a;
    private final transient LocalTime b;

    private C0026e(ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        Objects.a(localTime, "time");
        this.a = chronoLocalDate;
        this.b = localTime;
    }

    static C0026e Z(Chronology chronology, Temporal temporal) {
        C0026e c0026e = (C0026e) temporal;
        if (chronology.equals(c0026e.a.a())) {
            return c0026e;
        }
        throw new ClassCastException(j$.time.d.d("Chronology mismatch, required: ", chronology.n(), ", actual: ", c0026e.a.a().n()));
    }

    static C0026e a0(ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        return new C0026e(chronoLocalDate, localTime);
    }

    private C0026e d0(ChronoLocalDate chronoLocalDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        LocalTime localTime = this.b;
        if (j5 == 0) {
            return f0(chronoLocalDate, localTime);
        }
        long j6 = j2 / 1440;
        long j7 = j / 24;
        long j8 = (j2 % 1440) * 60000000000L;
        long j9 = ((j % 24) * 3600000000000L) + j8 + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long r0 = localTime.r0();
        long j10 = j9 + r0;
        long f = j$.nio.file.attribute.p.f(j10, 86400000000000L) + j7 + j6 + (j3 / 86400) + (j4 / 86400000000000L);
        long g = j$.nio.file.attribute.p.g(j10, 86400000000000L);
        if (g != r0) {
            localTime = LocalTime.j0(g);
        }
        return f0(chronoLocalDate.d(f, (TemporalUnit) ChronoUnit.DAYS), localTime);
    }

    private C0026e f0(Temporal temporal, LocalTime localTime) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == temporal && this.b == localTime) ? this : new C0026e(AbstractC0024c.Z(chronoLocalDate.a(), temporal), localTime);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new D((byte) 2, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object D(j$.time.temporal.m mVar) {
        return AbstractC0028g.k(this, mVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal G(Temporal temporal) {
        return temporal.c(b().toEpochDay(), ChronoField.EPOCH_DAY).c(toLocalTime().r0(), ChronoField.NANO_OF_DAY);
    }

    @Override // java.lang.Comparable
    /* renamed from: K */
    public final /* synthetic */ int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return AbstractC0028g.c(this, chronoLocalDateTime);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final Chronology a() {
        return this.a.a();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoLocalDate b() {
        return this.a;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final C0026e d(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        ChronoLocalDate chronoLocalDate = this.a;
        if (!z) {
            return Z(chronoLocalDate.a(), temporalUnit.o(this, j));
        }
        int i = AbstractC0025d.a[((ChronoUnit) temporalUnit).ordinal()];
        LocalTime localTime = this.b;
        switch (i) {
            case 1:
                return d0(this.a, 0L, 0L, 0L, j);
            case 2:
                C0026e f0 = f0(chronoLocalDate.d(j / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), localTime);
                return f0.d0(f0.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                C0026e f02 = f0(chronoLocalDate.d(j / 86400000, (TemporalUnit) ChronoUnit.DAYS), localTime);
                return f02.d0(f02.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return c0(j);
            case 5:
                return d0(this.a, 0L, j, 0L, 0L);
            case 6:
                return d0(this.a, j, 0L, 0L, 0L);
            case 7:
                C0026e f03 = f0(chronoLocalDate.d(j / 256, (TemporalUnit) ChronoUnit.DAYS), localTime);
                return f03.d0(f03.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return f0(chronoLocalDate.d(j, temporalUnit), localTime);
        }
    }

    final C0026e c0(long j) {
        return d0(this.a, 0L, 0L, j, 0L);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.a(temporal, "endExclusive");
        ChronoLocalDate chronoLocalDate = this.a;
        ChronoLocalDateTime F = chronoLocalDate.a().F(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.a(temporalUnit, "unit");
            return temporalUnit.between(this, F);
        }
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        boolean z = ((ChronoUnit) temporalUnit).compareTo(chronoUnit) < 0;
        LocalTime localTime = this.b;
        if (!z) {
            ChronoLocalDate b = F.b();
            if (F.toLocalTime().isBefore(localTime)) {
                b = b.o(1L, chronoUnit);
            }
            return chronoLocalDate.e(b, temporalUnit);
        }
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        long y = F.y(chronoField) - chronoLocalDate.y(chronoField);
        switch (AbstractC0025d.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                y = j$.time.b.d(y, 86400000000000L);
                break;
            case 2:
                y = j$.time.b.d(y, 86400000000L);
                break;
            case 3:
                y = j$.time.b.d(y, 86400000L);
                break;
            case 4:
                y = j$.time.b.d(y, 86400);
                break;
            case 5:
                y = j$.time.b.d(y, 1440);
                break;
            case 6:
                y = j$.time.b.d(y, 24);
                break;
            case 7:
                y = j$.time.b.d(y, 2);
                break;
        }
        return j$.time.b.c(y, localTime.e(F.toLocalTime(), temporalUnit));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final C0026e c(long j, TemporalField temporalField) {
        boolean z = temporalField instanceof ChronoField;
        ChronoLocalDate chronoLocalDate = this.a;
        if (!z) {
            return Z(chronoLocalDate.a(), temporalField.D(this, j));
        }
        boolean c0 = ((ChronoField) temporalField).c0();
        LocalTime localTime = this.b;
        return c0 ? f0(chronoLocalDate, localTime.c(j, temporalField)) : f0(chronoLocalDate.c(j, temporalField), localTime);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDateTime) && AbstractC0028g.c(this, (ChronoLocalDateTime) obj) == 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField != null && temporalField.y(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        return chronoField.Z() || chronoField.c0();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).c0() ? this.b.get(temporalField) : this.a.get(temporalField) : v(temporalField).a(y(temporalField), temporalField);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal o(long j, ChronoUnit chronoUnit) {
        return Z(this.a.a(), j$.time.temporal.j.b(this, j, chronoUnit));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final InterfaceC0030i q(ZoneId zoneId) {
        return k.Z(zoneId, null, this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ long toEpochSecond(ZoneOffset zoneOffset) {
        return AbstractC0028g.n(this, zoneOffset);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final LocalTime toLocalTime() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal u(LocalDate localDate) {
        if (localDate instanceof ChronoLocalDate) {
            return f0(localDate, this.b);
        }
        Chronology a = this.a.a();
        localDate.getClass();
        return Z(a, (C0026e) AbstractC0028g.a(localDate, this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o v(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.G(this);
        }
        if (!((ChronoField) temporalField).c0()) {
            return this.a.v(temporalField);
        }
        LocalTime localTime = this.b;
        localTime.getClass();
        return j$.time.temporal.j.d(localTime, temporalField);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.a);
        objectOutput.writeObject(this.b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).c0() ? this.b.y(temporalField) : this.a.y(temporalField) : temporalField.v(this);
    }
}
