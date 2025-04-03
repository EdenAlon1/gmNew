package com.google.android.rcs.client.messaging;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_MessagingOperationResult extends MessagingOperationResult {
    private final MessagingResult a;
    private final String b;
    private final com.google.android.rcs.client.messaging.data.Conversation c;
    private final boolean d;

    public AutoValue_MessagingOperationResult(MessagingResult messagingResult, String str, com.google.android.rcs.client.messaging.data.Conversation conversation, boolean z) {
        this.a = messagingResult;
        this.b = str;
        this.c = conversation;
        this.d = z;
    }

    @Override // com.google.android.rcs.client.messaging.MessagingOperationResult
    public final MessagingResult a() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.MessagingOperationResult
    public final com.google.android.rcs.client.messaging.data.Conversation b() {
        return this.c;
    }

    @Override // com.google.android.rcs.client.messaging.MessagingOperationResult
    public final String c() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.MessagingOperationResult
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessagingOperationResult) {
            MessagingOperationResult messagingOperationResult = (MessagingOperationResult) obj;
            if (this.a.equals(messagingOperationResult.a()) && this.b.equals(messagingOperationResult.c()) && this.c.equals(messagingOperationResult.b()) && this.d == messagingOperationResult.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        com.google.android.rcs.client.messaging.data.Conversation conversation = this.c;
        return "MessagingOperationResult{result=" + this.a.toString() + ", messageId=" + this.b + ", conversation=" + conversation.toString() + ", isRevocationSupported=" + this.d + "}";
    }
}
