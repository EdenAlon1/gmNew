package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface alxl {
    elfl A(ConversationId conversationId, Uri uri);

    elfl B(ConversationId conversationId);

    elfl C(ConversationId conversationId, eoko eokoVar);

    aqge D(int i);

    elfl E(engw engwVar, int i);

    elfl F(engw engwVar, int i);

    Conversation a(ConversationId conversationId, alxk alxkVar);

    ConversationId b(amwl amwlVar);

    ConversationId c(byte[] bArr);

    aqge d(ConversationId conversationId);

    elfl e(ConversationId conversationId, eoko eokoVar);

    elfl f(ConversationId conversationId);

    elfl g(anvc anvcVar);

    elfl h(azcr azcrVar);

    @Deprecated
    elfl i(engw engwVar);

    elfl j();

    @Deprecated
    elfl k(engw engwVar, String str);

    elfl l(azcr azcrVar, aqux aquxVar, amer amerVar);

    elfl m(Optional optional, engw engwVar, String str);

    elfl n(ConversationId conversationId, ampp amppVar, Recipient recipient);

    elfl o(ConversationId conversationId);

    elfl p(engw engwVar);

    elfl q(ConversationId conversationId, ampp amppVar);

    elfl r(Recipient recipient);

    elfl s(ConversationId conversationId, String str);

    elfl t(ConversationId conversationId, aqux aquxVar);

    elfl u(ConversationId conversationId, String str, String str2, apmq apmqVar);

    elfl v(ConversationId conversationId, String str, Uri uri);

    elfl w(ConversationId conversationId, amny amnyVar);

    elfl x(ConversationId conversationId, cuea cueaVar);

    elfl y(ConversationId conversationId, eoko eokoVar);

    elfl z(ConversationId conversationId, cuex cuexVar, String str, boolean z, cuea cueaVar);
}
