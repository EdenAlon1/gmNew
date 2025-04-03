package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cicp {
    public final ConversationId a;
    public final int b;

    public cicp(int i, ConversationId conversationId) {
        this.b = i;
        this.a = conversationId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cicp)) {
            return false;
        }
        cicp cicpVar = (cicp) obj;
        return this.b == cicpVar.b && ffkj.e(this.a, cicpVar.a);
    }

    public final int hashCode() {
        ConversationId conversationId = this.a;
        return (this.b * 31) + (conversationId == null ? 0 : conversationId.hashCode());
    }

    public final String toString() {
        return "ConversationIdOrFailureStatus(status=" + ((Object) Integer.toString(erwy.a(this.b))) + ", id=" + this.a + ")";
    }

    public /* synthetic */ cicp(int i) {
        this(i, null);
    }
}
