package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cohe implements Supplier {
    final /* synthetic */ ScheduledSendTable.BindData a;

    public cohe(ScheduledSendTable.BindData bindData) {
        this.a = bindData;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        ConversationIdType conversationIdType = this.a.c;
        if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
            return null;
        }
        return Long.valueOf(bdgq.a(this.a.c));
    }
}
