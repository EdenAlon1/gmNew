package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqvb {
    public static final entd a = entd.c("BugleFileTransfer");
    public final errl b;
    public final ffbr c;
    private final errl d;
    private final ffbr e;
    private final ffbr f;

    public cqvb(errl errlVar, errl errlVar2, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.b = errlVar;
        this.d = errlVar2;
        this.e = ffbrVar;
        this.c = ffbrVar2;
        this.f = ffbrVar3;
    }

    public static cqus a(FileInformation fileInformation, eyee eyeeVar, String str, Optional optional) {
        cqty cqtyVar = new cqty();
        final cqup cqupVar = (cqup) cqus.a.createBuilder();
        String i = fileInformation.i();
        cqupVar.copyOnWrite();
        cqus cqusVar = (cqus) cqupVar.instance;
        cqusVar.b |= 2;
        cqusVar.d = i;
        cqupVar.copyOnWrite();
        cqus cqusVar2 = (cqus) cqupVar.instance;
        str.getClass();
        cqusVar2.b |= 8;
        cqusVar2.f = str;
        int a2 = fileInformation.a();
        cqupVar.copyOnWrite();
        cqus cqusVar3 = (cqus) cqupVar.instance;
        cqusVar3.b |= 32;
        cqusVar3.h = a2;
        cqupVar.copyOnWrite();
        cqus cqusVar4 = (cqus) cqupVar.instance;
        cqusVar4.b |= 16;
        cqusVar4.g = eyeeVar;
        fileInformation.h().ifPresent(new Consumer() { // from class: cquw
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                cqup cqupVar2 = cqup.this;
                String str2 = (String) obj;
                cqupVar2.copyOnWrite();
                cqus cqusVar5 = (cqus) cqupVar2.instance;
                cqus cqusVar6 = cqus.a;
                str2.getClass();
                cqusVar5.b |= 4;
                cqusVar5.e = str2;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        optional.ifPresent(new Consumer() { // from class: cqux
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                cqup cqupVar2 = cqup.this;
                String str2 = (String) obj;
                cqupVar2.copyOnWrite();
                cqus cqusVar5 = (cqus) cqupVar2.instance;
                cqus cqusVar6 = cqus.a;
                str2.getClass();
                cqusVar5.b |= 64;
                cqusVar5.i = str2;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        cqur cqurVar = (cqur) cqtyVar.fP((eifj) fileInformation.g().orElse(eifj.FILE));
        cqupVar.copyOnWrite();
        cqus cqusVar5 = (cqus) cqupVar.instance;
        cqusVar5.c = cqurVar.c;
        cqusVar5.b |= 1;
        return (cqus) cqupVar.build();
    }

    public final elfl b(final MessageIdType messageIdType, final String str, final FileInformation fileInformation, final eyee eyeeVar) {
        final cqus a2 = a(fileInformation, eyeeVar, str, Optional.empty());
        ekzz f = eleg.f("FileDownloadWorker::scheduleAsync");
        try {
            try {
                elfl h = elfo.h(new erog() { // from class: cqva
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        FileInformation fileInformation2 = fileInformation;
                        Optional g = fileInformation2.g();
                        final eifj eifjVar = eifj.FILE;
                        eifjVar.getClass();
                        boolean isPresent = g.filter(new Predicate() { // from class: cquy
                            public final /* synthetic */ Predicate and(Predicate predicate) {
                                return Predicate$CC.$default$and(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            /* renamed from: negate */
                            public final /* synthetic */ Predicate mo439negate() {
                                return Predicate$CC.$default$negate(this);
                            }

                            public final /* synthetic */ Predicate or(Predicate predicate) {
                                return Predicate$CC.$default$or(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                return eifj.this.equals((eifj) obj);
                            }
                        }).isPresent();
                        cqvb cqvbVar = cqvb.this;
                        if (isPresent) {
                            eyee eyeeVar2 = eyeeVar;
                            String str2 = str;
                            MessageIdType messageIdType2 = messageIdType;
                            if (!((cqrl) cqvbVar.c.b()).n(messageIdType2, str2, cqtk.DOWNLOAD, (awvb) new avtz().m().fP(fileInformation2), eyeeVar2.I())) {
                                ensz enszVar = (ensz) cqvb.a.i();
                                enszVar.Y(csux.b, messageIdType2);
                                enszVar.Y(cqpo.a, str2);
                                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/downloads/FileDownloadWorker", "insertFileTransferDatabaseEntry", 197, "FileDownloadWorker.java")).q("Failed to insert OR update file transfer entry in database.");
                                throw new cquo(false, cqpn.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_INSERT_OR_UPDATE_FILE_TRANSFER_ENTRY_IN_DB, String.format("Failed to insert OR update file transfer entry in database for message %s with transfer id %s", messageIdType2, str2));
                            }
                        }
                        return cqvbVar.c(a2);
                    }
                }, this.b);
                f.b(h);
                f.close();
                return h;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                try {
                    f.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final elfl c(final cqus cqusVar) {
        final String str = cqusVar.f;
        cetp cetpVar = new cetp();
        cetpVar.d = str;
        if (((atxc) this.f.b()).a()) {
            cetpVar.b = str;
        }
        return ((cevh) ((avxv) this.e.b()).a.b()).b(ceyr.h("file_download", cqusVar, cetpVar.a())).i(new eroh() { // from class: cqut
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((cevg) obj).b();
            }
        }, this.d).h(new emwl() { // from class: cquu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = cqvb.a;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str2 = str;
                cqus cqusVar2 = cqusVar;
                if (booleanValue) {
                    ensz enszVar = (ensz) cqvb.a.h();
                    enszVar.Y(cqpo.a, str2);
                    ensz enszVar2 = (ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/downloads/FileDownloadWorker", "queueFileDownloadAsync", 238, "FileDownloadWorker.java");
                    cqur b = cqur.b(cqusVar2.c);
                    if (b == null) {
                        b = cqur.FILE;
                    }
                    enszVar2.t("Download is queued for %s.", b.name());
                    return str2;
                }
                ensz enszVar3 = (ensz) cqvb.a.j();
                enszVar3.Y(cqpo.a, str2);
                ensz enszVar4 = (ensz) enszVar3.h("com/google/android/apps/messaging/shared/transfer/downloads/FileDownloadWorker", "queueFileDownloadAsync", 230, "FileDownloadWorker.java");
                cqur b2 = cqur.b(cqusVar2.c);
                if (b2 == null) {
                    b2 = cqur.FILE;
                }
                enszVar4.t("Download not queued for %s.", b2.name());
                return str2;
            }
        }, this.b);
    }
}
