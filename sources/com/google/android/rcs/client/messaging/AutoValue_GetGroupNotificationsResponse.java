package com.google.android.rcs.client.messaging;

import defpackage.engw;
import defpackage.enkr;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_GetGroupNotificationsResponse extends GetGroupNotificationsResponse {
    private final MessagingResult a;
    private final engw b;

    public AutoValue_GetGroupNotificationsResponse(MessagingResult messagingResult, engw engwVar) {
        this.a = messagingResult;
        this.b = engwVar;
    }

    @Override // com.google.android.rcs.client.messaging.GetGroupNotificationsResponse
    public final MessagingResult a() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.GetGroupNotificationsResponse
    public final engw b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GetGroupNotificationsResponse) {
            GetGroupNotificationsResponse getGroupNotificationsResponse = (GetGroupNotificationsResponse) obj;
            if (this.a.equals(getGroupNotificationsResponse.a()) && enkr.h(this.b, getGroupNotificationsResponse.b())) {
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
        return "GetGroupNotificationsResponse{result=" + this.a.toString() + ", notifications=" + engwVar.toString() + "}";
    }
}
