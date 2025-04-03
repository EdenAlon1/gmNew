package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cogn extends dtyx {
    public cogn(String[] strArr) {
        super("scheduled_send INNER JOIN messages ON (messages._id=scheduled_send.message_id) LEFT JOIN parts ON (parts.message_id=messages._id) LEFT JOIN message_captions ON (message_captions.message_id=messages._id)", strArr, "messages._id", null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cogl b() {
        l();
        return new cogl(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = cogq.a;
        apply = function.apply(new cogp());
        k(new cogo((cogp) apply));
    }
}
