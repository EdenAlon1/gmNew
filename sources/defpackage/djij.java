package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djij implements erqj {
    final /* synthetic */ clsd a;
    final /* synthetic */ djik b;

    public djij(djik djikVar, clsd clsdVar) {
        this.a = clsdVar;
        this.b = djikVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ensz enszVar = (ensz) ((ensz) this.b.a.h()).h("com/google/android/ims/messaging/v2/SendMessageOperationResultProcessor$1", "onSuccess", 131, "SendMessageOperationResultProcessor.java");
        clqx clqxVar = this.a.f;
        if (clqxVar == null) {
            clqxVar = clqx.a;
        }
        enszVar.t("[%s] Notification completed.", clqxVar.c);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ensz enszVar = (ensz) ((ensz) ((ensz) this.b.a.j()).g(th)).h("com/google/android/ims/messaging/v2/SendMessageOperationResultProcessor$1", "onFailure", 136, "SendMessageOperationResultProcessor.java");
        clqx clqxVar = this.a.f;
        if (clqxVar == null) {
            clqxVar = clqx.a;
        }
        enszVar.D("[%s] Error while notifying operation completed: %s", clqxVar.c, th);
    }
}
