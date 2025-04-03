package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqcs implements aqdl {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/message/status/IncomingExpiredOrNotAvailableFailedStatusHandler");

    @Override // defpackage.aqdl
    public final /* bridge */ /* synthetic */ aqcm a(Resources resources, MessagesTable.BindData bindData, engw engwVar, aoug aougVar, apug apugVar, amfx amfxVar) {
        resources.getClass();
        bindData.getClass();
        engwVar.getClass();
        aougVar.getClass();
        apugVar.getClass();
        amfxVar.getClass();
        String string = resources.getString(R.string.message_status_download_error);
        string.getClass();
        ((enrr) a.h().h("com/google/android/apps/messaging/shared/api/messaging/message/status/IncomingExpiredOrNotAvailableFailedStatusHandler", "convert", 38, "IncomingExpiredOrNotAvailableFailedStatusHandler.kt")).D("Message with id %s has status %s", bindData.D().b(), string);
        return new aqcj(string);
    }
}
