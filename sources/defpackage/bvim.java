package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvim extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new bvil(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        aq(new dtrt("parent_disallowed_conversations.conversation_id", 1, Long.valueOf(bdgq.a(conversationIdType))));
    }
}
