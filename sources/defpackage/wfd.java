package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wfd extends wfr {
    private final ConversationId a;
    private final MessageIdType b;
    private final long c;

    public wfd(ConversationId conversationId, MessageIdType messageIdType, long j) {
        this.a = conversationId;
        this.b = messageIdType;
        this.c = j;
    }

    @Override // defpackage.wfr
    public final long a() {
        return this.c;
    }

    @Override // defpackage.wfr
    public final ConversationId b() {
        return this.a;
    }

    @Override // defpackage.wfr
    public final MessageIdType c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wfr) {
            wfr wfrVar = (wfr) obj;
            if (this.a.equals(wfrVar.b()) && this.b.equals(wfrVar.c()) && this.c == wfrVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        long j = this.c;
        return (hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        MessageIdType messageIdType = this.b;
        return "StarBadgeMenuRemoveClickEvent{conversationId=" + this.a.toString() + ", messageId=" + messageIdType.toString() + ", usageStatsLoggingId=" + this.c + "}";
    }
}
