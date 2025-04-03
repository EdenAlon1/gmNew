package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvao extends dtyx {
    public bvao(String[] strArr) {
        super("smarts_personalization_decayed_feature_values", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bvam b() {
        l();
        return new bvam(this.a.a());
    }

    public final void c(bval... bvalVarArr) {
        C((String) DesugarArrays.stream(bvalVarArr).map(new Function() { // from class: bvan
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bval) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(bvar.c);
        bvad[] bvadVarArr = {(bvad) apply};
        int a = bvar.c().a();
        Integer.valueOf(a).getClass();
        if (((Integer) bvar.b.getOrDefault(bvadVarArr[0].toString(), -1)).intValue() > a) {
            dtub.w("columnReference.toString()", a);
        }
        m(bvadVarArr);
    }

    public final void e(Function function) {
        Object apply;
        String[] strArr = bvar.a;
        apply = function.apply(new bvaq());
        k(new bvap((bvaq) apply));
    }
}
