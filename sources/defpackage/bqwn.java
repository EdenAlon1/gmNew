package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqwn extends dtyx {
    public bqwn(String[] strArr) {
        super("cms", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bqwl b() {
        l();
        return new bqwl(this.a.a());
    }

    public final void c(bqwk... bqwkVarArr) {
        C((String) DesugarArrays.stream(bqwkVarArr).map(new Function() { // from class: bqwm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bqwk) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void d(bqwr bqwrVar) {
        k(new bqwq(bqwrVar));
    }

    public final void e(Function function) {
        Object apply;
        String[] strArr = bqws.a;
        apply = function.apply(new bqwr());
        k(new bqwq((bqwr) apply));
    }
}
