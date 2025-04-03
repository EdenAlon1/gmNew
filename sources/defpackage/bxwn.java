package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxwn extends dtyx {
    public bxwn(String[] strArr) {
        super("settings", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bxwm b() {
        l();
        return new bxwm(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = bxws.a;
        apply = function.apply(new bxwr());
        k(new bxwq((bxwr) apply));
    }
}
