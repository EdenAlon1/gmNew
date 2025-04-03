package defpackage;

import android.app.PendingIntent;
import com.google.android.rcs.client.messaging.AutoValue_SendMessageRequest;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.android.rcs.client.messaging.data.TraceId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehzm extends eico {
    private PendingIntent a;
    private Conversation b;
    private Message c;
    private MessageClass d;
    private TraceId e;
    private Optional f = Optional.empty();
    private eigz g;

    @Override // defpackage.eico
    public final SendMessageRequest a() {
        Conversation conversation;
        Message message;
        MessageClass messageClass;
        TraceId traceId;
        eigz eigzVar;
        PendingIntent pendingIntent = this.a;
        if (pendingIntent != null && (conversation = this.b) != null && (message = this.c) != null && (messageClass = this.d) != null && (traceId = this.e) != null && (eigzVar = this.g) != null) {
            return new AutoValue_SendMessageRequest(pendingIntent, conversation, message, messageClass, traceId, this.f, eigzVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" intent");
        }
        if (this.b == null) {
            sb.append(" conversation");
        }
        if (this.c == null) {
            sb.append(" message");
        }
        if (this.d == null) {
            sb.append(" messageClass");
        }
        if (this.e == null) {
            sb.append(" traceId");
        }
        if (this.g == null) {
            sb.append(" messagingMethod");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eico
    public final void b(Conversation conversation) {
        if (conversation == null) {
            throw new NullPointerException("Null conversation");
        }
        this.b = conversation;
    }

    @Override // defpackage.eico
    public final void c(PendingIntent pendingIntent) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null intent");
        }
        this.a = pendingIntent;
    }

    @Override // defpackage.eico
    public final void d(Message message) {
        if (message == null) {
            throw new NullPointerException("Null message");
        }
        this.c = message;
    }

    @Override // defpackage.eico
    public final void e(MessageClass messageClass) {
        if (messageClass == null) {
            throw new NullPointerException("Null messageClass");
        }
        this.d = messageClass;
    }

    @Override // defpackage.eico
    public final void f(eigz eigzVar) {
        if (eigzVar == null) {
            throw new NullPointerException("Null messagingMethod");
        }
        this.g = eigzVar;
    }

    @Override // defpackage.eico
    public final void g(eyee eyeeVar) {
        this.f = Optional.of(eyeeVar);
    }

    @Override // defpackage.eico
    public final void h(TraceId traceId) {
        if (traceId == null) {
            throw new NullPointerException("Null traceId");
        }
        this.e = traceId;
    }
}
