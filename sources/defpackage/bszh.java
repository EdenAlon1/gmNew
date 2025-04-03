package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bszh extends dtyx {
    public bszh(String[] strArr) {
        super("emergency_sessions", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bszg b() {
        l();
        return new bszg(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = bszm.a;
        apply = function.apply(new bszl());
        k(new bszk((bszl) apply));
    }
}
