package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcdp extends dtyx {
    public bcdp(String[] strArr) {
        super("parts_backup", strArr, null, null, null, "backup");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bcdo b() {
        l();
        return new bcdo(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = bcds.a;
        apply = function.apply(new bcdr());
        k(new bcdq((bcdr) apply));
    }
}
