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
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class z extends AbstractC0022a implements Serializable {
    public static final z e = new z();
    private static final long serialVersionUID = 1039765215346859963L;

    private z() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate A(int i, int i2) {
        return new B(LocalDate.l0(i + 1911, i2));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate M(int i, int i2, int i3) {
        return new B(LocalDate.of(i + 1911, i2, i3));
    }

    @Override // j$.time.chrono.AbstractC0022a, j$.time.chrono.Chronology
    public final ChronoLocalDate P(Map map, j$.time.format.D d) {
        return (B) super.P(map, d);
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.o Q(ChronoField chronoField) {
        int i = y.a[chronoField.ordinal()];
        if (i == 1) {
            j$.time.temporal.o o = ChronoField.PROLEPTIC_MONTH.o();
            return j$.time.temporal.o.j(o.e() - 22932, o.d() - 22932);
        }
        if (i == 2) {
            j$.time.temporal.o o2 = ChronoField.YEAR.o();
            return j$.time.temporal.o.k(1L, o2.d() - 1911, (-o2.e()) + 1912);
        }
        if (i != 3) {
            return chronoField.o();
        }
        j$.time.temporal.o o3 = ChronoField.YEAR.o();
        return j$.time.temporal.o.j(o3.e() - 1911, o3.d() - 1911);
    }

    @Override // j$.time.chrono.Chronology
    public final InterfaceC0030i R(Instant instant, ZoneId zoneId) {
        return k.a0(this, instant, zoneId);
    }

    @Override // j$.time.chrono.Chronology
    public final List T() {
        return j$.desugar.sun.nio.fs.g.b(C.values());
    }

    @Override // j$.time.chrono.Chronology
    public final boolean V(long j) {
        return r.e.V(j + 1911);
    }

    @Override // j$.time.chrono.Chronology
    public final l W(int i) {
        if (i == 0) {
            return C.BEFORE_ROC;
        }
        if (i == 1) {
            return C.ROC;
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    @Override // j$.time.chrono.Chronology
    public final int h(l lVar, int i) {
        if (lVar instanceof C) {
            return lVar == C.ROC ? i : 1 - i;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate m(long j) {
        return new B(LocalDate.k0(j));
    }

    @Override // j$.time.chrono.Chronology
    public final String n() {
        return "Minguo";
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate r(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof B ? (B) temporalAccessor : new B(LocalDate.b0(temporalAccessor));
    }

    @Override // j$.time.chrono.AbstractC0022a
    public final ChronoLocalDate u() {
        return new B(LocalDate.b0(LocalDate.i0(j$.time.b.g())));
    }

    Object writeReplace() {
        return new D((byte) 1, this);
    }

    @Override // j$.time.chrono.Chronology
    public final String x() {
        return "roc";
    }
}
