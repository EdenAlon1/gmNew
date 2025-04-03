package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avxz extends ceut {
    public static final entd a = entd.c("BugleFileTransfer");
    public final cqun b;
    public final cqps c;
    private final errl d;
    private final cins e;
    private final avya f;
    private final cqqb g;

    public avxz(cins cinsVar, errl errlVar, avya avyaVar, cqqb cqqbVar, cqun cqunVar, cqps cqpsVar) {
        this.e = cinsVar;
        this.d = errlVar;
        this.f = avyaVar;
        this.g = cqqbVar;
        this.b = cqunVar;
        this.c = cqpsVar;
    }

    private final elfl k(final cqus cqusVar, Optional optional, Optional optional2) {
        return this.f.a(cqusVar.d, cqusVar.h, cqusVar.f, optional, optional2).i(new eroh() { // from class: avxw
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                avxs avxsVar = (avxs) obj;
                int b = avxsVar.b();
                final cqus cqusVar2 = cqusVar;
                avxz avxzVar = avxz.this;
                if (b == 1) {
                    cqun cqunVar = avxzVar.b;
                    final Uri c = avxsVar.c();
                    ensz enszVar = (ensz) cqud.a.h();
                    enszVar.Y(cqpo.a, cqusVar2.f);
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/downloads/BugleFileDownloadCallbackHandler", "onDownloadSucceeded", 80, "BugleFileDownloadCallbackHandler.java")).q("Download succeeded callback is called.");
                    try {
                        final cqxn a2 = cqud.a(cqusVar2.g);
                        final cqud cqudVar = (cqud) cqunVar;
                        return elfo.f(new Runnable() { // from class: cqub
                            @Override // java.lang.Runnable
                            public final void run() {
                                cqus cqusVar3 = cqusVar2;
                                cqur b2 = cqur.b(cqusVar3.c);
                                if (b2 == null) {
                                    b2 = cqur.FILE;
                                }
                                cqxn cqxnVar = a2;
                                Uri uri = c;
                                cqud cqudVar2 = cqud.this;
                                if (b2 != cqur.FILE) {
                                    ((cpev) cqudVar2.f.b()).o(cqxnVar.b, new ecda("ToOnInvokeThumbnailPostDownload"), cpeu.TACHYGRAM_MESSAGE_ARRIVED);
                                    craw crawVar = (craw) crax.a.createBuilder();
                                    String str = cqxnVar.b;
                                    crawVar.copyOnWrite();
                                    crax craxVar = (crax) crawVar.instance;
                                    str.getClass();
                                    craxVar.b = str;
                                    String str2 = cqusVar3.e;
                                    crawVar.copyOnWrite();
                                    crax craxVar2 = (crax) crawVar.instance;
                                    str2.getClass();
                                    craxVar2.d = str2;
                                    String uri2 = uri.toString();
                                    crawVar.copyOnWrite();
                                    crax craxVar3 = (crax) crawVar.instance;
                                    uri2.getClass();
                                    craxVar3.c = uri2;
                                    ((cray) cqudVar2.c.b()).a((crax) crawVar.build());
                                    ensz enszVar2 = (ensz) cqud.a.h();
                                    enszVar2.Y(csux.e, cqxnVar.b);
                                    ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/downloads/BugleFileDownloadCallbackHandler", "invokeThumbnailPostDownload", 199, "BugleFileDownloadCallbackHandler.java")).q("Thumbnail download completed is queued.");
                                    return;
                                }
                                String str3 = cqxnVar.b;
                                cqxj cqxjVar = (cqxj) cqxk.a.createBuilder();
                                cqxjVar.copyOnWrite();
                                cqxk cqxkVar = (cqxk) cqxjVar.instance;
                                str3.getClass();
                                cqxkVar.b |= 1;
                                cqxkVar.c = str3;
                                String str4 = cqusVar3.e;
                                cqxjVar.copyOnWrite();
                                cqxk cqxkVar2 = (cqxk) cqxjVar.instance;
                                str4.getClass();
                                cqxkVar2.b |= 4;
                                cqxkVar2.e = str4;
                                String uri3 = uri.toString();
                                cqxjVar.copyOnWrite();
                                cqxk cqxkVar3 = (cqxk) cqxjVar.instance;
                                uri3.getClass();
                                cqxkVar3.b |= 2;
                                cqxkVar3.d = uri3;
                                long j = cqusVar3.h;
                                cqxjVar.copyOnWrite();
                                cqxk cqxkVar4 = (cqxk) cqxjVar.instance;
                                cqxkVar4.b |= 8;
                                cqxkVar4.f = j;
                                eqyl a3 = ((avkk) cqudVar2.e.b()).a();
                                cqxjVar.copyOnWrite();
                                cqxk cqxkVar5 = (cqxk) cqxjVar.instance;
                                cqxkVar5.g = a3.h;
                                cqxkVar5.b |= 16;
                                cqxk cqxkVar6 = (cqxk) cqxjVar.build();
                                ensz enszVar3 = (ensz) cqud.a.h();
                                enszVar3.Y(cqpo.a, cqusVar3.f);
                                enszVar3.Y(csux.e, str3);
                                ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/transfer/downloads/BugleFileDownloadCallbackHandler", "invokeFilePostDownload", 177, "BugleFileDownloadCallbackHandler.java")).q("File download completed is queued.");
                                ((cpev) cqudVar2.f.b()).o(cqxnVar.b, new ecda("ToOnInvokeFilePostDownload"), cpeu.TACHYGRAM_MESSAGE_ARRIVED);
                                ((cevh) ((cqxl) cqudVar2.b.b()).a.b()).a(ceyr.g("file_download_completed", cqxkVar6));
                            }
                        }, cqudVar.g);
                    } catch (cquo e) {
                        return elfo.d(e);
                    }
                }
                if (avxsVar.b() == 3) {
                    String str = cqusVar2.f;
                    ((ensz) ((ensz) ((ensz) avxz.a.h()).g(avxsVar.d())).h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/FileDownloadWorkHandler", "download", 119, "FileDownloadWorkHandler.java")).t("Auto paused downloadId: %s", str);
                    return avxzVar.c.a(str);
                }
                final avvd a3 = avxsVar.a();
                if (((avuq) a3).a.equals(cqpn.FILE_TRANSFER_FAILURE_REASON_MANUAL_CANCELLATION)) {
                    return avxzVar.c.b(cqusVar2.f);
                }
                cqun cqunVar2 = avxzVar.b;
                try {
                    cqxn a4 = cqud.a(cqusVar2.g);
                    cqud cqudVar2 = (cqud) cqunVar2;
                    epyh a5 = cqudVar2.h.a(a3);
                    eoop eoopVar = (eoop) eopq.a.createBuilder();
                    eqyl a6 = ((avkk) cqudVar2.e.b()).a();
                    eoopVar.copyOnWrite();
                    eopq eopqVar = (eopq) eoopVar.instance;
                    eopqVar.aa = a6.h;
                    eopqVar.c |= 2097152;
                    epyb i = a3.i(a5);
                    eoopVar.copyOnWrite();
                    eopq eopqVar2 = (eopq) eoopVar.instance;
                    i.getClass();
                    eopqVar2.an = i;
                    eopqVar2.d |= 4;
                    eopq eopqVar3 = (eopq) eoopVar.build();
                    cqxv cqxvVar = (cqxv) cqxw.a.createBuilder();
                    String str2 = a4.b;
                    cqxvVar.copyOnWrite();
                    cqxw cqxwVar = (cqxw) cqxvVar.instance;
                    str2.getClass();
                    cqxwVar.b = 1 | cqxwVar.b;
                    cqxwVar.c = str2;
                    cqxvVar.copyOnWrite();
                    cqxw cqxwVar2 = (cqxw) cqxvVar.instance;
                    eopqVar3.getClass();
                    cqxwVar2.e = eopqVar3;
                    cqxwVar2.b |= 4;
                    String str3 = cqusVar2.d;
                    cqxvVar.copyOnWrite();
                    cqxw cqxwVar3 = (cqxw) cqxvVar.instance;
                    str3.getClass();
                    cqxwVar3.b |= 8;
                    cqxwVar3.f = str3;
                    final cqxw cqxwVar4 = (cqxw) cqxvVar.build();
                    cqur b2 = cqur.b(cqusVar2.c);
                    if (b2 == null) {
                        b2 = cqur.FILE;
                    }
                    if (!b2.equals(cqur.THUMBNAIL)) {
                        return ((cqxx) cqudVar2.d.b()).a(cqxwVar4).h(new emwl() { // from class: cquc
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                ensz enszVar2 = (ensz) cqud.a.h();
                                enszVar2.Y(csux.e, cqxw.this.c);
                                ensz enszVar3 = (ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/downloads/BugleFileDownloadCallbackHandler", "onDownloadFailed", 143, "BugleFileDownloadCallbackHandler.java");
                                avvd avvdVar = a3;
                                int b3 = epxz.b(avvdVar.h().e);
                                if (b3 == 0) {
                                    b3 = 1;
                                }
                                epyd epydVar = avvdVar.h().f;
                                if (epydVar == null) {
                                    epydVar = epyd.a;
                                }
                                enszVar3.J("File download failed with reason: %s and http response code: %s, queued work item to process failure. Error details: %s", epxz.a(b3), Long.valueOf(epydVar.c), avvdVar.k());
                                return null;
                            }
                        }, cqudVar2.g);
                    }
                    ensz enszVar2 = (ensz) cqud.a.h();
                    enszVar2.Y(csux.e, cqxwVar4.c);
                    ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/downloads/BugleFileDownloadCallbackHandler", "onDownloadFailed", 131, "BugleFileDownloadCallbackHandler.java")).q("Thumbnail download failed.");
                    return elfo.e(null);
                } catch (cquo e2) {
                    return elfo.d(e2);
                }
            }
        }, this.d).h(new emwl() { // from class: avxx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = avxz.a;
                return ceyt.i();
            }
        }, erpp.a);
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.b(cevc.BACKGROUND_SERVICE_FALLBACK_TO_FOREGROUND_SERVICE);
        ((ceti) l).b = this.e.b();
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("FileDownloadWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cqus.a.getParserForType();
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final String e() {
        return "FileDownloadWorkHandler";
    }

    @Override // defpackage.ceut
    protected final /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        cqus cqusVar = (cqus) eyhsVar;
        ensz enszVar = (ensz) a.h();
        enszVar.Y(cqpo.a, cqusVar.f);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/FileDownloadWorkHandler", "processPendingWorkItemAsync", 76, "FileDownloadWorkHandler.java")).q("File download is starting via work scheduler.");
        Optional filter = Optional.of(cqusVar.i).filter(new Predicate() { // from class: avxy
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
                entd entdVar = avxz.a;
                return !TextUtils.isEmpty((String) obj);
            }
        });
        cqur b = cqur.b(cqusVar.c);
        if (b == null) {
            b = cqur.FILE;
        }
        Optional of = b.equals(cqur.FILE) ? Optional.of(this.g) : Optional.empty();
        cqur b2 = cqur.b(cqusVar.c);
        if (b2 == null) {
            b2 = cqur.FILE;
        }
        if (!b2.equals(cqur.FILE)) {
            return k(cqusVar, of, filter);
        }
        ekzz f = eleg.f("HttpFileDownloader::download");
        try {
            elfl k = k(cqusVar, of, filter);
            f.b(k);
            f.close();
            return k;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
