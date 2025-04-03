package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyhh extends ThreadPoolExecutor {
    private static final long c = TimeUnit.MINUTES.toMillis(3);
    public final Set a;
    public final String b;
    private final AtomicInteger d;
    private final ScheduledExecutorService e;

    public dyhh(ScheduledExecutorService scheduledExecutorService, String str, int i, int i2, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, 1L, timeUnit, (BlockingQueue<Runnable>) blockingQueue, threadFactory);
        this.d = new AtomicInteger(0);
        this.a = Collections.newSetFromMap(new ConcurrentHashMap());
        this.e = scheduledExecutorService;
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        final int incrementAndGet = this.d.incrementAndGet();
        final Throwable th = new Throwable();
        final ScheduledFuture<?> schedule = this.e.schedule(new Runnable() { // from class: dyhf
            @Override // java.lang.Runnable
            public final void run() {
                dyhh dyhhVar = dyhh.this;
                if (dyhhVar.a.contains(Integer.valueOf(incrementAndGet))) {
                    dyhr.g(dyhhVar.b, "Task executed for too long: ", th);
                }
            }
        }, c, TimeUnit.MILLISECONDS);
        this.a.add(Integer.valueOf(incrementAndGet));
        super.execute(new Runnable() { // from class: dyhg
            @Override // java.lang.Runnable
            public final void run() {
                runnable.run();
                dyhh.this.a.remove(Integer.valueOf(incrementAndGet));
                schedule.cancel(false);
            }
        });
    }
}
