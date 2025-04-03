package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brwp extends dtyx<brwa, brwo, brwp, brvg, brvz> {
    public brwp(String[] strArr) {
        super("conversation_participants", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final brwo b() {
        l();
        return new brwo(this.a.a());
    }

    public final void c(brvz... brvzVarArr) {
        int intValue = brww.d().intValue();
        for (brvz brvzVar : brvzVarArr) {
            if (((Integer) brww.b.getOrDefault(brvzVar.toString(), -1)).intValue() > intValue) {
                dtub.w("columnReference.toString()", intValue);
            }
        }
        m(brvzVarArr);
    }

    public final void d(brwv brwvVar) {
        k(new brwu(brwvVar));
    }

    public final void e(Function function) {
        Object apply;
        String[] strArr = brww.a;
        apply = function.apply(new brwv());
        k(new brwu((brwv) apply));
    }
}
