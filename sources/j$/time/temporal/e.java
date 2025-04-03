package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.chrono.Chronology;
import j$.time.chrono.r;
import j$.time.format.D;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
abstract class e implements TemporalField {
    public static final e DAY_OF_QUARTER;
    public static final e QUARTER_OF_YEAR;
    public static final e WEEK_BASED_YEAR;
    public static final e WEEK_OF_WEEK_BASED_YEAR;
    private static final int[] a;
    private static final /* synthetic */ e[] b;

    static {
        e eVar = new e() { // from class: j$.time.temporal.a
            @Override // j$.time.temporal.TemporalField
            public final Temporal D(Temporal temporal, long j) {
                long v = v(temporal);
                o().b(j, this);
                ChronoField chronoField = ChronoField.DAY_OF_YEAR;
                return temporal.c((j - v) + temporal.y(chronoField), chronoField);
            }

            @Override // j$.time.temporal.TemporalField
            public final o G(TemporalAccessor temporalAccessor) {
                if (!y(temporalAccessor)) {
                    throw new n("Unsupported field: DayOfQuarter");
                }
                long y = temporalAccessor.y(e.QUARTER_OF_YEAR);
                if (y == 1) {
                    return r.e.V(temporalAccessor.y(ChronoField.YEAR)) ? o.j(1L, 91L) : o.j(1L, 90L);
                }
                return y == 2 ? o.j(1L, 91L) : (y == 3 || y == 4) ? o.j(1L, 92L) : o();
            }

            @Override // j$.time.temporal.TemporalField
            public final o o() {
                return o.k(1L, 90L, 92L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }

            @Override // j$.time.temporal.e, j$.time.temporal.TemporalField
            public final TemporalAccessor u(HashMap hashMap, TemporalAccessor temporalAccessor, D d) {
                LocalDate localDate;
                long j;
                ChronoField chronoField = ChronoField.YEAR;
                Long l = (Long) hashMap.get(chronoField);
                TemporalField temporalField = e.QUARTER_OF_YEAR;
                Long l2 = (Long) hashMap.get(temporalField);
                if (l == null || l2 == null) {
                    return null;
                }
                int a0 = chronoField.a0(l.longValue());
                long longValue = ((Long) hashMap.get(e.DAY_OF_QUARTER)).longValue();
                TemporalField temporalField2 = g.a;
                if (!Chronology.CC.a(temporalAccessor).equals(r.e)) {
                    throw new DateTimeException("Resolve requires IsoChronology");
                }
                if (d == D.LENIENT) {
                    localDate = LocalDate.of(a0, 1, 1).plusMonths(j$.time.b.d(j$.time.b.e(l2.longValue(), 1L), 3));
                    j = j$.time.b.e(longValue, 1L);
                } else {
                    LocalDate of = LocalDate.of(a0, ((temporalField.o().a(l2.longValue(), temporalField) - 1) * 3) + 1, 1);
                    if (longValue < 1 || longValue > 90) {
                        if (d == D.STRICT) {
                            G(of).b(longValue, this);
                        } else {
                            o().b(longValue, this);
                        }
                    }
                    localDate = of;
                    j = longValue - 1;
                }
                hashMap.remove(this);
                hashMap.remove(chronoField);
                hashMap.remove(temporalField);
                return localDate.plusDays(j);
            }

            @Override // j$.time.temporal.TemporalField
            public final long v(TemporalAccessor temporalAccessor) {
                int[] iArr;
                if (!y(temporalAccessor)) {
                    throw new n("Unsupported field: DayOfQuarter");
                }
                int i = temporalAccessor.get(ChronoField.DAY_OF_YEAR);
                int i2 = temporalAccessor.get(ChronoField.MONTH_OF_YEAR);
                long y = temporalAccessor.y(ChronoField.YEAR);
                iArr = e.a;
                return i - iArr[((i2 - 1) / 3) + (r.e.V(y) ? 4 : 0)];
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean y(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.f(ChronoField.DAY_OF_YEAR) || !temporalAccessor.f(ChronoField.MONTH_OF_YEAR) || !temporalAccessor.f(ChronoField.YEAR)) {
                    return false;
                }
                TemporalField temporalField = g.a;
                return Chronology.CC.a(temporalAccessor).equals(r.e);
            }
        };
        DAY_OF_QUARTER = eVar;
        e eVar2 = new e() { // from class: j$.time.temporal.b
            @Override // j$.time.temporal.TemporalField
            public final Temporal D(Temporal temporal, long j) {
                long v = v(temporal);
                o().b(j, this);
                ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
                return temporal.c(((j - v) * 3) + temporal.y(chronoField), chronoField);
            }

            @Override // j$.time.temporal.TemporalField
            public final o G(TemporalAccessor temporalAccessor) {
                if (y(temporalAccessor)) {
                    return o();
                }
                throw new n("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final o o() {
                return o.j(1L, 4L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }

            @Override // j$.time.temporal.TemporalField
            public final long v(TemporalAccessor temporalAccessor) {
                if (y(temporalAccessor)) {
                    return (temporalAccessor.y(ChronoField.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new n("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean y(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.f(ChronoField.MONTH_OF_YEAR)) {
                    return false;
                }
                TemporalField temporalField = g.a;
                return Chronology.CC.a(temporalAccessor).equals(r.e);
            }
        };
        QUARTER_OF_YEAR = eVar2;
        e eVar3 = new e() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.TemporalField
            public final Temporal D(Temporal temporal, long j) {
                o().b(j, this);
                return temporal.d(j$.time.b.e(j, v(temporal)), ChronoUnit.WEEKS);
            }

            @Override // j$.time.temporal.TemporalField
            public final o G(TemporalAccessor temporalAccessor) {
                if (y(temporalAccessor)) {
                    return e.e0(LocalDate.b0(temporalAccessor));
                }
                throw new n("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final o o() {
                return o.k(1L, 52L, 53L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }

            @Override // j$.time.temporal.e, j$.time.temporal.TemporalField
            public final TemporalAccessor u(HashMap hashMap, TemporalAccessor temporalAccessor, D d) {
                LocalDate c;
                long j;
                long j2;
                TemporalField temporalField = e.WEEK_BASED_YEAR;
                Long l = (Long) hashMap.get(temporalField);
                ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                Long l2 = (Long) hashMap.get(chronoField);
                if (l == null || l2 == null) {
                    return null;
                }
                int a2 = temporalField.o().a(l.longValue(), temporalField);
                long longValue = ((Long) hashMap.get(e.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                TemporalField temporalField2 = g.a;
                if (!Chronology.CC.a(temporalAccessor).equals(r.e)) {
                    throw new DateTimeException("Resolve requires IsoChronology");
                }
                LocalDate of = LocalDate.of(a2, 1, 4);
                if (d == D.LENIENT) {
                    long longValue2 = l2.longValue();
                    if (longValue2 > 7) {
                        long j3 = longValue2 - 1;
                        j = 1;
                        of = of.n0(j3 / 7);
                        j2 = j3 % 7;
                    } else {
                        j = 1;
                        if (longValue2 < 1) {
                            of = of.n0(j$.time.b.e(longValue2, 7L) / 7);
                            j2 = (longValue2 + 6) % 7;
                        }
                        c = of.n0(j$.time.b.e(longValue, j)).c(longValue2, chronoField);
                    }
                    longValue2 = j2 + j;
                    c = of.n0(j$.time.b.e(longValue, j)).c(longValue2, chronoField);
                } else {
                    int a0 = chronoField.a0(l2.longValue());
                    if (longValue < 1 || longValue > 52) {
                        if (d == D.STRICT) {
                            e.e0(of).b(longValue, this);
                        } else {
                            o().b(longValue, this);
                        }
                    }
                    c = of.n0(longValue - 1).c(a0, chronoField);
                }
                hashMap.remove(this);
                hashMap.remove(temporalField);
                hashMap.remove(chronoField);
                return c;
            }

            @Override // j$.time.temporal.TemporalField
            public final long v(TemporalAccessor temporalAccessor) {
                if (y(temporalAccessor)) {
                    return e.b0(LocalDate.b0(temporalAccessor));
                }
                throw new n("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean y(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.f(ChronoField.EPOCH_DAY)) {
                    return false;
                }
                TemporalField temporalField = g.a;
                return Chronology.CC.a(temporalAccessor).equals(r.e);
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = eVar3;
        e eVar4 = new e() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.TemporalField
            public final Temporal D(Temporal temporal, long j) {
                int g0;
                if (!y(temporal)) {
                    throw new n("Unsupported field: WeekBasedYear");
                }
                int a2 = ChronoField.YEAR.o().a(j, e.WEEK_BASED_YEAR);
                LocalDate b0 = LocalDate.b0(temporal);
                int i = b0.get(ChronoField.DAY_OF_WEEK);
                int b02 = e.b0(b0);
                if (b02 == 53) {
                    g0 = e.g0(a2);
                    if (g0 == 52) {
                        b02 = 52;
                    }
                }
                return temporal.u(LocalDate.of(a2, 1, 4).plusDays(((b02 - 1) * 7) + (i - r6.get(r0))));
            }

            @Override // j$.time.temporal.TemporalField
            public final o G(TemporalAccessor temporalAccessor) {
                if (y(temporalAccessor)) {
                    return o();
                }
                throw new n("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final o o() {
                return ChronoField.YEAR.o();
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }

            @Override // j$.time.temporal.TemporalField
            public final long v(TemporalAccessor temporalAccessor) {
                int f0;
                if (!y(temporalAccessor)) {
                    throw new n("Unsupported field: WeekBasedYear");
                }
                f0 = e.f0(LocalDate.b0(temporalAccessor));
                return f0;
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean y(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.f(ChronoField.EPOCH_DAY)) {
                    return false;
                }
                TemporalField temporalField = g.a;
                return Chronology.CC.a(temporalAccessor).equals(r.e);
            }
        };
        WEEK_BASED_YEAR = eVar4;
        b = new e[]{eVar, eVar2, eVar3, eVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    static int b0(LocalDate localDate) {
        int ordinal = localDate.getDayOfWeek().ordinal();
        int d0 = localDate.d0() - 1;
        int i = (3 - ordinal) + d0;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (d0 < i3) {
            return (int) o.j(1L, g0(f0(localDate.t0(180).o0(-1L)))).d();
        }
        int i4 = ((d0 - i3) / 7) + 1;
        if (i4 != 53 || i3 == -3 || (i3 == -2 && localDate.N())) {
            return i4;
        }
        return 1;
    }

    static o e0(LocalDate localDate) {
        return o.j(1L, g0(f0(localDate)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int f0(LocalDate localDate) {
        int year = localDate.getYear();
        int d0 = localDate.d0();
        if (d0 <= 3) {
            return d0 - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
        }
        if (d0 >= 363) {
            return ((d0 - 363) - (localDate.N() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int g0(int i) {
        LocalDate of = LocalDate.of(i, 1, 1);
        if (of.getDayOfWeek() != DayOfWeek.THURSDAY) {
            return (of.getDayOfWeek() == DayOfWeek.WEDNESDAY && of.N()) ? 53 : 52;
        }
        return 53;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) b.clone();
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean Z() {
        return true;
    }

    public /* synthetic */ TemporalAccessor u(HashMap hashMap, TemporalAccessor temporalAccessor, D d) {
        return null;
    }
}
