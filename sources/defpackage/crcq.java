package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crcq extends ceut {
    public final crcc b;
    public final crbq c;
    public final cqqb d;
    public final cqps e;
    public String f = "";
    private final errl i;
    private final errl j;
    private final cins k;
    private final ffbr l;
    private final crga m;
    private final ffbr n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private static final cfup g = cfvl.e(cfvl.b, "file_upload_max_retry_count", 5);
    private static final cfup h = cfvl.e(cfvl.b, "file_upload_retry_delay_seconds", 10);
    public static final entd a = entd.c("BugleFileTransfer");

    public crcq(crcc crccVar, errl errlVar, errl errlVar2, cins cinsVar, cqqb cqqbVar, cqps cqpsVar, crbq crbqVar, ffbr ffbrVar, crga crgaVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.b = crccVar;
        this.c = crbqVar;
        this.i = errlVar;
        this.j = errlVar2;
        this.k = cinsVar;
        this.d = cqqbVar;
        this.e = cqpsVar;
        this.l = ffbrVar;
        this.m = crgaVar;
        this.n = ffbrVar2;
        this.o = ffbrVar3;
        this.p = ffbrVar4;
        this.q = ffbrVar5;
    }

    public static crek k(awvd awvdVar, String str) {
        ekzz f = eleg.f("FileUploadWorkHandler#newSendFileTransferResponse");
        try {
            crbi crbiVar = new crbi();
            crbiVar.c(awvdVar);
            crbiVar.a = bdhg.a(str);
            awvb awvbVar = awvdVar.c;
            if (awvbVar == null) {
                awvbVar = awvb.a;
            }
            crbiVar.b(awvbVar.f);
            crek a2 = crbiVar.a();
            f.close();
            return a2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.c(((Integer) g.e()).intValue());
        l.b(cevc.BACKGROUND_SERVICE_FALLBACK_TO_FOREGROUND_SERVICE);
        l.g(Duration.ofSeconds(((Integer) h.e()).intValue()).toMillis());
        l.f(poa.EXPONENTIAL);
        poh pohVar = new poh();
        pohVar.c(2);
        ceti cetiVar = (ceti) l;
        cetiVar.a = pohVar.a();
        cetiVar.b = this.k.b();
        return l.a();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("FileUploadWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return crcb.a.getParserForType();
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final String e() {
        return "FileUploadWorkHandler";
    }

    @Override // defpackage.ceut
    protected final /* synthetic */ elfl j(final ceuw ceuwVar, eyhs eyhsVar) {
        final crcb crcbVar = (crcb) eyhsVar;
        this.f = crcbVar.g;
        entd entdVar = a;
        ensz enszVar = (ensz) entdVar.h();
        enszVar.Y(cqpo.a, this.f);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "processPendingWorkItemAsync", 162, "FileUploadWorkHandler.java")).q("File upload is starting via work scheduler.");
        final crbv a2 = new avua().apply(crcbVar);
        cqrl cqrlVar = (cqrl) this.p.b();
        if (((cqrl) this.p.b()).k(bdhb.b(this.f))) {
            ensz enszVar2 = (ensz) entdVar.h();
            enszVar2.Y(cqpo.a, this.f);
            ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "processPendingWorkItemAsync", 176, "FileUploadWorkHandler.java")).q("Upload has already a valid response, skipping and retry sending the XML.");
            return this.c.a(k((awvd) cqrlVar.g(bdhb.b(this.f)).get(), crcbVar.c), Optional.empty()).h(new emwl() { // from class: crcf
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    entd entdVar2 = crcq.a;
                    return ceyt.i();
                }
            }, erpp.a).f(Throwable.class, new eroh() { // from class: crch
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    Throwable th = (Throwable) obj;
                    ((ensz) ((ensz) ((ensz) crcq.a.j()).g(th)).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "handleUnexpectedException", (char) 209, "FileUploadWorkHandler.java")).q("Unexpected exception occurred during file upload.");
                    avvc g2 = avvd.g();
                    g2.f(cqpn.FILE_TRANSFER_FAILURE_REASON_UNKNOWN);
                    th.getClass();
                    g2.c(th);
                    avvd a3 = g2.a();
                    crcb crcbVar2 = crcbVar;
                    String str = crcbVar2.c;
                    awui awuiVar = crcbVar2.l;
                    if (awuiVar == null) {
                        awuiVar = awui.a;
                    }
                    crbv crbvVar = a2;
                    ceuw ceuwVar2 = ceuwVar;
                    return crcq.this.l(ceuwVar2, crbvVar, str, awuiVar, a3);
                }
            }, this.i);
        }
        ensz enszVar3 = (ensz) entdVar.h();
        enszVar3.Y(cqpo.a, this.f);
        ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "processPendingWorkItemAsync", 197, "FileUploadWorkHandler.java")).q("File upload is starting via work scheduler.");
        ekzz f = eleg.f("FileUploadWorkHandler#uploadOrResume");
        try {
            awui awuiVar = crcbVar.l;
            if (awuiVar == null) {
                awuiVar = awui.a;
            }
            emxf.m((awuiVar.b & 2) != 0, "Cannot fetch auth token in the file transfer upload or resume path because a self-identity was not provided.");
            elfl f2 = elfl.g(((akkf) this.q.b()).a(awuiVar).a()).i(new eroh() { // from class: crcj
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    eyee eyeeVar = (eyee) obj;
                    crcb crcbVar2 = crcbVar;
                    String str = crcbVar2.h;
                    String a3 = crcd.a();
                    boolean isEmpty = TextUtils.isEmpty(str);
                    crbv crbvVar = a2;
                    crcq crcqVar = crcq.this;
                    if (!isEmpty) {
                        return crcqVar.b.c(crbvVar, awbr.a(crcqVar.f, a3), crcqVar.d, str);
                    }
                    boolean z = ((cetk) ceuwVar.a()).c == 0;
                    crcc crccVar = crcqVar.b;
                    awbs a4 = awbr.a(crcqVar.f, a3);
                    cqqb cqqbVar = crcqVar.d;
                    awui awuiVar2 = crcbVar2.l;
                    if (awuiVar2 == null) {
                        awuiVar2 = awui.a;
                    }
                    return crccVar.b(crbvVar, a4, cqqbVar, eyeeVar, awuiVar2, z);
                }
            }, this.i).e(esps.class, new emwl() { // from class: crco
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    entd entdVar2 = crcq.a;
                    avvc g2 = avvd.g();
                    g2.f(cqpn.FILE_TRANSFER_FAILURE_REASON_TACHYON_TOKEN_FAILURE);
                    g2.c((esps) obj);
                    return new crfk(g2.a());
                }
            }, this.j).i(new eroh() { // from class: crcp
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    crfl crflVar = (crfl) obj;
                    boolean z = crflVar instanceof crfk;
                    crcb crcbVar2 = crcbVar;
                    crcq crcqVar = crcq.this;
                    if (!z) {
                        if (crflVar instanceof crfi) {
                            return crcqVar.e.b(crcbVar2.g).h(new emwl() { // from class: crcl
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    entd entdVar2 = crcq.a;
                                    return ceyt.i();
                                }
                            }, erpp.a);
                        }
                        if (!(crflVar instanceof crfj)) {
                            throw new AssertionError("Unreachable");
                        }
                        crce crceVar = ((crfj) crflVar).a;
                        return crcqVar.c.a(crcq.k(crceVar.a, crcbVar2.c), crceVar.b).h(new emwl() { // from class: crcm
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                entd entdVar2 = crcq.a;
                                return ceyt.i();
                            }
                        }, erpp.a);
                    }
                    crfk crfkVar = (crfk) crflVar;
                    if (((avuq) crfkVar.a).e.orElse(null) instanceof cqqj) {
                        return crcqVar.e.a(crcbVar2.g).h(new emwl() { // from class: crck
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                entd entdVar2 = crcq.a;
                                return ceyt.i();
                            }
                        }, erpp.a);
                    }
                    String str = crcbVar2.c;
                    awui awuiVar2 = crcbVar2.l;
                    if (awuiVar2 == null) {
                        awuiVar2 = awui.a;
                    }
                    crbv crbvVar = a2;
                    return crcqVar.l(ceuwVar, crbvVar, str, awuiVar2, crfkVar.a);
                }
            }, this.i).f(Throwable.class, new eroh() { // from class: crcg
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    Throwable th = (Throwable) obj;
                    ((ensz) ((ensz) ((ensz) crcq.a.j()).g(th)).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "uploadOrResume", (char) 246, "FileUploadWorkHandler.java")).q("Unexpected exception occurred during file upload.");
                    crcb crcbVar2 = crcbVar;
                    String str = crcbVar2.c;
                    awui awuiVar2 = crcbVar2.l;
                    if (awuiVar2 == null) {
                        awuiVar2 = awui.a;
                    }
                    awui awuiVar3 = awuiVar2;
                    crbv crbvVar = a2;
                    ceuw ceuwVar2 = ceuwVar;
                    crcq crcqVar = crcq.this;
                    avvc g2 = avvd.g();
                    g2.f(cqpn.FILE_TRANSFER_FAILURE_REASON_UNKNOWN);
                    th.getClass();
                    g2.c(th);
                    return crcqVar.l(ceuwVar2, crbvVar, str, awuiVar3, g2.a());
                }
            }, this.i);
            f.b(f2);
            f.close();
            return f2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final elfl l(ceuw ceuwVar, crbv crbvVar, final String str, awui awuiVar, final avvd avvdVar) {
        entd entdVar;
        axbq axbqVar;
        int i = ((cetk) ceuwVar.a()).c;
        entd entdVar2 = a;
        avuq avuqVar = (avuq) avvdVar;
        ((ensz) ((ensz) entdVar2.j()).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "handleError", 356, "FileUploadWorkHandler.java")).J("File transfer failure: HTTP response code = %d, reason = %s, detailed error message = %s", Integer.valueOf(avuqVar.b), avuqVar.a, avvdVar.k());
        epyh a2 = ((awgn) this.l.b()).a(avvdVar);
        final int i2 = i + 1;
        epyb j = avvdVar.j(i2, a2);
        Throwable th = (Throwable) avuqVar.e.orElse(null);
        int a3 = epyg.a(a2.c);
        if (a3 == 0) {
            a3 = 1;
        }
        if (!ceuwVar.c()) {
            ((ensz) ((ensz) ((ensz) entdVar2.j()).g(th)).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "shouldRetry", (char) 412, "FileUploadWorkHandler.java")).q("File upload failed as max retry count has been exceeded.");
        } else {
            if (a3 != 2) {
                ((ensz) ((ensz) ((ensz) entdVar2.j()).g(th)).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "shouldRetry", (char) 418, "FileUploadWorkHandler.java")).q("File upload failed with a recoverable error, scheduling retry.");
                MessageCoreData w = ((bdmq) this.n.b()).w(bdhg.a(str));
                if (w == null) {
                    ensz enszVar = (ensz) entdVar2.j();
                    enszVar.Y(csux.e, str);
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "logUploadFailedWithRetryAttempt", 489, "FileUploadWorkHandler.java")).q("Failed to log retry attempt, message is missing from the database.");
                    entdVar = entdVar2;
                } else if (avuqVar.d.isEmpty()) {
                    entdVar = entdVar2;
                    this.m.a(w, j, Optional.of(crbvVar));
                } else {
                    crga crgaVar = this.m;
                    epxt epxtVar = (epxt) epxv.a.createBuilder();
                    String str2 = avuqVar.d;
                    epxtVar.copyOnWrite();
                    epxv epxvVar = (epxv) epxtVar.instance;
                    str2.getClass();
                    entdVar = entdVar2;
                    epxvVar.b |= 8;
                    epxvVar.f = str2;
                    crgaVar.b(w, j, (epxv) epxtVar.build(), Optional.of(crbvVar));
                }
                int a4 = epyg.a(a2.c);
                if (a4 == 0) {
                    a4 = 1;
                }
                int i3 = a4 - 1;
                awyd awydVar = (i3 == 0 || i3 == 1 || i3 == 2) ? awyd.RECOVERY_STRATEGY_NONE : i3 != 3 ? awyd.RECOVERY_STRATEGY_REFRESH_REGISTRATION : awyd.RECOVERY_STRATEGY_REPROVISION;
                awydVar.getClass();
                ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "handleError", 379, "FileUploadWorkHandler.java")).t("Applying recovery strategy [%s] before retrying.", awydVar.name());
                axbo a5 = ((axca) this.o.b()).a(awydVar);
                if (awydVar.equals(awyd.RECOVERY_STRATEGY_REFRESH_REGISTRATION)) {
                    emxf.m((awuiVar.b & 2) != 0, "Self chat endpoint must contain id.");
                    axbqVar = new axbv(awuiVar);
                } else {
                    axbqVar = axbq.b;
                }
                return a5.a(axbqVar).i(new eroh() { // from class: crci
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        axbn axbnVar = (axbn) obj;
                        if (axbnVar == axbn.a || axbnVar == axbn.c) {
                            ((ensz) ((ensz) crcq.a.h()).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "handleError", 390, "FileUploadWorkHandler.java")).t("Recovery strategy result: [%s], retrying.", axbnVar);
                            return elfo.e(ceyt.m());
                        }
                        int i4 = i2;
                        avvd avvdVar2 = avvdVar;
                        String str3 = str;
                        crcq crcqVar = crcq.this;
                        ((ensz) ((ensz) crcq.a.h()).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "handleError", 393, "FileUploadWorkHandler.java")).q("Recovery strategy was not successful, file upload failed.");
                        return crcqVar.m(str3, avvdVar2, i4);
                    }
                }, this.j);
            }
            ((ensz) ((ensz) ((ensz) entdVar2.j()).g(th)).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "shouldRetry", (char) 423, "FileUploadWorkHandler.java")).q("File upload failed as the current failure cannot be recovered.");
        }
        return m(str, avvdVar, i2);
    }

    public final elfl m(String str, avvd avvdVar, int i) {
        return this.c.b(str, avvdVar, i).h(new emwl() { // from class: crcn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = crcq.a;
                return ceyt.k();
            }
        }, erpp.a);
    }
}
