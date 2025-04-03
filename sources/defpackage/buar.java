package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buar extends dtyx {
    public buar(String[] strArr) {
        super("message_labels", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final buap b() {
        l();
        return new buap(this.a.a());
    }

    public final void c(buac... buacVarArr) {
        int intValue = buaw.c().intValue();
        if (((Integer) buaw.b.getOrDefault(buacVarArr[0].toString(), -1)).intValue() > intValue) {
            dtub.w("columnReference.toString()", intValue);
        }
        m(buacVarArr);
    }

    public final void d(Function function) {
        Object apply;
        String[] strArr = buaw.a;
        apply = function.apply(new buav());
        k(new buau((buav) apply));
    }
}
