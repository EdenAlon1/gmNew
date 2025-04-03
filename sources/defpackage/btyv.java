package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btyv extends dtyx {
    public btyv(String[] strArr) {
        super("message_edits", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final btyt b() {
        l();
        return new btyt(this.a.a());
    }

    public final void c(btyi... btyiVarArr) {
        int a = btza.c().a();
        Integer.valueOf(a).getClass();
        for (btyi btyiVar : btyiVarArr) {
            if (((Integer) btza.b.getOrDefault(btyiVar.toString(), -1)).intValue() > a) {
                dtub.w("columnReference.toString()", a);
            }
        }
        m(btyiVarArr);
    }

    public final void d(btys... btysVarArr) {
        C((String) DesugarArrays.stream(btysVarArr).map(new Function() { // from class: btyu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((btys) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void e(Function function) {
        Object apply;
        apply = function.apply(btza.c);
        c((btyi[]) apply);
    }

    public final void f(Function function) {
        Object apply;
        apply = function.apply(btza.c);
        c((btyi) apply);
    }

    public final void g(Function function) {
        Object apply;
        String[] strArr = btza.a;
        apply = function.apply(new btyz());
        k(new btyy((btyz) apply));
    }
}
