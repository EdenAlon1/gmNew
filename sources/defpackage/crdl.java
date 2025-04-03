package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.ims.rcsservice.filetransfer.FileTransferInfo;
import com.google.android.ims.rcsservice.filetransfer.FileTransferServiceResult;
import com.google.android.rcs.client.filetransfer.FileTransferService;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crdl implements crdb {
    public static final entd a = entd.c("BugleFileTransfer");
    public final ffbr b;
    public final dtuu c;
    public final Context d;
    public final ffbr e;
    private final errl f;
    private final errl g;

    public crdl(ffbr ffbrVar, dtuu dtuuVar, Context context, ffbr ffbrVar2, errl errlVar, errl errlVar2) {
        this.b = ffbrVar;
        this.c = dtuuVar;
        this.d = context;
        this.e = ffbrVar2;
        this.f = errlVar;
        this.g = errlVar2;
    }

    @Override // defpackage.crdb
    public final elfl a(final String str) {
        return elfo.h(new erog() { // from class: crdd
            @Override // defpackage.erog
            public final ListenableFuture a() {
                crdl crdlVar = crdl.this;
                String str2 = str;
                if (crdlVar.d(str2) && ((FileTransferService) crdlVar.b.b()).pauseFileTransfer(Long.parseLong(str2)).succeeded()) {
                    ensz enszVar = (ensz) crdl.a.h();
                    enszVar.Y(cqpo.a, str2);
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/uploads/LegacyRcsFileUploader", "pauseUpload", 173, "LegacyRcsFileUploader.java")).q("Paused file upload.");
                    return elfo.e(null);
                }
                ensz enszVar2 = (ensz) crdl.a.h();
                enszVar2.Y(cqpo.a, str2);
                ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/uploads/LegacyRcsFileUploader", "pauseUpload", 177, "LegacyRcsFileUploader.java")).q("Failed to pause the upload.");
                return elfo.e(null);
            }
        }, this.g);
    }

    @Override // defpackage.crdb
    public final elfl b(final String str) {
        return elfo.g(new Callable() { // from class: crde
            @Override // java.util.concurrent.Callable
            public final Object call() {
                crdl crdlVar = crdl.this;
                String str2 = str;
                try {
                    if (!crdlVar.d(str2)) {
                        return ckbx.i;
                    }
                    FileTransferServiceResult resumeUploadToContentServer = ((FileTransferService) crdlVar.b.b()).resumeUploadToContentServer(Long.parseLong(str2));
                    if (resumeUploadToContentServer.succeeded()) {
                        ensz enszVar = (ensz) crdl.a.h();
                        enszVar.Y(cqpo.a, str2);
                        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/uploads/LegacyRcsFileUploader", "resumeUpload", 195, "LegacyRcsFileUploader.java")).q("Resumed file upload.");
                        return ckbx.i;
                    }
                    ensz enszVar2 = (ensz) crdl.a.j();
                    enszVar2.Y(cqpo.a, str2);
                    ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/uploads/LegacyRcsFileUploader", "resumeUpload", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "LegacyRcsFileUploader.java")).r("Failed to resume the upload: %s.", resumeUploadToContentServer.getCode());
                    return ckbx.j(3, 0).a();
                } catch (ehxg unused) {
                    return ckbx.j(3, 0).a();
                }
            }
        }, this.g);
    }

    @Override // defpackage.crdb
    public final elfl c(final crei creiVar) {
        return elfo.g(new Callable() { // from class: crdi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                crbh crbhVar = (crbh) creiVar;
                crbg crbgVar = (crbg) crbhVar.b;
                crdl crdlVar = crdl.this;
                crdlVar.d.grantUriPermission("com.google.android.ims", crbgVar.c, 1);
                FileTransferService fileTransferService = (FileTransferService) crdlVar.b.b();
                String e = bdhg.e(crbhVar.a.E());
                dkny dknyVar = dkny.FILE_TRANSFER;
                Function function = new Function() { // from class: crdf
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((ContentType) obj).toString();
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                crbg crbgVar2 = (crbg) crbhVar.b;
                return fileTransferService.uploadToContentServer(e, new FileTransferInfo(dknyVar, crbgVar2.c, (String) crbgVar2.b.map(function).orElse(null), (String) crbgVar2.d.orElse(null), crbgVar2.e.orElse(-1L), ((Long) crbgVar2.a.map(new Function() { // from class: crdg
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Long.valueOf(((Duration) obj).toMillis());
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }).orElse(0L)).longValue(), (byte[]) crbgVar2.g.map(new Function() { // from class: crdh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((eyee) obj).I();
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }).orElse(null), (String) crbgVar2.f.map(new Function() { // from class: crdf
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((ContentType) obj).toString();
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }).orElse(null)));
            }
        }, this.g).h(new emwl() { // from class: crdj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                final FileTransferServiceResult fileTransferServiceResult = (FileTransferServiceResult) obj;
                boolean succeeded = fileTransferServiceResult.succeeded();
                final crei creiVar2 = creiVar;
                if (succeeded) {
                    final crdl crdlVar = crdl.this;
                    crdlVar.c.d("RcsFileUploader#uploadFile", new Runnable() { // from class: crdc
                        @Override // java.lang.Runnable
                        public final void run() {
                            crbh crbhVar = (crbh) creiVar2;
                            MessageIdType B = crbhVar.a.B();
                            String valueOf = String.valueOf(fileTransferServiceResult.a);
                            cqrl cqrlVar = (cqrl) crdl.this.e.b();
                            if (cqrlVar.i(B, valueOf)) {
                                ensz enszVar = (ensz) crdl.a.j();
                                enszVar.Y(cqpo.a, valueOf);
                                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/uploads/LegacyRcsFileUploader", "upsertFileTransferEntryIntoDatabase", 128, "LegacyRcsFileUploader.java")).q("Found duplicate upload transfer id. Deleting it to continue with upload.");
                            }
                            emxf.m(cqrlVar.m(B, valueOf, cqtk.UPLOAD, crbz.a(crbhVar.b)), "Failed to insert or update FileTransferTable entry for legacy upload.");
                            ensz enszVar2 = (ensz) crdl.a.h();
                            enszVar2.Y(csux.b, B);
                            ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/uploads/LegacyRcsFileUploader", "upsertFileTransferEntryIntoDatabase", 139, "LegacyRcsFileUploader.java")).q("File transfer entry is updated.");
                        }
                    });
                    return ckbx.i;
                }
                ensz enszVar = (ensz) crdl.a.j();
                enszVar.Y(csux.b, ((crbh) creiVar2).a.B());
                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/uploads/LegacyRcsFileUploader", "uploadFile", 97, "LegacyRcsFileUploader.java")).r("Failed to schedule the file upload: %s.", fileTransferServiceResult.getCode());
                return ckbx.j(3, 0).a();
            }
        }, this.f).e(ehxg.class, new emwl() { // from class: crdk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = crdl.a;
                return ckbx.j(3, 0).a();
            }
        }, erpp.a);
    }

    public final boolean d(String str) {
        List h = ((cqrl) this.e.b()).h(str, cqtk.UPLOAD);
        if (h.isEmpty()) {
            ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/transfer/uploads/LegacyRcsFileUploader", "confirmSingleFileTransferTableEntry", 224, "LegacyRcsFileUploader.java")).q("Could not find the file upload entry in database.");
            return false;
        }
        if (((enou) h).c <= 1) {
            return true;
        }
        ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/transfer/uploads/LegacyRcsFileUploader", "confirmSingleFileTransferTableEntry", 229, "LegacyRcsFileUploader.java")).q("Found more than one file upload entry in database.");
        return false;
    }
}
