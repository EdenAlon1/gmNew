package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public interface bzqb {
    MessageCoreData a(ConversationIdType conversationIdType, MessageIdType messageIdType);

    elfl b(String str);

    engw c(int i);

    engw d(ConversationIdType conversationIdType, engw engwVar);

    Optional e(MessageIdType messageIdType);

    void f(engw engwVar, ConversationIdType conversationIdType);

    void g(SelfIdentityId selfIdentityId);

    void h(awui awuiVar, ConversationIdType conversationIdType, int i, caqc caqcVar);

    @Deprecated
    void i(ConversationIdType conversationIdType, int i, caqc caqcVar);

    boolean j(ConversationIdType conversationIdType);

    boolean k(MessageIdType messageIdType);
}
