package defpackage;

import com.google.android.rcs.client.messaging.AutoValue_TriggerGroupNotificationResponse;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationResponse;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehzr extends eicy {
    private MessagingResult a;

    @Override // defpackage.eicy
    public final TriggerGroupNotificationResponse a() {
        MessagingResult messagingResult = this.a;
        if (messagingResult != null) {
            return new AutoValue_TriggerGroupNotificationResponse(messagingResult);
        }
        throw new IllegalStateException("Missing required properties: result");
    }

    @Override // defpackage.eicy
    public final void b(MessagingResult messagingResult) {
        if (messagingResult == null) {
            throw new NullPointerException("Null result");
        }
        this.a = messagingResult;
    }
}
