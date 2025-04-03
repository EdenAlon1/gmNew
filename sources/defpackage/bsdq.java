package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsdq extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new bsdp(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        aq(new dtrt("conversation_to_participants.conversation_id", 1, Long.valueOf(bdgq.a(conversationIdType))));
    }

    public final void c(dtzj dtzjVar) {
        aq(new dtru("conversation_to_participants.conversation_id", 1, dtzjVar));
    }

    public final void d(dtzj dtzjVar) {
        aq(new dtru("conversation_to_participants.conversation_id", 3, dtzjVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Iterable iterable) {
        engr engrVar = new engr();
        enqv it = ((engw) iterable).iterator();
        while (it.hasNext()) {
            engrVar.h(String.valueOf(bdgq.a((ConversationIdType) it.next())));
        }
        aq(new dtrw("conversation_to_participants.conversation_id", 3, at(engrVar.g()), true));
    }

    public final void f(long j) {
        aq(new dtwe("conversation_to_participants.participant_id", 1, Long.valueOf(j)));
    }

    public final void g(Iterable iterable) {
        aq(new dtrw("conversation_to_participants.participant_id", 3, at(iterable), true));
    }
}
