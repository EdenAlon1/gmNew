package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elfo {
    public static elfl a(Iterable iterable) {
        return elfl.g(erqt.e(iterable));
    }

    public static elfl b(ListenableFuture... listenableFutureArr) {
        return elfl.g(erqt.f(listenableFutureArr));
    }

    public static elfl c() {
        return elfl.g(erqt.g());
    }

    public static elfl d(Throwable th) {
        return elfl.g(erqt.h(th));
    }

    public static elfl e(Object obj) {
        return elfl.g(erqt.i(obj));
    }

    public static elfl f(Runnable runnable, Executor executor) {
        return elfl.g(elfr.g(runnable, executor));
    }

    public static elfl g(final Callable callable, Executor executor) {
        return h(new erog() { // from class: elfm
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return erqt.i(callable.call());
            }
        }, executor);
    }

    public static elfl h(erog erogVar, Executor executor) {
        return elfl.g(elfr.i(erogVar, executor));
    }

    public static elfl i(Iterable iterable) {
        return elfl.g(erqt.o(iterable));
    }

    public static elfn j(Iterable iterable) {
        return new elfn(elfr.a(iterable));
    }

    @SafeVarargs
    public static elfn k(ListenableFuture... listenableFutureArr) {
        return new elfn(elfr.b(listenableFutureArr));
    }

    public static elfn l(Iterable iterable) {
        return new elfn(elfr.c(iterable));
    }

    @SafeVarargs
    public static elfn m(ListenableFuture... listenableFutureArr) {
        return new elfn(elfr.d(listenableFutureArr));
    }
}
