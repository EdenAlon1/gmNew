package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0022a implements Chronology {
    private static final ConcurrentHashMap a = new ConcurrentHashMap();
    private static final ConcurrentHashMap b = new ConcurrentHashMap();
    private static final Locale c = new Locale("ja", "JP", "JP");
    public static final /* synthetic */ int d = 0;

    protected AbstractC0022a() {
    }

    static Chronology D(Locale locale) {
        Objects.a(locale, "locale");
        String unicodeLocaleType = locale.getUnicodeLocaleType("ca");
        if (unicodeLocaleType == null) {
            unicodeLocaleType = locale.equals(c) ? "japanese" : null;
        }
        if (unicodeLocaleType == null || "iso".equals(unicodeLocaleType) || "iso8601".equals(unicodeLocaleType)) {
            return r.e;
        }
        do {
            Chronology chronology = (Chronology) b.get(unicodeLocaleType);
            if (chronology != null) {
                return chronology;
            }
        } while (v());
        Iterator it = ServiceLoader.load(Chronology.class).iterator();
        while (it.hasNext()) {
            Chronology chronology2 = (Chronology) it.next();
            if (unicodeLocaleType.equals(chronology2.x())) {
                return chronology2;
            }
        }
        throw new DateTimeException("Unknown calendar system: ".concat(unicodeLocaleType));
    }

    static Chronology G(AbstractC0022a abstractC0022a, String str) {
        String x;
        Chronology chronology = (Chronology) a.putIfAbsent(str, abstractC0022a);
        if (chronology == null && (x = abstractC0022a.x()) != null) {
            b.putIfAbsent(x, abstractC0022a);
        }
        return chronology;
    }

    static ChronoLocalDate Z(ChronoLocalDate chronoLocalDate, long j, long j2, long j3) {
        long j4;
        ChronoLocalDate d2 = chronoLocalDate.d(j, (TemporalUnit) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        ChronoLocalDate d3 = d2.d(j2, (TemporalUnit) chronoUnit);
        if (j3 <= 7) {
            if (j3 < 1) {
                d3 = d3.d(j$.time.b.e(j3, 7L) / 7, (TemporalUnit) chronoUnit);
                j4 = (j3 + 6) % 7;
            }
            return d3.u(new j$.time.temporal.k(DayOfWeek.of((int) j3).getValue(), 1));
        }
        long j5 = j3 - 1;
        d3 = d3.d(j5 / 7, (TemporalUnit) chronoUnit);
        j4 = j5 % 7;
        j3 = j4 + 1;
        return d3.u(new j$.time.temporal.k(DayOfWeek.of((int) j3).getValue(), 1));
    }

    static void o(Map map, ChronoField chronoField, long j) {
        Long l = (Long) map.get(chronoField);
        if (l == null || l.longValue() == j) {
            map.put(chronoField, Long.valueOf(j));
            return;
        }
        throw new DateTimeException("Conflict found: " + String.valueOf(chronoField) + " " + l + " differs from " + String.valueOf(chronoField) + " " + j);
    }

    private static boolean v() {
        if (a.get("ISO") != null) {
            return false;
        }
        n nVar = n.n;
        G(nVar, nVar.n());
        u uVar = u.e;
        G(uVar, uVar.n());
        z zVar = z.e;
        G(zVar, zVar.n());
        F f = F.e;
        G(f, f.n());
        try {
            for (AbstractC0022a abstractC0022a : Arrays.asList(new AbstractC0022a[0])) {
                if (!abstractC0022a.n().equals("ISO")) {
                    G(abstractC0022a, abstractC0022a.n());
                }
            }
            r rVar = r.e;
            G(rVar, rVar.n());
            return true;
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    static Chronology y(String str) {
        Objects.a(str, "id");
        do {
            Chronology chronology = (Chronology) a.get(str);
            if (chronology == null) {
                chronology = (Chronology) b.get(str);
            }
            if (chronology != null) {
                return chronology;
            }
        } while (v());
        Iterator it = ServiceLoader.load(Chronology.class).iterator();
        while (it.hasNext()) {
            Chronology chronology2 = (Chronology) it.next();
            if (str.equals(chronology2.n()) || str.equals(chronology2.x())) {
                return chronology2;
            }
        }
        throw new DateTimeException("Unknown chronology: ".concat(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [j$.time.chrono.i] */
    @Override // j$.time.chrono.Chronology
    public InterfaceC0030i C(Temporal temporal) {
        try {
            ZoneId Z = ZoneId.Z(temporal);
            try {
                temporal = R(Instant.a0(temporal), Z);
                return temporal;
            } catch (DateTimeException unused) {
                return k.Z(Z, null, C0026e.Z(this, F(temporal)));
            }
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ChronoZonedDateTime from TemporalAccessor: ".concat(String.valueOf(temporal.getClass())), e);
        }
    }

    @Override // j$.time.chrono.Chronology
    public ChronoLocalDateTime F(Temporal temporal) {
        try {
            return r(temporal).B(LocalTime.b0(temporal));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: ".concat(String.valueOf(temporal.getClass())), e);
        }
    }

    @Override // j$.time.chrono.Chronology
    public ChronoLocalDate P(Map map, j$.time.format.D d2) {
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        if (map.containsKey(chronoField)) {
            return m(((Long) map.remove(chronoField)).longValue());
        }
        a0(map, d2);
        ChronoLocalDate c0 = c0(map, d2);
        if (c0 != null) {
            return c0;
        }
        ChronoField chronoField2 = ChronoField.YEAR;
        if (!map.containsKey(chronoField2)) {
            return null;
        }
        ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
        if (map.containsKey(chronoField3)) {
            if (map.containsKey(ChronoField.DAY_OF_MONTH)) {
                return b0(map, d2);
            }
            ChronoField chronoField4 = ChronoField.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(chronoField4)) {
                ChronoField chronoField5 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map.containsKey(chronoField5)) {
                    int a2 = Q(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                    if (d2 == j$.time.format.D.LENIENT) {
                        long e = j$.time.b.e(((Long) map.remove(chronoField3)).longValue(), 1L);
                        return M(a2, 1, 1).d(e, (TemporalUnit) ChronoUnit.MONTHS).d(j$.time.b.e(((Long) map.remove(chronoField4)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).d(j$.time.b.e(((Long) map.remove(chronoField5)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                    }
                    int a3 = Q(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                    int a4 = Q(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4);
                    ChronoLocalDate d3 = M(a2, a3, 1).d((Q(chronoField5).a(((Long) map.remove(chronoField5)).longValue(), chronoField5) - 1) + ((a4 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                    if (d2 != j$.time.format.D.STRICT || d3.get(chronoField3) == a3) {
                        return d3;
                    }
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                }
                ChronoField chronoField6 = ChronoField.DAY_OF_WEEK;
                if (map.containsKey(chronoField6)) {
                    int a5 = Q(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                    if (d2 == j$.time.format.D.LENIENT) {
                        return Z(M(a5, 1, 1), j$.time.b.e(((Long) map.remove(chronoField3)).longValue(), 1L), j$.time.b.e(((Long) map.remove(chronoField4)).longValue(), 1L), j$.time.b.e(((Long) map.remove(chronoField6)).longValue(), 1L));
                    }
                    int a6 = Q(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                    ChronoLocalDate u = M(a5, a6, 1).d((Q(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).u(new j$.time.temporal.k(DayOfWeek.of(Q(chronoField6).a(((Long) map.remove(chronoField6)).longValue(), chronoField6)).getValue(), 1));
                    if (d2 != j$.time.format.D.STRICT || u.get(chronoField3) == a6) {
                        return u;
                    }
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        ChronoField chronoField7 = ChronoField.DAY_OF_YEAR;
        if (map.containsKey(chronoField7)) {
            int a7 = Q(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
            if (d2 != j$.time.format.D.LENIENT) {
                return A(a7, Q(chronoField7).a(((Long) map.remove(chronoField7)).longValue(), chronoField7));
            }
            return A(a7, 1).d(j$.time.b.e(((Long) map.remove(chronoField7)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        ChronoField chronoField8 = ChronoField.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(chronoField8)) {
            return null;
        }
        ChronoField chronoField9 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(chronoField9)) {
            int a8 = Q(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
            if (d2 == j$.time.format.D.LENIENT) {
                return A(a8, 1).d(j$.time.b.e(((Long) map.remove(chronoField8)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).d(j$.time.b.e(((Long) map.remove(chronoField9)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
            }
            int a9 = Q(chronoField8).a(((Long) map.remove(chronoField8)).longValue(), chronoField8);
            ChronoLocalDate d4 = A(a8, 1).d((Q(chronoField9).a(((Long) map.remove(chronoField9)).longValue(), chronoField9) - 1) + ((a9 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
            if (d2 != j$.time.format.D.STRICT || d4.get(chronoField2) == a8) {
                return d4;
            }
            throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
        }
        ChronoField chronoField10 = ChronoField.DAY_OF_WEEK;
        if (!map.containsKey(chronoField10)) {
            return null;
        }
        int a10 = Q(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        if (d2 == j$.time.format.D.LENIENT) {
            return Z(A(a10, 1), 0L, j$.time.b.e(((Long) map.remove(chronoField8)).longValue(), 1L), j$.time.b.e(((Long) map.remove(chronoField10)).longValue(), 1L));
        }
        ChronoLocalDate u2 = A(a10, 1).d((Q(chronoField8).a(((Long) map.remove(chronoField8)).longValue(), chronoField8) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).u(new j$.time.temporal.k(DayOfWeek.of(Q(chronoField10).a(((Long) map.remove(chronoField10)).longValue(), chronoField10)).getValue(), 1));
        if (d2 != j$.time.format.D.STRICT || u2.get(chronoField2) == a10) {
            return u2;
        }
        throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
    }

    void a0(Map map, j$.time.format.D d2) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (d2 != j$.time.format.D.LENIENT) {
                chronoField.b0(l.longValue());
            }
            ChronoLocalDate c2 = u().c(1L, (TemporalField) ChronoField.DAY_OF_MONTH).c(l.longValue(), (TemporalField) chronoField);
            o(map, ChronoField.MONTH_OF_YEAR, c2.get(r0));
            o(map, ChronoField.YEAR, c2.get(r0));
        }
    }

    ChronoLocalDate b0(Map map, j$.time.format.D d2) {
        ChronoField chronoField = ChronoField.YEAR;
        int a2 = Q(chronoField).a(((Long) map.remove(chronoField)).longValue(), chronoField);
        if (d2 == j$.time.format.D.LENIENT) {
            long e = j$.time.b.e(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L);
            return M(a2, 1, 1).d(e, (TemporalUnit) ChronoUnit.MONTHS).d(j$.time.b.e(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int a3 = Q(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int a4 = Q(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
        if (d2 != j$.time.format.D.SMART) {
            return M(a2, a3, a4);
        }
        try {
            return M(a2, a3, a4);
        } catch (DateTimeException unused) {
            return M(a2, a3, 1).u(new j$.time.temporal.l(0));
        }
    }

    ChronoLocalDate c0(Map map, j$.time.format.D d2) {
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l = (Long) map.remove(chronoField);
        if (l == null) {
            ChronoField chronoField2 = ChronoField.ERA;
            if (!map.containsKey(chronoField2)) {
                return null;
            }
            Q(chronoField2).b(((Long) map.get(chronoField2)).longValue(), chronoField2);
            return null;
        }
        Long l2 = (Long) map.remove(ChronoField.ERA);
        int a2 = d2 != j$.time.format.D.LENIENT ? Q(chronoField).a(l.longValue(), chronoField) : j$.time.b.b(l.longValue());
        if (l2 != null) {
            o(map, ChronoField.YEAR, h(W(Q(r2).a(l2.longValue(), r2)), a2));
            return null;
        }
        ChronoField chronoField3 = ChronoField.YEAR;
        if (map.containsKey(chronoField3)) {
            o(map, chronoField3, h(A(Q(chronoField3).a(((Long) map.get(chronoField3)).longValue(), chronoField3), 1).H(), a2));
            return null;
        }
        if (d2 == j$.time.format.D.STRICT) {
            map.put(chronoField, l);
            return null;
        }
        if (T().isEmpty()) {
            o(map, chronoField3, a2);
            return null;
        }
        o(map, chronoField3, h((l) r9.get(r9.size() - 1), a2));
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC0022a) && compareTo((AbstractC0022a) obj) == 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Chronology chronology) {
        return n().compareTo(chronology.n());
    }

    @Override // j$.time.chrono.Chronology
    public final int hashCode() {
        return getClass().hashCode() ^ n().hashCode();
    }

    @Override // j$.time.chrono.Chronology
    public final String toString() {
        return n();
    }

    public abstract /* synthetic */ ChronoLocalDate u();
}
