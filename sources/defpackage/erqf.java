package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class erqf<V> extends enfm implements Future<V> {
    protected erqf() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return hi().cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return hi().get();
    }

    @Override // defpackage.enfm
    protected /* bridge */ /* synthetic */ Object hC() {
        throw null;
    }

    protected abstract Future hi();

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return hi().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return hi().isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return hi().get(j, timeUnit);
    }
}
