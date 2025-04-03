package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class errr extends erro implements errm {
    final ScheduledExecutorService a;

    public errr(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.a = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d */
    public final errk schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.a;
        ersl d = ersl.d(runnable, null);
        return new errp(d, scheduledExecutorService.schedule(d, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: e */
    public final errk schedule(Callable callable, long j, TimeUnit timeUnit) {
        ersl erslVar = new ersl(callable);
        return new errp(erslVar, this.a.schedule(erslVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: f */
    public final errk scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        errq errqVar = new errq(runnable);
        return new errp(errqVar, this.a.scheduleAtFixedRate(errqVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: g */
    public final errk scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        errq errqVar = new errq(runnable);
        return new errp(errqVar, this.a.scheduleWithFixedDelay(errqVar, j, j2, timeUnit));
    }
}
