package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aauv implements xik {
    public final ffxx a;
    public final ffbr b;
    private final ffsk c;
    private final ConversationId d;
    private final ffbr e;

    public aauv(ffxx ffxxVar, ffsk ffskVar, ConversationId conversationId, ffbr ffbrVar, ffbr ffbrVar2) {
        ffxxVar.getClass();
        ffskVar.getClass();
        conversationId.getClass();
        ffbrVar.getClass();
        this.a = ffxxVar;
        this.c = ffskVar;
        this.d = conversationId;
        this.e = ffbrVar;
        this.b = ffbrVar2;
    }

    @Override // defpackage.xik
    public final void a(xhu xhuVar) {
        if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue()) {
            if (!((aspy) this.e.b()).a()) {
                axol.k(this.c, null, new aauu(this, null), 3);
            } else if (this.d instanceof PenpalBotConversationId) {
                ((ajge) this.b.b()).c();
            }
        }
    }
}
