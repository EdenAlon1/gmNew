package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaus implements zkv {
    public final ffxx a;
    public final ffbr b;
    public final Object c;
    public final HashSet d;
    private final ConversationId e;
    private final ffsk f;
    private final ffbr g;

    public aaus(ffxx ffxxVar, ConversationId conversationId, ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2) {
        ffxxVar.getClass();
        conversationId.getClass();
        ffskVar.getClass();
        ffbrVar.getClass();
        this.a = ffxxVar;
        this.e = conversationId;
        this.f = ffskVar;
        this.g = ffbrVar;
        this.b = ffbrVar2;
        this.c = new Object();
        this.d = new HashSet();
    }

    @Override // defpackage.zkv
    public final void a(dnmw dnmwVar) {
        if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && (dnmwVar instanceof zsn)) {
            if (!((aspy) this.g.b()).a()) {
                axol.k(this.f, null, new aaur(this, dnmwVar, null), 3);
                return;
            }
            if (this.e instanceof PenpalBotConversationId) {
                zsn zsnVar = (zsn) dnmwVar;
                if (zsr.q(zsnVar.c)) {
                    synchronized (this.c) {
                        if (this.d.add(zsnVar.f) && ((ajge) this.b.b()).a() > 0) {
                            ((ajge) this.b.b()).b();
                        }
                    }
                }
            }
        }
    }
}
