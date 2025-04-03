package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class ejwc {
    public abstract int a();

    public abstract long b();

    public abstract ejuh c();

    public abstract ejvd d();

    public abstract ejvh e();

    public abstract Instant f();

    final ejwc g(ejuh ejuhVar, Instant instant) {
        emxf.m(b() != Long.MAX_VALUE, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        return new ejub(ejuhVar, b() + 1, new ejts(0L), new ejtt(0L), 0, instant);
    }

    final boolean h(ejwc ejwcVar) {
        emxf.l(b() != Long.MIN_VALUE);
        emxf.l(!equals(ejwcVar) || this == ejwcVar);
        long b = b();
        ejub ejubVar = (ejub) ejwcVar;
        long j = ejubVar.b;
        if (b < j) {
            return true;
        }
        if (b() == j) {
            if (((ejts) d()).a < ((ejts) ejubVar.c).a) {
                return true;
            }
            if (((ejtt) e()).a < ((ejtt) ejubVar.d).a) {
                return true;
            }
        }
        return false;
    }

    final boolean i() {
        return a() > 3;
    }
}
