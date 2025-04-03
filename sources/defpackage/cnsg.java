package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnsg {
    public final ConversationIdType a;
    public final SelfIdentityId b;
    public final ParticipantsTable.BindData c;

    public cnsg(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, ParticipantsTable.BindData bindData) {
        this.a = conversationIdType;
        this.b = selfIdentityId;
        this.c = bindData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnsg)) {
            return false;
        }
        cnsg cnsgVar = (cnsg) obj;
        return ffkj.e(this.a, cnsgVar.a) && ffkj.e(this.b, cnsgVar.b) && ffkj.e(this.c, cnsgVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ConvInfo(conversationIdType=" + this.a + ", selfIdentityId=" + this.b + ", participantsTableBindData=" + this.c + ")";
    }
}
