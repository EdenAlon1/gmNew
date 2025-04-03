package defpackage;

import com.google.android.apps.messaging.conversation2.api.OpenConversation2Arguments;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xeb implements fbba {
    public static OpenConversation2Arguments a(llv llvVar) {
        llvVar.getClass();
        OpenConversation2Arguments openConversation2Arguments = (OpenConversation2Arguments) llvVar.b("open_conversation2_arguments");
        if (openConversation2Arguments != null) {
            return openConversation2Arguments;
        }
        Object b = llvVar.b("mapi_conversation_id");
        b.getClass();
        return new OpenConversation2Arguments((ConversationId) b, null, null, null, false, false, null, 126, null);
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
