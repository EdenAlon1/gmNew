package defpackage;

import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class axou {
    private static final cfup a = cfvl.i(cfvl.b, "future_callbacks_always_crash", false);

    @Deprecated
    public static erqj a(final erqj erqjVar) {
        return (axov.a() || ((Boolean) a.e()).booleanValue()) ? new axnv(new Consumer() { // from class: axot
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                erqj.this.b(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Function() { // from class: axno
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
        }, new RuntimeException()) : erqjVar;
    }
}
