package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class bajr {
    private final ConversationIdType a;
    private final SelfIdentityId b;
    private final int c;

    public bajr(MessageCoreData messageCoreData) {
        ConversationIdType z = messageCoreData.z();
        this.a = z;
        if ((!ersy.a("bugle.enable_sim_parallel_rcs_sending", "bugle") || !messageCoreData.cX()) && !messageCoreData.df() && !messageCoreData.cP()) {
            this.b = null;
            this.c = z.hashCode();
        } else {
            SelfIdentityId v = messageCoreData.v();
            this.b = v;
            this.c = Objects.hash(z, aquz.b(v));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bajr)) {
            return false;
        }
        bajr bajrVar = (bajr) obj;
        return this.c == bajrVar.c && Objects.equals(this.a, bajrVar.a) && Objects.equals(this.b, bajrVar.b);
    }

    public final int hashCode() {
        return this.c;
    }
}
