package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bjjm extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new bjjj(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        aq(new dtrt("messages.conversation_id", 1, Long.valueOf(bdgq.a(conversationIdType))));
    }

    public final void c(MessageIdType messageIdType) {
        aq(new dtrt("messages._id", 1, Long.valueOf(bdhb.a(messageIdType))));
    }

    public final void d() {
        int intValue = bjjn.c().intValue();
        if (intValue < 30010) {
            dtub.w("is_hidden", intValue);
        }
        aq(new dtwe("messages.is_hidden", 1, 0));
    }

    public final void e(long j) {
        aq(new dtwe("messages.received_timestamp", 9, Long.valueOf(j)));
    }

    public final void f(Iterable iterable) {
        aq(new dtrw("messages.message_status", 3, at(iterable), true));
    }

    public final void g(int i) {
        aq(new dtwe("messages.message_status", 2, Integer.valueOf(i)));
    }
}
