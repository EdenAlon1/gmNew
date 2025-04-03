package defpackage;

import j$.time.Instant;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duod extends FutureTask implements RunnableScheduledFuture {
    private final dunt a;
    private final long b;
    private final long c;

    public duod(Runnable runnable, dunt duntVar, long j, long j2) {
        super(runnable, null);
        this.a = duntVar;
        this.b = System.nanoTime() + j;
        this.c = j2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        Delayed delayed2 = delayed;
        if (!(delayed2 instanceof duod)) {
            return Long.signum(getDelay(TimeUnit.NANOSECONDS) - delayed2.getDelay(TimeUnit.NANOSECONDS));
        }
        duod duodVar = (duod) delayed2;
        long j = this.b - duodVar.b;
        if (j < 0) {
            return -1;
        }
        return (j <= 0 && this.c < duodVar.c) ? -1 : 1;
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        if (timeUnit != null) {
            return timeUnit.convert(this.b - System.nanoTime(), TimeUnit.NANOSECONDS);
        }
        return 0L;
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return false;
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        long epochMilli = Instant.now().toEpochMilli();
        super.run();
        dunt duntVar = this.a;
        if (duntVar != null) {
            duntVar.b = Instant.now().toEpochMilli();
            dunt duntVar2 = this.a;
            duntVar2.c = duntVar2.b - epochMilli;
        }
    }
}
