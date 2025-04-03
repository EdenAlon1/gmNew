package defpackage;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.MonthDay;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sth {
    public static final long a(cqoh cqohVar) {
        return b(cqohVar).toEpochMilli();
    }

    public static final Instant b(cqoh cqohVar) {
        Instant instant = cqohVar.f().atZone(ZoneId.systemDefault()).truncatedTo(ChronoUnit.DAYS).toInstant();
        instant.getClass();
        return instant;
    }

    public static final MonthDay c(cqoh cqohVar) {
        Instant f = cqohVar.f();
        f.getClass();
        return d(f);
    }

    public static final MonthDay d(Instant instant) {
        MonthDay from = MonthDay.from(instant.atZone(ZoneId.systemDefault()));
        from.getClass();
        return from;
    }

    public static final ZonedDateTime e(Instant instant) {
        ZonedDateTime truncatedTo = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).q(ZoneId.systemDefault()).truncatedTo(ChronoUnit.DAYS);
        truncatedTo.getClass();
        return truncatedTo;
    }
}
