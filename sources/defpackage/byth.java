package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byth extends dtyx {
    public byth(String[] strArr) {
        super("user_references", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bytf b() {
        l();
        return new bytf(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(bytk.c);
        bysr[] bysrVarArr = (bysr[]) apply;
        int a = bytk.c().a();
        Integer.valueOf(a).getClass();
        for (bysr bysrVar : bysrVarArr) {
            if (((Integer) bytk.b.getOrDefault(bysrVar.toString(), -1)).intValue() > a) {
                dtub.w("columnReference.toString()", a);
            }
        }
        m(bysrVarArr);
    }

    public final void d(Function function) {
        Object apply;
        String[] strArr = bytk.a;
        apply = function.apply(new bytj());
        k(new byti((bytj) apply));
    }
}
