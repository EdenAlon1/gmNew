package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bczi extends bdfy {
    public final ConversationIdType a;
    public final boolean b;

    public bczi(ConversationIdType conversationIdType, boolean z) {
        this.a = conversationIdType;
        this.b = z;
    }

    @Override // defpackage.bdfy
    public final ConversationIdType a() {
        return this.a;
    }

    @Override // defpackage.bdfy
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdfy) {
            bdfy bdfyVar = (bdfy) obj;
            if (this.a.equals(bdfyVar.a()) && this.b == bdfyVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "CreateConversationResult{conversationId=" + this.a.toString() + ", newlyCreated=" + this.b + "}";
    }
}
