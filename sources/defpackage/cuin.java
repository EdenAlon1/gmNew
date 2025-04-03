package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuin extends dtyx {
    public cuin(String[] strArr) {
        super("spam_logging_ids_table", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cuim b() {
        l();
        return new cuim(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = cuiq.a;
        apply = function.apply(new cuip());
        k(new cuio((cuip) apply));
    }
}
