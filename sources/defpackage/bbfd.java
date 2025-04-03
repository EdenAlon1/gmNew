package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface bbfd extends bbck<Void> {
    elfl a(ConversationIdType conversationIdType);

    elfl b(ConversationIdType conversationIdType, MessageIdType messageIdType);

    void d(ConversationIdType conversationIdType);

    void e(ConversationIdType conversationIdType);

    Action f(ConversationIdType conversationIdType, MessageIdType messageIdType, boolean z);

    Action g(ConversationIdType[] conversationIdTypeArr, MessageIdType messageIdType);

    Action h(ConversationIdType conversationIdType, MessageIdType messageIdType);

    void j(ConversationIdType conversationIdType, MessageIdType messageIdType);

    void k(ConversationIdType conversationIdType);

    Action l();
}
