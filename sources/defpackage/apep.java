package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apep {
    public final String a;
    public final fbrc b;
    public final MessageId c;
    public final long d;
    public final boolean e;
    private final ConversationId f;

    public apep(String str, ConversationId conversationId, fbrc fbrcVar, MessageId messageId, long j, boolean z) {
        this.a = str;
        this.f = conversationId;
        this.b = fbrcVar;
        this.c = messageId;
        this.d = j;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apep)) {
            return false;
        }
        apep apepVar = (apep) obj;
        return ffkj.e(this.a, apepVar.a) && ffkj.e(this.f, apepVar.f) && this.b == apepVar.b && ffkj.e(this.c, apepVar.c) && this.d == apepVar.d && this.e == apepVar.e;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() * 31) + this.f.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        int i = true != this.e ? 1237 : 1231;
        long j = this.d;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + i;
    }

    public final String toString() {
        return "BugleClassification(classificationText=" + this.a + ", conversationId=" + this.f + ", classificationType=" + this.b + ", messageId=" + this.c + ", usageStatsLoggingId=" + this.d + ", isIncoming=" + this.e + ")";
    }
}
