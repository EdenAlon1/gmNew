package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.receiver.IncomingRcsEventReceiver;
import com.google.android.ims.rcsservice.filetransfer.FileTransferResult;
import com.google.android.ims.rcsservice.filetransfer.PauseDownloadResult;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadResult;
import com.google.android.rcs.client.filetransfer.FileTransferService;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqvs implements cqvc {
    public static final entd a = entd.c("BugleFileTransfer");
    public final ffbr b;
    public final ffbr c;
    public final errl d;
    public final Context e;
    private final errl f;
    private final errl g;

    public cqvs(ffbr ffbrVar, ffbr ffbrVar2, Context context, errl errlVar, errl errlVar2, errl errlVar3) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.e = context;
        this.f = errlVar;
        this.d = errlVar2;
        this.g = errlVar3;
    }

    public static int d(FileInformation fileInformation, eyee eyeeVar) {
        return Objects.hash(fileInformation, eyeeVar);
    }

    @Override // defpackage.cqvc
    public final elfl a(final MessageIdType messageIdType, final FileInformation fileInformation, final eyee eyeeVar) {
        ensz enszVar = (ensz) a.h();
        enszVar.Y(csux.a, messageIdType.b());
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "downloadFile", 84, "RcsFileDownloader.java")).q("Initiating download.");
        return elfo.g(new Callable() { // from class: cqvh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cqvs cqvsVar = cqvs.this;
                FileInformation fileInformation2 = fileInformation;
                eyee eyeeVar2 = eyeeVar;
                try {
                    FileTransferService fileTransferService = (FileTransferService) cqvsVar.b.b();
                    PendingIntent e = eepf.e(cqvsVar.e, cqvs.d(fileInformation2, eyeeVar2), cqvsVar.e(eyeeVar2), 1107296256, 3);
                    e.getClass();
                    dknb dknbVar = new dknb();
                    dknbVar.b(fileInformation2);
                    dknbVar.c(e);
                    return (cqum) new cqtx().fP(fileTransferService.downloadFile(dknbVar.a()));
                } catch (ehxg e2) {
                    throw new cquo(false, "Exception occurred during file download IPC to RCS Engine.", (Throwable) e2);
                }
            }
        }, this.f).h(new emwl() { // from class: cqvi
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                FileInformation fileInformation2 = fileInformation;
                cqum cqumVar = (cqum) obj;
                Optional g = fileInformation2.g();
                if (g.isPresent() && eifj.FILE.equals(g.get())) {
                    eyee eyeeVar2 = eyeeVar;
                    emxf.m(((cqrl) cqvs.this.c.b()).n(messageIdType, cqumVar.a(), cqtk.DOWNLOAD, (awvb) new avtz().m().fP(fileInformation2), eyeeVar2.I()), "Failed to insert OR update file transfer entry in database.");
                }
                return cqumVar;
            }
        }, this.d);
    }

    @Override // defpackage.cqvc
    public final elfl b(final String str) {
        ensz enszVar = (ensz) a.h();
        enszVar.Y(cqpo.a, str);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "pauseDownload", 124, "RcsFileDownloader.java")).q("Pausing download.");
        return elfo.h(new erog() { // from class: cqvr
            @Override // defpackage.erog
            public final ListenableFuture a() {
                cqvs cqvsVar = cqvs.this;
                cqrl cqrlVar = (cqrl) cqvsVar.c.b();
                String str2 = str;
                List h = cqrlVar.h(str2, cqtk.DOWNLOAD);
                if (h.isEmpty()) {
                    ((ensz) ((ensz) cqvs.a.j()).h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "confirmSingleFileTransferTableEntry", 319, "RcsFileDownloader.java")).q("Could not find the file download entry in database.");
                } else {
                    if (((enou) h).c <= 1) {
                        FileTransferService fileTransferService = (FileTransferService) cqvsVar.b.b();
                        dknh dknhVar = new dknh();
                        dknhVar.b(str2);
                        PauseDownloadResult pauseDownload = fileTransferService.pauseDownload(dknhVar.a());
                        if (FileTransferResult.a.equals(pauseDownload.a())) {
                            ensz enszVar2 = (ensz) cqvs.a.h();
                            enszVar2.Y(cqpo.a, str2);
                            enszVar2.Y(cqpo.h, pauseDownload.a());
                            ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "pauseDownload", 153, "RcsFileDownloader.java")).q("Paused file download request succeeded.");
                            return elfo.e(true);
                        }
                        ensz enszVar3 = (ensz) cqvs.a.h();
                        enszVar3.Y(cqpo.a, str2);
                        enszVar3.Y(cqpo.h, pauseDownload.a());
                        ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "pauseDownload", 144, "RcsFileDownloader.java")).q("Paused file download request failed.");
                        return cquo.b("Pause file download request failed");
                    }
                    ((ensz) ((ensz) cqvs.a.j()).h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "confirmSingleFileTransferTableEntry", 324, "RcsFileDownloader.java")).q("Found more than one file download entry in database.");
                }
                return cquo.a("Failed to pause the download because file transfer entry does not exist in the file transfer table.");
            }
        }, this.f).f(ehxg.class, new eroh() { // from class: cqvg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                entd entdVar = cqvs.a;
                return cquo.c("Exception occurred during pause download IPC to RCS Engine.", (ehxg) obj);
            }
        }, erpp.a);
    }

    @Override // defpackage.cqvc
    public final elfl c(final String str) {
        entd entdVar = a;
        ensz enszVar = (ensz) entdVar.h();
        enszVar.Y(cqpo.a, str);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "resumeDownload", 167, "RcsFileDownloader.java")).q("Resuming download.");
        ensz enszVar2 = (ensz) entdVar.h();
        enszVar2.Y(cqpo.a, str);
        ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "getFileInformationForResume", 262, "RcsFileDownloader.java")).q("Canceling download.");
        final elfl g = elfo.g(new Callable() { // from class: cqvl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                entd entdVar2 = cqvs.a;
                cqte b = cqtj.b();
                b.z("getFileInformationForResume");
                cqsn cqsnVar = cqtj.c;
                b.c(cqsnVar.a, cqsnVar.e);
                cqti cqtiVar = new cqti();
                cqtiVar.c(str);
                cqtiVar.d(cqtk.DOWNLOAD);
                b.k(new cqth(cqtiVar));
                return (cqrs) ((cqsp) b.b().o()).cS();
            }
        }, this.d);
        return g.i(new eroh() { // from class: cqvm
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final cqrs cqrsVar = (cqrs) obj;
                if (cqrsVar == null) {
                    return cquo.a("Failed to resume the download. No file transfer bind data found.");
                }
                if (cqrsVar.k() == null) {
                    return cquo.a("Failed to resume the download. No file information found.");
                }
                return elfo.g(new Callable() { // from class: cqvq
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        entd entdVar2 = cqvs.a;
                        return (String) MessagesTable.h(cqrs.this.n(), new Function() { // from class: cqvj
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                entd entdVar3 = cqvs.a;
                                return ((MessagesTable.BindData) obj2).G().b;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Supplier() { // from class: cqvk
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                entd entdVar3 = cqvs.a;
                                return null;
                            }
                        });
                    }
                }, cqvs.this.d);
            }
        }, this.g).i(new eroh() { // from class: cqvn
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                String str2 = (String) obj;
                if (str2 == null) {
                    return cquo.a("Failed to resume the download. No message data found.");
                }
                String str3 = str;
                elfl elflVar = g;
                cqvs cqvsVar = cqvs.this;
                avtz avtzVar = new avtz();
                cqrs cqrsVar = (cqrs) erqt.q(elflVar);
                cqrsVar.getClass();
                FileInformation fileInformation = (FileInformation) avtzVar.fP(cqrsVar.k());
                cqxm cqxmVar = (cqxm) cqxn.a.createBuilder();
                cqxmVar.copyOnWrite();
                ((cqxn) cqxmVar.instance).b = str2;
                eyee byteString = ((cqxn) cqxmVar.build()).toByteString();
                fileInformation.getClass();
                PendingIntent e = eepf.e(cqvsVar.e, cqvs.d(fileInformation, byteString), cqvsVar.e(byteString), 1107296256, 3);
                e.getClass();
                dknl dknlVar = new dknl();
                dknlVar.d(e);
                dknlVar.c(fileInformation);
                dknlVar.b(str3);
                return elfo.e(dknlVar.a());
            }
        }, this.d).i(new eroh() { // from class: cqvo
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ResumeDownloadResult resumeDownload = ((FileTransferService) cqvs.this.b.b()).resumeDownload((ResumeDownloadRequest) obj);
                boolean equals = FileTransferResult.a.equals(resumeDownload.a());
                String str2 = str;
                if (!equals) {
                    ensz enszVar3 = (ensz) cqvs.a.h();
                    enszVar3.Y(cqpo.h, resumeDownload.a());
                    enszVar3.Y(cqpo.a, str2);
                    ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "resumeDownload", 242, "RcsFileDownloader.java")).q("Resume download request failed.");
                    return cquo.b("Resume download request failed.");
                }
                ensz enszVar4 = (ensz) cqvs.a.h();
                enszVar4.Y(cqpo.h, resumeDownload.a());
                enszVar4.Y(cqpo.a, str2);
                ((ensz) enszVar4.h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "resumeDownload", 233, "RcsFileDownloader.java")).q("Resume download request succeeded.");
                cqtz cqtzVar = new cqtz();
                cqtzVar.b(str2);
                return elfo.e(cqtzVar.a());
            }
        }, this.f).f(ehxg.class, new eroh() { // from class: cqvp
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                entd entdVar2 = cqvs.a;
                return cquo.c("Exception occurred during resume download IPC to RCS Engine.", (ehxg) obj);
            }
        }, erpp.a);
    }

    public final Intent e(eyee eyeeVar) {
        Intent putExtra = new Intent().putExtra("file_transfer_service_download_response_extra", eyeeVar.I());
        putExtra.setClass(this.e, IncomingRcsEventReceiver.class);
        return putExtra;
    }
}
