package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqxi extends ceut {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler");
    public static final entd b = entd.c("BugleNotifications");
    public static final cfup c = cfvl.e(cfvl.b, "file_download_completed_handler_max_retry", 3);
    public static final cfup d = cfvl.e(cfvl.b, "file_download_completed_handler_retry_delay", 2000);
    public final ffbr A;
    private final crab B;
    public final Context e;
    public final errl f;
    public final errl g;
    public final errl h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    public final ffbr o;
    public final ffbr p;
    public final covj q;
    public final bbgg r;
    public final ffbr s;
    public final ffbr t;
    public final ffbr u;
    public final ffbr v;
    public final ffbr w;
    public final cqvy x;
    public final avxt y;
    public final bbfo z;

    public cqxi(Context context, errl errlVar, errl errlVar2, errl errlVar3, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, crab crabVar, covj covjVar, bbgg bbggVar, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, cqvy cqvyVar, avxt avxtVar, bbfo bbfoVar, ffbr ffbrVar14) {
        this.e = context;
        this.f = errlVar;
        this.g = errlVar2;
        this.h = errlVar3;
        this.i = ffbrVar;
        this.j = ffbrVar2;
        this.k = ffbrVar3;
        this.l = ffbrVar4;
        this.m = ffbrVar5;
        this.p = ffbrVar6;
        this.n = ffbrVar7;
        this.o = ffbrVar8;
        this.B = crabVar;
        this.q = covjVar;
        this.r = bbggVar;
        this.s = ffbrVar9;
        this.t = ffbrVar10;
        this.u = ffbrVar11;
        this.v = ffbrVar12;
        this.w = ffbrVar13;
        this.x = cqvyVar;
        this.y = avxtVar;
        this.z = bbfoVar;
        this.A = ffbrVar14;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.c(((Integer) c.e()).intValue());
        l.g(((Integer) d.e()).intValue());
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("FileDownloadCompletedHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cqxk.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final cqxk cqxkVar = (cqxk) eyhsVar;
        final bdhg a2 = bdhg.a(cqxkVar.c);
        final Uri parse = Uri.parse(cqxkVar.d);
        elfl i = this.B.a(a2).i(new eroh() { // from class: cqxa
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    bdhg bdhgVar = a2;
                    ensk h = cqxi.a.h();
                    h.Y(ente.a, "BugleFileTransfer");
                    enrr enrrVar = (enrr) h;
                    enrrVar.Y(csux.f, bdhgVar);
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "processPendingWorkItemAsync", 252, "FileDownloadCompletedHandler.java")).q("MessageCoreData not found for completing file transfer.");
                    return elfo.e(ceyt.k());
                }
                final MessageCoreData messageCoreData = (MessageCoreData) optional.get();
                if (!messageCoreData.cy()) {
                    final cqxk cqxkVar2 = cqxkVar;
                    final Uri uri = parse;
                    final cqxi cqxiVar = cqxi.this;
                    final String a3 = emxe.a(cqxkVar2.e);
                    return elfo.g(new Callable() { // from class: cqwm
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            ensk h2 = cqxi.a.h();
                            h2.Y(ente.a, "BugleFileTransfer");
                            enrr enrrVar2 = (enrr) h2;
                            enrrVar2.Y(csux.f, bdhg.a(cqxkVar2.c));
                            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "completeIncomingFileTransferForValidMessage", 307, "FileDownloadCompletedHandler.java")).q("Converting file to unencrypted");
                            return cqxi.this.q.a(messageCoreData.E(), uri, 2);
                        }
                    }, cqxiVar.g).i(new eroh() { // from class: cqwn
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            final Uri uri2 = (Uri) obj2;
                            cqxi cqxiVar2 = cqxi.this;
                            boolean a4 = ((atwp) cqxiVar2.A.b()).a();
                            cqxk cqxkVar3 = cqxkVar2;
                            MessageCoreData messageCoreData2 = messageCoreData;
                            String str = a3;
                            if (!a4) {
                                ensk h2 = cqxi.a.h();
                                h2.Y(ente.a, "BugleFileTransfer");
                                enrr enrrVar2 = (enrr) h2;
                                enrrVar2.Y(csux.f, bdhg.a(cqxkVar3.c));
                                ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "completeIncomingFileTransferForValidMessage", 338, "FileDownloadCompletedHandler.java")).q("Persisting file to Telephony DB");
                                return ((ckch) cqxiVar2.l.b()).j(messageCoreData2, uri2, str).h(new emwl() { // from class: cqwl
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj3) {
                                        enru enruVar = cqxi.a;
                                        return new cqwi(uri2, (Uri) obj3);
                                    }
                                }, cqxiVar2.f);
                            }
                            final Uri uri3 = uri;
                            ensk h3 = cqxi.a.h();
                            h3.Y(ente.a, "BugleFileTransfer");
                            enrr enrrVar3 = (enrr) h3;
                            enrrVar3.Y(csux.f, bdhg.a(cqxkVar3.c));
                            ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "completeIncomingFileTransferForValidMessage", 323, "FileDownloadCompletedHandler.java")).q("Persisting file in local storage");
                            return ((ckch) cqxiVar2.l.b()).i(messageCoreData2, uri2, str).h(new emwl() { // from class: cqwz
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    enru enruVar = cqxi.a;
                                    return new cqwi(uri3, (Uri) obj3);
                                }
                            }, cqxiVar2.f);
                        }
                    }, cqxiVar.g).i(new eroh() { // from class: cqwo
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            final cqxf cqxfVar = (cqxf) obj2;
                            Uri a4 = cqxfVar.a();
                            final MessageCoreData messageCoreData2 = messageCoreData;
                            if (a4 == null) {
                                ensk i2 = cqxi.a.i();
                                i2.Y(ente.a, "BugleFileTransfer");
                                enrr enrrVar2 = (enrr) i2;
                                enrrVar2.Y(csux.f, messageCoreData2.E());
                                ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "completeIncomingFileTransferForValidMessage", 351, "FileDownloadCompletedHandler.java")).q("Failed to complete file transfer. Temporary file was not successfully persisted");
                                return elfo.e(new cqwk(ceyt.m(), cqxfVar));
                            }
                            cqxk cqxkVar3 = cqxkVar2;
                            final cqxi cqxiVar2 = cqxi.this;
                            ensk h2 = cqxi.a.h();
                            h2.Y(ente.a, "BugleFileTransfer");
                            enrr enrrVar3 = (enrr) h2;
                            enrrVar3.Y(csux.f, bdhg.a(cqxkVar3.c));
                            ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "completeIncomingFileTransferForValidMessage", 364, "FileDownloadCompletedHandler.java")).q("Completing incoming file transfer for successfully persisted file");
                            final Uri a5 = cqxfVar.a();
                            a5.getClass();
                            final Uri b2 = cqxfVar.b();
                            final MessagePartCoreData G = messageCoreData2.G();
                            G.getClass();
                            return elfo.g(new Callable() { // from class: cqxd
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    String[] strArr = PartsTable.a;
                                    bwdi bwdiVar = new bwdi();
                                    bwdiVar.ap("createMessagePartUpdateBuilder");
                                    Uri uri2 = a5;
                                    bwdiVar.z(uri2);
                                    cqxi cqxiVar3 = cqxi.this;
                                    MessagePartCoreData messagePartCoreData = G;
                                    if (messagePartCoreData.bo()) {
                                        Rect h3 = ((ctap) cqxiVar3.m.b()).h(uri2, messagePartCoreData.V());
                                        bwdiVar.B(h3.width());
                                        bwdiVar.p(h3.height());
                                        return bwdiVar;
                                    }
                                    if (!messagePartCoreData.bD()) {
                                        if (messagePartCoreData.ba()) {
                                            bwdiVar.l(csuu.c(cqxiVar3.e, uri2));
                                        }
                                        return bwdiVar;
                                    }
                                    cqxg cqxgVar = (cqxg) new ctel(cqxiVar3.e).b(uri2, new emwl() { // from class: cqwy
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj3) {
                                            ctel ctelVar = (ctel) obj3;
                                            enru enruVar = cqxi.a;
                                            Point b3 = ctet.b(ctelVar);
                                            String extractMetadata = ctelVar.a.extractMetadata(9);
                                            return new cqwj(b3, Duration.ofMillis(TextUtils.isEmpty(extractMetadata) ? 0L : Long.parseLong(extractMetadata)));
                                        }
                                    }, new cqwj(new Point(-1, -1), Duration.ZERO));
                                    bwdiVar.B(cqxgVar.a().x);
                                    bwdiVar.p(cqxgVar.a().y);
                                    bwdiVar.l(cqxgVar.b().toMillis());
                                    return bwdiVar;
                                }
                            }, cqxiVar2.h).i(new eroh() { // from class: cqxe
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj3) {
                                    final bwdi bwdiVar = (bwdi) obj3;
                                    final cqxi cqxiVar3 = cqxi.this;
                                    dtuu dtuuVar = (dtuu) cqxiVar3.n.b();
                                    final MessageCoreData messageCoreData3 = messageCoreData2;
                                    final MessagePartCoreData messagePartCoreData = G;
                                    final Uri uri2 = a5;
                                    if (!((Boolean) dtuuVar.a("IncomingRcsFileTransferUtils#completeFileTransfer", new dtus() { // from class: cqwx
                                        /* JADX WARN: Removed duplicated region for block: B:10:0x015c  */
                                        @Override // defpackage.dtus
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                            To view partially-correct add '--show-bad-code' argument
                                        */
                                        public final java.lang.Object a(defpackage.cbwn r15) {
                                            /*
                                                Method dump skipped, instructions count: 517
                                                To view this dump add '--comments-level debug' option
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: defpackage.cqwx.a(cbwn):java.lang.Object");
                                        }
                                    })).booleanValue()) {
                                        ensk i3 = cqxi.a.i();
                                        i3.Y(ente.a, "BugleFileTransfer");
                                        enrr enrrVar4 = (enrr) i3;
                                        enrrVar4.Y(csux.b, messageCoreData3.B());
                                        enrrVar4.Y(csux.f, messageCoreData3.E());
                                        ((enrr) enrrVar4.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "saveIncomingFileTransferInBugleDbWithFuture", 601, "FileDownloadCompletedHandler.java")).q("Failed to update message part in Bugle db.");
                                        return elfo.e(false);
                                    }
                                    ((cpev) cqxiVar3.v.b()).o(messageCoreData3.E().f(), new ecda("ToFileDownloadedAndCommitted"), cpeu.TACHYGRAM_MESSAGE_ARRIVED);
                                    ensk h3 = cqxi.a.h();
                                    h3.Y(ente.a, "BugleFileTransfer");
                                    enrr enrrVar5 = (enrr) h3;
                                    enrrVar5.Y(csux.b, messageCoreData3.B());
                                    enrrVar5.Y(csux.f, messageCoreData3.E());
                                    ((enrr) enrrVar5.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "saveIncomingFileTransferInBugleDbWithFuture", 609, "FileDownloadCompletedHandler.java")).q("Notifying bugle database message updated");
                                    ((cbgf) cqxiVar3.o.b()).l(messageCoreData3.z(), messageCoreData3.B(), new String[0]);
                                    cqvy cqvyVar = cqxiVar3.x;
                                    cqvyVar.b(messageCoreData3, "Bugle.Download.Success.Attachment.Size.Bucket.Rcs");
                                    cqvyVar.e(messageCoreData3, 4, new Consumer() { // from class: cqvx
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void o(Object obj4) {
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                    return elfo.e(true);
                                }
                            }, cqxiVar2.g).h(new emwl() { // from class: cqws
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    Boolean bool = (Boolean) obj3;
                                    if (bool.booleanValue()) {
                                        Iterator it = ((Set) cqxi.this.u.b()).iterator();
                                        while (it.hasNext()) {
                                            ((bdnt) it.next()).c(messageCoreData2);
                                        }
                                    }
                                    return bool;
                                }
                            }, cqxiVar2.g).i(new eroh() { // from class: cqwt
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj3) {
                                    elfl e;
                                    boolean booleanValue = ((Boolean) obj3).booleanValue();
                                    final MessageCoreData messageCoreData3 = messageCoreData2;
                                    if (!booleanValue) {
                                        ensk i3 = cqxi.a.i();
                                        i3.Y(ente.a, "BugleFileTransfer");
                                        enrr enrrVar4 = (enrr) i3;
                                        enrrVar4.Y(csux.b, messageCoreData3.B());
                                        enrrVar4.Y(csux.f, messageCoreData3.E());
                                        enrrVar4.Y(csux.p, messageCoreData3.z());
                                        ((enrr) enrrVar4.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "completeIncomingFileTransferForSuccessfullyPersistedFile", 506, "FileDownloadCompletedHandler.java")).q("Failed to complete file transfer. Bugle db was not successfully updated.");
                                        return elfo.e(ceyt.m());
                                    }
                                    final cqxi cqxiVar3 = cqxi.this;
                                    MessagePartCoreData G2 = messageCoreData3.G();
                                    if (G2 == null) {
                                        ensk j = cqxi.a.j();
                                        j.Y(ente.a, "BugleFileTransfer");
                                        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "refreshStatefulNotifications", 696, "FileDownloadCompletedHandler.java")).q("Not refreshing notification. Message part not found");
                                        e = elfo.e(null);
                                    } else {
                                        boolean z = messageCoreData3.cF() && G2.bg();
                                        boolean z2 = G2.x() != null;
                                        if (ctjd.b()) {
                                            z2 = z2 && !z;
                                        }
                                        ensk h3 = cqxi.a.h();
                                        h3.Y(ente.a, "BugleFileTransfer");
                                        enrr enrrVar5 = (enrr) h3;
                                        enrrVar5.Y(csux.b, messageCoreData3.B());
                                        enrrVar5.Y(csux.f, messageCoreData3.E());
                                        ((enrr) enrrVar5.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "refreshStatefulNotifications", 710, "FileDownloadCompletedHandler.java")).t("Notifying file transfer completed. shouldNotifySilently: %b", Boolean.valueOf(z2));
                                        ((ensz) ((ensz) cqxi.b.h()).h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "refreshStatefulNotifications", 711, "FileDownloadCompletedHandler.java")).q("Creating notification from FileDownloadCompletedHandler");
                                        if (z) {
                                            ((ensz) ((ensz) cqxi.b.h()).h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "refreshStatefulNotifications", 718, "FileDownloadCompletedHandler.java")).q("Creating notification for emotify reaction");
                                            ((cjbc) cqxiVar3.s.b()).b(messageCoreData3.z(), Duration.ofMillis(messageCoreData3.o()), false);
                                        } else {
                                            ((cjbc) cqxiVar3.s.b()).c();
                                        }
                                        e = elfo.e(null);
                                    }
                                    final Uri uri2 = b2;
                                    final Uri uri3 = a5;
                                    return elfo.m(e, elfo.g(new Callable() { // from class: cqwu
                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            Uri uri4 = uri2;
                                            Uri uri5 = uri3;
                                            if (uri4.equals(uri5)) {
                                                ensk h4 = cqxi.a.h();
                                                h4.Y(ente.a, "BugleFileTransfer");
                                                ((enrr) ((enrr) h4).h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "deleteTemporaryFile", 758, "FileDownloadCompletedHandler.java")).q("Skipping deleting temporary file. Temporary file and persisted file are the same");
                                            } else if (cqxi.this.e.getContentResolver().delete(uri4, null, null) != 1) {
                                                MessageCoreData messageCoreData4 = messageCoreData3;
                                                ensk j2 = cqxi.a.j();
                                                j2.Y(ente.a, "BugleFileTransfer");
                                                enrr enrrVar6 = (enrr) j2;
                                                enrrVar6.Y(csux.b, messageCoreData4.B());
                                                enrrVar6.Y(csux.f, messageCoreData4.E());
                                                enrrVar6.Y(csux.z, uri5.toString());
                                                ((enrr) enrrVar6.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "deleteTemporaryFile", 771, "FileDownloadCompletedHandler.java")).q("Failed to delete temporary file");
                                            }
                                            return null;
                                        }
                                    }, cqxiVar3.g), cqxiVar3.r.d(messageCoreData3.B(), eooi.FILE_DOWNLOAD_COMPLETED_HANDLER).q(), cqxiVar3.z.b(16).q()).a(new Callable() { // from class: cqwv
                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            ensk h4 = cqxi.a.h();
                                            h4.Y(ente.a, "BugleFileTransfer");
                                            enrr enrrVar6 = (enrr) h4;
                                            enrrVar6.Y(csux.f, MessageCoreData.this.E());
                                            ((enrr) enrrVar6.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "completeIncomingFileTransferForSuccessfulBugleDbUpdate", 557, "FileDownloadCompletedHandler.java")).q("Successfully completed file transfer");
                                            return ceyt.i();
                                        }
                                    }, cqxiVar3.g);
                                }
                            }, cqxiVar2.f).h(new emwl() { // from class: cqww
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    enru enruVar = cqxi.a;
                                    return new cqwk((ceyt) obj3, cqxf.this);
                                }
                            }, cqxiVar2.f);
                        }
                    }, cqxiVar.f).h(new emwl() { // from class: cqwp
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            cqxh cqxhVar = (cqxh) obj2;
                            if (!((atwp) cqxi.this.A.b()).a() || !cqxhVar.a().e()) {
                                return cqxhVar.a();
                            }
                            MessageCoreData messageCoreData2 = messageCoreData;
                            cqwb cqwbVar = (cqwb) cqwd.a.createBuilder();
                            String f = messageCoreData2.E().f();
                            cqwbVar.copyOnWrite();
                            ((cqwd) cqwbVar.instance).b = f;
                            Uri a4 = cqxhVar.b().a();
                            a4.getClass();
                            String uri2 = a4.toString();
                            cqwbVar.copyOnWrite();
                            cqwd cqwdVar = (cqwd) cqwbVar.instance;
                            uri2.getClass();
                            cqwdVar.c = uri2;
                            cqwbVar.copyOnWrite();
                            ((cqwd) cqwbVar.instance).e = cqwc.a(3);
                            cqwd cqwdVar2 = (cqwd) cqwbVar.build();
                            cetp cetpVar = new cetp();
                            cetpVar.d = messageCoreData2.E().f();
                            cetpVar.b = messageCoreData2.E().f();
                            return ceyt.j(engw.r(cqwe.a(cqwdVar2, cetpVar.a())));
                        }
                    }, cqxiVar.f).f(FileNotFoundException.class, new eroh() { // from class: cqwq
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            avvc g = avvd.g();
                            g.f(cqpn.FILE_TRANSFER_FAILURE_REASON_FILE_NOT_FOUND_WHILE_TRYING_TO_DECRYPT);
                            g.e(BasePaymentResult.ERROR_REQUEST_FAILED);
                            avvd a4 = g.a();
                            cqxi cqxiVar2 = cqxi.this;
                            final epyb i2 = avvd.g().a().i(cqxiVar2.y.a(a4));
                            eoop eoopVar = (eoop) eopq.a.createBuilder();
                            eqyl a5 = ((avkk) cqxiVar2.w.b()).a();
                            eoopVar.copyOnWrite();
                            eopq eopqVar = (eopq) eoopVar.instance;
                            eopqVar.aa = a5.h;
                            eopqVar.c |= 2097152;
                            eoopVar.copyOnWrite();
                            eopq eopqVar2 = (eopq) eoopVar.instance;
                            i2.getClass();
                            eopqVar2.an = i2;
                            eopqVar2.d |= 4;
                            eopq eopqVar3 = (eopq) eoopVar.build();
                            cqxv cqxvVar = (cqxv) cqxw.a.createBuilder();
                            cqxk cqxkVar3 = cqxkVar2;
                            String str = cqxkVar3.c;
                            cqxvVar.copyOnWrite();
                            cqxw cqxwVar = (cqxw) cqxvVar.instance;
                            str.getClass();
                            cqxwVar.b |= 1;
                            cqxwVar.c = str;
                            cqxvVar.copyOnWrite();
                            cqxw cqxwVar2 = (cqxw) cqxvVar.instance;
                            eopqVar3.getClass();
                            cqxwVar2.e = eopqVar3;
                            cqxwVar2.b |= 4;
                            String str2 = cqxkVar3.d;
                            cqxvVar.copyOnWrite();
                            cqxw cqxwVar3 = (cqxw) cqxvVar.instance;
                            str2.getClass();
                            cqxwVar3.b |= 8;
                            cqxwVar3.f = str2;
                            final cqxw cqxwVar4 = (cqxw) cqxvVar.build();
                            return ((cqxx) cqxiVar2.p.b()).a(cqxwVar4).h(new emwl() { // from class: cqxc
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    ensk h2 = cqxi.a.h();
                                    h2.Y(ente.a, "BugleFileTransfer");
                                    enrr enrrVar2 = (enrr) h2;
                                    enrrVar2.Y(csux.e, cqxw.this.c);
                                    enrr enrrVar3 = (enrr) enrrVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "processFileDownloadForFileNotFound", 462, "FileDownloadCompletedHandler.java");
                                    epyb epybVar = i2;
                                    int b2 = epxz.b(epybVar.e);
                                    if (b2 == 0) {
                                        b2 = 1;
                                    }
                                    epyd epydVar = epybVar.f;
                                    if (epydVar == null) {
                                        epydVar = epyd.a;
                                    }
                                    enrrVar3.C("File download failed with reason: %s and http response code: %s, queued work item to process failure.", epxz.a(b2), epydVar.c);
                                    return ceyt.j(engw.r(cisl.c()));
                                }
                            }, cqxiVar2.g);
                        }
                    }, cqxiVar.f).e(IOException.class, new emwl() { // from class: cqwr
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            ensk j = cqxi.a.j();
                            j.Y(ente.a, "BugleFileTransfer");
                            ((enrr) ((enrr) ((enrr) j).g((IOException) obj2)).h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "completeIncomingFileTransferForValidMessage", 419, "FileDownloadCompletedHandler.java")).q("Unable to complete the incoming file transfer.");
                            return ceyt.k();
                        }
                    }, cqxiVar.f);
                }
                ensk h2 = cqxi.a.h();
                h2.Y(ente.a, "BugleFileTransfer");
                enrr enrrVar2 = (enrr) h2;
                enrrVar2.Y(csux.p, messageCoreData.z());
                enrrVar2.Y(csux.b, messageCoreData.B());
                enrrVar2.Y(csux.f, messageCoreData.E());
                ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "processPendingWorkItemAsync", 262, "FileDownloadCompletedHandler.java")).q("Message has already finished downloading. Skipping completing the incoming file transfer.");
                return elfo.e(ceyt.i());
            }
        }, this.f);
        return ((Boolean) ((cfup) avyb.a.get()).e()).booleanValue() ? i : i.f(cquo.class, new eroh() { // from class: cqxb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cquo cquoVar = (cquo) obj;
                ensk j = cqxi.a.j();
                j.Y(ente.a, "BugleFileTransfer");
                enrr enrrVar = (enrr) ((enrr) j).g(cquoVar);
                enrrVar.Y(csux.f, bdhg.this);
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "processPendingWorkItemAsync", 282, "FileDownloadCompletedHandler.java")).q("Failed to complete file transfer.");
                return cquoVar.d().booleanValue() ? elfo.e(ceyt.m()) : elfo.e(ceyt.k());
            }
        }, this.f);
    }
}
