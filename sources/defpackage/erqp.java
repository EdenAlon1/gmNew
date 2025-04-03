package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erqp {
    private final boolean a;
    private final engw b;

    public erqp(boolean z, engw engwVar) {
        this.a = z;
        this.b = engwVar;
    }

    public final ListenableFuture a(Callable callable, Executor executor) {
        return new erpo(this.b, this.a, executor, callable);
    }

    public final ListenableFuture b(erog erogVar, Executor executor) {
        return new erpo(this.b, this.a, executor, erogVar);
    }

    public final ListenableFuture c(Runnable runnable, Executor executor) {
        return a(new erqo(runnable), executor);
    }
}
