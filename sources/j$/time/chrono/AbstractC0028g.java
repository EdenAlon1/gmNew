package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.util.Objects;

/* renamed from: j$.time.chrono.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class AbstractC0028g {
    public static Temporal a(ChronoLocalDate chronoLocalDate, Temporal temporal) {
        return temporal.c(chronoLocalDate.toEpochDay(), ChronoField.EPOCH_DAY);
    }

    public static int b(ChronoLocalDate chronoLocalDate, ChronoLocalDate chronoLocalDate2) {
        int compare = Long.compare(chronoLocalDate.toEpochDay(), chronoLocalDate2.toEpochDay());
        if (compare != 0) {
            return compare;
        }
        return ((AbstractC0022a) chronoLocalDate.a()).compareTo(chronoLocalDate2.a());
    }

    public static int c(ChronoLocalDateTime chronoLocalDateTime, ChronoLocalDateTime chronoLocalDateTime2) {
        int compareTo = chronoLocalDateTime.b().compareTo(chronoLocalDateTime2.b());
        return (compareTo == 0 && (compareTo = chronoLocalDateTime.toLocalTime().compareTo(chronoLocalDateTime2.toLocalTime())) == 0) ? chronoLocalDateTime.a().compareTo(chronoLocalDateTime2.a()) : compareTo;
    }

    public static int d(InterfaceC0030i interfaceC0030i, InterfaceC0030i interfaceC0030i2) {
        int compare = Long.compare(interfaceC0030i.Y(), interfaceC0030i2.Y());
        return (compare == 0 && (compare = interfaceC0030i.toLocalTime().f0() - interfaceC0030i2.toLocalTime().f0()) == 0 && (compare = interfaceC0030i.L().compareTo(interfaceC0030i2.L())) == 0 && (compare = interfaceC0030i.getZone().n().compareTo(interfaceC0030i2.getZone().n())) == 0) ? interfaceC0030i.a().compareTo(interfaceC0030i2.a()) : compare;
    }

    public static int e(InterfaceC0030i interfaceC0030i, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return j$.time.temporal.j.a(interfaceC0030i, temporalField);
        }
        int i = AbstractC0029h.a[((ChronoField) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? interfaceC0030i.L().get(temporalField) : interfaceC0030i.i().getTotalSeconds();
        }
        throw new j$.time.temporal.n("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public static int f(l lVar, TemporalField temporalField) {
        return temporalField == ChronoField.ERA ? lVar.getValue() : j$.time.temporal.j.a(lVar, temporalField);
    }

    public static long g(l lVar, TemporalField temporalField) {
        if (temporalField == ChronoField.ERA) {
            return lVar.getValue();
        }
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
        return temporalField.v(lVar);
    }

    public static boolean h(ChronoLocalDate chronoLocalDate, TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).Z() : temporalField != null && temporalField.y(chronoLocalDate);
    }

    public static boolean i(l lVar, TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.ERA : temporalField != null && temporalField.y(lVar);
    }

    public static Object j(ChronoLocalDate chronoLocalDate, j$.time.temporal.m mVar) {
        if (mVar == j$.time.temporal.j.l() || mVar == j$.time.temporal.j.k() || mVar == j$.time.temporal.j.i() || mVar == j$.time.temporal.j.g()) {
            return null;
        }
        return mVar == j$.time.temporal.j.e() ? chronoLocalDate.a() : mVar == j$.time.temporal.j.j() ? ChronoUnit.DAYS : mVar.g(chronoLocalDate);
    }

    public static Object k(ChronoLocalDateTime chronoLocalDateTime, j$.time.temporal.m mVar) {
        if (mVar == j$.time.temporal.j.l() || mVar == j$.time.temporal.j.k() || mVar == j$.time.temporal.j.i()) {
            return null;
        }
        return mVar == j$.time.temporal.j.g() ? chronoLocalDateTime.toLocalTime() : mVar == j$.time.temporal.j.e() ? chronoLocalDateTime.a() : mVar == j$.time.temporal.j.j() ? ChronoUnit.NANOS : mVar.g(chronoLocalDateTime);
    }

    public static Object l(InterfaceC0030i interfaceC0030i, j$.time.temporal.m mVar) {
        return (mVar == j$.time.temporal.j.k() || mVar == j$.time.temporal.j.l()) ? interfaceC0030i.getZone() : mVar == j$.time.temporal.j.i() ? interfaceC0030i.i() : mVar == j$.time.temporal.j.g() ? interfaceC0030i.toLocalTime() : mVar == j$.time.temporal.j.e() ? interfaceC0030i.a() : mVar == j$.time.temporal.j.j() ? ChronoUnit.NANOS : mVar.g(interfaceC0030i);
    }

    public static Object m(l lVar, j$.time.temporal.m mVar) {
        return mVar == j$.time.temporal.j.j() ? ChronoUnit.ERAS : j$.time.temporal.j.c(lVar, mVar);
    }

    public static long n(ChronoLocalDateTime chronoLocalDateTime, ZoneOffset zoneOffset) {
        Objects.a(zoneOffset, "offset");
        return ((chronoLocalDateTime.b().toEpochDay() * 86400) + chronoLocalDateTime.toLocalTime().s0()) - zoneOffset.getTotalSeconds();
    }

    public static long o(InterfaceC0030i interfaceC0030i) {
        return ((interfaceC0030i.b().toEpochDay() * 86400) + interfaceC0030i.toLocalTime().s0()) - interfaceC0030i.i().getTotalSeconds();
    }

    public static Instant p(ChronoLocalDateTime chronoLocalDateTime, ZoneOffset zoneOffset) {
        return Instant.ofEpochSecond(chronoLocalDateTime.toEpochSecond(zoneOffset), chronoLocalDateTime.toLocalTime().f0());
    }
}
