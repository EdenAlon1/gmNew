package defpackage;

import android.app.PendingIntent;
import com.google.android.rcs.client.messaging.AutoValue_RevokeMessageRequest;
import com.google.android.rcs.client.messaging.RevokeMessageRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehzj extends eici {
    private PendingIntent a;
    private Conversation b;
    private String c;
    private Optional d = Optional.empty();

    @Override // defpackage.eici
    public final RevokeMessageRequest a() {
        Conversation conversation;
        String str;
        PendingIntent pendingIntent = this.a;
        if (pendingIntent != null && (conversation = this.b) != null && (str = this.c) != null) {
            return new AutoValue_RevokeMessageRequest(pendingIntent, conversation, str, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" intent");
        }
        if (this.b == null) {
            sb.append(" conversation");
        }
        if (this.c == null) {
            sb.append(" messageId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eici
    public final void b(Conversation conversation) {
        if (conversation == null) {
            throw new NullPointerException("Null conversation");
        }
        this.b = conversation;
    }

    @Override // defpackage.eici
    public final void c(PendingIntent pendingIntent) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null intent");
        }
        this.a = pendingIntent;
    }

    @Override // defpackage.eici
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null messageId");
        }
        this.c = str;
    }

    @Override // defpackage.eici
    public final void e(eyee eyeeVar) {
        this.d = Optional.of(eyeeVar);
    }
}
