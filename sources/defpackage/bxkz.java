package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxkz extends dtyx {
    public bxkz(String[] strArr) {
        super("restore_workflow_executions", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bxkx b() {
        l();
        return new bxkx(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = bxle.a;
        apply = function.apply(new bxld());
        k(new bxlc((bxld) apply));
    }
}
