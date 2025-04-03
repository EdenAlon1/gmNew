package defpackage;

import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dunp extends ScheduledThreadPoolExecutor {
    private final AtomicLong a;
    private final dunu b;

    public dunp(dunu dunuVar, dunn dunnVar) {
        super(1, dunnVar);
        this.a = new AtomicLong(0L);
        this.b = dunuVar;
        setKeepAliveTime(2L, TimeUnit.MINUTES);
        allowCoreThreadTimeOut(false);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    protected final RunnableScheduledFuture decorateTask(Runnable runnable, RunnableScheduledFuture runnableScheduledFuture) {
        return new duod(runnable, this.b.a(runnable), runnableScheduledFuture.getDelay(TimeUnit.NANOSECONDS), this.a.getAndIncrement());
    }
}
