package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cffo extends dtyx {
    public cffo(String[] strArr) {
        super("work_queue_work_manager_ids", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cffn b() {
        l();
        return new cffn(this.a.a());
    }

    public final void c(cfew... cfewVarArr) {
        int a = cfft.d().a();
        Integer.valueOf(a).getClass();
        for (cfew cfewVar : cfewVarArr) {
            if (((Integer) cfft.b.getOrDefault(cfewVar.toString(), -1)).intValue() > a) {
                dtub.w("columnReference.toString()", a);
            }
        }
        m(cfewVarArr);
    }

    public final void d(Function function) {
        Object apply;
        String[] strArr = cfft.a;
        apply = function.apply(new cffs());
        k(new cffr((cffs) apply));
    }
}
