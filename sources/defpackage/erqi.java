package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class erqi extends erqd implements errl {
    protected erqi() {
    }

    @Override // defpackage.erqd, java.util.concurrent.ExecutorService
    /* renamed from: b */
    public final ListenableFuture submit(Callable callable) {
        return h().submit(callable);
    }

    @Override // defpackage.erqd, java.util.concurrent.ExecutorService
    /* renamed from: c */
    public final ListenableFuture submit(Runnable runnable, Object obj) {
        return h().submit(runnable, obj);
    }

    @Override // defpackage.erqd, java.util.concurrent.ExecutorService
    /* renamed from: gd */
    public final ListenableFuture submit(Runnable runnable) {
        return h().submit(runnable);
    }

    protected abstract errl h();

    @Override // defpackage.erqd
    protected /* bridge */ /* synthetic */ ExecutorService i() {
        throw null;
    }
}
