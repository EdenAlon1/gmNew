package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bruu extends dtyx {
    public bruu(String[] strArr) {
        super("conversation_participants_audit_log", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final brut b() {
        l();
        return new brut(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = brux.a;
        apply = function.apply(new bruw());
        k(new bruv((bruw) apply));
    }
}
