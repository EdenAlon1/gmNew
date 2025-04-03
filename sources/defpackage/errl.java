package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface errl extends ExecutorService {
    ListenableFuture b(Callable callable);

    ListenableFuture c(Runnable runnable, Object obj);

    ListenableFuture gd(Runnable runnable);

    @Override // java.util.concurrent.ExecutorService
    List invokeAll(Collection collection);

    @Override // java.util.concurrent.ExecutorService
    List invokeAll(Collection collection, long j, TimeUnit timeUnit);
}
