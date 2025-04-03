package defpackage;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alol {
    private static final ZoneId a;
    private static final ZonedDateTime b;
    private final cqoh c;

    static {
        ZoneId of = ZoneId.of("America/Los_Angeles");
        a = of;
        ZonedDateTime atStartOfDay = LocalDate.EPOCH.atStartOfDay(of);
        atStartOfDay.getClass();
        b = atStartOfDay;
    }

    public alol(cqoh cqohVar) {
        cqohVar.getClass();
        this.c = cqohVar;
    }

    public static final int b(Instant instant) {
        return (int) ChronoUnit.DAYS.between(b, instant.atZone(a));
    }

    public final int a() {
        Instant f = this.c.f();
        f.getClass();
        return b(f);
    }
}
