package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.UUID;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqvf implements cqvc {
    private final entd a = entd.c("BugleFileTransfer");
    private final ffbr b;
    private final errl c;
    private final avya d;

    public cqvf(errl errlVar, ffbr ffbrVar, avya avyaVar) {
        this.c = errlVar;
        this.b = ffbrVar;
        this.d = avyaVar;
    }

    @Override // defpackage.cqvc
    public final elfl a(MessageIdType messageIdType, FileInformation fileInformation, eyee eyeeVar) {
        ((ensz) ((ensz) this.a.h()).h("com/google/android/apps/messaging/shared/transfer/downloads/FileDownloaderImpl", "downloadFile", 41, "FileDownloaderImpl.java")).q("Starting the file download.");
        return ((cqvb) this.b.b()).b(messageIdType, UUID.randomUUID().toString(), fileInformation, eyeeVar).h(new emwl() { // from class: cqve
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cqtz cqtzVar = new cqtz();
                cqtzVar.b((String) obj);
                return cqtzVar.a();
            }
        }, this.c);
    }

    @Override // defpackage.cqvc
    public final elfl b(String str) {
        ensz enszVar = (ensz) this.a.h();
        enszVar.Y(cqpo.a, str);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/downloads/FileDownloaderImpl", "pauseDownload", 59, "FileDownloaderImpl.java")).q("Starting to pause the file download.");
        return this.d.c(str);
    }

    @Override // defpackage.cqvc
    public final elfl c(final String str) {
        final cqvb cqvbVar = (cqvb) this.b.b();
        return elfo.h(new erog() { // from class: cquz
            @Override // defpackage.erog
            public final ListenableFuture a() {
                cqvb cqvbVar2 = cqvb.this;
                cqrl cqrlVar = (cqrl) cqvbVar2.c.b();
                Optional of = Optional.of(cqtk.DOWNLOAD);
                final String str2 = str;
                cqrs cqrsVar = (cqrs) cqrlVar.f(str2, of).orElseThrow(new Supplier() { // from class: cquv
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        entd entdVar = cqvb.a;
                        return new cquo(false, cqpn.FILE_TRANSFER_FAILURE_REASON_INVALID_MESSAGE, String.format("No file transfer bind data found for resuming download %s", str2));
                    }
                });
                FileInformation fileInformation = (FileInformation) new avtz().fP(cqrsVar.k());
                if (fileInformation == null) {
                    throw new cquo(false, cqpn.FILE_TRANSFER_FAILURE_REASON_INVALID_MESSAGE, String.format("No FileInformation found for resuming download %s", str2));
                }
                byte[] t = cqrsVar.t();
                if (t == null) {
                    throw new cquo(false, cqpn.FILE_TRANSFER_FAILURE_REASON_INVALID_MESSAGE, String.format("No opaque data found for resuming download %s", str2));
                }
                if (cqrsVar.q() == null) {
                    ensz enszVar = (ensz) cqvb.a.j();
                    enszVar.Y(csux.b, cqrsVar.n());
                    enszVar.Y(cqpo.a, str2);
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/downloads/FileDownloadWorker", "resume", 150, "FileDownloadWorker.java")).q("No transfer handle found during resume. Attempting full file download instead.");
                    return cqvbVar2.b(cqrsVar.n(), str2, fileInformation, eyee.x(t));
                }
                byte[] t2 = cqrsVar.t();
                t2.getClass();
                eyee x = eyee.x(t2);
                String q = cqrsVar.q();
                q.getClass();
                return cqvbVar2.c(cqvb.a(fileInformation, x, str2, Optional.of(q)));
            }
        }, cqvbVar.b).h(new emwl() { // from class: cqvd
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cqtz cqtzVar = new cqtz();
                cqtzVar.b((String) obj);
                return cqtzVar.a();
            }
        }, this.c);
    }
}
