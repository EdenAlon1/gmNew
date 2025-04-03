package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuva {
    public final ConversationIdType a;

    public cuva(ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        this.a = conversationIdType;
        if (((Boolean) ((cfup) cubs.z.get()).e()).booleanValue() && conversationIdType.b()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cuva) && ffkj.e(this.a, ((cuva) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BugleConversationIdWrapper(conversationId=" + this.a + ")";
    }
}
