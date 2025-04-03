package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwgr extends dtyx {
    public bwgr(String[] strArr) {
        super("pending_incoming_message_rcs_table", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bwgp b() {
        l();
        return new bwgp(this.a.a());
    }

    public final void c(bwfo... bwfoVarArr) {
        int intValue = bwgw.c().intValue();
        for (bwfo bwfoVar : bwfoVarArr) {
            if (((Integer) bwgw.b.getOrDefault(bwfoVar.toString(), -1)).intValue() > intValue) {
                dtub.w("columnReference.toString()", intValue);
            }
        }
        m(bwfoVarArr);
    }

    public final void d(Function function) {
        Object apply;
        String[] strArr = bwgw.a;
        apply = function.apply(new bwgv());
        k(new bwgs((bwgv) apply));
    }
}
