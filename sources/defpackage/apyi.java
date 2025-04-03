package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apyi implements alyc {
    private final MessageId a;
    private final ConversationId b;
    private final Instant c;

    public apyi(MessageId messageId, ConversationId conversationId, Instant instant) {
        this.a = messageId;
        this.b = conversationId;
        this.c = instant;
    }

    @Override // defpackage.alyc
    public final alxd a() {
        return alxd.UPDATE;
    }

    @Override // defpackage.alyc
    public final MessageId b() {
        return this.a;
    }

    @Override // defpackage.alyc
    public final ConversationId c() {
        return this.b;
    }

    @Override // defpackage.alyc
    public final Instant d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apyi)) {
            return false;
        }
        apyi apyiVar = (apyi) obj;
        return ffkj.e(this.a, apyiVar.a) && ffkj.e(this.b, apyiVar.b) && ffkj.e(this.c, apyiVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ImpactedMessage(messageId=" + this.a + ", conversationId=" + this.b + ", timestamp=" + this.c + ")";
    }
}
