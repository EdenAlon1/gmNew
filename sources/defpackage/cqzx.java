package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqzx {
    public static final entd a = entd.c("BugleFileTransfer");
    public static final entd b = entd.c("BugleNotifications");
    public final ffbr A;
    public final ffbr B;
    public final cers C;
    public final ffbr D;
    public final ffbr E;
    public final ffbr F;
    public final cqvy G;
    public final ffbr H;
    public final crak I;
    public final ffbr J;
    public final ffbr K;
    public final ffbr L;
    public final ffbr M;
    public final atmc N;
    public final atmb O;
    public final ffbr P;
    public final ffbr Q;
    public final ffbr R;
    public final ffbr S;
    public final ffbr T;
    public final cfmp U;
    private final ckch V;
    private final avff W;
    private final ffbr X;
    private final ffbr Y;
    private final cqos Z;
    public final errl c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final cowq j;
    public final avkm k;
    public final ckju l;
    public final ffbr m;
    public final dtuu n;
    public final byzp o;
    public final ffbr p;
    public final cubr q;
    public final cbut r;
    public final bdvi s;
    public final cqoh t;
    public final bbgg u;
    public final bbfo v;
    public final cvlf w;
    public final ffbr x;
    public final ffbr y;
    public final fazb z;

    public cqzx(errl errlVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, cowq cowqVar, avkm avkmVar, ckju ckjuVar, ffbr ffbrVar8, dtuu dtuuVar, byzp byzpVar, ffbr ffbrVar9, cubr cubrVar, cbut cbutVar, bdvi bdviVar, cqoh cqohVar, ckch ckchVar, bbgg bbggVar, bbfo bbfoVar, cqos cqosVar, cvlf cvlfVar, avff avffVar, cfmp cfmpVar, ffbr ffbrVar10, ffbr ffbrVar11, fazb fazbVar, ffbr ffbrVar12, ffbr ffbrVar13, cers cersVar, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, cqvy cqvyVar, ffbr ffbrVar17, crak crakVar, ffbr ffbrVar18, ffbr ffbrVar19, ffbr ffbrVar20, ffbr ffbrVar21, atmc atmcVar, atmb atmbVar, ffbr ffbrVar22, ffbr ffbrVar23, ffbr ffbrVar24, ffbr ffbrVar25, ffbr ffbrVar26, ffbr ffbrVar27) {
        this.c = errlVar;
        this.d = ffbrVar;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
        this.g = ffbrVar5;
        this.h = ffbrVar6;
        this.i = ffbrVar7;
        this.j = cowqVar;
        this.k = avkmVar;
        this.l = ckjuVar;
        this.m = ffbrVar8;
        this.n = dtuuVar;
        this.o = byzpVar;
        this.p = ffbrVar9;
        this.q = cubrVar;
        this.r = cbutVar;
        this.s = bdviVar;
        this.t = cqohVar;
        this.V = ckchVar;
        this.u = bbggVar;
        this.v = bbfoVar;
        this.Z = cqosVar;
        this.w = cvlfVar;
        this.W = avffVar;
        this.U = cfmpVar;
        this.x = ffbrVar10;
        this.y = ffbrVar11;
        this.z = fazbVar;
        this.A = ffbrVar12;
        this.B = ffbrVar13;
        this.C = cersVar;
        this.D = ffbrVar14;
        this.E = ffbrVar15;
        this.F = ffbrVar16;
        this.G = cqvyVar;
        this.H = ffbrVar17;
        this.I = crakVar;
        this.J = ffbrVar18;
        this.K = ffbrVar19;
        this.L = ffbrVar2;
        this.M = ffbrVar20;
        this.X = ffbrVar21;
        this.N = atmcVar;
        this.O = atmbVar;
        this.P = ffbrVar22;
        this.Q = ffbrVar23;
        this.R = ffbrVar24;
        this.S = ffbrVar25;
        this.Y = ffbrVar26;
        this.T = ffbrVar27;
    }

    public static boolean h(awui awuiVar) {
        awuh awuhVar = awuh.BOT;
        awuh b2 = awuh.b(awuiVar.c);
        if (b2 == null) {
            b2 = awuh.UNKNOWN_TYPE;
        }
        return awuhVar.equals(b2);
    }

    public static boolean i(awui awuiVar) {
        awuh awuhVar = awuh.GROUP;
        awuh b2 = awuh.b(awuiVar.c);
        if (b2 == null) {
            b2 = awuh.UNKNOWN_TYPE;
        }
        return awuhVar.equals(b2);
    }

    public static boolean j(awui awuiVar, ParticipantsTable.BindData bindData) {
        if (h(awuiVar)) {
            return true;
        }
        if (bindData == null) {
            return false;
        }
        ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "isRbmBot", 1282, "IncomingFileTransferProcessor.java")).q("Server and client mismatch in whether this is a bot participant. Assume thisis a server mishap.");
        return true;
    }

    public final ConversationIdType a(crme crmeVar, ConversationIdType conversationIdType) {
        if (this.N.a()) {
            conversationIdType.getClass();
            return conversationIdType;
        }
        crmeVar.getClass();
        return crmeVar.a();
    }

    public final elfl b(final awui awuiVar) {
        return this.W.a(awuiVar.d).h(new emwl() { // from class: cqym
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                optional.getClass();
                if (optional.isPresent()) {
                    return (BusinessInfoData) optional.get();
                }
                return ((cowf) cqzx.this.i.b()).a(awuiVar.d);
            }
        }, this.c);
    }

    public final elfl c(awui awuiVar) {
        return elfo.g(new cqzu(this, awuiVar), this.c);
    }

    public final elfl d(final MessageCoreData messageCoreData, final cqxn cqxnVar, final FileTransferInformation fileTransferInformation, final boolean z, final eopq eopqVar) {
        elfl e;
        final cqvc a2 = this.Z.a();
        MessageIdType B = messageCoreData.B();
        Optional d = fileTransferInformation.d();
        if (d.isEmpty()) {
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "downloadThumbnail", 1493, "IncomingFileTransferProcessor.java")).q("Thumbnail is not present.");
            e = elfo.e(null);
        } else {
            e = a2.a(B, (FileInformation) d.get(), cqxnVar.toByteString()).h(new emwl() { // from class: cqzs
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ((ensz) ((ensz) cqzx.a.h()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "downloadThumbnail", 1500, "IncomingFileTransferProcessor.java")).t("Thumbnail successfully queued for download. Download ID: %s", ((cqum) obj).a());
                    return null;
                }
            }, this.c).e(cquo.class, new emwl() { // from class: cqzt
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ((ensz) ((ensz) ((ensz) cqzx.a.j()).g((cquo) obj)).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "downloadThumbnail", 1512, "IncomingFileTransferProcessor.java")).q("Thumbnail was not successfully queued for download.");
                    return null;
                }
            }, this.c);
        }
        return e.i(new eroh() { // from class: cqzm
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final cqzx cqzxVar = cqzx.this;
                final MessageCoreData messageCoreData2 = messageCoreData;
                FileTransferInformation fileTransferInformation2 = fileTransferInformation;
                if (!z) {
                    final FileInformation a3 = fileTransferInformation2.a();
                    return elfo.g(new Callable() { // from class: cqzk
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            MessageIdType B2 = MessageCoreData.this.B();
                            awvb awvbVar = (awvb) new avtz().m().fP(a3);
                            ekzz f = eleg.f("FileTransferDatabaseOperations#upsertFileTransferEntryForManualDownload");
                            try {
                                String[] strArr = cqtj.a;
                                cqrv cqrvVar = new cqrv();
                                cqrvVar.c(B2);
                                cqrvVar.e("");
                                cqrvVar.f(cqtk.DOWNLOAD);
                                cqrvVar.b(awvbVar);
                                cqrs a4 = cqrvVar.a();
                                cqti cqtiVar = new cqti();
                                cqtiVar.b(B2);
                                boolean s = a4.s(new cqth(cqtiVar));
                                f.close();
                                return Boolean.valueOf(s);
                            } catch (Throwable th) {
                                try {
                                    f.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    }, cqzxVar.c).h(new emwl() { // from class: cqzl
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            entd entdVar = cqzx.a;
                            if (!((Boolean) obj2).booleanValue()) {
                                MessageCoreData messageCoreData3 = MessageCoreData.this;
                                ensz enszVar = (ensz) cqzx.a.j();
                                enszVar.Y(csux.b, messageCoreData3.B());
                                enszVar.Y(csux.f, messageCoreData3.E());
                                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "insertFileTransferTableEntry", 1598, "IncomingFileTransferProcessor.java")).q("Fail to insert/upsert the FileTransfer table for manual download");
                            }
                            return Optional.empty();
                        }
                    }, cqzxVar.c);
                }
                final eopq eopqVar2 = eopqVar;
                final cqxn cqxnVar2 = cqxnVar;
                final cqvc cqvcVar = a2;
                final FileInformation a4 = fileTransferInformation2.a();
                return elfo.f(new Runnable() { // from class: cqzf
                    @Override // java.lang.Runnable
                    public final void run() {
                        cqzx.this.G.d(messageCoreData2, 2, a4.i());
                    }
                }, cqzxVar.c).i(new eroh() { // from class: cqzg
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        entd entdVar = cqzx.a;
                        return cqvc.this.a(messageCoreData2.B(), a4, cqxnVar2.toByteString());
                    }
                }, cqzxVar.c).h(new emwl() { // from class: cqzh
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        cqum cqumVar = (cqum) obj2;
                        ensz enszVar = (ensz) cqzx.a.h();
                        enszVar.Y(csux.b, MessageCoreData.this.B());
                        enszVar.Y(cqpo.a, cqumVar.a());
                        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "downloadFile", 1550, "IncomingFileTransferProcessor.java")).q("File successfully queued for download");
                        return Optional.of(cqumVar);
                    }
                }, cqzxVar.c).e(cquo.class, new emwl() { // from class: cqzi
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        cquo cquoVar = (cquo) obj2;
                        ensz enszVar = (ensz) ((ensz) cqzx.a.j()).g(cquoVar);
                        MessageCoreData messageCoreData3 = messageCoreData2;
                        enszVar.Y(csux.b, messageCoreData3.B());
                        enszVar.Y(csux.f, messageCoreData3.E());
                        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "downloadFile", 1564, "IncomingFileTransferProcessor.java")).q("File was not successfully queued for auto download.");
                        cqxv cqxvVar = (cqxv) cqxw.a.createBuilder();
                        String str = messageCoreData3.E().b;
                        str.getClass();
                        cqxvVar.copyOnWrite();
                        cqxw cqxwVar = (cqxw) cqxvVar.instance;
                        cqxwVar.b |= 1;
                        cqxwVar.c = str;
                        cqxvVar.copyOnWrite();
                        cqxw cqxwVar2 = (cqxw) cqxvVar.instance;
                        eopq eopqVar3 = eopqVar2;
                        eopqVar3.getClass();
                        cqxwVar2.e = eopqVar3;
                        cqxwVar2.b |= 4;
                        String message = cquoVar.getMessage();
                        if (message != null) {
                            cqxvVar.copyOnWrite();
                            cqxw cqxwVar3 = (cqxw) cqxvVar.instance;
                            cqxwVar3.b |= 2;
                            cqxwVar3.d = message;
                        }
                        ((cevh) ((cqxx) cqzx.this.y.b()).a.b()).a(ceyr.g("file_download_failed", (cqxw) cqxvVar.build()));
                        return Optional.empty();
                    }
                }, cqzxVar.c);
            }
        }, this.c).h(new emwl() { // from class: cqzn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = cqzx.a;
                return MessageCoreData.this;
            }
        }, this.c);
    }

    public final elfl e(MessageCoreData messageCoreData, crme crmeVar, ParticipantsTable.BindData bindData, awui awuiVar, aztg aztgVar) {
        long a2;
        int e = aztgVar.e();
        String U = bindData.U();
        if (U == null) {
            ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "insertRcsFileTransferInTelephony", 1745, "IncomingFileTransferProcessor.java")).q("Not storing rcs file transfer in Telephony. Sender msisdn is null.");
            return elfo.e(Optional.empty());
        }
        aoku u = ((aolr) this.A.b()).u(U, e);
        if (this.N.a()) {
            a2 = ((ayfi) this.Y.b()).a(messageCoreData.z()).a();
        } else {
            crmeVar.getClass();
            a2 = cpxv.a(crmeVar.c());
        }
        return this.V.l(messageCoreData, a2, u, i(awuiVar) ? awuiVar.d : null, e).h(new emwl() { // from class: cqyo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Optional.ofNullable((Uri) obj);
            }
        }, this.c);
    }

    public final elfl f(final bdhg bdhgVar, final awui awuiVar, awui awuiVar2, final ParticipantsTable.BindData bindData, final crme crmeVar, final ConversationIdType conversationIdType, final Instant instant, final Instant instant2, final BusinessInfoData businessInfoData, final awui awuiVar3, final FileTransferInformation fileTransferInformation, final awxk awxkVar, final Bundle bundle) {
        final elfl e = this.N.a() ? elfo.e(bindData) : elfo.g(new Callable() { // from class: cqyy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final cqzx cqzxVar = cqzx.this;
                final ParticipantsTable.BindData bindData2 = bindData;
                final BusinessInfoData businessInfoData2 = businessInfoData;
                return (ParticipantsTable.BindData) cqzxVar.n.c("IncomingRcsFileTransferHandler#getOrCreateParticipantInBugleDb", new emyl() { // from class: cqze
                    @Override // defpackage.emyl
                    public final Object get() {
                        cqzx cqzxVar2 = cqzx.this;
                        String i = ((bdrr) cqzxVar2.e.b()).i(bindData2);
                        BusinessInfoData businessInfoData3 = businessInfoData2;
                        if (businessInfoData3 != null) {
                            String logoImageLocalUri = businessInfoData3.getLogoImageLocalUri();
                            if (!emxe.c(logoImageLocalUri)) {
                                ((ensz) ((ensz) cqzx.a.h()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "updateBotProfile", 1799, "IncomingFileTransferProcessor.java")).q("Updating RBM bot");
                                if (((bdrr) cqzxVar2.e.b()).s(i, Uri.parse(logoImageLocalUri))) {
                                    ((bczy) cqzxVar2.f.b()).R(i);
                                }
                            }
                        }
                        ParticipantsTable.BindData b2 = ((bdrr) cqzxVar2.e.b()).b(i);
                        b2.getClass();
                        return b2;
                    }
                });
            }
        }, this.c);
        final elfl e2 = !i(awuiVar3) ? elfo.e(awuiVar2) : ((cldg) this.X.b()).a(a(crmeVar, conversationIdType), awuiVar2);
        return elfo.k(e, e2).b(new erog() { // from class: cqyz
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final awui awuiVar4 = (awui) erqt.q(e2);
                final ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) erqt.q(e);
                final cqzx cqzxVar = cqzx.this;
                final bdhg bdhgVar2 = bdhgVar;
                try {
                    final aztg b2 = ((ckam) cqzxVar.J.b()).b(awuiVar4);
                    final FileTransferInformation fileTransferInformation2 = fileTransferInformation;
                    cqxm cqxmVar = (cqxm) cqxn.a.createBuilder();
                    String str = bdhgVar2.b;
                    str.getClass();
                    cqxmVar.copyOnWrite();
                    ((cqxn) cqxmVar.instance).b = str;
                    final cqxn cqxnVar = (cqxn) cqxmVar.build();
                    int a2 = fileTransferInformation2.a().a();
                    csuf b3 = ((csug) cqzxVar.E.b()).b(fileTransferInformation2.a().b(), r8.a());
                    final boolean c = b3.c();
                    csub csubVar = (csub) b3;
                    ((ensz) ((ensz) cqzx.a.h()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "isAutoDownload", 779, "IncomingFileTransferProcessor.java")).J("Calculating message status. FileSize: %d. Auto downloadable file size: %d.  Auto downloading: %b", Integer.valueOf(a2), Long.valueOf(csubVar.a), Boolean.valueOf(c));
                    if (!c) {
                        ((ensz) ((ensz) cqzx.a.h()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "isAutoDownload", 784, "IncomingFileTransferProcessor.java")).t("File is not auto downloading b/c %s.", csubVar.b);
                    }
                    final awxk awxkVar2 = awxkVar;
                    eopq eopqVar = awxkVar2.q;
                    if (eopqVar == null) {
                        eopqVar = eopq.a;
                    }
                    ConversationIdType conversationIdType2 = conversationIdType;
                    final crme crmeVar2 = crmeVar;
                    final ConversationIdType a3 = cqzxVar.a(crmeVar2, conversationIdType2);
                    fayv fayvVar = awxkVar2.n;
                    if (fayvVar == null) {
                        fayvVar = fayv.a;
                    }
                    final fayv fayvVar2 = fayvVar;
                    final Bundle bundle2 = bundle;
                    final awui awuiVar5 = awuiVar3;
                    final Instant instant3 = instant2;
                    final Instant instant4 = instant;
                    final awui awuiVar6 = awuiVar;
                    final eopq eopqVar2 = eopqVar;
                    final eygk eygkVar = new eygk(awxkVar2.s, awxk.a);
                    final FileInformation a4 = fileTransferInformation2.a();
                    final int i = true != c ? 115 : 105;
                    return elfo.g(new Callable() { // from class: cqzj
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            FileInformation fileInformation = a4;
                            ContentType b4 = fileInformation.b();
                            if (eijq.e.f(b4)) {
                                eidz eidzVar = new eidz(eijq.j);
                                eidzVar.h(b4.a());
                                b4 = eidzVar.g();
                            }
                            awui awuiVar7 = awuiVar4;
                            awui awuiVar8 = awuiVar6;
                            Bundle bundle3 = bundle2;
                            FileTransferInformation fileTransferInformation3 = fileTransferInformation2;
                            Instant instant5 = instant3;
                            Instant instant6 = instant4;
                            int i2 = i;
                            ConversationIdType conversationIdType3 = a3;
                            aztg aztgVar = b2;
                            ParticipantsTable.BindData bindData3 = bindData2;
                            bdhg bdhgVar3 = bdhgVar2;
                            cqzx cqzxVar2 = cqzx.this;
                            MessageCoreData u = cqzxVar2.o.u(b4.toString(), fileInformation.a(), fileInformation.d().toEpochMilli(), bdhgVar3, bindData3.S(), aztgVar.g(), conversationIdType3, i2, cqzxVar2.q.a(conversationIdType3), instant6.toEpochMilli(), instant5.toEpochMilli(), (String) fileInformation.h().orElse(""), (String) fileTransferInformation3.d().map(new Function() { // from class: cqzr
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    entd entdVar = cqzx.a;
                                    return ((FileInformation) obj).b().toString();
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).orElse(null));
                            cqzxVar2.U.a(u, bundle3);
                            u.bQ(((aolr) cqzxVar2.A.b()).b(awuiVar8));
                            aoku b5 = ((aolr) cqzxVar2.A.b()).b(awuiVar7);
                            emxf.a(b5.e().isPresent());
                            awuh b6 = awuh.b(((awui) b5.e().get()).c);
                            if (b6 == null) {
                                b6 = awuh.UNKNOWN_TYPE;
                            }
                            List list = eygkVar;
                            fayv fayvVar3 = fayvVar2;
                            emxf.a(b6.equals(awuh.PHONE));
                            u.bN(b5);
                            u.bs(fayvVar3);
                            if (((augx) cqzxVar2.T.b()).a()) {
                                u.bI((list.contains(awxj.POSITIVE_DELIVERY) || list.contains(awxj.NEGATIVE_DELIVERY)) ? byzg.NOT_SENT : byzg.NOT_REQUESTED);
                            } else {
                                u.bI(list.contains(awxj.POSITIVE_DELIVERY) ? byzg.NOT_SENT : byzg.NOT_REQUESTED);
                            }
                            u.bJ(list.contains(awxj.DISPLAY) ? byzg.NOT_SENT : byzg.NOT_REQUESTED);
                            return u;
                        }
                    }, cqzxVar.c).h(new emwl() { // from class: cqyv
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            MessageCoreData messageCoreData = (MessageCoreData) obj;
                            Iterator it = ((Set) cqzx.this.z.b()).iterator();
                            while (it.hasNext()) {
                                ((bdnu) it.next()).e(messageCoreData);
                            }
                            return messageCoreData;
                        }
                    }, cqzxVar.c).i(new eroh() { // from class: cqyw
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            final MessageCoreData messageCoreData = (MessageCoreData) obj;
                            final cqzx cqzxVar2 = cqzx.this;
                            ((coxg) cqzxVar2.m.b()).i(instant3.toEpochMilli());
                            final ConversationIdType z = cqzxVar2.N.a() ? messageCoreData.z() : a3;
                            final aztg aztgVar = b2;
                            final boolean z2 = c;
                            final awui awuiVar7 = awuiVar5;
                            final ParticipantsTable.BindData bindData3 = bindData2;
                            final bdhg bdhgVar3 = bdhgVar2;
                            final awxk awxkVar3 = awxkVar2;
                            return elfo.g(new Callable() { // from class: cqyu
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    cpev cpevVar;
                                    String str2;
                                    final cqzx cqzxVar3 = cqzx.this;
                                    bdmq bdmqVar = (bdmq) cqzxVar3.g.b();
                                    bdhg bdhgVar4 = bdhgVar3;
                                    MessageCoreData w = bdmqVar.w(bdhgVar4);
                                    final MessageCoreData messageCoreData2 = messageCoreData;
                                    final ConversationIdType conversationIdType3 = z;
                                    if (w != null) {
                                        ensz enszVar = (ensz) cqzx.a.j();
                                        enszVar.Y(csux.f, bdhgVar4);
                                        enszVar.Y(csux.p, conversationIdType3);
                                        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "insertRcsFileTransferInBugleDb", 1636, "IncomingFileTransferProcessor.java")).q("Duplicate message found.");
                                        axnw.h(((coww) cqzxVar3.K.b()).a(messageCoreData2).h(new emwl() { // from class: cqyp
                                            @Override // defpackage.emwl
                                            public final Object apply(Object obj2) {
                                                Boolean bool = (Boolean) obj2;
                                                entd entdVar = cqzx.a;
                                                boolean booleanValue = bool.booleanValue();
                                                MessageCoreData messageCoreData3 = MessageCoreData.this;
                                                if (booleanValue) {
                                                    ensz enszVar2 = (ensz) cqzx.a.h();
                                                    enszVar2.Y(csux.f, messageCoreData3.E());
                                                    ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "sendBestEffortDeliveryReport", 1722, "IncomingFileTransferProcessor.java")).q("Best-effort delivery report sent.");
                                                    return bool;
                                                }
                                                ensz enszVar3 = (ensz) cqzx.a.j();
                                                enszVar3.Y(csux.f, messageCoreData3.E());
                                                ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "sendBestEffortDeliveryReport", 1727, "IncomingFileTransferProcessor.java")).q("Failed to send best-effort delivery report.");
                                                return bool;
                                            }
                                        }, cqzxVar3.c));
                                        avui avuiVar = avui.SUCCESS;
                                        avuiVar.getClass();
                                        return new cqwg(avuiVar);
                                    }
                                    final awui awuiVar8 = awuiVar7;
                                    final ParticipantsTable.BindData bindData4 = bindData3;
                                    cqzxVar3.n.d("IncomingRcsFileTransferHandler#insertRcsFileTransferInBugleDb", new Runnable() { // from class: cqyc
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            cqzx cqzxVar4 = cqzx.this;
                                            cbut cbutVar = cqzxVar4.r;
                                            MessageCoreData messageCoreData3 = messageCoreData2;
                                            cbutVar.j(messageCoreData3);
                                            ((bdjr) cqzxVar4.H.b()).a(messageCoreData3);
                                            Iterator it = ((Set) cqzxVar4.z.b()).iterator();
                                            while (it.hasNext()) {
                                                ((bdnu) it.next()).k(messageCoreData3);
                                            }
                                            awui awuiVar9 = awuiVar8;
                                            ParticipantsTable.BindData bindData5 = bindData4;
                                            ConversationIdType conversationIdType4 = conversationIdType3;
                                            bdfl bdflVar = (bdfl) cqzxVar4.h.b();
                                            MessageIdType B = messageCoreData3.B();
                                            Long valueOf = Long.valueOf(messageCoreData3.o());
                                            boolean i2 = cqzx.i(awuiVar9);
                                            ((ensz) ((ensz) cqzx.a.h()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "getArchiveStatus", 1809, "IncomingFileTransferProcessor.java")).t("Calculating archive status. isGroup: %b", Boolean.valueOf(i2));
                                            String U = bindData5.U();
                                            bdflVar.f(conversationIdType4, B, valueOf, U == null ? byyt.UNARCHIVED : ((bdmq) cqzxVar4.g.b()).F(conversationIdType4, U, false, i2), -1L, 0);
                                        }
                                    });
                                    boolean g = ((carb) cqzxVar3.B.b()).g(messageCoreData2.z());
                                    boolean z3 = true;
                                    if (!messageCoreData2.cN() && !z2 && !g) {
                                        z3 = false;
                                    }
                                    awxk awxkVar4 = awxkVar3;
                                    aztg aztgVar2 = aztgVar;
                                    altk altkVar = (altk) cqzxVar3.d.b();
                                    int e3 = aztgVar2.e();
                                    eopq eopqVar3 = awxkVar4.q;
                                    if (eopqVar3 == null) {
                                        eopqVar3 = eopq.a;
                                    }
                                    eoop eoopVar = (eoop) eopqVar3.toBuilder();
                                    eoopVar.copyOnWrite();
                                    eopq eopqVar4 = (eopq) eoopVar.instance;
                                    eopqVar4.h = 2;
                                    eopqVar4.b = 2 | eopqVar4.b;
                                    eoopVar.copyOnWrite();
                                    eopq eopqVar5 = (eopq) eoopVar.instance;
                                    eopqVar5.c |= 1073741824;
                                    eopqVar5.aj = z3;
                                    altkVar.O(messageCoreData2, e3, eoopVar);
                                    cqvy cqvyVar = cqzxVar3.G;
                                    eolu c2 = cqvyVar.c(messageCoreData2, 32, new Consumer() { // from class: cqvw
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void o(Object obj2) {
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                    cpev cpevVar2 = (cpev) cqvyVar.f.b();
                                    String f = messageCoreData2.E().f();
                                    Optional empty = Optional.empty();
                                    engw engwVar = cpev.i;
                                    int i2 = ((enou) engwVar).c;
                                    int i3 = 0;
                                    while (i3 < i2) {
                                        int i4 = i3;
                                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) cpevVar2.u.get(((cpeu) engwVar.get(i3)).ordinal());
                                        if (concurrentHashMap.containsKey(f)) {
                                            akzo akzoVar = ((cpes) concurrentHashMap.get(f)).b;
                                            if (empty.isEmpty()) {
                                                cpevVar = cpevVar2;
                                                str2 = f;
                                            } else {
                                                cpevVar = cpevVar2;
                                                akzo akzoVar2 = (akzo) empty.get();
                                                str2 = f;
                                                if (akzoVar.a < akzoVar2.a) {
                                                    if (akzoVar.b >= akzoVar2.b) {
                                                    }
                                                }
                                            }
                                            empty = Optional.of(akzoVar);
                                        } else {
                                            cpevVar = cpevVar2;
                                            str2 = f;
                                        }
                                        i3 = i4 + 1;
                                        cpevVar2 = cpevVar;
                                        f = str2;
                                    }
                                    if (empty.isEmpty()) {
                                        ensk h = cqvy.a.h();
                                        h.Y(ente.a, "BugleFileTransfer");
                                        enrr enrrVar = (enrr) h;
                                        enrrVar.Y(csux.f, messageCoreData2.E());
                                        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/transfer/downloads/analytics/FileDownloadEventLogger", "logRcsMessageDownloadReceiving", 264, "FileDownloadEventLogger.java")).q("Receiving timestamp has not been recorded for message. Skipping logging of RECEIVING event.");
                                    } else {
                                        akxn a5 = ((akyb) cqvyVar.b.b()).a();
                                        a5.f((akzo) empty.get());
                                        a5.j(c2, alal.LOG_SPEC_MESSAGE_RECEIVING_NORTHSTAR_EVENTS);
                                    }
                                    cqzxVar3.s.c(conversationIdType3, bindData4, messageCoreData2);
                                    ensz enszVar2 = (ensz) cqzx.a.h();
                                    enszVar2.Y(csux.b, messageCoreData2.B());
                                    enszVar2.Y(csux.p, conversationIdType3);
                                    ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "insertRcsFileTransferInBugleDb", 1696, "IncomingFileTransferProcessor.java")).q("Received and processed RCS file transfer push message.");
                                    ((ensz) ((ensz) cqzx.b.h()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "insertRcsFileTransferInBugleDb", 1698, "IncomingFileTransferProcessor.java")).q("Creating notification from IncomingFileTransferProcessor");
                                    ((cjbc) cqzxVar3.F.b()).b(messageCoreData2.z(), Duration.ofMillis(messageCoreData2.o()), false);
                                    messageCoreData2.getClass();
                                    return new cqwf(messageCoreData2);
                                }
                            }, cqzxVar2.c);
                        }
                    }, cqzxVar.c).i(new eroh() { // from class: cqyx
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            cqzw cqzwVar = (cqzw) obj;
                            int b4 = cqzwVar.b();
                            final bdhg bdhgVar3 = bdhgVar2;
                            if (b4 == 2) {
                                ConversationIdType conversationIdType3 = a3;
                                ensz enszVar = (ensz) cqzx.a.h();
                                enszVar.Y(csux.f, bdhgVar3);
                                enszVar.Y(csux.p, conversationIdType3);
                                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "processFileTransferPushMessageForValidParticipant", 739, "IncomingFileTransferProcessor.java")).q("Skipping the file download.");
                                return elfo.e(cqzwVar.c());
                            }
                            final aztg aztgVar = b2;
                            eopq eopqVar3 = eopqVar2;
                            boolean z = c;
                            FileTransferInformation fileTransferInformation3 = fileTransferInformation2;
                            final awui awuiVar7 = awuiVar5;
                            cqxn cqxnVar2 = cqxnVar;
                            final crme crmeVar3 = crmeVar2;
                            final ParticipantsTable.BindData bindData3 = bindData2;
                            final cqzx cqzxVar2 = cqzx.this;
                            if (!((Boolean) ((cfup) avyb.a.get()).e()).booleanValue()) {
                                return cqzxVar2.d(cqzwVar.a(), cqxnVar2, fileTransferInformation3, z, eopqVar3).h(new emwl() { // from class: cqyk
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj2) {
                                        MessageCoreData messageCoreData = (MessageCoreData) obj2;
                                        Iterator it = ((Set) cqzx.this.z.b()).iterator();
                                        while (it.hasNext()) {
                                            ((bdnu) it.next()).d(messageCoreData);
                                        }
                                        return messageCoreData;
                                    }
                                }, cqzxVar2.c).i(new eroh() { // from class: cqyl
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj2) {
                                        final cqzx cqzxVar3 = cqzx.this;
                                        final MessageCoreData messageCoreData = (MessageCoreData) obj2;
                                        crme crmeVar4 = crmeVar3;
                                        final ParticipantsTable.BindData bindData4 = bindData3;
                                        elfl e3 = cqzxVar3.e(messageCoreData, crmeVar4, bindData4, awuiVar7, aztgVar);
                                        final bdhg bdhgVar4 = bdhgVar3;
                                        return e3.i(new eroh() { // from class: cqza
                                            @Override // defpackage.eroh
                                            public final ListenableFuture a(Object obj3) {
                                                return cqzx.this.g(messageCoreData, bdhgVar4, bindData4, (Optional) obj3);
                                            }
                                        }, cqzxVar3.c);
                                    }
                                }, cqzxVar2.c);
                            }
                            final MessageCoreData a5 = cqzwVar.a();
                            final elfl h = elfo.h(new erog() { // from class: cqyd
                                @Override // defpackage.erog
                                public final ListenableFuture a() {
                                    return cqzx.this.e(a5, crmeVar3, bindData3, awuiVar7, aztgVar);
                                }
                            }, cqzxVar2.c);
                            final crak crakVar = cqzxVar2.I;
                            ensz enszVar2 = (ensz) crak.a.h();
                            enszVar2.Y(csux.e, bdhgVar3.b);
                            ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/TelephonyInsertionFutureRepository", "addFutureForRcsMessage", 46, "TelephonyInsertionFutureRepository.java")).q("Adding Telephony insertion future to the repository.");
                            crakVar.b.put(bdhgVar3, h.h(new emwl() { // from class: craj
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    ensz enszVar3 = (ensz) crak.a.h();
                                    bdhg bdhgVar4 = bdhgVar3;
                                    enszVar3.Y(csux.e, bdhgVar4.b);
                                    ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/TelephonyInsertionFutureRepository", "addFutureForRcsMessage", 55, "TelephonyInsertionFutureRepository.java")).q("Processing of Telephony insertion finished. Removing from repository.");
                                    return null;
                                }
                            }, erpp.a));
                            return elfo.k(cqzxVar2.d(a5, cqxnVar2, fileTransferInformation3, z, eopqVar3).h(new emwl() { // from class: cqye
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    MessageCoreData messageCoreData = (MessageCoreData) obj2;
                                    Iterator it = ((Set) cqzx.this.z.b()).iterator();
                                    while (it.hasNext()) {
                                        ((bdnu) it.next()).d(messageCoreData);
                                    }
                                    return messageCoreData;
                                }
                            }, cqzxVar2.c), h).b(new erog() { // from class: cqyf
                                @Override // defpackage.erog
                                public final ListenableFuture a() {
                                    return cqzx.this.g(a5, bdhgVar3, bindData3, (Optional) erqt.q(h));
                                }
                            }, cqzxVar2.c);
                        }
                    }, cqzxVar.c);
                } catch (IllegalStateException unused) {
                    ensz enszVar = (ensz) cqzx.a.j();
                    enszVar.Y(csux.f, bdhgVar2);
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "processFileTransferPushMessageForValidParticipant", 677, "IncomingFileTransferProcessor.java")).q("Cannot process incoming FT message because the subscription was not found");
                    ((avkz) cqzxVar.M.b()).c(bdhgVar2, awuiVar4);
                    return elfo.e(avui.FAIL_RETRY);
                }
            }
        }, this.c);
    }

    public final elfl g(final MessageCoreData messageCoreData, final bdhg bdhgVar, final ParticipantsTable.BindData bindData, final Optional optional) {
        return elfo.h(new erog() { // from class: cqyi
            @Override // defpackage.erog
            public final ListenableFuture a() {
                if (optional.isEmpty()) {
                    bdhg bdhgVar2 = bdhgVar;
                    ensz enszVar = (ensz) cqzx.a.i();
                    enszVar.Y(csux.f, bdhgVar2);
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "scheduleFinishingActions", 906, "IncomingFileTransferProcessor.java")).q("Failed to store incoming file transfer push message in Telephony.");
                    return elfo.e(avui.FAIL_RETRY);
                }
                ParticipantsTable.BindData bindData2 = bindData;
                final MessageCoreData messageCoreData2 = messageCoreData;
                final cqzx cqzxVar = cqzx.this;
                final ConversationIdType z = messageCoreData2.z();
                elfl f = elfo.f(new Runnable() { // from class: cqyb
                    @Override // java.lang.Runnable
                    public final void run() {
                        cqzx.this.w.c(z, 3);
                    }
                }, cqzxVar.c);
                ((cukj) cqzxVar.p.b()).a(messageCoreData2, null, messageCoreData2.aa());
                return elfo.m(f, cqzxVar.u.d(messageCoreData2.B(), eooi.INCOMING_FILE_TRANSFER_PROCESSOR).q().i(new eroh() { // from class: cqyg
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return cqzx.this.v.b(3).q();
                    }
                }, cqzxVar.c), ((avln) cqzxVar.D.b()).a(((aolr) cqzxVar.A.b()).t(bindData2), messageCoreData2)).a(new Callable() { // from class: cqyh
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ensz enszVar2 = (ensz) cqzx.a.h();
                        MessageCoreData messageCoreData3 = MessageCoreData.this;
                        enszVar2.Y(csux.b, messageCoreData3.B());
                        enszVar2.Y(csux.f, messageCoreData3.E());
                        enszVar2.Y(csux.p, messageCoreData3.z());
                        ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "scheduleFinishingActionsForIncomingFileTransferPushMessage", 1011, "IncomingFileTransferProcessor.java")).q("Incoming file transfer push message successfully processed.");
                        return avui.SUCCESS;
                    }
                }, cqzxVar.c);
            }
        }, this.c).i(new eroh() { // from class: cqyt
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                String U;
                ParticipantsTable.BindData bindData2 = bindData;
                final avui avuiVar = (avui) obj;
                if (!bdqv.d(bindData2) || (U = bindData2.U()) == null) {
                    return elfo.e(avuiVar);
                }
                cqzx cqzxVar = cqzx.this;
                cero ceroVar = (cero) cerr.a.createBuilder();
                ceroVar.copyOnWrite();
                ((cerr) ceroVar.instance).b = U;
                ceroVar.copyOnWrite();
                ((cerr) ceroVar.instance).d = cerq.a(5);
                ceroVar.copyOnWrite();
                ((cerr) ceroVar.instance).c = cerp.a(3);
                cerr cerrVar = (cerr) ceroVar.build();
                cetp cetpVar = new cetp();
                cetpVar.a = U;
                cetpVar.b = U;
                return cqzxVar.C.a(cerrVar, cetpVar.a()).h(new emwl() { // from class: cqyj
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        entd entdVar = cqzx.a;
                        return avui.this;
                    }
                }, cqzxVar.c);
            }
        }, this.c);
    }
}
