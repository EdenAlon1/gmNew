package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brbr extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new brbq(this);
    }

    public final void b(axcj axcjVar) {
        int intValue = brbs.c().intValue();
        if (intValue < 58690) {
            dtub.w("classification_state", intValue);
        }
        aq(new dtwe("conversation_classifications_table.classification_state", 2, Integer.valueOf(axcjVar == null ? 0 : axcjVar.a())));
    }

    public final void c(axcl axclVar) {
        aq(new dtwe("conversation_classifications_table.classification_type", 1, Integer.valueOf(axclVar == null ? 0 : axclVar.a())));
    }

    public final void d(ConversationIdType conversationIdType) {
        aq(new dtrt("conversation_classifications_table.conversation_id", 1, Long.valueOf(bdgq.a(conversationIdType))));
    }

    public final void e(String str) {
        aq(new dtrt("conversation_classifications_table.date", 1, String.valueOf(str)));
    }
}
