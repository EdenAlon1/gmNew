package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btch extends dtyx {
    public btch(String[] strArr) {
        super("etouffee_rcs_metadata", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final btcg b() {
        l();
        return new btcg(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = btck.a;
        apply = function.apply(new btcj());
        k(new btci((btcj) apply));
    }
}
