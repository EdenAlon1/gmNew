package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bjny extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new bjnv(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        aq(new dtrt("conversation_to_participants.conversation_id", 1, Long.valueOf(bdgq.a(conversationIdType))));
    }
}
