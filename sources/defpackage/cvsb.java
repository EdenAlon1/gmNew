package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvsb {
    public static final ConversationId a(llv llvVar) {
        llvVar.getClass();
        ConversationId conversationId = (ConversationId) llvVar.b("conversation_mapi_id");
        if (conversationId != null) {
            return conversationId;
        }
        String str = (String) llvVar.b("conversation_id");
        if (str == null) {
            return null;
        }
        return new BugleConversationId(bdgq.b(str));
    }
}
