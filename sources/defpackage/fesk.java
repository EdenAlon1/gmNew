package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fesk {
    public final ScheduledExecutorService a;
    public final Executor b;
    public final Runnable c;
    public long d;
    public boolean e;
    public ScheduledFuture f;
    private final emyg g;

    public fesk(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, emyg emygVar) {
        this.c = runnable;
        this.b = executor;
        this.a = scheduledExecutorService;
        this.g = emygVar;
        emygVar.f();
    }

    public final long a() {
        return this.g.a(TimeUnit.NANOSECONDS);
    }
}
