package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avny extends dtyx {
    public avny(String[] strArr) {
        super("rcs_remote_capabilities_cache", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final avnx b() {
        l();
        return new avnx(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = avod.a;
        apply = function.apply(new avoc());
        k(new avob((avoc) apply));
    }
}
