package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btmp extends dtyx {
    public btmp(String[] strArr) {
        super("lighter_conversations_table", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final btmo b() {
        l();
        return new btmo(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = btmu.a;
        apply = function.apply(new btmt());
        k(new btms((btmt) apply));
    }
}
