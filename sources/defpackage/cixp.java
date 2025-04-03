package defpackage;

import com.google.android.apps.messaging.shared.notification2o.NotificationsReceiver;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cixp implements erqj {
    final /* synthetic */ ciux a;

    public cixp(ciux ciuxVar) {
        this.a = ciuxVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ensz enszVar = (ensz) NotificationsReceiver.a.h();
        enszVar.Y(cird.p, this.a);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver$1", "onSuccess", 152, "NotificationsReceiver.java")).q("Successfully run action callback");
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ensz enszVar = (ensz) NotificationsReceiver.a.h();
        enszVar.Y(cird.p, this.a);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver$1", "onFailure", 160, "NotificationsReceiver.java")).q("Failed to run action callback");
    }
}
