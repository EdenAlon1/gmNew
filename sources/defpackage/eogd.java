package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eogd implements Executor {
    final /* synthetic */ Executor a;
    final /* synthetic */ eogi b;

    public eogd(eogi eogiVar, Executor executor) {
        this.a = executor;
        this.b = eogiVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.b.setException(e);
        }
    }
}
