package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dloy implements elnz {
    private final Function a;

    private dloy(Function function) {
        this.a = function;
    }

    public static dloy a(final Consumer consumer) {
        return new dloy(new Function() { // from class: dlox
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Consumer.this.accept(obj);
                return elod.c().a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.elnz
    public final ListenableFuture b(Object obj) {
        Object apply;
        apply = this.a.apply(obj);
        return erqt.i((elod) apply);
    }
}
