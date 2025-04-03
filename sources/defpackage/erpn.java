package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class erpn extends errh {
    private final Executor a;
    final /* synthetic */ erpo b;

    public erpn(erpo erpoVar, Executor executor) {
        this.b = erpoVar;
        executor.getClass();
        this.a = executor;
    }

    public abstract void c(Object obj);

    @Override // defpackage.errh
    public final void d(Throwable th) {
        this.b.b = null;
        if (th instanceof ExecutionException) {
            this.b.setException(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.b.cancel(false);
        } else {
            this.b.setException(th);
        }
    }

    @Override // defpackage.errh
    public final void e(Object obj) {
        this.b.b = null;
        c(obj);
    }

    final void f() {
        try {
            this.a.execute(this);
        } catch (RejectedExecutionException e) {
            this.b.setException(e);
        }
    }

    @Override // defpackage.errh
    public final boolean g() {
        return this.b.isDone();
    }
}
