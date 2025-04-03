package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crdz {
    public static final entd a = entd.c("BugleFileTransfer");
    public final errl b;
    public final crft c;
    public final cqqd d;
    public final ffbr e;
    public final asmh f;
    public final Object g = new Object();
    public final Map h = new HashMap();
    public final crcd i;

    public crdz(errl errlVar, crft crftVar, cqqd cqqdVar, crcd crcdVar, ffbr ffbrVar, asmh asmhVar) {
        this.b = errlVar;
        this.c = crftVar;
        this.d = cqqdVar;
        this.i = crcdVar;
        this.e = ffbrVar;
        this.f = asmhVar;
    }

    public final elfl a(final awbs awbsVar, final emwl emwlVar, final crbv crbvVar, final String str) {
        return this.c.a(crbvVar, new crfs() { // from class: crdt
            @Override // defpackage.crfs
            public final favp a(crbk crbkVar, crbv crbvVar2) {
                entd entdVar = crdz.a;
                crff crffVar = (crff) crbkVar;
                csuu csuuVar = (csuu) crffVar.b.b();
                Uri uri = ((crbg) crbvVar2).c;
                return new favz(((csuu) crffVar.b.b()).k(uri), csuuVar.b(uri), ((Integer) crff.a.e()).intValue());
            }
        }).g(new erot() { // from class: crdu
            @Override // defpackage.erot
            public final erph a(erpc erpcVar, Object obj) {
                favp favpVar = (favp) obj;
                entd entdVar = crdz.a;
                favpVar.getClass();
                emxf.b(favpVar.e() != -1, "DataStream is unknown size.");
                return new erph((ListenableFuture) emwl.this.apply(favpVar));
            }
        }, this.b).g(new erot() { // from class: crdv
            @Override // defpackage.erot
            public final erph a(erpc erpcVar, Object obj) {
                elfl h;
                final fawj fawjVar = (fawj) obj;
                fawjVar.getClass();
                final awbs awbsVar2 = awbsVar;
                crdz crdzVar = crdz.this;
                synchronized (crdzVar.g) {
                    crdzVar.h.put(awbsVar2, fawjVar);
                }
                final cqqd cqqdVar = crdzVar.d;
                final String str2 = awbsVar2.a;
                if (str2 == null) {
                    ((ensz) ((ensz) cqqd.a.j()).h("com/google/android/apps/messaging/shared/transfer/FileTransferStartedCallbackHandler", "markMessageInProgress", 46, "FileTransferStartedCallbackHandler.java")).q("Upload id is empty. Message should already be marked in progress.");
                    h = elfo.e(null);
                } else {
                    h = ((cqrl) cqqdVar.d.b()).c(str2, Optional.empty()).h(new emwl() { // from class: cqqc
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, java.lang.Object] */
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            cqrn cqrnVar = (cqrn) obj2;
                            boolean isEmpty = cqrnVar.b().isEmpty();
                            String str3 = str2;
                            if (isEmpty || cqrnVar.a().isEmpty()) {
                                ensz enszVar = (ensz) cqqd.a.j();
                                enszVar.Y(cqpo.a, str3);
                                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/FileTransferStartedCallbackHandler", "markMessageInProgress", 59, "FileTransferStartedCallbackHandler.java")).q("Could not find a valid FileTransferMessageCoreData to handle file transfer starting callback.");
                                return null;
                            }
                            cqqd cqqdVar2 = cqqd.this;
                            ?? r5 = cqrnVar.b().get();
                            cqtk o = ((cqrs) cqrnVar.a().get()).o();
                            r5.aW(cqtk.DOWNLOAD.equals(o) ? r5.o() : cqqdVar2.e.f().toEpochMilli(), o);
                            ensz enszVar2 = (ensz) cqqd.a.h();
                            enszVar2.Y(cqpo.a, str3);
                            ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/FileTransferStartedCallbackHandler", "markMessageInProgress", 77, "FileTransferStartedCallbackHandler.java")).q("File transfer starting. Marking message in progress.");
                            ((bdmq) cqqdVar2.c.b()).T(r5);
                            return null;
                        }
                    }, cqqdVar.b);
                }
                return new erph(h.i(new eroh() { // from class: crdq
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        ensz enszVar = (ensz) crdz.a.h();
                        fawj fawjVar2 = fawj.this;
                        enszVar.Y(cqpo.b, fawjVar2.d());
                        awbs awbsVar3 = awbsVar2;
                        enszVar.Y(cqpo.a, awbsVar3.a);
                        enszVar.Y(cqpo.j, awbsVar3.b);
                        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/uploads/ScottyFileUploader", "uploadInternal", 230, "ScottyFileUploader.java")).q("File upload is starting.");
                        return fawjVar2.b();
                    }
                }, crdzVar.b));
            }
        }, this.b).h().h(new emwl() { // from class: crdw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                awbs awbsVar2 = awbsVar;
                fawm fawmVar = (fawm) obj;
                final crdz crdzVar = crdz.this;
                synchronized (crdzVar.g) {
                    crdzVar.h.remove(awbsVar2);
                }
                String str2 = str;
                final crbv crbvVar2 = crbvVar;
                return crbs.a(fawmVar, new crbr() { // from class: crds
                    @Override // defpackage.crbr
                    public final crfj a(fcki fckiVar) {
                        awvc awvcVar = (awvc) awvd.a.createBuilder();
                        crbg crbgVar = (crbg) crbvVar2;
                        awvb h = crft.h(fckiVar, crbgVar.d, crbgVar.b);
                        awvcVar.copyOnWrite();
                        awvd awvdVar = (awvd) awvcVar.instance;
                        h.getClass();
                        awvdVar.c = h;
                        awvdVar.b |= 1;
                        return new crfj(new crce((awvd) awvcVar.build()));
                    }
                }, str2);
            }
        }, this.b).e(Throwable.class, new emwl() { // from class: crdx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                awbs awbsVar2 = awbsVar;
                Throwable th = (Throwable) obj;
                crdz crdzVar = crdz.this;
                synchronized (crdzVar.g) {
                    crdzVar.h.remove(awbsVar2);
                }
                if (th instanceof CancellationException) {
                    return crfi.a;
                }
                String str2 = str;
                if (th instanceof FileNotFoundException) {
                    avvc g = avvd.g();
                    g.f(cqpn.FILE_TRANSFER_FAILURE_REASON_OPENING_THE_FILE_FAILED);
                    g.c(th);
                    g.g(str2);
                    return new crfk(g.a());
                }
                if (th instanceof IllegalArgumentException) {
                    avvc g2 = avvd.g();
                    g2.f(cqpn.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_GET_FILE_SIZE);
                    g2.g(str2);
                    return new crfk(g2.a());
                }
                avvc g3 = avvd.g();
                g3.f(cqpn.FILE_TRANSFER_FAILURE_REASON_UNKNOWN);
                g3.c(th);
                g3.g(str2);
                return new crfk(g3.a());
            }
        }, this.b);
    }
}
