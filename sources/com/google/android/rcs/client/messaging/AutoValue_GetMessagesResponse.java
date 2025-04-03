package com.google.android.rcs.client.messaging;

import defpackage.engw;
import defpackage.enkr;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_GetMessagesResponse extends GetMessagesResponse {
    private final MessagingResult a;
    private final engw b;

    public AutoValue_GetMessagesResponse(MessagingResult messagingResult, engw engwVar) {
        this.a = messagingResult;
        this.b = engwVar;
    }

    @Override // com.google.android.rcs.client.messaging.GetMessagesResponse
    public final MessagingResult a() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.GetMessagesResponse
    public final engw b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GetMessagesResponse) {
            GetMessagesResponse getMessagesResponse = (GetMessagesResponse) obj;
            if (this.a.equals(getMessagesResponse.a()) && enkr.h(this.b, getMessagesResponse.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        engw engwVar = this.b;
        return "GetMessagesResponse{result=" + this.a.toString() + ", messages=" + engwVar.toString() + "}";
    }
}
