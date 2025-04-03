package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awch implements ffji {
    final /* synthetic */ awcl a;

    public awch(awcl awclVar) {
        this.a = awclVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ensk h = awcl.a.h();
        h.Y(ente.a, "BugleFileTransfer");
        enrr enrrVar = (enrr) h;
        enrrVar.Y(cqpo.j, this.a.c);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/WaitingStep$awaitCallback$2$1$1", "invoke", 72, "WaitingStep.kt")).q("Continuation has been cancelled, removing related file processing listeners.");
        awcl awclVar = this.a;
        awclVar.b.a(awclVar.c);
        return ffcu.a;
    }
}
