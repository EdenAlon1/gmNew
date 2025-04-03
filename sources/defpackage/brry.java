package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brry extends dtyx {
    public brry(String[] strArr) {
        super("conversation_labels", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final brrx b() {
        l();
        return new brrx(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(brsd.c);
        brre[] brreVarArr = {(brre) apply};
        int intValue = brsd.c().intValue();
        if (((Integer) brsd.b.getOrDefault(brreVarArr[0].toString(), -1)).intValue() > intValue) {
            dtub.w("columnReference.toString()", intValue);
        }
        m(brreVarArr);
    }

    public final void d(Function function) {
        Object apply;
        String[] strArr = brsd.a;
        apply = function.apply(new brsc());
        k(new brsb((brsc) apply));
    }
}
