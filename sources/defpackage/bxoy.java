package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxoy extends dtyx {
    public bxoy(String[] strArr) {
        super("restore_workflow_scratch_suffix", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bxox b() {
        l();
        return new bxox(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = bxpb.a;
        apply = function.apply(new bxpa());
        k(new bxoz((bxpa) apply));
    }
}
