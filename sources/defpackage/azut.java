package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azut extends dtyx {
    public azut(String[] strArr) {
        super("subscriptions", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final azus b() {
        l();
        return new azus(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = azuy.a;
        apply = function.apply(new azux());
        k(new azuw((azux) apply));
    }
}
