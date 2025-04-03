package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avvq {
    public static final entd a = entd.c("BugleFileTransfer");
    public final errl b;
    public final String c;
    public final avwq d;
    public final avvo e;
    public final avvo f;
    public final avvo g;
    public final avvo h;
    public avvo i;
    public final avxm j;
    public final avxn k;

    public avvq(errl errlVar, String str, avxm avxmVar, avwq avwqVar, avxn avxnVar) {
        avvp avvpVar = new avvp();
        this.e = avvpVar;
        this.f = new avvn(this);
        this.g = new avvk(this);
        this.h = new avvj(this);
        this.b = errlVar;
        this.c = str;
        this.j = avxmVar;
        this.d = avwqVar;
        this.i = avvpVar;
        this.k = avxnVar;
    }

    public final synchronized void a(avvo avvoVar, avvi avviVar) {
        if (this.i == this.h) {
            ensz enszVar = (ensz) a.j();
            enszVar.Y(cqpo.a, this.c);
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/InProgressFileTransfer", "transition", 88, "InProgressFileTransfer.java")).q("InProgressFileTransfer already finished.");
            return;
        }
        ensz enszVar2 = (ensz) a.h();
        enszVar2.Y(cqpo.a, this.c);
        ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/InProgressFileTransfer", "transition", 94, "InProgressFileTransfer.java")).D("Transitioning from %s to %s.", this.i.a(), avvoVar.a());
        this.i.c();
        this.i = avvoVar;
        avvoVar.b(avviVar);
    }
}
