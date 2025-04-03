package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxmp extends dtyx {
    public bxmp(String[] strArr) {
        super("restore_workflow_files", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bxmo b() {
        l();
        return new bxmo(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = bxmu.a;
        apply = function.apply(new bxmt());
        k(new bxms((bxmt) apply));
    }
}
