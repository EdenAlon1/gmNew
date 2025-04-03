package defpackage;

import android.app.PendingIntent;
import com.google.android.rcs.client.messaging.AutoValue_UpdateGroupRequest;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehzs extends eidb {
    private PendingIntent a;
    private Conversation b;
    private Optional c = Optional.empty();
    private Optional d = Optional.empty();

    @Override // defpackage.eidb
    public final UpdateGroupRequest a() {
        Conversation conversation;
        PendingIntent pendingIntent = this.a;
        if (pendingIntent != null && (conversation = this.b) != null) {
            return new AutoValue_UpdateGroupRequest(pendingIntent, conversation, this.c, this.d);
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

    @Override // defpackage.eidb
    public final void b(Conversation conversation) {
        if (conversation == null) {
            throw new NullPointerException("Null conversation");
        }
        this.b = conversation;
    }

    @Override // defpackage.eidb
    public final void c(PendingIntent pendingIntent) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null intent");
        }
        this.a = pendingIntent;
    }

    @Override // defpackage.eidb
    public final void d(eyee eyeeVar) {
        this.d = Optional.of(eyeeVar);
    }

    @Override // defpackage.eidb
    public final void e(String str) {
        this.c = Optional.of(str);
    }
}
