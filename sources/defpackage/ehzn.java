package defpackage;

import com.google.android.rcs.client.messaging.AutoValue_SendMessageResponse;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.SendMessageResponse;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehzn extends eicq {
    private MessagingResult a;

    @Override // defpackage.eicq
    public final SendMessageResponse a() {
        MessagingResult messagingResult = this.a;
        if (messagingResult != null) {
            return new AutoValue_SendMessageResponse(messagingResult);
        }
        throw new IllegalStateException("Missing required properties: result");
    }

    @Override // defpackage.eicq
    public final void b(MessagingResult messagingResult) {
        if (messagingResult == null) {
            throw new NullPointerException("Null result");
        }
        this.a = messagingResult;
    }
}
