package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buot implements Supplier {
    final /* synthetic */ MessagesTable.BindData a;

    public buot(MessagesTable.BindData bindData) {
        this.a = bindData;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bdgr bdgrVar = this.a.an;
        if (bdgrVar == null || bdgrVar.equals(bdgr.a)) {
            return null;
        }
        return bdgr.d(this.a.an);
    }
}
