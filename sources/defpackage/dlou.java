package defpackage;

import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlou extends elna {
    public static final /* synthetic */ int b = 0;
    public final List a;

    public dlou(List list) {
        List list2 = (List) Collection.EL.stream(list).map(new Function() { // from class: dloq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new elnl((eloy) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toUnmodifiableList());
        this.a = list2;
        Collection.EL.stream(list2).map(new Function() { // from class: dlor
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elno) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).forEach(new Consumer() { // from class: dlos
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                eloy eloyVar = (eloy) obj;
                int i = dlou.b;
                if (eloyVar instanceof dlow) {
                    ((dlow) eloyVar).b();
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.elna
    protected final boolean a(eloy eloyVar) {
        if (eloyVar instanceof dlov) {
            return ((dlov) eloyVar).a();
        }
        return true;
    }
}
