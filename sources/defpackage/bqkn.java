package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqkn extends dtyx {
    public bqkn(String[] strArr) {
        super("cms_dead_letter_queue", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bqkm b() {
        l();
        return new bqkm(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = bqkv.a;
        apply = function.apply(new bqku());
        k(new bqkq((bqku) apply));
    }
}
