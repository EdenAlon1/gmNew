package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public interface cnla {
    kma a(ConversationIdType conversationIdType, MessageIdType messageIdType);

    bxbi b(String str);

    elfl c(String[] strArr);

    elfl d();

    elfl e();

    elfl f(String str);

    elfl g();

    elfl h(MessageIdType messageIdType, ConversationIdType conversationIdType);

    ListenableFuture i(ConversationId conversationId, String str);

    void j();

    void k(aeiy aeiyVar);

    PendingIntent l(String[] strArr);

    PendingIntent m(String str);

    PendingIntent n(ConversationIdType conversationIdType, String str);

    PendingIntent o(Context context, ConversationIdType conversationIdType, String str);

    elfl p(ConversationIdType conversationIdType);

    void q(aeiy aeiyVar);

    elfl r(String str, ConversationIdType conversationIdType, int i);

    elfl s(MessageIdType messageIdType, ConversationIdType conversationIdType, int i);

    elfl t(ConversationIdType conversationIdType, String str, int i);

    elfl u(MessageIdType messageIdType, ConversationIdType conversationIdType, long j, int i);

    ListenableFuture v(MessageIdType messageIdType, ConversationIdType conversationIdType, long j, int i);

    void w(int i, int i2);

    void x(int i);
}
