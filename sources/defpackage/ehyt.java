package defpackage;

import com.google.android.rcs.client.messaging.AutoValue_GroupOperationResult;
import com.google.android.rcs.client.messaging.GroupOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.Conversation;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehyt extends eibb {
    private MessagingResult a;
    private Conversation b;

    @Override // defpackage.eibb
    public final GroupOperationResult a() {
        Conversation conversation;
        MessagingResult messagingResult = this.a;
        if (messagingResult != null && (conversation = this.b) != null) {
            return new AutoValue_GroupOperationResult(messagingResult, conversation);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" result");
        }
        if (this.b == null) {
            sb.append(" conversation");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eibb
    public final void b(Conversation conversation) {
        if (conversation == null) {
            throw new NullPointerException("Null conversation");
        }
        this.b = conversation;
    }

    @Override // defpackage.eibb
    public final void c(MessagingResult messagingResult) {
        if (messagingResult == null) {
            throw new NullPointerException("Null result");
        }
        this.a = messagingResult;
    }
}
