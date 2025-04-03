package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apsl extends apsp {
    private final alxd a;
    private final MessageId b;
    private final ConversationId c;
    private final Instant d;
    private final int e;

    public apsl(alxd alxdVar, MessageId messageId, ConversationId conversationId, Instant instant, int i) {
        if (alxdVar == null) {
            throw new NullPointerException("Null operation");
        }
        this.a = alxdVar;
        this.b = messageId;
        this.c = conversationId;
        if (instant == null) {
            throw new NullPointerException("Null timestamp");
        }
        this.d = instant;
        this.e = i;
    }

    @Override // defpackage.alyc
    public final alxd a() {
        return this.a;
    }

    @Override // defpackage.alyc
    public final MessageId b() {
        return this.b;
    }

    @Override // defpackage.alyc
    public final ConversationId c() {
        return this.c;
    }

    @Override // defpackage.alyc
    public final Instant d() {
        return this.d;
    }

    @Override // defpackage.apsp
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apsp) {
            apsp apspVar = (apsp) obj;
            if (this.a.equals(apspVar.a()) && this.b.equals(apspVar.b()) && this.c.equals(apspVar.c()) && this.d.equals(apspVar.d()) && this.e == apspVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e;
    }

    public final String toString() {
        Instant instant = this.d;
        ConversationId conversationId = this.c;
        MessageId messageId = this.b;
        return "BugleMessageChanged{operation=" + this.a.toString() + ", id=" + messageId.toString() + ", conversationId=" + conversationId.toString() + ", timestamp=" + instant.toString() + ", status=" + this.e + "}";
    }
}
