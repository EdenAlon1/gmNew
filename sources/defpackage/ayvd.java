package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayvd extends dtyx {
    public ayvd(String[] strArr) {
        super("conversations INNER JOIN conversation_to_participants ON (conversation_to_participants.conversation_id=conversations._id) INNER JOIN participants ON (participants._id=conversation_to_participants.participant_id)", strArr, "conversations._id", null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ayvb b() {
        l();
        return new ayvb(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = ayvg.a;
        apply = function.apply(new ayvf());
        k(new ayve((ayvf) apply));
    }
}
