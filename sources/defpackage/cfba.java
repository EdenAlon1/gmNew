package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfba extends dtyx {
    public cfba(String[] strArr) {
        super("work_queue", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cfay b() {
        l();
        return new cfay(this.a.a());
    }

    public final void c(cfaf... cfafVarArr) {
        int intValue = cfbf.c().intValue();
        for (cfaf cfafVar : cfafVarArr) {
            if (((Integer) cfbf.b.getOrDefault(cfafVar.toString(), -1)).intValue() > intValue) {
                dtub.w("columnReference.toString()", intValue);
            }
        }
        m(cfafVarArr);
    }

    public final void d(cfax... cfaxVarArr) {
        C((String) DesugarArrays.stream(cfaxVarArr).map(new Function() { // from class: cfaz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cfax) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void e(Function function) {
        Object apply;
        String[] strArr = cfbf.a;
        apply = function.apply(new cfbe());
        k(new cfbd((cfbe) apply));
    }
}
