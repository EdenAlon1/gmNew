package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cioq {
    private final cpn a = new cpn();

    public final synchronized void a(ConversationIdType conversationIdType) {
        if (conversationIdType.b()) {
            this.a.clear();
        } else {
            this.a.remove(conversationIdType);
        }
    }
}
