package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wcj extends wcl {
    private final ConversationIdType a;
    private final aora b;

    public wcj(ConversationIdType conversationIdType, aora aoraVar) {
        this.a = conversationIdType;
        if (aoraVar == null) {
            throw new NullPointerException("Null messagingIdentity");
        }
        this.b = aoraVar;
    }

    @Override // defpackage.wcl
    public final aora a() {
        return this.b;
    }

    @Override // defpackage.wcl
    public final ConversationIdType b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wcl) {
            wcl wclVar = (wcl) obj;
            if (this.a.equals(wclVar.b()) && this.b.equals(wclVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        aora aoraVar = this.b;
        return "RemoveUserConfirmedEvent{conversationId=" + this.a.toString() + ", messagingIdentity=" + aoraVar.toString() + "}";
    }
}
