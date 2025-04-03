package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djip implements erqj {
    final /* synthetic */ String a;
    final /* synthetic */ djiq b;

    public djip(djiq djiqVar, String str) {
        this.a = str;
        this.b = djiqVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((ensz) ((ensz) this.b.a.h()).h("com/google/android/ims/messaging/v2/UpdateGroupOperationResultProcessor$1", "onSuccess", 103, "UpdateGroupOperationResultProcessor.java")).t("[%s] Notification completed.", this.a);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ((ensz) ((ensz) ((ensz) this.b.a.j()).g(th)).h("com/google/android/ims/messaging/v2/UpdateGroupOperationResultProcessor$1", "onFailure", 108, "UpdateGroupOperationResultProcessor.java")).D("[%s] Error while notifying operation completed: %s", this.a, th);
    }
}
