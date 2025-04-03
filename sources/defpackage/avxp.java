package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Predicate$CC;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avxp implements avya {
    public static final entd a = entd.c("BugleFileTransfer");
    public final ffbr b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final avvr d;
    public final avwr e;
    private final ffbr f;
    private final errl g;
    private final errl h;
    private final Context i;
    private final ffbr j;
    private final aslw k;
    private final aqvh l;
    private final csjk m;
    private final atte n;
    private final attd o;

    public avxp(Context context, errl errlVar, errl errlVar2, ffbr ffbrVar, ffbr ffbrVar2, avvr avvrVar, ffbr ffbrVar3, avwr avwrVar, aslw aslwVar, aqvh aqvhVar, csjk csjkVar, atte atteVar, attd attdVar) {
        this.b = ffbrVar2;
        this.f = ffbrVar;
        this.d = avvrVar;
        this.g = errlVar;
        this.h = errlVar2;
        this.i = context;
        this.e = avwrVar;
        this.j = ffbrVar3;
        this.k = aslwVar;
        this.l = aqvhVar;
        this.m = csjkVar;
        this.n = atteVar;
        this.o = attdVar;
    }

    private final Uri d(String str) {
        return cbgi.d("file_".concat(String.valueOf(str)), this.i);
    }

    private final void e(String str, String str2) {
        if (((cqrl) this.f.b()).l(str, cqtk.DOWNLOAD, str2)) {
            return;
        }
        ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/CronetFileDownloader", "updateDatabaseWithTransferHandle", 357, "CronetFileDownloader.java")).t("Failed to update transfer handle in database during download. Transfer ID: %s", str);
    }

    @Override // defpackage.avya
    public final elfl a(final String str, final int i, final String str2, final Optional optional, Optional optional2) {
        if ((!this.o.a() && !this.n.a() && !((cspt) this.j.b()).a()) || ((csmz) this.m.a()).u()) {
            return elfo.e(avxs.e());
        }
        final boolean isPresent = optional2.isPresent();
        Uri parse = isPresent ? Uri.parse((String) optional2.get()) : d(str2);
        File i2 = cbgi.i(parse, this.i);
        if (isPresent && i != 0 && i2.length() == i) {
            return elfo.e(avxf.a(parse));
        }
        if (!isPresent) {
            e(str2, parse.toString());
        }
        if (((ersq) ((arpm) this.k).a.b()).a("bugle.enable_check_to_verify_file_writability_for_cronet_downloads_on_resume") && isPresent && !i2.canWrite()) {
            Context context = this.i;
            Uri d = d(str2);
            e(str2, d.toString());
            ensz enszVar = (ensz) a.h();
            enszVar.Y(cqpo.a, str2);
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/CronetFileDownloader", "createNewDestinationFile", 309, "CronetFileDownloader.java")).q("Destination file wasn't seen as writable, creating a new destination file.");
            avxg avxgVar = new avxg(cbgi.i(d, context), d);
            i2 = avxgVar.a;
            parse = avxgVar.b;
        }
        final Uri uri = parse;
        final File file = i2;
        try {
            final FileOutputStream fileOutputStream = new FileOutputStream(file, isPresent);
            return (!this.o.a() && this.n.a() && ((csmz) this.m.a()).t()) ? this.l.a().b().i(new eroh() { // from class: avxj
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    boolean anyMatch = Collection.EL.stream((engw) obj).anyMatch(new Predicate() { // from class: avxk
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
                        public final boolean test(Object obj2) {
                            entd entdVar = avxp.a;
                            return ((aqux) obj2).s();
                        }
                    });
                    String str3 = str2;
                    if (!anyMatch) {
                        ensz enszVar2 = (ensz) avxp.a.h();
                        enszVar2.Y(cqpo.a, str3);
                        ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/CronetFileDownloader", "download", 214, "CronetFileDownloader.java")).q("No satellite self identity supporting media.");
                        return elfo.e(avxs.e());
                    }
                    FileOutputStream fileOutputStream2 = fileOutputStream;
                    File file2 = file;
                    boolean z = isPresent;
                    Uri uri2 = uri;
                    Optional optional3 = optional;
                    int i3 = i;
                    String str4 = str;
                    avxp avxpVar = avxp.this;
                    ensz enszVar3 = (ensz) avxp.a.h();
                    enszVar3.Y(cqpo.a, str3);
                    ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/CronetFileDownloader", "download", BasePaymentResult.ERROR_REQUEST_FAILED, "CronetFileDownloader.java")).q("Found a satellite self identity supporting media.");
                    return avxpVar.b(str4, i3, str3, optional3, uri2, z, file2, fileOutputStream2);
                }
            }, this.h) : b(str, i, str2, optional, uri, isPresent, file, fileOutputStream);
        } catch (FileNotFoundException e) {
            avvc g = avvd.g();
            g.f(cqpn.FILE_TRANSFER_FAILURE_REASON_WRITING_TO_FILE_FAILED);
            g.c(e);
            return elfo.e(new avxb(g.a()));
        }
    }

    public final elfl b(final String str, final int i, final String str2, final Optional optional, final Uri uri, final boolean z, final File file, final FileOutputStream fileOutputStream) {
        elfl g = elfl.g(kfg.a(new kfd() { // from class: avxh
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                avxm avxmVar = new avxm(kfbVar, uri);
                File file2 = file;
                String str3 = str2;
                int i2 = i;
                Optional optional2 = optional;
                String str4 = str;
                avxp avxpVar = avxp.this;
                boolean z2 = z;
                FileOutputStream fileOutputStream2 = fileOutputStream;
                avwq a2 = avxpVar.e.a();
                avxn avxnVar = new avxn(avxpVar, z2, file2, str3, i2, fileOutputStream2, optional2, str4);
                errl errlVar = (errl) avxpVar.d.a.b();
                errlVar.getClass();
                str3.getClass();
                a2.getClass();
                avvq avvqVar = new avvq(errlVar, str3, avxmVar, a2, avxnVar);
                ensz enszVar = (ensz) avxp.a.h();
                enszVar.Y(cqpo.a, str3);
                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/CronetFileDownloader", "getDownloadResultOrErrorPropagatedFluentFuture", 264, "CronetFileDownloader.java")).q("File download is started.");
                avxpVar.c.put(str3, avvqVar);
                ensz enszVar2 = (ensz) avvq.a.h();
                enszVar2.Y(cqpo.a, avvqVar.c);
                ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/InProgressFileTransfer", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 64, "InProgressFileTransfer.java")).t("Starting InProgressFileTransfer HTTP execution flow. %s", avvqVar.d.getClass().getName());
                if (avvqVar.i != avvqVar.e) {
                    throw new IllegalStateException(String.format("Transfer id %s already started.", avvqVar.c));
                }
                avvqVar.a(avvqVar.f, avun.a);
                return "CronetFileDownloader#download";
            }
        }));
        if (!optional.isEmpty()) {
            ekzz f = eleg.f("CronetFileDownloader::download");
            try {
                f.b(g);
                f.close();
            } finally {
            }
        }
        return g.h(new emwl() { // from class: avxi
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                avxs avxsVar = (avxs) obj;
                FileOutputStream fileOutputStream2 = fileOutputStream;
                String str3 = str2;
                avxp avxpVar = avxp.this;
                try {
                    fileOutputStream2.close();
                    avxpVar.c.remove(str3);
                    ensz enszVar = (ensz) avxp.a.h();
                    enszVar.Y(cqpo.a, str3);
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/CronetFileDownloader", "cleanup", 433, "CronetFileDownloader.java")).q("HTTP request cleaned up");
                    return avxsVar;
                } catch (IOException e) {
                    avvc g2 = avvd.g();
                    g2.f(cqpn.FILE_TRANSFER_FAILURE_REASON_CLOSING_THE_FILE_FAILED);
                    g2.c(e);
                    return new avxb(g2.a());
                }
            }
        }, this.g);
    }

    @Override // defpackage.avya
    public final elfl c(final String str) {
        return elfo.g(new Callable() { // from class: avxl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ConcurrentHashMap concurrentHashMap = avxp.this.c;
                String str2 = str;
                avvq avvqVar = (avvq) concurrentHashMap.remove(str2);
                if (avvqVar == null) {
                    ensz enszVar = (ensz) avxp.a.j();
                    enszVar.Y(cqpo.a, str2);
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/CronetFileDownloader", "pause", 325, "CronetFileDownloader.java")).q("Could not find ongoing file download to pause.");
                    return false;
                }
                avvc g = avvd.g();
                g.f(cqpn.FILE_TRANSFER_FAILURE_REASON_MANUAL_CANCELLATION);
                avvqVar.a(avvqVar.h, new avul(g.a()));
                ensz enszVar2 = (ensz) avxp.a.h();
                enszVar2.Y(cqpo.a, str2);
                ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/CronetFileDownloader", "pause", 329, "CronetFileDownloader.java")).q("Paused ongoing file download.");
                return true;
            }
        }, this.h);
    }
}
