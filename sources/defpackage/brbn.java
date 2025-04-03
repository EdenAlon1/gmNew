package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brbn extends dtyx {
    public brbn(String[] strArr) {
        super("conversation_classifications_table", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final brbm b() {
        l();
        return new brbm(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = brbs.a;
        apply = function.apply(new brbr());
        k(new brbq((brbr) apply));
    }
}
