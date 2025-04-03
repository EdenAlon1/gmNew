package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnoq {
    public static /* synthetic */ ejoi a(int i, String str, Duration duration, int i2) {
        pon ponVar = new pon();
        ponVar.e(GroupManagementRequest.ACTION_TAG, i != 1 ? i != 2 ? "REGISTER_SATELLITE_PENDING_INTENT" : "LOST_SATELLITE_CONNECTION" : "NEW_SATELLITE_CONNECTION");
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (str != null) {
            ponVar.e("MyIdentityToken", str);
        }
        if ((i2 & 4) != 0) {
            duration = null;
        }
        ejoe n = ejoi.n(cnov.class);
        ejnt ejntVar = (ejnt) n;
        ejntVar.e = ponVar.a();
        n.f(fffi.b("SatelliteWorkTag"));
        if (duration != null) {
            ensk h = cnov.a.h();
            h.Y(ente.a, "BugleSatellite");
            ((enrr) h.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/NotifySatelliteConnectionChangeWorker$Companion", "buildWorkSpec", 163, "NotifySatelliteConnectionChangeWorker.kt")).s("Will re-register for satellite event with delay: %ss", duration.getSeconds());
            ejntVar.c = new ejnw(duration.getSeconds(), TimeUnit.SECONDS);
        } else {
            ejntVar.b = emxc.j(pqg.RUN_AS_NON_EXPEDITED_WORK_REQUEST);
        }
        return n.h();
    }
}
