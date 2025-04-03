package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azdq extends dtyx {
    public azdq(String[] strArr) {
        super("destinations", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final azdp b() {
        l();
        return new azdp(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = azdt.a;
        apply = function.apply(new azds());
        k(new azdr((azds) apply));
    }
}
