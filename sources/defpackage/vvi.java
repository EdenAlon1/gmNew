package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.conversation.screen.ConversationActivityUsageStatisticsState;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vvi extends txv<tyq> {
    final /* synthetic */ vvn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvi(vvn vvnVar) {
        super("Message count");
        this.a = vvnVar;
    }

    @Override // defpackage.ejwd
    public final /* synthetic */ void b(Object obj) {
        tyq tyqVar = (tyq) obj;
        ensk e = vvn.a.e();
        e.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) e;
        enrrVar.Y(csux.p, this.a.M);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$8", "onNewData", 2245, "ConversationFragmentPeer.java")).q("ConversationFragment: onNewData: Message count");
        ensk h = vvn.a.h();
        h.Y(ente.a, "Bugle");
        enrr enrrVar2 = (enrr) h;
        vvn vvnVar = this.a;
        enrrVar2.Y(csux.p, vvnVar.M);
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onConversationMessagesUpdated", 4525, "ConversationFragmentPeer.java")).t("ConversationFragment: onConversationMessagesUpdated messagesUpdated: %s", tyqVar);
        vjt vjtVar = vvnVar.cC;
        int a = tyqVar.a();
        int b = tyqVar.b();
        int i = ((typ) ((bcqs) vvnVar.cA.a()).d).c;
        ahqt ahqtVar = (ahqt) vjtVar;
        ahqtVar.v.isPresent();
        ConversationActivityUsageStatisticsState o = ahqtVar.o();
        boolean c = ahqtVar.n().c();
        boolean z = b != 0;
        if (c) {
            o.d = a;
            o.e = z;
            o.i = i;
        } else if (o.b < 0) {
            o.b = a;
            o.e = z;
            o.i = i;
            ahqtVar.B();
        }
        Intent s = vvnVar.s();
        int intExtra = s == null ? -1 : s.getIntExtra("message_position", -1);
        if (intExtra >= 0) {
            ensk g = vvn.a.g();
            g.Y(ente.a, "Bugle");
            enrr enrrVar3 = (enrr) g;
            enrrVar3.Y(csux.p, vvnVar.M);
            ((enrr) enrrVar3.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onConversationMessagesUpdated", 4538, "ConversationFragmentPeer.java")).r("ConversationFragment: onConversationMessagesUpdated scrollToPos: %d", intExtra);
            Intent s2 = vvnVar.s();
            if (s2 != null) {
                s2.putExtra("message_position", -1);
            }
        }
        vvnVar.cC.c();
    }
}
