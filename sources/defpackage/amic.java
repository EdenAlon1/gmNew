package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amic {
    public static final ConversationIdType a(ConversationId conversationId) {
        if (conversationId instanceof RbmConversationId) {
            ConversationIdType conversationIdType = ((RbmConversationId) conversationId).a;
            conversationIdType.getClass();
            return conversationIdType;
        }
        if (conversationId instanceof EmergencySosConversationId) {
            return ((EmergencySosConversationId) conversationId).a;
        }
        if (conversationId instanceof EmergencyConversationId) {
            return ((EmergencyConversationId) conversationId).a;
        }
        if (!(conversationId instanceof PenpalBotConversationId)) {
            return ((BugleConversationId) conversationId).a;
        }
        ConversationIdType conversationIdType2 = ((PenpalBotConversationId) conversationId).a;
        conversationIdType2.getClass();
        return conversationIdType2;
    }
}
