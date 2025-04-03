package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bruw extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new bruv(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        aq(new dtrt("conversation_participants_audit_log.conversation_id", 1, Long.valueOf(bdgq.a(conversationIdType))));
    }
}
