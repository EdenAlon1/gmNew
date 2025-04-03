package defpackage;

import j$.util.function.Function$CC;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class axos {
    private static final cfup a = cfvl.i(cfvl.b, "executor_callbacks_always_crash", false);

    @Deprecated
    public static void a(Runnable runnable, Executor executor) {
        if (!axov.a() && !((Boolean) a.e()).booleanValue()) {
            executor.execute(eldl.l(runnable));
            return;
        }
        elfo.f(runnable, executor).k(new axnt(new Function() { // from class: axns
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new axow((Throwable) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new RuntimeException()), erpp.a);
    }
}
