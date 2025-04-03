package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjl implements Executor {
    private static volatile Executor a;
    private final ExecutorService b = Executors.newFixedThreadPool(2, new bjk());

    public static Executor a() {
        if (a == null) {
            synchronized (bjl.class) {
                if (a == null) {
                    a = new bjl();
                }
            }
        }
        return a;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.execute(runnable);
    }
}
