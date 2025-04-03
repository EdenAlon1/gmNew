package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvwj implements Supplier {
    final /* synthetic */ PartsTable.BindData a;

    public bvwj(PartsTable.BindData bindData) {
        this.a = bindData;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        MessageIdType messageIdType = this.a.b;
        if (messageIdType == null || messageIdType.equals(bdhb.a)) {
            return null;
        }
        return Long.valueOf(bdhb.a(this.a.b));
    }
}
