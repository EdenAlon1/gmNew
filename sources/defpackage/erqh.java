package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class erqh<V> extends erqf<V> implements ListenableFuture<V> {
    protected erqh() {
    }

    public void b(Runnable runnable, Executor executor) {
        hh().b(runnable, executor);
    }

    protected abstract ListenableFuture hh();

    @Override // defpackage.erqf
    protected /* bridge */ /* synthetic */ Future hi() {
        throw null;
    }
}
