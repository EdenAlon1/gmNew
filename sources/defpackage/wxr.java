package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wxr implements wqq {
    public final aigz a;
    private final ffxx b;
    private final ConversationId c;
    private final ffbr d;
    private final ffxx e;
    private final Set f;

    public wxr(ffxx ffxxVar, ConversationId conversationId, ffbr ffbrVar, ffbr ffbrVar2, aigz aigzVar) {
        ffxxVar.getClass();
        conversationId.getClass();
        ffbrVar.getClass();
        aigzVar.getClass();
        this.b = ffxxVar;
        this.c = conversationId;
        this.d = ffbrVar2;
        this.a = aigzVar;
        this.e = ((aspy) ffbrVar.b()).a() ? fgdm.a(c(conversationId instanceof PenpalBotConversationId)) : new wxq(ffxxVar, this);
        this.f = fffi.b(aaxf.a);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.f;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.e;
    }

    public final dlsr c(boolean z) {
        if (!z || ((Optional) this.d.b()).isEmpty()) {
            return null;
        }
        return new dlsr(((cjdk) ((Optional) this.d.b()).get()).g(), null, false, true, true, false, null, false, null, new ffix() { // from class: wxn
            @Override // defpackage.ffix
            public final Object invoke() {
                wxr.this.a.h(aion.a);
                return ffcu.a;
            }
        }, 998);
    }
}
