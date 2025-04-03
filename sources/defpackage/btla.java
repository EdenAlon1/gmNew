package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class btla implements Supplier {
    final /* synthetic */ btlb a;

    public btla(btlb btlbVar) {
        this.a = btlbVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        ConversationIdType conversationIdType = this.a.b;
        if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
            return null;
        }
        return Long.valueOf(bdgq.a(this.a.b));
    }
}
