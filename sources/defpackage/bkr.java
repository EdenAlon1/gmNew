package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bkr implements ListenableFuture {
    List a;
    List b;
    kfb c;
    private final boolean d;
    private final AtomicInteger e;
    private final ListenableFuture f = kfg.a(new bko(this));

    public bkr(List list, boolean z, Executor executor) {
        this.a = list;
        this.b = new ArrayList(list.size());
        this.d = z;
        this.e = new AtomicInteger(list.size());
        b(new bkp(this), bjb.a());
        if (this.a.isEmpty()) {
            this.c.b(new ArrayList(this.b));
            return;
        }
        for (int i = 0; i < this.a.size(); i++) {
            this.b.add(null);
        }
        List list2 = this.a;
        for (int i2 = 0; i2 < list2.size(); i2++) {
            ListenableFuture listenableFuture = (ListenableFuture) list2.get(i2);
            listenableFuture.b(new bkq(this, i2, listenableFuture), executor);
        }
    }

    private final void c() {
        List<ListenableFuture> list = this.a;
        if (list == null || isDone()) {
            return;
        }
        for (ListenableFuture listenableFuture : list) {
            while (!listenableFuture.isDone()) {
                try {
                    listenableFuture.get();
                } catch (Error e) {
                    throw e;
                } catch (InterruptedException e2) {
                    throw e2;
                } catch (Throwable unused) {
                    if (this.d) {
                        return;
                    }
                }
            }
        }
    }

    final void a(int i, Future future) {
        int decrementAndGet;
        List list = this.b;
        if (isDone() || list == null) {
            ksw.d(this.d, "Future was done before all dependencies completed");
            return;
        }
        try {
            try {
                try {
                    try {
                        ksw.d(future.isDone(), "Tried to set value from future which is not done");
                        list.set(i, bkj.h(future));
                    } catch (CancellationException unused) {
                        if (this.d) {
                            cancel(false);
                        }
                    }
                } catch (Error e) {
                    this.c.c(e);
                }
            } catch (RuntimeException e2) {
                if (this.d) {
                    this.c.c(e2);
                }
            } catch (ExecutionException e3) {
                if (this.d) {
                    this.c.c(e3.getCause());
                }
            }
            ksw.d(decrementAndGet >= 0, "Less than 0 remaining futures");
            if (decrementAndGet == 0) {
                List list2 = this.b;
                if (list2 != null) {
                    this.c.b(new ArrayList(list2));
                } else {
                    ksw.c(isDone());
                }
            }
        } finally {
            decrementAndGet = this.e.decrementAndGet();
            ksw.d(decrementAndGet >= 0, "Less than 0 remaining futures");
            if (decrementAndGet == 0) {
                List list3 = this.b;
                if (list3 != null) {
                    this.c.b(new ArrayList(list3));
                } else {
                    ksw.c(isDone());
                }
            }
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void b(Runnable runnable, Executor executor) {
        this.f.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        List list = this.a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).cancel(z);
            }
        }
        return this.f.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final /* bridge */ /* synthetic */ Object get() {
        c();
        return (List) this.f.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f.isDone();
    }

    @Override // java.util.concurrent.Future
    public final /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) {
        return (List) this.f.get(j, timeUnit);
    }
}
