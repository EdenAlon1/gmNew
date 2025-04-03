package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wtf implements wqq {
    private final wqq a;
    private final wqq b;
    private final ConversationId c;
    private final ffxx d;
    private final Set e;

    public wtf(wqq wqqVar, wqq wqqVar2, ConversationId conversationId, ffbr ffbrVar) {
        conversationId.getClass();
        ffbrVar.getClass();
        this.a = wqqVar;
        this.b = wqqVar2;
        this.c = conversationId;
        this.d = (((aspy) ffbrVar.b()).a() && (conversationId instanceof PenpalBotConversationId)) ? ((wto) wqqVar).k : ((wte) wqqVar2).k;
        this.e = (((aspy) ffbrVar.b()).a() && (conversationId instanceof PenpalBotConversationId)) ? ((wto) wqqVar).l : ((wte) wqqVar2).l;
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.e;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.d;
    }
}
