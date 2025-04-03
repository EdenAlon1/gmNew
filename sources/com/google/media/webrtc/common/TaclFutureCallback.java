package com.google.media.webrtc.common;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.erqj;
import defpackage.erqt;
import io.grpc.Status;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class TaclFutureCallback<T> implements erqj<T> {
    private static final Executor a = Executors.newSingleThreadExecutor();
    private final ListenableFuture b;

    private TaclFutureCallback(ListenableFuture listenableFuture) {
        this.b = listenableFuture;
    }

    public static <T> TaclFutureCallback<T> attachToFuture(ListenableFuture<T> listenableFuture) {
        return new TaclFutureCallback<>(listenableFuture);
    }

    private native void nativeProcessFailure(Status status);

    private native void nativeProcessResult(T t);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.erqj
    public final void b(Object obj) {
        nativeProcessResult(obj);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        nativeProcessFailure(Status.c(th));
    }

    public void listen() {
        erqt.r(this.b, this, a);
    }
}
