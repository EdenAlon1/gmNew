package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elfl<V> extends erqg<V> {
    private elfl(ListenableFuture listenableFuture) {
        super(listenableFuture);
    }

    public static elfl g(ListenableFuture listenableFuture) {
        return listenableFuture instanceof elfl ? (elfl) listenableFuture : new elfl(listenableFuture);
    }

    public final elfl e(Class cls, emwl emwlVar, Executor executor) {
        return new elfl(elfr.e(this.b, cls, emwlVar, executor));
    }

    public final elfl f(Class cls, eroh erohVar, Executor executor) {
        return new elfl(elfr.f(this.b, cls, erohVar, executor));
    }

    public final elfl h(emwl emwlVar, Executor executor) {
        return new elfl(elfr.j(this.b, emwlVar, executor));
    }

    public final elfl i(eroh erohVar, Executor executor) {
        return new elfl(elfr.k(this.b, erohVar, executor));
    }

    public final elfl j(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return new elfl(erqt.p(this.b, j, timeUnit, scheduledExecutorService));
    }

    public final void k(erqj erqjVar, Executor executor) {
        elfr.l(this.b, erqjVar, executor);
    }
}
