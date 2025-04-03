package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wxm implements wqq {
    public final ffbr a;
    public final aigz b;
    private final ffxx c;
    private final ConversationId d;
    private final ffxx e;
    private final Set f;

    public wxm(ffxx ffxxVar, ConversationId conversationId, ffbr ffbrVar, ffbr ffbrVar2, aigz aigzVar) {
        ffxxVar.getClass();
        conversationId.getClass();
        ffbrVar.getClass();
        aigzVar.getClass();
        this.c = ffxxVar;
        this.d = conversationId;
        this.a = ffbrVar2;
        this.b = aigzVar;
        this.e = ((aspy) ffbrVar.b()).a() ? fgdm.a(c(conversationId instanceof PenpalBotConversationId)) : new wxl(ffxxVar, this);
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
        if (!z || ((Optional) this.a.b()).isEmpty()) {
            return null;
        }
        return new dlsr(((cjdk) ((Optional) this.a.b()).get()).f(), null, false, true, true, false, null, false, null, new ffix() { // from class: wxi
            @Override // defpackage.ffix
            public final Object invoke() {
                wxm wxmVar = wxm.this;
                wxmVar.b.h(new aile(((cjdk) ((Optional) wxmVar.a.b()).get()).b()));
                return ffcu.a;
            }
        }, 998);
    }
}
