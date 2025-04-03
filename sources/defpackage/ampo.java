package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ampo implements ampj {
    private final ffbr a;
    private final ffbr b;

    public ampo(ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
    }

    @Override // defpackage.ampj
    public final /* bridge */ /* synthetic */ aqge a(ConversationId conversationId) {
        errl errlVar = (errl) this.a.b();
        errlVar.getClass();
        becj becjVar = (becj) this.b.b();
        becjVar.getClass();
        return new ampn(errlVar, becjVar, conversationId);
    }
}
