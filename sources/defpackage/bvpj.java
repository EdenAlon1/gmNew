package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvpj implements Supplier {
    final /* synthetic */ ParticipantsTable.BindData a;

    public bvpj(ParticipantsTable.BindData bindData) {
        this.a = bindData;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        azsu azsuVar = this.a.c;
        if (azsuVar == null || azsuVar.equals(null)) {
            return null;
        }
        return azsv.b(this.a.c);
    }
}
