package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.format.D;
import java.util.HashMap;

/* loaded from: classes9.dex */
final class p implements TemporalField {
    private static final o f = o.j(1, 7);
    private static final o g = o.k(0, 4, 6);
    private static final o h = o.k(0, 52, 54);
    private static final o i = o.k(1, 52, 53);
    private final String a;
    private final WeekFields b;
    private final Enum c;
    private final Enum d;
    private final o e;

    /* JADX WARN: Multi-variable type inference failed */
    private p(String str, WeekFields weekFields, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, o oVar) {
        this.a = str;
        this.b = weekFields;
        this.c = (Enum) temporalUnit;
        this.d = (Enum) temporalUnit2;
        this.e = oVar;
    }

    private static int a(int i2, int i3) {
        return ((i3 - 1) + (i2 + 7)) / 7;
    }

    private int b(TemporalAccessor temporalAccessor) {
        return j.h(temporalAccessor.get(ChronoField.DAY_OF_WEEK) - this.b.getFirstDayOfWeek().getValue()) + 1;
    }

    private int c(TemporalAccessor temporalAccessor) {
        int b = b(temporalAccessor);
        int i2 = temporalAccessor.get(ChronoField.YEAR);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int i3 = temporalAccessor.get(chronoField);
        int l = l(i3, b);
        int a = a(l, i3);
        if (a == 0) {
            return i2 - 1;
        }
        return a >= a(l, this.b.e() + ((int) temporalAccessor.v(chronoField).d())) ? i2 + 1 : i2;
    }

    private int d(TemporalAccessor temporalAccessor) {
        int b = b(temporalAccessor);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int i2 = temporalAccessor.get(chronoField);
        int l = l(i2, b);
        int a = a(l, i2);
        if (a == 0) {
            return d(Chronology.CC.a(temporalAccessor).r(temporalAccessor).o(i2, ChronoUnit.DAYS));
        }
        if (a <= 50) {
            return a;
        }
        int a2 = a(l, this.b.e() + ((int) temporalAccessor.v(chronoField).d()));
        return a >= a2 ? (a - a2) + 1 : a;
    }

    static p e(WeekFields weekFields) {
        return new p("DayOfWeek", weekFields, ChronoUnit.DAYS, ChronoUnit.WEEKS, f);
    }

    private ChronoLocalDate f(Chronology chronology, int i2, int i3, int i4) {
        ChronoLocalDate M = chronology.M(i2, 1, 1);
        int l = l(1, b(M));
        int i5 = i4 - 1;
        return M.d(((Math.min(i3, a(l, this.b.e() + M.U()) - 1) - 1) * 7) + i5 + (-l), (TemporalUnit) ChronoUnit.DAYS);
    }

    static p g(WeekFields weekFields) {
        return new p("WeekBasedYear", weekFields, g.d, ChronoUnit.FOREVER, ChronoField.YEAR.o());
    }

    static p h(WeekFields weekFields) {
        return new p("WeekOfMonth", weekFields, ChronoUnit.WEEKS, ChronoUnit.MONTHS, g);
    }

    static p i(WeekFields weekFields) {
        return new p("WeekOfWeekBasedYear", weekFields, ChronoUnit.WEEKS, g.d, i);
    }

    private o j(TemporalAccessor temporalAccessor, ChronoField chronoField) {
        int l = l(temporalAccessor.get(chronoField), b(temporalAccessor));
        o v = temporalAccessor.v(chronoField);
        return o.j(a(l, (int) v.e()), a(l, (int) v.d()));
    }

    private o k(TemporalAccessor temporalAccessor) {
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        if (!temporalAccessor.f(chronoField)) {
            return h;
        }
        int b = b(temporalAccessor);
        int i2 = temporalAccessor.get(chronoField);
        int l = l(i2, b);
        int a = a(l, i2);
        if (a == 0) {
            return k(Chronology.CC.a(temporalAccessor).r(temporalAccessor).o(i2 + 7, ChronoUnit.DAYS));
        }
        return a >= a(l, this.b.e() + ((int) temporalAccessor.v(chronoField).d())) ? k(Chronology.CC.a(temporalAccessor).r(temporalAccessor).d((r0 - i2) + 8, (TemporalUnit) ChronoUnit.DAYS)) : o.j(1L, r1 - 1);
    }

    private int l(int i2, int i3) {
        int h2 = j.h(i2 - i3);
        return h2 + 1 > this.b.e() ? 7 - h2 : -h2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.time.temporal.TemporalUnit, java.lang.Enum] */
    @Override // j$.time.temporal.TemporalField
    public final Temporal D(Temporal temporal, long j) {
        TemporalField temporalField;
        TemporalField temporalField2;
        if (this.e.a(j, this) == temporal.get(this)) {
            return temporal;
        }
        if (this.d != ChronoUnit.FOREVER) {
            return temporal.d(r0 - r1, this.c);
        }
        WeekFields weekFields = this.b;
        temporalField = weekFields.c;
        int i2 = temporal.get(temporalField);
        temporalField2 = weekFields.e;
        return f(Chronology.CC.a(temporal), (int) j, temporal.get(temporalField2), i2);
    }

