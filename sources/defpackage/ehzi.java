package defpackage;

import com.google.android.rcs.client.messaging.AutoValue_RemoveUserFromGroupResponse;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupResponse;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehzi extends eicf {
    private MessagingResult a;

    @Override // defpackage.eicf
    public final RemoveUserFromGroupResponse a() {
        MessagingResult messagingResult = this.a;
        if (messagingResult != null) {
            return new AutoValue_RemoveUserFromGroupResponse(messagingResult);
        }
        throw new IllegalStateException("Missing required properties: result");
    }

    @Override // defpackage.eicf
    public final void b(MessagingResult messagingResult) {
        if (messagingResult == null) {
            throw new NullPointerException("Null result");
        }
        this.a = messagingResult;
    }
}
