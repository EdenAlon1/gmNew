package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abar {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/preload/ConversationCachedLoaderImpl");
    public final alxl b;
    public abaq c = null;

    public abar(alxl alxlVar) {
        this.b = alxlVar;
    }

    public final Conversation a() {
        abaq abaqVar = this.c;
        abaqVar.getClass();
        Conversation conversation = abaqVar.a;
        this.c = null;
        return conversation;
    }

    public final Boolean b(ConversationId conversationId) {
        efbd.c();
        abaq abaqVar = this.c;
        boolean z = false;
        if (abaqVar != null && conversationId.equals(abaqVar.a.d())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
