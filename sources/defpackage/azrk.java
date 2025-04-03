package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azrk extends dtyx {
    public azrk(String[] strArr) {
        super("my_identities LEFT JOIN subscriptions ON (subscriptions.my_identity_token=my_identities.token)", strArr, "token", null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final azrj b() {
        l();
        return new azrj(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = azrn.a;
        apply = function.apply(new azrm());
        k(new azrl((azrm) apply));
    }
}
