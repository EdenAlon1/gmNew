package defpackage;

import android.app.PendingIntent;
import com.google.android.rcs.client.messaging.AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.AutoValue_AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehyd extends ehxt {
    private PendingIntent a;
    private Conversation b;
    private RcsDestinationId c;
    private Optional d = Optional.empty();

    @Override // defpackage.ehxt
    public final AddUserToGroupRequest a() {
        Conversation conversation;
        RcsDestinationId rcsDestinationId;
        PendingIntent pendingIntent = this.a;
        if (pendingIntent != null && (conversation = this.b) != null && (rcsDestinationId = this.c) != null) {
            return new AutoValue_AddUserToGroupRequest(pendingIntent, conversation, rcsDestinationId, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" intent");
        }
        if (this.b == null) {
            sb.append(" conversation");
        }
        if (this.c == null) {
            sb.append(" user");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ehxt
    public final void b(Conversation conversation) {
        if (conversation == null) {
            throw new NullPointerException("Null conversation");
        }
        this.b = conversation;
    }

    @Override // defpackage.ehxt
    public final void c(PendingIntent pendingIntent) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null intent");
        }
        this.a = pendingIntent;
    }

    @Override // defpackage.ehxt
    public final void d(eyee eyeeVar) {
        this.d = Optional.of(eyeeVar);
    }

    @Override // defpackage.ehxt
    public final void e(RcsDestinationId rcsDestinationId) {
        if (rcsDestinationId == null) {
            throw new NullPointerException("Null user");
        }
        this.c = rcsDestinationId;
    }
}
