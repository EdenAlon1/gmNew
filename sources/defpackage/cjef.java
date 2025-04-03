package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjef {
    private final azsu a;
    private final ConversationIdType b;

    public cjef(azsu azsuVar, ConversationIdType conversationIdType) {
        this.a = azsuVar;
        this.b = conversationIdType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjef)) {
            return false;
        }
        cjef cjefVar = (cjef) obj;
        return ffkj.e(this.a, cjefVar.a) && ffkj.e(this.b, cjefVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MyIdentityTokenAndConversationIdType(token=" + this.a + ", conversationId=" + this.b + ")";
    }
}
