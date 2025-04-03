package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tar extends tbt {
    private final ConversationIdType a;
    private final MessageIdType b;
    private final enip c;

    public tar(ConversationIdType conversationIdType, MessageIdType messageIdType, enip enipVar) {
        this.a = conversationIdType;
        this.b = messageIdType;
        this.c = enipVar;
    }

    @Override // defpackage.tbt
    public final ConversationIdType a() {
        return this.a;
    }

    @Override // defpackage.tbt
    public final MessageIdType b() {
        return this.b;
    }

    @Override // defpackage.tbt
    public final enip c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tbt) {
            tbt tbtVar = (tbt) obj;
            if (this.a.equals(tbtVar.a()) && this.b.equals(tbtVar.b()) && this.c.equals(tbtVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        enip enipVar = this.c;
        MessageIdType messageIdType = this.b;
        return "ConversationWithParticipantInfos{conversationId=" + this.a.toString() + ", latestMessageId=" + messageIdType.toString() + ", otherParticipants=" + enipVar.toString() + "}";
    }
}
