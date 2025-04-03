package defpackage;

import android.app.PendingIntent;
import com.google.android.rcs.client.messaging.AutoValue_TriggerGroupNotificationRequest;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehzq extends eicw {
    private PendingIntent a;
    private Conversation b;
    private Optional c = Optional.empty();

    @Override // defpackage.eicw
    public final TriggerGroupNotificationRequest a() {
        Conversation conversation;
        PendingIntent pendingIntent = this.a;
        if (pendingIntent != null && (conversation = this.b) != null) {
            return new AutoValue_TriggerGroupNotificationRequest(pendingIntent, conversation, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" intent");
        }
        if (this.b == null) {
            sb.append(" conversation");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eicw
    public final void b(Conversation conversation) {
        if (conversation == null) {
            throw new NullPointerException("Null conversation");
        }
        this.b = conversation;
    }

    @Override // defpackage.eicw
    public final void c(PendingIntent pendingIntent) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null intent");
        }
        this.a = pendingIntent;
    }

    @Override // defpackage.eicw
    public final void d(eyee eyeeVar) {
        this.c = Optional.of(eyeeVar);
    }
}
