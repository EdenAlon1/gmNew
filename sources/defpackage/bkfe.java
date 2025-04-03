package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bkfe extends dtyx {
    public bkfe(String[] strArr) {
        super("draft_parts_view", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bkfd b() {
        l();
        return new bkfd(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = bkfh.a;
        apply = function.apply(new bkfg());
        k(new bkff((bkfg) apply));
    }
}
