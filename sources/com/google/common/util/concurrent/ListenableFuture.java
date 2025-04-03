package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface ListenableFuture<V> extends Future<V> {
    void b(Runnable runnable, Executor executor);
}
