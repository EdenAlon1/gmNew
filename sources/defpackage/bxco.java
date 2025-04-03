package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxco extends dtyx {
    public bxco(String[] strArr) {
        super("reminders", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bxcm b() {
        l();
        return new bxcm(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(bxct.c);
        bxbz[] bxbzVarArr = {(bxbz) apply};
        int intValue = bxct.e().intValue();
        if (((Integer) bxct.b.getOrDefault(bxbzVarArr[0].toString(), -1)).intValue() > intValue) {
            dtub.w("columnReference.toString()", intValue);
        }
        m(bxbzVarArr);
    }

    public final void d(bxcs bxcsVar) {
        k(new bxcr(bxcsVar));
    }

    public final void e(Function function) {
        Object apply;
        String[] strArr = bxct.a;
        apply = function.apply(new bxcs());
        k(new bxcr((bxcs) apply));
    }
}
