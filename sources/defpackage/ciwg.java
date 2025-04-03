package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciwg implements ciuu {
    final /* synthetic */ cixv a;

    public ciwg(cixv cixvVar) {
        this.a = cixvVar;
    }

    @Override // defpackage.ciuu
    public final elfl a(cniz cnizVar, Intent intent, Bundle bundle, ciwd ciwdVar) {
        ciux b = ciux.b(intent.getIntExtra("extra_notification_action_type", ciux.NAT_UNKNOWN.p));
        b.getClass();
        ensz enszVar = (ensz) ciwi.a.h();
        cisw ciswVar = (cisw) ciwdVar;
        enszVar.Y(cird.n, ciswVar.a);
        enszVar.Y(cird.d, (String) ciswVar.b.orElse(null));
        enszVar.Y(cird.p, b);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationDirectorCallbacksModule$1", "onActionCalled", 55, "NotificationDirectorCallbacksModule.java")).q("Notification action clicked");
        ((akzt) this.a.a.b()).e("Bugle.Notifications2o.ActionClicked.Count", b.p);
        return elfo.e(null);
    }
}
