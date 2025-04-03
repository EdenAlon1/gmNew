package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuip extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new cuio(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        aq(new dtrt("spam_logging_ids_table.conversation_id", 1, Long.valueOf(bdgq.a(conversationIdType))));
    }

    public final void c() {
        aq(new dtrx("spam_logging_ids_table.conversation_logging_id", 6));
    }

    public final void d() {
        aq(new dtrt("spam_logging_ids_table.conversation_logging_id", 2, ""));
    }
}
