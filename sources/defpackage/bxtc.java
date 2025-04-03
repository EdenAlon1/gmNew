package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxtc extends dtyx {
    public bxtc(String[] strArr) {
        super("self_participants", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bxtb b() {
        l();
        return new bxtb(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = bxth.a;
        apply = function.apply(new bxtg());
        k(new bxtf((bxtg) apply));
    }
}
