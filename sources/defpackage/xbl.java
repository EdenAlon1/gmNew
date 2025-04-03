package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xbl implements wqq {
    public final wqq a;
    public final wqq b;
    private final ffxx c;
    private final ffxx d;
    private final Set e;

    public xbl(wqq wqqVar, wqq wqqVar2, ConversationId conversationId, ffxx ffxxVar, ffbr ffbrVar) {
        ffxx fgenVar;
        conversationId.getClass();
        ffxxVar.getClass();
        ffbrVar.getClass();
        this.a = wqqVar;
        this.b = wqqVar2;
        this.c = ffxxVar;
        if (((aspy) ffbrVar.b()).a()) {
            fgenVar = conversationId instanceof PenpalBotConversationId ? ((xaz) wqqVar).c : conversationId instanceof RbmConversationId ? ((xbj) wqqVar2).c : new ffyg(null);
        } else {
            xbk xbkVar = new xbk(null, this, conversationId);
            int i = fgau.a;
            fgenVar = new fgen(xbkVar, ffxxVar);
        }
        this.d = fgenVar;
        this.e = fffi.b(aaxf.a);
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
