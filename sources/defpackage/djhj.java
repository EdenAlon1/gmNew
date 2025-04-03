package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djhj implements erqj {
    final /* synthetic */ String a;
    final /* synthetic */ djhk b;

    public djhj(djhk djhkVar, String str) {
        this.a = str;
        this.b = djhkVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((ensz) ((ensz) this.b.a.h()).h("com/google/android/ims/messaging/v2/CreateGroupOperationResultProcessor$1", "onSuccess", 110, "CreateGroupOperationResultProcessor.java")).t("[%s] Notification completed.", this.a);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ((ensz) ((ensz) ((ensz) this.b.a.j()).g(th)).h("com/google/android/ims/messaging/v2/CreateGroupOperationResultProcessor$1", "onFailure", 115, "CreateGroupOperationResultProcessor.java")).D("[%s] Error while notifying operation completed: %s", this.a, th);
    }
}
