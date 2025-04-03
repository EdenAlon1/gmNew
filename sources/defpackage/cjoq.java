package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjoq {
    public final ConversationIdType a;
    public final cpxu b;
    public final boolean c;

    public cjoq(ConversationIdType conversationIdType, cpxu cpxuVar, boolean z) {
        this.a = conversationIdType;
        this.b = cpxuVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjoq)) {
            return false;
        }
        cjoq cjoqVar = (cjoq) obj;
        return ffkj.e(this.a, cjoqVar.a) && ffkj.e(this.b, cjoqVar.b) && this.c == cjoqVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "ConversationData(conversationId=" + this.a + ", threadId=" + this.b + ", isNewConversation=" + this.c + ")";
    }
}
