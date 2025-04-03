package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxqd extends dtyx {
    public bxqd(String[] strArr) {
        super("restore_workflow_scratch_timestamps", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bxqc b() {
        l();
        return new bxqc(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = bxqg.a;
        apply = function.apply(new bxqf());
        k(new bxqe((bxqf) apply));
    }
}
