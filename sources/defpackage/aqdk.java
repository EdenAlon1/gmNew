package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqdk implements aqdl {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/message/status/SendingStatusHandler");
    private final csjk b;
    private final cqoh c;

    public aqdk(csjk csjkVar, cqoh cqohVar) {
        csjkVar.getClass();
        cqohVar.getClass();
        this.b = csjkVar;
        this.c = cqohVar;
    }

    @Override // defpackage.aqdl
    public final aqcm a(Resources resources, MessagesTable.BindData bindData, engw engwVar, aoug aougVar, apug apugVar, amfx amfxVar) {
        String string;
        aqux f;
        resources.getClass();
        bindData.getClass();
        engwVar.getClass();
        aougVar.getClass();
        apugVar.getClass();
        amfxVar.getClass();
        csjk csjkVar = this.b;
        int l = bindData.l();
        csmz csmzVar = (csmz) csjkVar.a();
        if (csmzVar.x() && (f = amfxVar.f()) != null && csmzVar.d(l, f.b()) == csod.UNAVAILABLE) {
            string = resources.getString(R.string.mapi_message_status_waiting_to_connect);
        } else {
            Instant ofEpochMilli = Instant.ofEpochMilli(bindData.y());
            Object e = aqgk.a.e();
            e.getClass();
            string = ofEpochMilli.plus(Duration.ofMillis(((Number) e).longValue())).isBefore(this.c.f()) ? resources.getString(R.string.mapi_message_status_still_sending) : null;
        }
        String str = string;
        ((enrr) a.h().h("com/google/android/apps/messaging/shared/api/messaging/message/status/SendingStatusHandler", "convert", 74, "SendingStatusHandler.kt")).D("Message with id %s has status %s", bindData.D().b(), str);
        boolean z = false;
        if (bindData.l() == 3 && !amfxVar.M()) {
            z = true;
        }
        return new aqcl(str, 1, true, z, true, false, false, false, 224);
    }
}
