package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erqa {
    private final AtomicReference b = new AtomicReference(erre.a);
    public erpz a = new erpz();

    public final ListenableFuture a(Callable callable, Executor executor) {
        executor.getClass();
        return b(new erpv(callable), executor);
    }

    public final ListenableFuture b(erog erogVar, Executor executor) {
        executor.getClass();
        final erpy erpyVar = new erpy(executor, this);
        erpw erpwVar = new erpw(erpyVar, erogVar);
        AtomicReference atomicReference = this.b;
        final SettableFuture create = SettableFuture.create();
        final ListenableFuture listenableFuture = (ListenableFuture) atomicReference.getAndSet(create);
        final ersl erslVar = new ersl(erpwVar);
        listenableFuture.b(erslVar, erpyVar);
        final ListenableFuture j = erqt.j(erslVar);
        Runnable runnable = new Runnable() { // from class: erpu
            @Override // java.lang.Runnable
            public final void run() {
                ersl erslVar2 = ersl.this;
                if (erslVar2.isDone()) {
                    create.m(listenableFuture);
                } else if (j.isCancelled() && erpyVar.compareAndSet(erpx.NOT_RUN, erpx.CANCELLED)) {
                    erslVar2.cancel(false);
                }
            }
        };
        j.b(runnable, erpp.a);
        erslVar.b(runnable, erpp.a);
        return j;
    }
}
