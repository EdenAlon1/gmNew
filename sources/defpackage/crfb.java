package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crfb extends fawn {
    public static final entd a = entd.c("BugleFileTransfer");
    public final ffbr b;
    public final awbs c;
    private final cqqb d;
    private final long e;
    private final errl f;

    public crfb(cqqb cqqbVar, ffbr ffbrVar, awbs awbsVar, long j, errl errlVar) {
        this.d = cqqbVar;
        this.b = ffbrVar;
        this.c = awbsVar;
        this.e = j;
        this.f = errlVar;
    }

    @Override // defpackage.fawn
    public final void a(fawj fawjVar) {
        final String str = ((fawh) fawjVar).a;
        str.getClass();
        axnw.h(elfo.f(new Runnable() { // from class: crfa
            @Override // java.lang.Runnable
            public final void run() {
                crfb crfbVar = crfb.this;
                if (((awcz) crfbVar.b.b()).p(crfbVar.c, new awbt(str))) {
                    return;
                }
                ensz enszVar = (ensz) ((ensz) crfb.a.j()).h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramTransferListener", "onTransferHandleReady", 83, "TachygramTransferListener.java");
                awbs awbsVar = crfbVar.c;
                enszVar.D("Failed to update transfer handle in database. Transfer ID: %s. Processing ID: %s", awbsVar.a, awbsVar.b);
            }
        }, this.f));
    }

    @Override // defpackage.fawn
    public final void b(fawj fawjVar) {
        long a2 = fawjVar.a();
        String d = fawjVar.d();
        ensz enszVar = (ensz) a.h();
        enszVar.Y(cqpo.b, d);
        enszVar.Y(cqpo.e, Long.valueOf(a2));
        enszVar.Y(cqpo.f, Long.valueOf(this.e));
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramTransferListener", "onUploadProgress", 105, "TachygramTransferListener.java")).q("Upload progress reported.");
        cqou cqouVar = new cqou();
        cqouVar.b(a2);
        cqouVar.c(this.e);
        axnw.h(this.d.a(this.c, cqouVar.d()));
    }
}
