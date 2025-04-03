package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqte extends dtyx {
    public cqte(String[] strArr) {
        super("file_transfer", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cqtd b() {
        l();
        return new cqtd(this.a.a());
    }

    public final void c(cqso... cqsoVarArr) {
        int intValue = cqtj.d().intValue();
        for (cqso cqsoVar : cqsoVarArr) {
            if (((Integer) cqtj.b.getOrDefault(cqsoVar.toString(), -1)).intValue() > intValue) {
                dtub.w("columnReference.toString()", intValue);
            }
        }
        m(cqsoVarArr);
    }

    public final void d(cqti cqtiVar) {
        k(new cqth(cqtiVar));
    }

    public final void e(Function function) {
        Object apply;
        String[] strArr = cqtj.a;
        apply = function.apply(new cqti());
        k(new cqth((cqti) apply));
    }
}
