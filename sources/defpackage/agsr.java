package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agsr extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new agsq(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        aq(new dtrt("messages.conversation_id", 1, Long.valueOf(bdgq.a(conversationIdType))));
    }

    public final void c() {
        int intValue = agss.c().intValue();
        if (intValue < 30010) {
            dtub.w("is_hidden", intValue);
        }
        aq(new dtwe("messages.is_hidden", 1, 0));
    }
}
