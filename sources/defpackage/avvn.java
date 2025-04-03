package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avvn implements avvo {
    public final /* synthetic */ avvq a;

    public avvn(avvq avvqVar) {
        this.a = avvqVar;
    }

    @Override // defpackage.avvo
    public final String a() {
        return "SetupState";
    }

    @Override // defpackage.avvo
    public final void b(avvi avviVar) {
        ensz enszVar = (ensz) avvq.a.h();
        enszVar.Y(cqpo.a, this.a.c);
        enszVar.Y(cqpo.i, "SetupState");
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/InProgressFileTransfer$SetupState", "enter", 143, "InProgressFileTransfer.java")).q("Preparing the HTTP request for execution.");
        this.a.d.a().h(new emwl() { // from class: avvl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                avwp avwpVar = (avwp) obj;
                int b = avwpVar.b();
                avvn avvnVar = avvn.this;
                if (b == 2) {
                    avvd a = avwpVar.a();
                    ensz enszVar2 = (ensz) avvq.a.j();
                    enszVar2.Y(cqpo.a, avvnVar.a.c);
                    enszVar2.Y(cqpo.i, "SetupState");
                    ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/InProgressFileTransfer$SetupState", "enter", 155, "InProgressFileTransfer.java")).q("Failure during setting up the UrlRequest.");
                    avvq avvqVar = avvnVar.a;
                    avvqVar.a(avvqVar.h, new avul(a));
                    return null;
                }
                avvq avvqVar2 = avvnVar.a;
                avvm avvmVar = new avvm(avvnVar);
                avxn avxnVar = avvqVar2.k;
                long length = avxnVar.a ? avxnVar.b.length() : 0L;
                avwa a2 = ((avwb) avxnVar.h.b.b()).a(avxnVar.g, new avxq(avxnVar.c, avxnVar.d, length, avxnVar.e, cqqm.a(), avvmVar, avxnVar.f));
                if (avxnVar.a) {
                    a2.b(String.format(Locale.US, "bytes=%d-", Long.valueOf(length)));
                }
                a2.c(avwpVar.c());
                avvq avvqVar3 = avvnVar.a;
                avvqVar3.a(avvqVar3.g, new avuk(a2.a()));
                return null;
            }
        }, this.a.b).k(axnw.b(), erpp.a);
    }

    @Override // defpackage.avvo
    public final void c() {
    }
}
