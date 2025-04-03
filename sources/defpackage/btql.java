package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btql extends dtyx {
    public btql(String[] strArr) {
        super("link_preview", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final btqk b() {
        l();
        return new btqk(this.a.a());
    }

    public final void c(btpr... btprVarArr) {
        int intValue = btqq.d().intValue();
        for (btpr btprVar : btprVarArr) {
            if (((Integer) btqq.b.getOrDefault(btprVar.toString(), -1)).intValue() > intValue) {
                dtub.w("columnReference.toString()", intValue);
            }
        }
        m(btprVarArr);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(btqq.c);
        c((btpr[]) apply);
    }

    public final void e(Function function) {
        Object apply;
        String[] strArr = btqq.a;
        apply = function.apply(new btqp());
        k(new btqo((btqp) apply));
    }
}
