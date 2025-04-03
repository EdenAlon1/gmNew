package com.google.android.rcs.client.messaging.data;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_Conversation extends Conversation {
    public final RcsDestinationId a;
    public final String b;
    public final int c;

    public AutoValue_Conversation(int i, RcsDestinationId rcsDestinationId, String str) {
        this.c = i;
        this.a = rcsDestinationId;
        this.b = str;
    }

    @Override // com.google.android.rcs.client.messaging.data.Conversation
    public final RcsDestinationId a() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.data.Conversation
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.data.Conversation
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Conversation) {
            Conversation conversation = (Conversation) obj;
            if (this.c == conversation.c() && this.a.equals(conversation.a()) && this.b.equals(conversation.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.c ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
    }
}
