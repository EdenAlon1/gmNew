package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aykf extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new ayke(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        aq(new dtrt("conversation_matcher_cache.conversation_id", 1, Long.valueOf(bdgq.a(conversationIdType))));
    }

    public final void c(long j) {
        aq(new dtwe("conversation_matcher_cache.matcher_version", 1, Long.valueOf(j)));
    }
}
