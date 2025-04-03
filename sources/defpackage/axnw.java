package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axnw {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/concurrent/CrashOnUnexpectedExceptionFutureCallback");

    public static elfl a(elfl elflVar) {
        final RuntimeException runtimeException = new RuntimeException();
        return elflVar.f(Throwable.class, new eroh() { // from class: axnq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Throwable th = (Throwable) obj;
                axnw.g(th, runtimeException, new axnp());
                return elfo.d(th);
            }
        }, erpp.a);
    }

    public static erqj b() {
        return new axnt(new Function() { // from class: axnr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new RuntimeException((Throwable) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new RuntimeException());
    }

    public static erqj c(Consumer consumer) {
        return new axnv(consumer, new axnp(), new RuntimeException());
    }

    public static void d(Throwable th) {
        j(th, null, new axnp());
    }

    public static void e(ListenableFuture listenableFuture) {
        elfr.l(listenableFuture, axnu.a, erpp.a);
    }

    public static void f(ListenableFuture listenableFuture, String str) {
        elfr.l(listenableFuture, new axnu(str), erpp.a);
    }

    public static void g(Throwable th, RuntimeException runtimeException, Function function) {
        if (!(th instanceof CancellationException)) {
            j(th, runtimeException, function);
            return;
        }
        ensk j = a.j();
        j.Y(ente.a, "Bugle");
        ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/shared/concurrent/CrashOnUnexpectedExceptionFutureCallback", "onFailure", (char) 273, "CrashOnUnexpectedExceptionFutureCallback.java")).q("future failed due to CancellationException");
    }

    public static void h(ListenableFuture listenableFuture) {
        elfr.l(listenableFuture, b(), erpp.a);
    }

    public static void i(ListenableFuture listenableFuture, Consumer consumer, Executor executor) {
        elfr.l(listenableFuture, c(consumer), executor);
    }

    private static void j(Throwable th, RuntimeException runtimeException, Function function) {
        Object apply;
        apply = function.apply(th);
        final RuntimeException runtimeException2 = (RuntimeException) apply;
        if (runtimeException != null) {
            runtimeException2.setStackTrace(runtimeException.getStackTrace());
        }
        efbd.a().post(new Runnable() { // from class: axnn
            @Override // java.lang.Runnable
            public final void run() {
                throw runtimeException2;
            }
        });
    }
}
