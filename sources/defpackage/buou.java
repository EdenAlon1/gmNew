package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buou implements Supplier {
    final /* synthetic */ MessagesTable.BindData a;

    public buou(MessagesTable.BindData bindData) {
        this.a = bindData;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Optional optional = this.a.ap;
        if (optional == null || optional.equals(bdhj.a)) {
            return null;
        }
        return bdhj.b(this.a.ap);
    }
}
