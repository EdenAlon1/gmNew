package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avvk implements avvo {
    final /* synthetic */ avvq a;
    private Optional b = Optional.empty();

    public avvk(avvq avvqVar) {
        this.a = avvqVar;
    }

    @Override // defpackage.avvo
    public final String a() {
        return "HttpExecutionState";
    }

    @Override // defpackage.avvo
    public final void b(avvi avviVar) {
        ensz enszVar = (ensz) avvq.a.h();
        enszVar.Y(cqpo.a, this.a.c);
        enszVar.Y(cqpo.i, "HttpExecutionState");
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/InProgressFileTransfer$HttpExecutionState", "enter", 212, "InProgressFileTransfer.java")).q("Starting the HTTP execution.");
        if (avviVar.b() != 2) {
            throw new IllegalStateException(String.format("Transfer id %s can't enter %s without a UrlHttpRequest.", this.a.c, "HttpExecutionState"));
        }
        avvz a = avviVar.a();
        this.b = Optional.of(a);
        a.b();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [avvz, java.lang.Object] */
    @Override // defpackage.avvo
    public final void c() {
        if (this.b.isEmpty()) {
            return;
        }
        ensz enszVar = (ensz) avvq.a.h();
        enszVar.Y(cqpo.a, this.a.c);
        enszVar.Y(cqpo.i, "HttpExecutionState");
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/InProgressFileTransfer$HttpExecutionState", "exit", 234, "InProgressFileTransfer.java")).q("Cancelling the HTTP execution.");
        ?? r0 = this.b.get();
        this.b = Optional.empty();
        r0.a();
    }
}
