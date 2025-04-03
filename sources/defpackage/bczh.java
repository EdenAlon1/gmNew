package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bczh extends bdfx {
    private ConversationIdType a;
    private boolean b;
    private byte c;

    @Override // defpackage.bdfx
    public final bdfy a() {
        ConversationIdType conversationIdType;
        if (this.c == 1 && (conversationIdType = this.a) != null) {
            return new bczi(conversationIdType, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" conversationId");
        }
        if (this.c == 0) {
            sb.append(" newlyCreated");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.bdfx
    public final void b(ConversationIdType conversationIdType) {
        if (conversationIdType == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.a = conversationIdType;
    }

    @Override // defpackage.bdfx
    public final void c(boolean z) {
        this.b = z;
        this.c = (byte) 1;
    }
}
