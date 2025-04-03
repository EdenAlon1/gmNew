package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmpx extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new bmpu(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        aq(new dtrt("messages.conversation_id", 1, Long.valueOf(bdgq.a(conversationIdType))));
    }

    public final void c() {
        aq(new dtwe("messages.message_status", 8, Integer.valueOf(BasePaymentResult.ERROR_REQUEST_FAILED)));
    }
}
