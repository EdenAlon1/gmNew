package defpackage;

import com.google.android.rcs.client.messaging.AutoValue_GetMessagesResponse;
import com.google.android.rcs.client.messaging.GetMessagesResponse;
import com.google.android.rcs.client.messaging.MessagingResult;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehyq extends eiap {
    private MessagingResult a;
    private engw b;

    @Override // defpackage.eiap
    public final GetMessagesResponse a() {
        engw engwVar;
        MessagingResult messagingResult = this.a;
        if (messagingResult != null && (engwVar = this.b) != null) {
            return new AutoValue_GetMessagesResponse(messagingResult, engwVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" result");
        }
        if (this.b == null) {
            sb.append(" messages");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eiap
    public final void b(List list) {
        this.b = engw.n(list);
    }

    @Override // defpackage.eiap
    public final void c(MessagingResult messagingResult) {
        if (messagingResult == null) {
            throw new NullPointerException("Null result");
        }
        this.a = messagingResult;
    }
}
