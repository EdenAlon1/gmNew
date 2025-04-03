package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djim implements erqj {
    final /* synthetic */ String a;
    final /* synthetic */ djin b;

    public djim(djin djinVar, String str) {
        this.a = str;
        this.b = djinVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((ensz) ((ensz) this.b.a.h()).h("com/google/android/ims/messaging/v2/TriggerGroupNotificationOperationResultProcessor$1", "onSuccess", 103, "TriggerGroupNotificationOperationResultProcessor.java")).t("[%s] Notification completed.", this.a);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ((ensz) ((ensz) ((ensz) this.b.a.j()).g(th)).h("com/google/android/ims/messaging/v2/TriggerGroupNotificationOperationResultProcessor$1", "onFailure", 108, "TriggerGroupNotificationOperationResultProcessor.java")).D("[%s] Error while notifying operation completed: %s", this.a, th);
    }
}
