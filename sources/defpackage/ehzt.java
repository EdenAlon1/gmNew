package defpackage;

import com.google.android.rcs.client.messaging.AutoValue_UpdateGroupResponse;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.UpdateGroupResponse;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehzt extends eidd {
    private MessagingResult a;

    @Override // defpackage.eidd
    public final UpdateGroupResponse a() {
        MessagingResult messagingResult = this.a;
        if (messagingResult != null) {
            return new AutoValue_UpdateGroupResponse(messagingResult);
        }
        throw new IllegalStateException("Missing required properties: result");
    }

    @Override // defpackage.eidd
    public final void b(MessagingResult messagingResult) {
        if (messagingResult == null) {
            throw new NullPointerException("Null result");
        }
        this.a = messagingResult;
    }
}
