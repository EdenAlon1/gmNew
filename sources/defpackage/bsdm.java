package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsdm extends dtyx<bsdb, bsdl, bsdm, bscj, bsda> {
    public bsdm(String[] strArr) {
        super("conversation_to_participants", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bsdl b() {
        l();
        return new bsdl(this.a.a());
    }

    public final void c(bsda... bsdaVarArr) {
        int a = bsdr.c().a();
        Integer.valueOf(a).getClass();
        for (bsda bsdaVar : bsdaVarArr) {
            if (((Integer) bsdr.b.getOrDefault(bsdaVar.toString(), -1)).intValue() > a) {
                dtub.w("columnReference.toString()", a);
            }
        }
        m(bsdaVarArr);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(bsdr.c);
        c((bsda[]) apply);
    }

    public final void e(Function function) {
        Object apply;
        apply = function.apply(bsdr.c);
        c((bsda) apply);
    }

    public final void f(Function function) {
        Object apply;
        String[] strArr = bsdr.a;
        apply = function.apply(new bsdq());
        k(new bsdp((bsdq) apply));
    }
}
