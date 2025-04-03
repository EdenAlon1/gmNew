package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buor implements Supplier {
    final /* synthetic */ MessagesTable.BindData a;

    public buor(MessagesTable.BindData bindData) {
        this.a = bindData;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        MessageIdType messageIdType = this.a.Y;
        if (messageIdType == null || messageIdType.equals(bdhb.a)) {
            return null;
        }
        return Long.valueOf(bdhb.a(this.a.Y));
    }
}
