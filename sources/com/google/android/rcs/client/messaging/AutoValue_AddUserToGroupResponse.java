package com.google.android.rcs.client.messaging;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_AddUserToGroupResponse extends AddUserToGroupResponse {
    private final MessagingResult a;

    public AutoValue_AddUserToGroupResponse(MessagingResult messagingResult) {
        this.a = messagingResult;
    }

    @Override // com.google.android.rcs.client.messaging.AddUserToGroupResponse
    public final MessagingResult a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AddUserToGroupResponse) {
            return this.a.equals(((AddUserToGroupResponse) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "AddUserToGroupResponse{result=" + this.a.toString() + "}";
    }
}
