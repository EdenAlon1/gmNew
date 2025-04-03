package defpackage;

import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pqh extends pqu {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqh(Class cls, long j, TimeUnit timeUnit) {
        super(cls);
        timeUnit.getClass();
        this.c.b(timeUnit.toMillis(j));
    }

    @Override // defpackage.pqu
    public final /* bridge */ /* synthetic */ pqv a() {
        if (this.a && this.c.l.d) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        if (this.c.s) {
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
        }
        return new pqi(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqh(Class cls, long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2) {
        super(cls);
        timeUnit.getClass();
        timeUnit2.getClass();
        this.c.c(timeUnit.toMillis(j), timeUnit2.toMillis(j2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqh(Class cls, Duration duration) {
        super(cls);
        duration.getClass();
        this.c.b(duration.toMillis());
    }
}
