package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class duqy {
    public static ListenableFuture a(duqz duqzVar) {
        return erny.f(duqzVar.a(), new emwl() { // from class: duqx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Stream map = Collection.EL.stream((engw) obj).map(new Function() { // from class: duqw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return duvf.a((String) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = engw.d;
                return (engw) map.collect(endq.a);
            }
        }, erpp.a);
    }

    public static void b(duqz duqzVar, duvw duvwVar) {
        duqzVar.e(((duvb) duvwVar).a);
    }
}
