package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxnv extends dtyx {
    public bxnv(String[] strArr) {
        super("restore_workflow_scratch_duplicates", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bxnu b() {
        l();
        return new bxnu(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = bxny.a;
        apply = function.apply(new bxnx());
        k(new bxnw((bxnx) apply));
    }
}
