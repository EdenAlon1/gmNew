package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqcy implements aqdf {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/message/status/OutgoingFailedRecipientNegativeDeliveryStatusHandler");

    @Override // defpackage.aqdl
    public final /* synthetic */ aqcm a(Resources resources, MessagesTable.BindData bindData, engw engwVar, aoug aougVar, apug apugVar, amfx amfxVar) {
        return aqde.a(this, resources, bindData, engwVar, aougVar, apugVar, amfxVar);
    }

    @Override // defpackage.aqdf
    public final aqcl b(Resources resources, MessagesTable.BindData bindData, engw engwVar, aoug aougVar, apug apugVar, amfx amfxVar) {
        String string = resources.getString(R.string.message_status_rcs_delivery_failed_recipient_not_rcs_and_no_fallback);
        string.getClass();
        ((enrr) a.h().h("com/google/android/apps/messaging/shared/api/messaging/message/status/OutgoingFailedRecipientNegativeDeliveryStatusHandler", "convertFailure", 49, "OutgoingFailedRecipientNegativeDeliveryStatusHandler.kt")).D("Message with id %s has text %s", bindData.D().b(), string);
        return new aqcl(string, 2, false, false, true, false, false, false, 224);
    }
}
