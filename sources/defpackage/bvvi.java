package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvvi implements dtuq {
    @Override // defpackage.dtuq
    public final String a() {
        return "participants";
    }

    @Override // defpackage.dtuq
    public final void b(dtve dtveVar) {
        dtveVar.y(ParticipantsTable.n(Alert.DURATION_SHOW_INDEFINITELY, "participants"));
        for (String str : ParticipantsTable.p(Alert.DURATION_SHOW_INDEFINITELY)) {
            dtveVar.y(str);
        }
    }
}
