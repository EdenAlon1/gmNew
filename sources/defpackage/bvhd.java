package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvhd extends dtyx {
    public bvhd(String[] strArr) {
        super("p2p_suggestions", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bvhc b() {
        l();
        return new bvhc(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(bvhn.c);
        bvgo[] bvgoVarArr = (bvgo[]) apply;
        int intValue = bvhn.c().intValue();
        for (bvgo bvgoVar : bvgoVarArr) {
            if (((Integer) bvhn.b.getOrDefault(bvgoVar.toString(), -1)).intValue() > intValue) {
                dtub.w("columnReference.toString()", intValue);
            }
        }
        m(bvgoVarArr);
    }

    public final void d(Function function) {
        Object apply;
        String[] strArr = bvhn.a;
        apply = function.apply(new bvhm());
        k(new bvhg((bvhm) apply));
    }
}
