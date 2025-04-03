package com.google.android.rcs.client.messaging;

import defpackage.eica;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_Conversation extends Conversation {
    private final eica a;
    private final String b;
    private final int c;

    public AutoValue_Conversation(int i, eica eicaVar, String str) {
        this.c = i;
        this.a = eicaVar;
        this.b = str;
    }

    @Override // com.google.android.rcs.client.messaging.Conversation
    public final eica a() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.Conversation
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.Conversation
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
