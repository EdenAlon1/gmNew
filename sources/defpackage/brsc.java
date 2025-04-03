package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brsc extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new brsb(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        aq(new dtrt("conversation_labels.conversation_id", 1, Long.valueOf(bdgq.a(conversationIdType))));
    }

    public final void c(int i) {
        int intValue = brsd.c().intValue();
        if (intValue < 53020) {
            dtub.w(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, intValue);
        }
        aq(new dtwe("conversation_labels.label", 1, Integer.valueOf(i)));
    }
}
