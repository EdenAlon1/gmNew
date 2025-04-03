package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayfe {
    public static void a(Context context, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId) {
        Intent intent = new Intent("conversation_self_id_change");
        intent.putExtra("conversation_id", conversationIdType.a());
        if (!conversationIdType.b()) {
            intent.putExtra("mapi_conversation_id", new BugleConversationId(conversationIdType));
        }
        intent.putExtra("conversation_self_id", aquz.b(selfIdentityId));
        lpf.a(context).d(intent);
    }
}
