package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aing implements aihs {
    public final ConversationId a;
    private final int b = 2;

    public aing(ConversationId conversationId) {
        this.a = conversationId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aing)) {
            return false;
        }
        aing aingVar = (aing) obj;
        if (!ffkj.e(this.a, aingVar.a)) {
            return false;
        }
        int i = aingVar.b;
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 2;
    }

    public final String toString() {
        return "SearchContentType(conversationId=" + this.a + ", contentType=2)";
    }
}
