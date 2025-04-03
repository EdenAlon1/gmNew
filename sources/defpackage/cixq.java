package defpackage;

import com.google.android.apps.messaging.shared.notification2o.NotificationsReceiver;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cixq implements erqj {
    final /* synthetic */ civq a;

    public cixq(civq civqVar) {
        this.a = civqVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ensz enszVar = (ensz) NotificationsReceiver.a.h();
        enszVar.Y(cird.o, this.a);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver$2", "onSuccess", 261, "NotificationsReceiver.java")).q("Successfully run callback");
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ((ensz) ((ensz) ((ensz) NotificationsReceiver.a.j()).g(th)).h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver$2", "onFailure", (char) 266, "NotificationsReceiver.java")).q("Failed to run callback");
    }
}
