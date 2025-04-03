package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bukw extends dtyx {
    public bukw(String[] strArr) {
        super("message_spam", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final buku b() {
        l();
        return new buku(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = buld.a;
        apply = function.apply(new bulc());
        k(new bukz((bulc) apply));
    }
}
