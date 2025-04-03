package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsuz extends dtyx {
    public bsuz(String[] strArr) {
        super("desktop", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bsux b() {
        l();
        return new bsux(this.a.a());
    }

    public final void c(bsts... bstsVarArr) {
        int intValue = bsve.c().intValue();
        for (bsts bstsVar : bstsVarArr) {
            if (((Integer) bsve.b.getOrDefault(bstsVar.toString(), -1)).intValue() > intValue) {
                dtub.w("columnReference.toString()", intValue);
            }
        }
        m(bstsVarArr);
    }

    public final void d(bsuw... bsuwVarArr) {
        C((String) DesugarArrays.stream(bsuwVarArr).map(new Function() { // from class: bsuy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bsuw) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void e(Function function) {
        Object apply;
        apply = function.apply(bsve.c);
        c((bsts) apply);
    }

    public final void f(Function function) {
        Object apply;
        String[] strArr = bsve.a;
        apply = function.apply(new bsvd());
        k(new bsvc((bsvd) apply));
    }
}
