package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bueb extends dtyx {
    public bueb(String[] strArr) {
        super("message_reactions", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final buea b() {
        l();
        return new buea(this.a.a());
    }

    public final void c(budl... budlVarArr) {
        int intValue = bueg.c().intValue();
        for (budl budlVar : budlVarArr) {
            if (((Integer) bueg.b.getOrDefault(budlVar.toString(), -1)).intValue() > intValue) {
                dtub.w("columnReference.toString()", intValue);
            }
        }
        m(budlVarArr);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(bueg.c);
        c((budl[]) apply);
    }

    public final void e(Function function) {
        Object apply;
        apply = function.apply(bueg.c);
        c((budl) apply);
    }

    public final void f(Function function) {
        Object apply;
        String[] strArr = bueg.a;
        apply = function.apply(new buef());
        k(new buee((buef) apply));
    }
}
