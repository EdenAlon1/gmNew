package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btgt extends dtyx {
    public btgt(String[] strArr) {
        super("gemini_conversation_id_mappings", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final btgs b() {
        l();
        return new btgs(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = btgy.a;
        apply = function.apply(new btgx());
        k(new btgw((btgx) apply));
    }
}
