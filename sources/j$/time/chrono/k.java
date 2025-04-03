package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
final class k implements InterfaceC0030i, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    private final transient C0026e a;
    private final transient ZoneOffset b;
    private final transient ZoneId c;

    private k(ZoneId zoneId, ZoneOffset zoneOffset, C0026e c0026e) {
        Objects.a(c0026e, "dateTime");
        this.a = c0026e;
        Objects.a(zoneOffset, "offset");
        this.b = zoneOffset;
        Objects.a(zoneId, "zone");
        this.c = zoneId;
    }

    static k G(Chronology chronology, Temporal temporal) {
        k kVar = (k) temporal;
        if (chronology.equals(kVar.a())) {
            return kVar;
        }
        throw new ClassCastException(j$.time.d.d("Chronology mismatch, required: ", chronology.n(), ", actual: ", kVar.a().n()));
    }

    static InterfaceC0030i Z(ZoneId zoneId, ZoneOffset zoneOffset, C0026e c0026e) {
        Objects.a(c0026e, "localDateTime");
        Objects.a(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new k(zoneId, (ZoneOffset) zoneId, c0026e);
        }
        ZoneRules rules = zoneId.getRules();
        LocalDateTime a0 = LocalDateTime.a0(c0026e);
        List g = rules.g(a0);
        if (g.size() == 1) {
            zoneOffset = (ZoneOffset) g.get(0);
        } else if (g.size() == 0) {
            j$.time.zone.b f = rules.f(a0);
            c0026e = c0026e.c0(f.v().getSeconds());
            zoneOffset = f.y();
        } else if (zoneOffset == null || !g.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) g.get(0);
        }
        Objects.a(zoneOffset, "offset");
        return new k(zoneId, zoneOffset, c0026e);
    }

    static k a0(Chronology chronology, Instant instant, ZoneId zoneId) {
        ZoneOffset d = zoneId.getRules().d(instant);
        Objects.a(d, "offset");
        return new k(zoneId, d, (C0026e) chronology.F(LocalDateTime.e0(instant.getEpochSecond(), instant.getNano(), d)));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new D((byte) 3, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object D(j$.time.temporal.m mVar) {
        return AbstractC0028g.l(this, mVar);
    }

    @Override // j$.time.chrono.InterfaceC0030i
    public final ChronoLocalDateTime L() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC0030i
    public final /* synthetic */ long Y() {
        return AbstractC0028g.o(this);
    }

    @Override // j$.time.chrono.InterfaceC0030i
    public final Chronology a() {
        return b().a();
    }

    @Override // j$.time.chrono.InterfaceC0030i
    public final ChronoLocalDate b() {
        return ((C0026e) L()).b();
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0030i d(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return G(a(), temporalUnit.o(this, j));
        }
        return G(a(), this.a.d(j, temporalUnit).G(this));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return G(a(), temporalField.D(this, j));
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = j.a[chronoField.ordinal()];
        if (i == 1) {
            return d(j - AbstractC0028g.o(this), ChronoUnit.SECONDS);
        }
        ZoneId zoneId = this.c;
        C0026e c0026e = this.a;
        if (i != 2) {
            return Z(zoneId, this.b, c0026e.c(j, temporalField));
        }
        ZoneOffset ofTotalSeconds = ZoneOffset.ofTotalSeconds(chronoField.a0(j));
        c0026e.getClass();
        return a0(a(), AbstractC0028g.p(c0026e, ofTotalSeconds), zoneId);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC0028g.d(this, (InterfaceC0030i) obj);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.a(temporal, "endExclusive");
        InterfaceC0030i C = a().C(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.a.e(C.j(this.b).L(), temporalUnit);
        }
        Objects.a(temporalUnit, "unit");
        return temporalUnit.between(this, C);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0030i) && AbstractC0028g.d(this, (InterfaceC0030i) obj) == 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return true;
        }
        return temporalField != null && temporalField.y(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int get(TemporalField temporalField) {
        return AbstractC0028g.e(this, temporalField);
    }

    @Override // j$.time.chrono.InterfaceC0030i
    public final ZoneId getZone() {
        return this.c;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.chrono.InterfaceC0030i
    public final ZoneOffset i() {
        return this.b;
    }

    @Override // j$.time.chrono.InterfaceC0030i
    public final InterfaceC0030i j(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        C0026e c0026e = this.a;
        c0026e.getClass();
        return a0(a(), AbstractC0028g.p(c0026e, this.b), zoneId);
    }

    @Override // j$.time.chrono.InterfaceC0030i
    public final InterfaceC0030i k(ZoneId zoneId) {
        return Z(zoneId, this.b, this.a);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal o(long j, ChronoUnit chronoUnit) {
        return G(a(), j$.time.temporal.j.b(this, j, chronoUnit));
    }

    @Override // j$.time.chrono.InterfaceC0030i
    public final LocalTime toLocalTime() {
        return ((C0026e) L()).toLocalTime();
    }

    public final String toString() {
        String c0026e = this.a.toString();
        ZoneOffset zoneOffset = this.b;
        String str = c0026e + zoneOffset.toString();
        ZoneId zoneId = this.c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal u(LocalDate localDate) {
        return G(a(), localDate.G(this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o v(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) ? ((ChronoField) temporalField).o() : ((C0026e) L()).v(temporalField) : temporalField.G(this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.a);
        objectOutput.writeObject(this.b);
        objectOutput.writeObject(this.c);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.v(this);
        }
        int i = AbstractC0029h.a[((ChronoField) temporalField).ordinal()];
        return i != 1 ? i != 2 ? ((C0026e) L()).y(temporalField) : i().getTotalSeconds() : Y();
    }
}
