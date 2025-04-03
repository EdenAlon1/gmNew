package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class F extends AbstractC0022a implements Serializable {
    public static final F e = new F();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap.put("en", new String[]{"BB", "BE"});
        hashMap.put("th", new String[]{"BB", "BE"});
        hashMap2.put("en", new String[]{"B.B.", "B.E."});
        hashMap2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        hashMap3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        hashMap3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private F() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate A(int i, int i2) {
        return new H(LocalDate.l0(i - 543, i2));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate M(int i, int i2, int i3) {
        return new H(LocalDate.of(i - 543, i2, i3));
    }

    @Override // j$.time.chrono.AbstractC0022a, j$.time.chrono.Chronology
    public final ChronoLocalDate P(Map map, j$.time.format.D d) {
        return (H) super.P(map, d);
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.o Q(ChronoField chronoField) {
        int i = E.a[chronoField.ordinal()];
        if (i == 1) {
            j$.time.temporal.o o = ChronoField.PROLEPTIC_MONTH.o();
            return j$.time.temporal.o.j(o.e() + 6516, o.d() + 6516);
        }
        if (i == 2) {
            j$.time.temporal.o o2 = ChronoField.YEAR.o();
            return j$.time.temporal.o.k(1L, (-(o2.e() + 543)) + 1, o2.d() + 543);
        }
        if (i != 3) {
            return chronoField.o();
        }
        j$.time.temporal.o o3 = ChronoField.YEAR.o();
        return j$.time.temporal.o.j(o3.e() + 543, o3.d() + 543);
    }

    @Override // j$.time.chrono.Chronology
    public final InterfaceC0030i R(Instant instant, ZoneId zoneId) {
        return k.a0(this, instant, zoneId);
    }

    @Override // j$.time.chrono.Chronology
    public final List T() {
        return j$.desugar.sun.nio.fs.g.b(I.values());
    }

    @Override // j$.time.chrono.Chronology
    public final boolean V(long j) {
        return r.e.V(j - 543);
    }

    @Override // j$.time.chrono.Chronology
    public final l W(int i) {
        if (i == 0) {
            return I.BEFORE_BE;
        }
        if (i == 1) {
            return I.BE;
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    @Override // j$.time.chrono.Chronology
    public final int h(l lVar, int i) {
        if (lVar instanceof I) {
            return lVar == I.BE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate m(long j) {
        return new H(LocalDate.k0(j));
    }

    @Override // j$.time.chrono.Chronology
    public final String n() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate r(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof H ? (H) temporalAccessor : new H(LocalDate.b0(temporalAccessor));
    }

    @Override // j$.time.chrono.AbstractC0022a
    public final ChronoLocalDate u() {
        return new H(LocalDate.b0(LocalDate.i0(j$.time.b.g())));
    }

    Object writeReplace() {
        return new D((byte) 1, this);
    }

    @Override // j$.time.chrono.Chronology
    public final String x() {
        return "buddhist";
    }
}
