package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djhg implements erqj {
    final /* synthetic */ String a;
    final /* synthetic */ djhh b;

    public djhg(djhh djhhVar, String str) {
        this.a = str;
        this.b = djhhVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((ensz) ((ensz) this.b.a.h()).h("com/google/android/ims/messaging/v2/AddUserToGroupOperationResultProcessor$1", "onSuccess", 107, "AddUserToGroupOperationResultProcessor.java")).t("[%s] Notification completed.", this.a);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ((ensz) ((ensz) ((ensz) this.b.a.j()).g(th)).h("com/google/android/ims/messaging/v2/AddUserToGroupOperationResultProcessor$1", "onFailure", 112, "AddUserToGroupOperationResultProcessor.java")).D("[%s] Error while notifying operation completed: %s", this.a, th);
    }
}
