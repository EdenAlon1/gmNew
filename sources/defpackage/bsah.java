package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsah extends dtyx {
    public bsah(String[] strArr) {
        super("conversation_suggestions", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bsag b() {
        l();
        return new bsag(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = bsam.a;
        apply = function.apply(new bsal());
        k(new bsak((bsal) apply));
    }
}
