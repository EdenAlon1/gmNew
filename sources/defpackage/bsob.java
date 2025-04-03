package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsob extends dtyx<bskr, bsnz, bsob, bseh, bskq> {
    public bsob(String[] strArr) {
        super("conversations", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bsnz b() {
        l();
        return new bsnz(this.a.a());
    }

    public final void c(bskq... bskqVarArr) {
        int intValue = bsom.g().intValue();
        for (bskq bskqVar : bskqVarArr) {
            if (((Integer) bsom.b.getOrDefault(bskqVar.toString(), -1)).intValue() > intValue) {
                dtub.w("columnReference.toString()", intValue);
            }
        }
        m(bskqVarArr);
    }

    public final void d() {
        ((dtri) this.a).o = true;
    }

    public final void e(bsny... bsnyVarArr) {
        C((String) DesugarArrays.stream(bsnyVarArr).map(new Function() { // from class: bsoa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bsny) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void f(Function function) {
        Object apply;
        apply = function.apply(bsom.c);
        c((bskq[]) apply);
    }

    public final void g(Function function) {
        Object apply;
        apply = function.apply(bsom.c);
        c((bskq) apply);
    }

    public final void h(bsol bsolVar) {
        k(new bsof(bsolVar));
    }

    public final void i(Function function) {
        Object apply;
        String[] strArr = bsom.a;
        apply = function.apply(new bsol());
        k(new bsof((bsol) apply));
    }
}
