package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btvs extends dtyx {
    public btvs(String[] strArr) {
        super("message_classifications_table", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final btvr b() {
        l();
        return new btvr(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = btvy.a;
        apply = function.apply(new btvx());
        k(new btvt((btvx) apply));
    }
}
