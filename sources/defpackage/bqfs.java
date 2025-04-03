package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqfs extends dtyx {
    public bqfs(String[] strArr) {
        super("business_conversations_metadata", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bqfr b() {
        l();
        return new bqfr(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = bqfx.a;
        apply = function.apply(new bqfw());
        k(new bqfv((bqfw) apply));
    }
}
