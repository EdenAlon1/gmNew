package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crez implements crdb {
    public final entd a = entd.c("BugleFileTransfer");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    private final errl e;
    private final errl f;
    private final ffbr g;

    public crez(errl errlVar, errl errlVar2, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.e = errlVar;
        this.f = errlVar2;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.g = ffbrVar4;
    }

    @Override // defpackage.crdb
    public final elfl a(final String str) {
        ensz enszVar = (ensz) this.a.h();
        enszVar.Y(cqpo.a, str);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploader", "pauseUpload", 115, "TachygramFileUploader.java")).q("Pausing the file upload.");
        return ((cqps) this.g.b()).b(str).i(new eroh() { // from class: crex
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return crez.this.d(str);
            }
        }, this.e).i(new eroh() { // from class: crey
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((crcc) crez.this.c.b()).a(new awbs(str, null, null, 6));
            }
        }, this.e);
    }

    @Override // defpackage.crdb
    public final elfl b(final String str) {
        ensz enszVar = (ensz) this.a.h();
        enszVar.Y(cqpo.a, str);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploader", "resumeUpload", 130, "TachygramFileUploader.java")).q("Resuming the file upload.");
        final crda crdaVar = (crda) this.b.b();
        return elfo.h(new erog() { // from class: crcw
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, java.lang.Object] */
            @Override // defpackage.erog
            public final ListenableFuture a() {
                crda crdaVar2 = crda.this;
                cqrl cqrlVar = (cqrl) crdaVar2.d.b();
                Optional of = Optional.of(cqtk.UPLOAD);
                String str2 = str;
                cqrn b = cqrlVar.b(str2, of);
                if (!b.c()) {
                    return elfo.e(ckbx.j(3, 0).a());
                }
                cqqs cqqsVar = (cqqs) b;
                Optional optional = cqqsVar.b;
                Optional optional2 = cqqsVar.a;
                Object obj = optional.get();
                ?? r1 = optional2.get();
                cqrs cqrsVar = (cqrs) obj;
                awvb k = cqrsVar.k();
                k.getClass();
                avty avtyVar = new avty();
                entd entdVar = crbv.h;
                crbf crbfVar = new crbf();
                crbfVar.e(Uri.parse(k.f));
                crbfVar.f(k.c);
                crbfVar.g(k.d);
                if ((k.b & 1) != 0) {
                    awup awupVar = k.e;
                    if (awupVar == null) {
                        awupVar = awup.a;
                    }
                    crbfVar.d((ContentType) avtyVar.fP(awupVar));
                }
                crbv j = crbfVar.j();
                String q = cqrsVar.q();
                if (q == null) {
                    ((ensz) ((ensz) crda.a.h()).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkScheduler", "resume", 111, "FileUploadWorkScheduler.java")).q("Transfer handle is not populated, i.e. file transfer is not ready to be resumed, falling back to full upload.");
                    return crdaVar2.c(str2, r1, j);
                }
                crca a = crda.a(r1.E(), r1.w(), j, str2);
                a.copyOnWrite();
                crcb crcbVar = (crcb) a.instance;
                crcb crcbVar2 = crcb.a;
                crcbVar.b |= 32;
                crcbVar.h = q;
                return crdaVar2.b(str2, (crcb) a.build());
            }
        }, crdaVar.c);
    }

    @Override // defpackage.crdb
    public final elfl c(final crei creiVar) {
        final MessageIdType B = ((crbh) creiVar).a.B();
        return elfo.f(new Runnable() { // from class: crev
            @Override // java.lang.Runnable
            public final void run() {
                crez crezVar = crez.this;
                ffbr ffbrVar = crezVar.d;
                MessageIdType messageIdType = B;
                String b = messageIdType.b();
                cqrl cqrlVar = (cqrl) ffbrVar.b();
                if (cqrlVar.i(messageIdType, b)) {
                    ensz enszVar = (ensz) crezVar.a.h();
                    enszVar.Y(cqpo.a, b);
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploader", "updateFileTransferTable", 90, "TachygramFileUploader.java")).q("Found duplicate upload transfer id. Deleting it to continue with upload.");
                }
                emxf.m(cqrlVar.m(messageIdType, b, cqtk.UPLOAD, crbz.a(((crbh) creiVar).b)), "Failed to insert or update FileTransferTable entry for upload.");
            }
        }, this.f).i(new eroh() { // from class: crew
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                crez crezVar = crez.this;
                ensz enszVar = (ensz) crezVar.a.h();
                ensn ensnVar = csux.b;
                MessageIdType messageIdType = B;
                enszVar.Y(ensnVar, messageIdType);
                crbh crbhVar = (crbh) creiVar;
                enszVar.Y(csux.p, crbhVar.a.z());
                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploader", "uploadFile", 70, "TachygramFileUploader.java")).q("Starting the file upload to content server.");
                return ((crda) crezVar.b.b()).c(messageIdType.b(), crbhVar.a, crbhVar.b);
            }
        }, this.e);
    }

    public final elfl d(final String str) {
        ensz enszVar = (ensz) this.a.h();
        enszVar.Y(cqpo.a, str);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploader", "cancelUpload", 104, "TachygramFileUploader.java")).q("Canceling the file upload.");
        try {
            final crda crdaVar = (crda) this.b.b();
            return elfo.f(new Runnable() { // from class: crcv
                @Override // java.lang.Runnable
                public final void run() {
                    cevh cevhVar = (cevh) ((crdm) crda.this.b.b()).a.b();
                    String str2 = str;
                    cevhVar.e("messaging_file_upload", str2);
                    ensz enszVar2 = (ensz) crda.a.h();
                    enszVar2.Y(cqpo.a, str2);
                    ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkScheduler", "cancel", 133, "FileUploadWorkScheduler.java")).q("File upload cancelled.");
                }
            }, crdaVar.c);
        } catch (IndexOutOfBoundsException unused) {
            ((ensz) ((ensz) this.a.j()).h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploader", "cancelUpload", 108, "TachygramFileUploader.java")).q("Attempted to cancel work, but no work was found.");
            return elfo.e(null);
        }
    }
}
