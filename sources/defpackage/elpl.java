package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elpl implements elpf {
    final /* synthetic */ Function a;
    final /* synthetic */ kfb b;

    public elpl(Function function, kfb kfbVar) {
        this.a = function;
        this.b = kfbVar;
    }

    @Override // defpackage.elpf
    public final void a(Throwable th) {
        this.b.c(th);
    }

    @Override // defpackage.elpf
    public final void b(Object obj) {
        Object apply;
        try {
            apply = this.a.apply(obj);
            elpn.a((ListenableFuture) apply, new elpj(this.b, Function$CC.identity()), new Executor() { // from class: elpk
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    runnable.run();
                }
            });
        } catch (Throwable th) {
            if (th instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            this.b.c(th);
        }
    }
}
