package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvbr extends dtyx {
    public bvbr(String[] strArr) {
        super("smarts_personalization_features", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bvbq b() {
        l();
        return new bvbq(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = bvbu.a;
        apply = function.apply(new bvbt());
        k(new bvbs((bvbt) apply));
    }
}
