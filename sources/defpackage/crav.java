package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crav extends ceut {
    public static final entd a = entd.c("BugleFileTransfer");
    public static final cfup b = cfvl.e(cfvl.b, "thumbnail_download_completed_handler_max_retry", 1);
    public static final cfup c = cfvl.e(cfvl.b, "thumbnail_download_completed_handler_retry_delay", 1000);
    public final errl d;
    public final errl e;
    public final bbfw f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final dtuu k;
    public final ckch l;
    public final covj m;
    public final cqvy n;
    public final ffbr o;
    public final ffbr p;
    private final crab q;

    public crav(errl errlVar, errl errlVar2, crab crabVar, bbfw bbfwVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ckch ckchVar, dtuu dtuuVar, covj covjVar, cqvy cqvyVar, ffbr ffbrVar5, ffbr ffbrVar6) {
        this.d = errlVar;
        this.e = errlVar2;
        this.q = crabVar;
        this.f = bbfwVar;
        this.g = ffbrVar;
        this.h = ffbrVar2;
        this.i = ffbrVar3;
        this.j = ffbrVar4;
        this.k = dtuuVar;
        this.l = ckchVar;
        this.m = covjVar;
        this.n = cqvyVar;
        this.o = ffbrVar5;
        this.p = ffbrVar6;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        if (((Boolean) ((cfup) avyb.a.get()).e()).booleanValue()) {
            return cety.l().h();
        }
        cetx l = cety.l();
        l.c(((Integer) b.e()).intValue());
        l.g(((Integer) c.e()).intValue());
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("ThumbnailDownloadCompletedHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return crax.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        crax craxVar = (crax) eyhsVar;
        final bdhg a2 = bdhg.a(craxVar.b);
        final Uri parse = Uri.parse(craxVar.c);
        final String a3 = emxe.a(craxVar.d);
        if (!Uri.EMPTY.equals(parse)) {
            elfl i = this.q.a(a2).i(new eroh() { // from class: crar
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    Optional optional = (Optional) obj;
                    if (optional.isEmpty()) {
                        return elfo.e(ceyt.k());
                    }
                    final MessageCoreData messageCoreData = (MessageCoreData) optional.get();
                    if (!messageCoreData.cy()) {
                        final String str = a3;
                        final Uri uri = parse;
                        final crav cravVar = crav.this;
                        return elfo.g(new Callable() { // from class: cran
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return crav.this.m.a(messageCoreData.E(), uri, 1);
                            }
                        }, cravVar.e).i(new eroh() { // from class: crao
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                final MessageCoreData messageCoreData2 = messageCoreData;
                                final Uri uri2 = (Uri) obj2;
                                final ConversationIdType z = messageCoreData2.z();
                                final MessageIdType B = messageCoreData2.B();
                                final MessagePartCoreData G = messageCoreData2.G();
                                G.getClass();
                                final crav cravVar2 = crav.this;
                                final byyz byyzVar = ((cutu) cravVar2.o.b()).b() ? byyz.PENDING_VERDICT : byyz.DEFAULT_NO_VERDICT;
                                String str2 = str;
                                elfl i2 = elfo.f(new Runnable() { // from class: cral
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final crav cravVar3 = crav.this;
                                        final ConversationIdType conversationIdType = z;
                                        final MessageIdType messageIdType = B;
                                        final MessagePartCoreData messagePartCoreData = G;
                                        final Uri uri3 = uri2;
                                        final byyz byyzVar2 = byyzVar;
                                        final MessageCoreData messageCoreData3 = messageCoreData2;
                                        cravVar3.k.d("ThumbnailDownloadCompletedHandler.updateThumbnailInBugleDb", new Runnable() { // from class: craq
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                crav cravVar4 = crav.this;
                                                bdpt bdptVar = (bdpt) cravVar4.h.b();
                                                String aa = messagePartCoreData.aa();
                                                String[] strArr = PartsTable.a;
                                                bwdi bwdiVar = new bwdi();
                                                bwdiVar.ap("updateThumbnailInBugleDb");
                                                bwdiVar.u(uri3);
                                                bwdiVar.q(byyzVar2);
                                                ConversationIdType conversationIdType2 = conversationIdType;
                                                MessageIdType messageIdType2 = messageIdType;
                                                bdptVar.f(conversationIdType2, messageIdType2, aa, bwdiVar);
                                                MessageCoreData n = ((bdmq) cravVar4.g.b()).n(conversationIdType2);
                                                if (n == null || n.B().equals(messageIdType2)) {
                                                    ((bdfl) cravVar4.i.b()).f(conversationIdType2, messageIdType2, Long.valueOf(messageCoreData3.o()), byyt.UNARCHIVED, -1L, null);
                                                }
                                            }
                                        });
                                        ((cpev) cravVar3.j.b()).o(messageCoreData3.E().f(), new ecda("ToThumbnailDownloaded"), cpeu.TACHYGRAM_MESSAGE_ARRIVED);
                                        Consumer consumer = new Consumer() { // from class: cqvu
                                            @Override // java.util.function.Consumer
                                            /* renamed from: accept */
                                            public final void o(Object obj3) {
                                            }

                                            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                                                return Consumer$CC.$default$andThen(this, consumer2);
                                            }
                                        };
                                        cqvy cqvyVar = cravVar3.n;
                                        ((akyb) cqvyVar.b.b()).a().j(cqvyVar.c(messageCoreData3, 34, consumer), alal.LOG_SPEC_MESSAGE_RECEIVING_NORTHSTAR_EVENTS);
                                    }
                                }, cravVar2.e).i(new eroh() { // from class: cram
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj3) {
                                        crav.this.f.e(false, messageCoreData2.z());
                                        return elfo.e(null);
                                    }
                                }, cravVar2.d);
                                return ((atwp) cravVar2.p.b()).a() ? elfo.k(i2, cravVar2.l.i(messageCoreData2, uri2, str2)).a(new Callable() { // from class: crat
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        cqwb cqwbVar = (cqwb) cqwd.a.createBuilder();
                                        MessageCoreData messageCoreData3 = MessageCoreData.this;
                                        String f = messageCoreData3.E().f();
                                        cqwbVar.copyOnWrite();
                                        ((cqwd) cqwbVar.instance).b = f;
                                        String uri3 = uri2.toString();
                                        cqwbVar.copyOnWrite();
                                        cqwd cqwdVar = (cqwd) cqwbVar.instance;
                                        uri3.getClass();
                                        cqwdVar.c = uri3;
                                        cqwbVar.copyOnWrite();
                                        ((cqwd) cqwbVar.instance).e = cqwc.a(4);
                                        cqwd cqwdVar2 = (cqwd) cqwbVar.build();
                                        cetp cetpVar = new cetp();
                                        cetpVar.d = messageCoreData3.E().f();
                                        cetpVar.b = "thumbnail/".concat(messageCoreData3.E().f());
                                        return ceyt.j(engw.r(cqwe.a(cqwdVar2, cetpVar.a())));
                                    }
                                }, cravVar2.d) : elfo.k(i2, cravVar2.l.k(messageCoreData2, uri2, str2)).a(new Callable() { // from class: crau
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        return ceyt.i();
                                    }
                                }, cravVar2.d);
                            }
                        }, cravVar.d).e(IOException.class, new emwl() { // from class: crap
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                crav.D.s("Unable to complete the incoming thumbnail transfer.", (IOException) obj2);
                                return ceyt.k();
                            }
                        }, cravVar.d);
                    }
                    ensz enszVar = (ensz) crav.a.h();
                    enszVar.Y(csux.o, messageCoreData.z().toString());
                    enszVar.Y(csux.a, messageCoreData.B().b());
                    enszVar.Y(csux.e, messageCoreData.E().b);
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/incoming/ThumbnailDownloadCompletedHandler", "processPendingWorkItemAsync", 198, "ThumbnailDownloadCompletedHandler.java")).q("Message has already finished downloading. Skipping updating thumbnail.");
                    return elfo.e(ceyt.i());
                }
            }, this.d);
            return ((Boolean) ((cfup) avyb.a.get()).e()).booleanValue() ? i : i.f(cquo.class, new eroh() { // from class: cras
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    cquo cquoVar = (cquo) obj;
                    ensz enszVar = (ensz) ((ensz) crav.a.j()).g(cquoVar);
                    enszVar.Y(csux.e, bdhg.this.b);
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/incoming/ThumbnailDownloadCompletedHandler", "processPendingWorkItemAsync", 218, "ThumbnailDownloadCompletedHandler.java")).q("Failed to update thumbnail for incoming file transfer.");
                    return cquoVar.d().booleanValue() ? elfo.e(ceyt.m()) : elfo.e(ceyt.k());
                }
            }, this.d);
        }
        ensz enszVar = (ensz) a.j();
        enszVar.Y(csux.e, a2.b);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/incoming/ThumbnailDownloadCompletedHandler", "processPendingWorkItemAsync", 171, "ThumbnailDownloadCompletedHandler.java")).q("Thumbnail Uri is not provided. Cannot update thumbnail for incoming file transfer.");
        return elfo.e(ceyt.k());
    }
}
