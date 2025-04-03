package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coij implements dtuq {
    @Override // defpackage.dtuq
    public final String a() {
        return "scheduled_send";
    }

    @Override // defpackage.dtuq
    public final void b(dtve dtveVar) {
        ScheduledSendTable.e(dtveVar, Alert.DURATION_SHOW_INDEFINITELY);
    }
}
