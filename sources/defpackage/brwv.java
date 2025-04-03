package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brwv extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new brwu(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        aq(new dtrt("conversation_participants.conversation_id", 1, Long.valueOf(bdgq.a(conversationIdType))));
    }

    public final void c(long j) {
        aq(new dtwe("conversation_participants.participant_id", 1, Long.valueOf(j)));
    }

    public final void d(Iterable iterable) {
        aq(new dtrw("conversation_participants.participant_id", 3, at(iterable), true));
    }
}
