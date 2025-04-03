package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwvt extends dtyx {
    public bwvt(String[] strArr) {
        super("read_reports", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bwvs b() {
        l();
        return new bwvs(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(bwvy.c);
        bwvh[] bwvhVarArr = (bwvh[]) apply;
        int intValue = bwvy.d().intValue();
        for (bwvh bwvhVar : bwvhVarArr) {
            if (((Integer) bwvy.b.getOrDefault(bwvhVar.toString(), -1)).intValue() > intValue) {
                dtub.w("columnReference.toString()", intValue);
            }
        }
        m(bwvhVarArr);
    }

    public final void d(Function function) {
        Object apply;
        String[] strArr = bwvy.a;
        apply = function.apply(new bwvx());
        k(new bwvw((bwvx) apply));
    }
}
