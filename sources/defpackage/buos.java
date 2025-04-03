package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buos implements Supplier {
    final /* synthetic */ MessagesTable.BindData a;

    public buos(MessagesTable.BindData bindData) {
        this.a = bindData;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Optional optional = this.a.ab;
        if (optional == null || optional.equals(bdhj.a)) {
            return null;
        }
        return bdhj.b(this.a.ab);
    }
}
