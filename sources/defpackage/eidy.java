package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_ChatMessage;
import com.google.android.rcs.client.messaging.data.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eidy extends eifa {
    private eyee a;
    private ContentType b;

    @Override // defpackage.eifa
    public final ChatMessage a() {
        ContentType contentType;
        eyee eyeeVar = this.a;
        if (eyeeVar != null && (contentType = this.b) != null) {
            return new AutoValue_ChatMessage(eyeeVar, contentType);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" content");
        }
        if (this.b == null) {
            sb.append(" contentType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eifa
    public final void b(eyee eyeeVar) {
        if (eyeeVar == null) {
            throw new NullPointerException("Null content");
        }
        this.a = eyeeVar;
    }

    @Override // defpackage.eifa
    public final void c(ContentType contentType) {
        if (contentType == null) {
            throw new NullPointerException("Null contentType");
        }
        this.b = contentType;
    }
}
