package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btgx extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new btgw(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        aq(new dtrt("gemini_conversation_id_mappings.conversation_id", 1, Long.valueOf(bdgq.a(conversationIdType))));
    }

    public final void c(azsu azsuVar) {
        aq(new dtrt("gemini_conversation_id_mappings.my_identity_token", 1, azsv.b(azsuVar)));
    }
}