    @Override // j$.time.temporal.TemporalField
    public final o G(TemporalAccessor temporalAccessor) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        Enum r1 = this.d;
        if (r1 == chronoUnit) {
            return this.e;
        }
        if (r1 == ChronoUnit.MONTHS) {
            return j(temporalAccessor, ChronoField.DAY_OF_MONTH);
        }
        if (r1 == ChronoUnit.YEARS) {
            return j(temporalAccessor, ChronoField.DAY_OF_YEAR);
        }
        if (r1 == WeekFields.h) {
            return k(temporalAccessor);
        }
        if (r1 == ChronoUnit.FOREVER) {
            return ChronoField.YEAR.o();
        }
        throw new IllegalStateException(j$.time.d.d("unreachable, rangeUnit: ", String.valueOf(r1), ", this: ", String.valueOf(this)));
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean Z() {
        return true;
    }

    @Override // j$.time.temporal.TemporalField
    public final o o() {
        return this.e;
    }

    public final String toString() {
        return this.a + "[" + this.b.toString() + "]";
    }

    @Override // j$.time.temporal.TemporalField
    public final TemporalAccessor u(HashMap hashMap, TemporalAccessor temporalAccessor, D d) {
        Object obj;
        Object obj2;
        TemporalField temporalField;
        Object obj3;
        TemporalField temporalField2;
        TemporalField temporalField3;
        Object obj4;
        TemporalField temporalField4;
        ChronoLocalDate chronoLocalDate;
        Object obj5;
        Object obj6;
        Object obj7;
        ChronoLocalDate chronoLocalDate2;
        ChronoField chronoField;
        ChronoLocalDate chronoLocalDate3;
        long longValue = ((Long) hashMap.get(this)).longValue();
        int b = j$.time.b.b(longValue);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        Enum r7 = this.d;
        o oVar = this.e;
        WeekFields weekFields = this.b;
        if (r7 == chronoUnit) {
            long h2 = j.h((oVar.a(longValue, this) - 1) + (weekFields.getFirstDayOfWeek().getValue() - 1)) + 1;
            hashMap.remove(this);
            hashMap.put(ChronoField.DAY_OF_WEEK, Long.valueOf(h2));
            return null;
        }
        ChronoField chronoField2 = ChronoField.DAY_OF_WEEK;
        if (!hashMap.containsKey(chronoField2)) {
            return null;
        }
        int h3 = j.h(chronoField2.a0(((Long) hashMap.get(chronoField2)).longValue()) - weekFields.getFirstDayOfWeek().getValue()) + 1;
        Chronology a = Chronology.CC.a(temporalAccessor);
        ChronoField chronoField3 = ChronoField.YEAR;
        if (!hashMap.containsKey(chronoField3)) {
            if (r7 != WeekFields.h && r7 != ChronoUnit.FOREVER) {
                return null;
            }
            obj = weekFields.f;
            if (!hashMap.containsKey(obj)) {
                return null;
            }
            obj2 = weekFields.e;
            if (!hashMap.containsKey(obj2)) {
                return null;
            }
            temporalField = weekFields.f;
            o oVar2 = ((p) temporalField).e;
            obj3 = weekFields.f;
            long longValue2 = ((Long) hashMap.get(obj3)).longValue();
            temporalField2 = weekFields.f;
            int a2 = oVar2.a(longValue2, temporalField2);
            if (d == D.LENIENT) {
                ChronoLocalDate f2 = f(a, a2, 1, h3);
                obj7 = weekFields.e;
                chronoLocalDate = f2.d(j$.time.b.e(((Long) hashMap.get(obj7)).longValue(), 1L), (TemporalUnit) chronoUnit);
            } else {
                temporalField3 = weekFields.e;
                o oVar3 = ((p) temporalField3).e;
                obj4 = weekFields.e;
                long longValue3 = ((Long) hashMap.get(obj4)).longValue();
                temporalField4 = weekFields.e;
                ChronoLocalDate f3 = f(a, a2, oVar3.a(longValue3, temporalField4), h3);
                if (d == D.STRICT && c(f3) != a2) {
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different week-based-year");
                }
                chronoLocalDate = f3;
            }
            hashMap.remove(this);
            obj5 = weekFields.f;
            hashMap.remove(obj5);
            obj6 = weekFields.e;
            hashMap.remove(obj6);
            hashMap.remove(chronoField2);
            return chronoLocalDate;
        }
        int a0 = chronoField3.a0(((Long) hashMap.get(chronoField3)).longValue());
        ChronoUnit chronoUnit2 = ChronoUnit.MONTHS;
        if (r7 == chronoUnit2) {
            ChronoField chronoField4 = ChronoField.MONTH_OF_YEAR;
            if (hashMap.containsKey(chronoField4)) {
                long longValue4 = ((Long) hashMap.get(chronoField4)).longValue();
                long j = b;
                if (d == D.LENIENT) {
                    ChronoLocalDate d2 = a.M(a0, 1, 1).d(j$.time.b.e(longValue4, 1L), (TemporalUnit) chronoUnit2);
                    int b2 = b(d2);
                    int i2 = d2.get(ChronoField.DAY_OF_MONTH);
                    chronoLocalDate3 = d2.d(j$.time.b.c(j$.time.b.d(j$.time.b.e(j, a(l(i2, b2), i2)), 7), h3 - b(d2)), (TemporalUnit) ChronoUnit.DAYS);
                    chronoField = chronoField4;
                } else {
                    chronoField = chronoField4;
                    ChronoLocalDate M = a.M(a0, chronoField.a0(longValue4), 1);
                    long a3 = oVar.a(j, this);
                    int b3 = b(M);
                    int i3 = M.get(ChronoField.DAY_OF_MONTH);
                    ChronoLocalDate d3 = M.d((((int) (a3 - a(l(i3, b3), i3))) * 7) + (h3 - b(M)), (TemporalUnit) ChronoUnit.DAYS);
                    if (d == D.STRICT && d3.y(chronoField) != longValue4) {
                        throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                    }
                    chronoLocalDate3 = d3;
                }
                hashMap.remove(this);
                hashMap.remove(chronoField3);
                hashMap.remove(chronoField);
                hashMap.remove(chronoField2);
                return chronoLocalDate3;
            }
        }
        if (r7 != ChronoUnit.YEARS) {
            return null;
        }
        long j2 = b;
        ChronoLocalDate M2 = a.M(a0, 1, 1);
        if (d == D.LENIENT) {
            int b4 = b(M2);
            int i4 = M2.get(ChronoField.DAY_OF_YEAR);
            chronoLocalDate2 = M2.d(j$.time.b.c(j$.time.b.d(j$.time.b.e(j2, a(l(i4, b4), i4)), 7), h3 - b(M2)), (TemporalUnit) ChronoUnit.DAYS);
        } else {
            long a4 = oVar.a(j2, this);
            int b5 = b(M2);
            int i5 = M2.get(ChronoField.DAY_OF_YEAR);
            ChronoLocalDate d4 = M2.d((((int) (a4 - a(l(i5, b5), i5))) * 7) + (h3 - b(M2)), (TemporalUnit) ChronoUnit.DAYS);
            if (d == D.STRICT && d4.y(chronoField3) != a0) {
                throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
            }
            chronoLocalDate2 = d4;
        }
        hashMap.remove(this);
        hashMap.remove(chronoField3);
        hashMap.remove(chronoField2);
        return chronoLocalDate2;
    }

