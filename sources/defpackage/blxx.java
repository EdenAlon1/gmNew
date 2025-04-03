package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class blxx extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new blxw(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        aq(new dtrt("conversations._id", 1, Long.valueOf(bdgq.a(conversationIdType))));
    }
}
