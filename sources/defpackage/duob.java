package defpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duob extends ThreadPoolExecutor implements duof {
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/concurrent/ThreadPoolExecutorWrapper");
    private static final AtomicInteger d = new AtomicInteger(0);
    final dunz b;
    public final dunr c;

    public duob(dunr dunrVar, int i, int i2, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, 2L, timeUnit, (BlockingQueue<Runnable>) blockingQueue, threadFactory);
        this.c = dunrVar;
        this.b = new dunz();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        super.execute(new duoa(this, runnable, d.getAndIncrement()));
    }
}
