package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baca extends barv {
    public final MessageIdType a;
    public final ConversationIdType b;

    public baca(MessageIdType messageIdType, ConversationIdType conversationIdType) {
        this.a = messageIdType;
        this.b = conversationIdType;
    }

    @Override // defpackage.barv
    public final ConversationIdType a() {
        return this.b;
    }

    @Override // defpackage.barv
    public final MessageIdType b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof barv) {
            barv barvVar = (barv) obj;
            if (this.a.equals(barvVar.b()) && this.b.equals(barvVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ConversationIdType conversationIdType = this.b;
        return "MessageSuggestionIds{lastMessageId=" + this.a.toString() + ", conversationId=" + conversationIdType.toString() + "}";
    }
}
