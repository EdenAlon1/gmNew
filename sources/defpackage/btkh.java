package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btkh extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new btkg(this);
    }

    public final void b(String str) {
        aq(new dtrt("generic_worker_queue._id", 1, String.valueOf(str)));
    }

    public final void c(String... strArr) {
        aq(new dtrw("generic_worker_queue._id", 3, av(strArr), false));
    }

    public final void d(boolean z) {
        aq(new dtwe("generic_worker_queue.in_flight", 1, Integer.valueOf(z ? 1 : 0)));
    }

    public final void e() {
        int intValue = btki.c().intValue();
        if (intValue < 34000) {
            dtub.w("next_execute_timestamp", intValue);
        }
        aq(new dtwe("generic_worker_queue.next_execute_timestamp", 7, 0L));
    }

    public final void f(long j) {
        int intValue = btki.c().intValue();
        if (intValue < 34000) {
            dtub.w("next_execute_timestamp", intValue);
        }
        aq(new dtwe("generic_worker_queue.next_execute_timestamp", 10, Long.valueOf(j)));
    }

    public final void g(int i) {
        aq(new dtwe("generic_worker_queue.retry_count", 9, Integer.valueOf(i)));
    }

    public final void h(int i) {
        aq(new dtwe("generic_worker_queue.retry_count", 8, Integer.valueOf(i)));
    }

    public final void i(int i) {
        aq(new dtwe("generic_worker_queue.retry_count", 10, Integer.valueOf(i)));
    }

    public final void j(int i) {
        aq(new dtwe("generic_worker_queue.worker_type", 1, Integer.valueOf(i)));
    }

    public final void k(int... iArr) {
        aq(new dtrw("generic_worker_queue.worker_type", 3, au(iArr), true));
    }
}
