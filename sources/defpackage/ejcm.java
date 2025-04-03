package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejcm extends erqh {
    final /* synthetic */ ejcn a;
    private final ListenableFuture b;

    public ejcm(ejcn ejcnVar, ListenableFuture listenableFuture) {
        this.a = ejcnVar;
        this.b = listenableFuture;
    }

    @Override // defpackage.erqh, com.google.common.util.concurrent.ListenableFuture
    public final void b(Runnable runnable, Executor executor) {
        if (isDone()) {
            this.b.b(runnable, executor);
        }
        this.b.b(runnable, new ejcj(this.a, executor));
    }

    @Override // defpackage.erqf, defpackage.enfm
    protected final /* synthetic */ Object hC() {
        return this.b;
    }

    @Override // defpackage.erqh
    protected final ListenableFuture hh() {
        return this.b;
    }

    @Override // defpackage.erqh, defpackage.erqf
    protected final /* synthetic */ Future hi() {
        return this.b;
    }
}
