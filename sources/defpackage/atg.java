package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atg implements Executor {
    public static final /* synthetic */ int c = 0;
    private static final ThreadFactory d = new atf();
    public final Object a = new Object();
    public ThreadPoolExecutor b = a();

    public static ThreadPoolExecutor a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), d);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: ate
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                int i = atg.c;
                avw.c("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
            }
        });
        return threadPoolExecutor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ksw.h(runnable);
        synchronized (this.a) {
            this.b.execute(runnable);
        }
    }
}
