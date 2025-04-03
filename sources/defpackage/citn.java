package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class citn implements erqj {
    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ensk h = cito.a.h();
        h.Y(ente.a, "BugleNotifications");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/notification2o/CancelNotificationHandler$1", "onSuccess", 186, "CancelNotificationHandler.java")).q("Notification canceled callback successfully run");
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ensk j = cito.a.j();
        j.Y(ente.a, "BugleNotifications");
        ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/shared/notification2o/CancelNotificationHandler$1", "onFailure", (char) 191, "CancelNotificationHandler.java")).q("Notification canceled callback failed");
    }
}
