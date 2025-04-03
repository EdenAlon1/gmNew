package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class u extends AbstractC0022a implements Serializable {
    public static final u e = new u();
    private static final long serialVersionUID = 459996390165777884L;

    private u() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate A(int i, int i2) {
        return new w(LocalDate.l0(i, i2));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate M(int i, int i2, int i3) {
        return new w(LocalDate.of(i, i2, i3));
    }

    @Override // j$.time.chrono.AbstractC0022a, j$.time.chrono.Chronology
    public final ChronoLocalDate P(Map map, j$.time.format.D d) {
        return (w) super.P(map, d);
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.o Q(ChronoField chronoField) {
        switch (t.a[chronoField.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(chronoField)));
            case 5:
                return j$.time.temporal.o.k(1L, x.s(), 999999999 - x.h().m().getYear());
            case 6:
                return j$.time.temporal.o.k(1L, x.r(), ChronoField.DAY_OF_YEAR.o().d());
            case 7:
                return j$.time.temporal.o.j(w.d.getYear(), 999999999L);
            case 8:
                return j$.time.temporal.o.j(x.d.getValue(), x.h().getValue());
            default:
                return chronoField.o();
        }
    }

    @Override // j$.time.chrono.Chronology
    public final InterfaceC0030i R(Instant instant, ZoneId zoneId) {
        return k.a0(this, instant, zoneId);
    }

    @Override // j$.time.chrono.Chronology
    public final List T() {
        return j$.desugar.sun.nio.fs.g.b(x.t());
    }

    @Override // j$.time.chrono.Chronology
    public final boolean V(long j) {
        return r.e.V(j);
    }

    @Override // j$.time.chrono.Chronology
    public final l W(int i) {
        return x.p(i);
    }

    @Override // j$.time.chrono.AbstractC0022a
    final ChronoLocalDate c0(Map map, j$.time.format.D d) {
        w i0;
        int i = 0;
        ChronoField chronoField = ChronoField.ERA;
        Long l = (Long) map.get(chronoField);
        x p = l != null ? x.p(Q(chronoField).a(l.longValue(), chronoField)) : null;
        ChronoField chronoField2 = ChronoField.YEAR_OF_ERA;
        Long l2 = (Long) map.get(chronoField2);
        int a = l2 != null ? Q(chronoField2).a(l2.longValue(), chronoField2) : 0;
        if (p == null && l2 != null && !map.containsKey(ChronoField.YEAR) && d != j$.time.format.D.STRICT) {
            p = x.t()[x.t().length - 1];
        }
        if (l2 != null && p != null) {
            ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
            if (map.containsKey(chronoField3)) {
                ChronoField chronoField4 = ChronoField.DAY_OF_MONTH;
                if (map.containsKey(chronoField4)) {
                    map.remove(chronoField);
                    map.remove(chronoField2);
                    if (d == j$.time.format.D.LENIENT) {
                        return new w(LocalDate.of((p.m().getYear() + a) - 1, 1, 1)).f0(j$.time.b.e(((Long) map.remove(chronoField3)).longValue(), 1L), ChronoUnit.MONTHS).f0(j$.time.b.e(((Long) map.remove(chronoField4)).longValue(), 1L), ChronoUnit.DAYS);
                    }
                    int a2 = Q(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                    int a3 = Q(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4);
                    if (d != j$.time.format.D.SMART) {
                        LocalDate localDate = w.d;
                        LocalDate of = LocalDate.of((p.m().getYear() + a) - 1, a2, a3);
                        if (of.f0(p.m()) || p != x.g(of)) {
                            throw new DateTimeException("year, month, and day not valid for Era");
                        }
                        return new w(p, a, of);
                    }
                    if (a < 1) {
                        throw new DateTimeException("Invalid YearOfEra: " + a);
                    }
                    int year = (p.m().getYear() + a) - 1;
                    try {
                        i0 = new w(LocalDate.of(year, a2, a3));
                    } catch (DateTimeException unused) {
                        i0 = new w(LocalDate.of(year, a2, 1)).i0(new j$.time.temporal.l(i));
                    }
                    if (i0.e0() == p || j$.time.temporal.j.a(i0, ChronoField.YEAR_OF_ERA) <= 1 || a <= 1) {
                        return i0;
                    }
                    throw new DateTimeException("Invalid YearOfEra for Era: " + String.valueOf(p) + " " + a);
                }
            }
            ChronoField chronoField5 = ChronoField.DAY_OF_YEAR;
            if (map.containsKey(chronoField5)) {
                map.remove(chronoField);
                map.remove(chronoField2);
                if (d == j$.time.format.D.LENIENT) {
                    return new w(LocalDate.l0((p.m().getYear() + a) - 1, 1)).f0(j$.time.b.e(((Long) map.remove(chronoField5)).longValue(), 1L), ChronoUnit.DAYS);
                }
                int a4 = Q(chronoField5).a(((Long) map.remove(chronoField5)).longValue(), chronoField5);
                LocalDate localDate2 = w.d;
                LocalDate l0 = a == 1 ? LocalDate.l0(p.m().getYear(), (p.m().d0() + a4) - 1) : LocalDate.l0((p.m().getYear() + a) - 1, a4);
                if (l0.f0(p.m()) || p != x.g(l0)) {
                    throw new DateTimeException("Invalid parameters");
                }
                return new w(p, a, l0);
            }
        }
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final int h(l lVar, int i) {
        if (!(lVar instanceof x)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        x xVar = (x) lVar;
        int year = (xVar.m().getYear() + i) - 1;
        if (i != 1 && (year < -999999999 || year > 999999999 || year < xVar.m().getYear() || lVar != x.g(LocalDate.of(year, 1, 1)))) {
            throw new DateTimeException("Invalid yearOfEra value");
        }
        return year;
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate m(long j) {
        return new w(LocalDate.k0(j));
    }

    @Override // j$.time.chrono.Chronology
    public final String n() {
        return "Japanese";
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate r(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof w ? (w) temporalAccessor : new w(LocalDate.b0(temporalAccessor));
    }

    @Override // j$.time.chrono.AbstractC0022a
    public final ChronoLocalDate u() {
        return new w(LocalDate.b0(LocalDate.i0(j$.time.b.g())));
    }

    Object writeReplace() {
        return new D((byte) 1, this);
    }

    @Override // j$.time.chrono.Chronology
    public final String x() {
        return "japanese";
    }
}
