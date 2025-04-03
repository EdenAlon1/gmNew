package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crlz extends crme {
    public final ConversationIdType a;
    private final fazb b;

    public crlz(ConversationIdType conversationIdType, fazb fazbVar) {
        if (conversationIdType == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.a = conversationIdType;
        this.b = fazbVar;
    }

    @Override // defpackage.crme
    public final ConversationIdType a() {
        return this.a;
    }

    @Override // defpackage.crme
    public final fazb b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof crme) {
            crme crmeVar = (crme) obj;
            if (this.a.equals(crmeVar.a()) && this.b.equals(crmeVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        fazb fazbVar = this.b;
        return "ConversationIdAndThreadId{conversationId=" + this.a.toString() + ", threadIdLazy=" + fazbVar.toString() + "}";
    }
}
