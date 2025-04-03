package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bryg extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new bryf(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        aq(new dtrt("conversation_pin.conversation_id", 1, Long.valueOf(bdgq.a(conversationIdType))));
    }

    public final void c(Iterable iterable) {
        engr engrVar = new engr();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            engrVar.h(String.valueOf(bdgq.a((ConversationIdType) it.next())));
        }
        aq(new dtrw("conversation_pin.conversation_id", 3, at(engrVar.g()), true));
    }
}
