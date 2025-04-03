package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_MessageNotification;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageNotification;
import com.google.android.rcs.client.messaging.data.TraceId;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eier extends eigu {
    private Conversation a;
    private Message b;
    private TraceId c;
    private Optional d = Optional.empty();

    @Override // defpackage.eigu
    public final MessageNotification a() {
        Message message;
        TraceId traceId;
        Conversation conversation = this.a;
        if (conversation != null && (message = this.b) != null && (traceId = this.c) != null) {
            return new AutoValue_MessageNotification(conversation, message, traceId, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" conversation");
        }
        if (this.b == null) {
            sb.append(" message");
        }
        if (this.c == null) {
            sb.append(" traceId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eigu
    public final void b(Conversation conversation) {
        if (conversation == null) {
            throw new NullPointerException("Null conversation");
        }
        this.a = conversation;
    }

    @Override // defpackage.eigu
    public final void c(Instant instant) {
        this.d = Optional.of(instant);
    }

    @Override // defpackage.eigu
    public final void d(Message message) {
        if (message == null) {
            throw new NullPointerException("Null message");
        }
        this.b = message;
    }

    @Override // defpackage.eigu
    public final void e(TraceId traceId) {
        if (traceId == null) {
            throw new NullPointerException("Null traceId");
        }
        this.c = traceId;
    }
}
