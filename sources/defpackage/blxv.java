package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class blxv extends dtyx {
    public blxv(String[] strArr) {
        super("messages_annotations INNER JOIN conversations ON (conversations.latest_message_id=messages_annotations.message_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final blxu b() {
        l();
        return new blxu(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = blxy.a;
        apply = function.apply(new blxx());
        k(new blxw((blxx) apply));
    }
}
