package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fijp implements Executor {
    final /* synthetic */ Executor a;
    final /* synthetic */ fijq b;

    public fijp(fijq fijqVar, Executor executor) {
        this.b = fijqVar;
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.b.g(e);
        }
    }
}
