package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btkd extends dtyx {
    public btkd(String[] strArr) {
        super("generic_worker_queue", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final btkb b() {
        l();
        return new btkb(this.a.a());
    }

    public final void c(btka... btkaVarArr) {
        C((String) DesugarArrays.stream(btkaVarArr).map(new Function() { // from class: btkc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((btka) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void d(Function function) {
        Object apply;
        String[] strArr = btki.a;
        apply = function.apply(new btkh());
        k(new btkg((btkh) apply));
    }
}