    @Override // j$.time.temporal.TemporalField
    public final long v(TemporalAccessor temporalAccessor) {
        int c;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        Enum r1 = this.d;
        if (r1 == chronoUnit) {
            c = b(temporalAccessor);
        } else if (r1 == ChronoUnit.MONTHS) {
            int b = b(temporalAccessor);
            int i2 = temporalAccessor.get(ChronoField.DAY_OF_MONTH);
            c = a(l(i2, b), i2);
        } else if (r1 == ChronoUnit.YEARS) {
            int b2 = b(temporalAccessor);
            int i3 = temporalAccessor.get(ChronoField.DAY_OF_YEAR);
            c = a(l(i3, b2), i3);
        } else if (r1 == WeekFields.h) {
            c = d(temporalAccessor);
        } else {
            if (r1 != ChronoUnit.FOREVER) {
                throw new IllegalStateException(j$.time.d.d("unreachable, rangeUnit: ", String.valueOf(r1), ", this: ", String.valueOf(this)));
            }
            c = c(temporalAccessor);
        }
        return c;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean y(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.f(ChronoField.DAY_OF_WEEK)) {
            return false;
        }
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        Enum r1 = this.d;
        if (r1 == chronoUnit) {
            return true;
        }
        if (r1 == ChronoUnit.MONTHS) {
            return temporalAccessor.f(ChronoField.DAY_OF_MONTH);
        }
        if (r1 == ChronoUnit.YEARS) {
            return temporalAccessor.f(ChronoField.DAY_OF_YEAR);
        }
        if (r1 == WeekFields.h) {
            return temporalAccessor.f(ChronoField.DAY_OF_YEAR);
        }
        if (r1 == ChronoUnit.FOREVER) {
            return temporalAccessor.f(ChronoField.YEAR);
        }
        return false;
    }
}
