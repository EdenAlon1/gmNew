package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elfr {
    public static elfq a(Iterable iterable) {
        return new elfq(erqt.a(iterable));
    }

    @SafeVarargs
    public static elfq b(ListenableFuture... listenableFutureArr) {
        return new elfq(erqt.b(listenableFutureArr));
    }

    public static elfq c(Iterable iterable) {
        return new elfq(erqt.c(iterable));
    }

    @SafeVarargs
    public static elfq d(ListenableFuture... listenableFutureArr) {
        return new elfq(erqt.d(listenableFutureArr));
    }

    public static ListenableFuture e(ListenableFuture listenableFuture, Class cls, emwl emwlVar, Executor executor) {
        return ernq.f(listenableFuture, cls, eldl.a(emwlVar), executor);
    }

    public static ListenableFuture f(ListenableFuture listenableFuture, Class cls, eroh erohVar, Executor executor) {
        return ernq.g(listenableFuture, cls, eldl.d(erohVar), executor);
    }

    public static ListenableFuture g(Runnable runnable, Executor executor) {
        return erqt.l(eldl.l(runnable), executor);
    }

    public static ListenableFuture h(Callable callable, Executor executor) {
        return erqt.m(eldl.m(callable), executor);
    }

    public static ListenableFuture i(erog erogVar, Executor executor) {
        return erqt.n(eldl.c(erogVar), executor);
    }

    public static ListenableFuture j(ListenableFuture listenableFuture, emwl emwlVar, Executor executor) {
        return erny.f(listenableFuture, eldl.a(emwlVar), executor);
    }

    public static ListenableFuture k(ListenableFuture listenableFuture, eroh erohVar, Executor executor) {
        return erny.g(listenableFuture, eldl.d(erohVar), executor);
    }

    public static void l(ListenableFuture listenableFuture, erqj erqjVar, Executor executor) {
        erqt.r(listenableFuture, eldl.i(erqjVar), executor);
    }
}
