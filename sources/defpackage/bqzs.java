package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqzs extends dtyx<bqyp, bqzq, bqzs, bqwx, bqyo> {
    public bqzs(String[] strArr) {
        super("contacts", strArr, null, null, null, "$primary");
    }

    private final void g(bqyo... bqyoVarArr) {
        int intValue = bqzv.c().intValue();
        for (bqyo bqyoVar : bqyoVarArr) {
            if (((Integer) bqzv.b.getOrDefault(bqyoVar.toString(), -1)).intValue() > intValue) {
                dtub.w("columnReference.toString()", intValue);
            }
        }
        m(bqyoVarArr);
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bqzq b() {
        l();
        return new bqzq(this.a.a());
    }

    public final void c(bqzp... bqzpVarArr) {
        C((String) DesugarArrays.stream(bqzpVarArr).map(new Function() { // from class: bqzr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bqzp) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(bqzv.c);
        g((bqyo[]) apply);
    }

    public final void e(Function function) {
        Object apply;
        apply = function.apply(bqzv.c);
        g((bqyo) apply);
    }

    public final void f(Function function) {
        Object apply;
        String[] strArr = bqzv.a;
        apply = function.apply(new bqzu());
        k(new bqzt((bqzu) apply));
    }
}
