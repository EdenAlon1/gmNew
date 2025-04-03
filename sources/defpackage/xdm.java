package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xdm implements fbba {
    public static Conversation a(ConversationId conversationId, alxk alxkVar, alxl alxlVar, abar abarVar) {
        conversationId.getClass();
        alxkVar.getClass();
        alxlVar.getClass();
        abarVar.getClass();
        if (!abarVar.b(conversationId).booleanValue()) {
            return alxlVar.a(conversationId, alxkVar);
        }
        efbd.c();
        emxf.l(abarVar.b(conversationId).booleanValue());
        ((enrr) ((enrr) abar.a.h()).h("com/google/android/apps/messaging/conversation2/preload/ConversationCachedLoaderImpl", "getPreloadedConversationAndClearCache", 75, "ConversationCachedLoaderImpl.java")).t("Returning conversation load future for conversation %s", conversationId.b());
        return abarVar.a();
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
