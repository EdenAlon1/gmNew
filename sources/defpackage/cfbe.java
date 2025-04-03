package defpackage;

import java.util.Date;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfbe extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new cfbd(this);
    }

    public final void b(Iterable iterable) {
        int intValue = cfbf.c().intValue();
        if (intValue < 42050) {
            dtub.w("deduplication_tag", intValue);
        }
        aq(new dtrw("work_queue.deduplication_tag", 4, at(iterable), false));
    }

    public final void c(long j) {
        aq(new dtwe("work_queue._id", 1, Long.valueOf(j)));
    }

    public final void d(Iterable iterable) {
        aq(new dtrw("work_queue._id", 3, at(iterable), true));
    }

    public final void e(Date date) {
        int intValue = cfbf.c().intValue();
        if (intValue < 46070) {
            dtub.w("minimum_start_time", intValue);
        }
        aq(new dtrt("work_queue.minimum_start_time", 8, Long.valueOf(bdgs.a(date))));
    }

    public final void f(Date date) {
        int intValue = cfbf.c().intValue();
        if (intValue < 46070) {
            dtub.w("minimum_start_time", intValue);
        }
        aq(new dtrt("work_queue.minimum_start_time", 10, Long.valueOf(bdgs.a(date))));
    }

    public final void g(String str) {
        int intValue = cfbf.c().intValue();
        if (intValue < 41030) {
            dtub.w("queue", intValue);
        }
        aq(new dtrt("work_queue.queue", 1, String.valueOf(str)));
    }

    public final void h(Iterable iterable) {
        int intValue = cfbf.c().intValue();
        if (intValue < 41030) {
            dtub.w("queue", intValue);
        }
        aq(new dtrw("work_queue.queue", 3, at(iterable), false));
    }

    public final void i() {
        int intValue = cfbf.c().intValue();
        if (intValue < 45030) {
            dtub.w("scheduled_in_workmanager", intValue);
        }
        aq(new dtwe("work_queue.scheduled_in_workmanager", 1, 0));
    }

    public final void j(String str) {
        aq(new dtrt("work_queue.type", 1, String.valueOf(str)));
    }

    public final void k(Iterable iterable) {
        aq(new dtrw("work_queue.type", 4, at(iterable), false));
    }
}
