package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aily implements aihu {
    public final ConversationId a;
    public final List b;

    /* JADX WARN: Multi-variable type inference failed */
    public aily() {
        this(null, 0 == true ? 1 : 0, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aily)) {
            return false;
        }
        aily ailyVar = (aily) obj;
        return ffkj.e(this.a, ailyVar.a) && ffkj.e(this.b, ailyVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ParentalApprovalDialog(conversationId=" + this.a + ", messagingIdentities=" + this.b + ")";
    }

    public /* synthetic */ aily(ConversationId conversationId, List list, int i) {
        conversationId = (i & 1) != 0 ? InvalidConversationId.a : conversationId;
        list = (i & 2) != 0 ? ffel.a : list;
        conversationId.getClass();
        list.getClass();
        this.a = conversationId;
        this.b = list;
    }
}
