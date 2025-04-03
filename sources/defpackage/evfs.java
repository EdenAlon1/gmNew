package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evfs implements Executor {
    private volatile Executor a;

    public evfs(Executor executor) {
        this.a = executor;
    }

    public final void a() {
        this.a = erpp.a;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
