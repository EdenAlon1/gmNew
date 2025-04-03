package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwol implements dtuq {
    @Override // defpackage.dtuq
    public final String a() {
        return "profiles_table";
    }

    @Override // defpackage.dtuq
    public final void b(dtve dtveVar) {
        ProfilesTable.e(dtveVar, Alert.DURATION_SHOW_INDEFINITELY);
    }
}
