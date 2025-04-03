package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.HandleReceiptResult;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import com.google.communication.synapse.security.scytale.PrekeyBundle;
import com.google.communication.synapse.security.scytale.ReceiptError;
import com.google.communication.synapse.security.scytale.ReceiptInfo;
import com.google.communication.synapse.security.scytale.RecreateFtdSessionResult;
import com.google.communication.synapse.security.scytale.Scope;
import com.google.communication.synapse.security.scytale.UserDevice;
import com.google.communication.synapse.security.scytale.UserDevices;
import com.google.media.webrtc.common.StatusOr;
import io.grpc.Status;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cabh extends ceut {
    private final Context a;
    private final caax b;
    private final ffbr c;
    private final cins d;
    private final ffbr e;

    public cabh(Context context, caax caaxVar, ffbr ffbrVar, cins cinsVar, ffbr ffbrVar2) {
        this.a = context;
        this.b = caaxVar;
        this.c = ffbrVar;
        this.d = cinsVar;
        this.e = ffbrVar2;
    }

    private final awui k(String str) {
        cfva cfvaVar = aoqm.a;
        if (((Boolean) new aopf().get()).booleanValue()) {
            return ((avkc) this.e.b()).a(str, false);
        }
        return null;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.c(5);
        l.f(poa.LINEAR);
        l.g(60000L);
        l.b(cevc.FOREGROUND_SERVICE);
        ((ceti) l).b = this.d.c(this.a.getString(R.string.ftd_handler_notification_text));
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("FtdHandlerWorkItem");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return ezgq.a.getParserForType();
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        ezgq ezgqVar = (ezgq) eyhsVar;
        if (bzwf.e()) {
            final cabg cabgVar = (cabg) this.c.b();
            faym faymVar = ezgqVar.c;
            if (faymVar == null) {
                faymVar = faym.a;
            }
            final awui k = k(ezgqVar.d);
            final awui k2 = k(ezgqVar.e);
            final String str = ezgqVar.d;
            final String str2 = ezgqVar.e;
            final String str3 = faymVar.d;
            try {
                final ReceiptInfo a = cady.a(faymVar.c);
                csjb c = cabg.a.c();
                c.I("Received SIGNAL_FTD");
                c.A("remoteRegistrationId", cskt.b(str3));
                c.A("rcsMessageId", a.getMessageId());
                c.A("reason", a.getError());
                c.r();
                if (bzwf.g() && a.getError() == ReceiptError.OTK_NOT_TARGETED_TO_ME) {
                    cabg.a.p("FTD is due to OTK not meant for me. Ignore it.");
                    ((akzt) cabgVar.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 19);
                    return elfo.e(ceyt.i());
                }
                cabgVar.n.b();
                final Scope create = Scope.create(cabgVar.e.b());
                return ((bzvx) cabgVar.d.b()).b(cabg.a(k, str)).i(new eroh() { // from class: cabb
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        elfl h;
                        awui awuiVar = k;
                        final cabg cabgVar2 = cabg.this;
                        cafn cafnVar = cabgVar2.c;
                        String str4 = str;
                        final NativeMessageEncryptorV2 nativeMessageEncryptorV2 = (NativeMessageEncryptorV2) obj;
                        final Instant f = cabgVar2.f.f();
                        cafm a2 = cafnVar.a(cabg.a(awuiVar, str4));
                        final awui awuiVar2 = k2;
                        final String str5 = str2;
                        String a3 = cabg.a(awuiVar2, str5);
                        final String str6 = str3;
                        UserDevice userDevice = new UserDevice(a3, str6);
                        final Scope scope = create;
                        final ReceiptInfo receiptInfo = a;
                        if (((HandleReceiptResult) cafo.a(nativeMessageEncryptorV2.handleReceiptV2(scope, userDevice, receiptInfo))).getReceiptIsVerifiedFtd()) {
                            h = elfl.g(a2.c(enkr.c(new UserDevices(cabg.a(awuiVar2, str5), enkr.c(str6))))).h(new emwl() { // from class: caba
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    return new bzvc(!((RecreateFtdSessionResult) cafo.a(NativeMessageEncryptorV2.this.recreateFtdSession(scope, r4, receiptInfo))).getCanReencryptMessageId().isEmpty(), Optional.of(eyee.x(((PrekeyBundle) enjk.l((Iterable) cafo.a((StatusOr) obj2))).getIdentityKey())));
                                }
                            }, cabgVar2.k);
                        } else {
                            ((akzt) cabgVar2.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 18);
                            h = elfo.d(new fedn(Status.g.withDescription("getReceiptIsVerifiedFtd is false for an FTD, it was likely not sent by us. Ignoring FTD as invalid.")));
                        }
                        return h.h(new emwl() { // from class: cabe
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                cabf cabfVar = (cabf) obj2;
                                if (!cabfVar.b()) {
                                    cabg.a.r("SIGNAL_FTD FTD was processed but was not successful.");
                                    return ceyt.i();
                                }
                                final String str7 = str6;
                                final String str8 = str5;
                                final awui awuiVar3 = awuiVar2;
                                final cabg cabgVar3 = cabg.this;
                                if (cabfVar.a().isEmpty()) {
                                    csjb e = cabg.a.e();
                                    e.I("FTD handler did not provide a new identity. It's an FTD from an existing identity.");
                                    e.A("remoteUserId", cskt.b(cabg.a(awuiVar3, str8)));
                                    e.A("remoteRegistrationId", cskt.b(str7));
                                    e.r();
                                } else {
                                    cabgVar3.j.d(awuiVar3, str8, str7, (eyee) cabfVar.a().get(), f);
                                }
                                bdhg a4 = bdhg.a(receiptInfo.getMessageId());
                                final MessageCoreData w = ((bdmq) cabgVar3.i.b()).w(a4);
                                if (w == null) {
                                    csjb e2 = cabg.a.e();
                                    e2.I("Message not found");
                                    e2.h(a4);
                                    e2.r();
                                    ((akzt) cabgVar3.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 14);
                                } else {
                                    cabgVar3.m.d("copyMessageAsANewHiddenOne", new Runnable() { // from class: caaz
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            final MessageCoreData messageCoreData = w;
                                            MessagesTable.BindData b = MessagesTable.b(messageCoreData.B());
                                            cabg cabgVar4 = cabg.this;
                                            if (b == null) {
                                                ((akzt) cabgVar4.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 14);
                                                csjb e3 = cabg.a.e();
                                                e3.I("Message did not exist. FTD can't be handled.");
                                                e3.h(messageCoreData.E());
                                                e3.r();
                                                return;
                                            }
                                            bcyk a5 = ((azwh) cabgVar4.g.b()).a(messageCoreData.z());
                                            if (a5 == null) {
                                                ((akzt) cabgVar4.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 15);
                                                csjb e4 = cabg.a.e();
                                                e4.I("Conversation does not exist. FTD can't be handled.");
                                                e4.h(messageCoreData.E());
                                                e4.c(messageCoreData.z());
                                                e4.r();
                                                return;
                                            }
                                            if (cabgVar4.f.f().toEpochMilli() - b.x() >= ((Long) bzqa.c.e()).longValue()) {
                                                ((akzt) cabgVar4.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 20);
                                                ensk j = cabg.b.j();
                                                j.Y(ente.a, "BugleEtouffee");
                                                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/FtdHandlerV2", "copyMessageAsANewHiddenOne", 441, "FtdHandlerV2.java")).D("FTD ignored because the original message is old. RCS messageId: %s, conversationId: %s", messageCoreData.E().f(), messageCoreData.z().a());
                                                return;
                                            }
                                            buoy I = b.I();
                                            if (a5.L() == 2) {
                                                String str9 = str8;
                                                awui awuiVar4 = awuiVar3;
                                                ffbr ffbrVar = cabgVar4.h;
                                                String a6 = cabg.a(awuiVar4, str9);
                                                String m = ((bdrr) ffbrVar.b()).m(a6);
                                                if (TextUtils.isEmpty(m)) {
                                                    csjb e5 = cabg.a.e();
                                                    e5.I("Participant is missing for a message.");
                                                    e5.h(messageCoreData.E());
                                                    e5.c(messageCoreData.z());
                                                    e5.M("remoteUserIdFtdSender", a6);
                                                    e5.r();
                                                    return;
                                                }
                                                I.u(m);
                                                if (bzwf.e()) {
                                                    bdhg E = messageCoreData.E();
                                                    csjb c2 = cahm.a.c();
                                                    c2.I("Add custom headers");
                                                    c2.h(E);
                                                    c2.r();
                                                    if (!E.i()) {
                                                        String str10 = str7;
                                                        clbi a7 = clbi.a();
                                                        a7.d(clbg.ETOUFFEE_NAMESPACE, "recipient", a6);
                                                        a7.d(clbg.ETOUFFEE_NAMESPACE, "registration", str10);
                                                        if (I.R.i()) {
                                                            cahm.a.m("Set original RCS message Id");
                                                            I.L(E);
                                                        }
                                                        if (!I.R.equals(messageCoreData.D())) {
                                                            throw new IllegalStateException("RCS message Ids do not match.");
                                                        }
                                                        I.q(a7.c());
                                                    }
                                                } else {
                                                    cabg.a.p("Does not add custom headers.");
                                                }
                                            }
                                            I.j(null);
                                            I.i(null);
                                            I.r(Optional.empty());
                                            I.ad(bdgr.a);
                                            I.x(Optional.of(UUID.randomUUID()));
                                            I.U(cabgVar4.p.a());
                                            I.ao(4);
                                            I.T(-1L);
                                            I.w(true);
                                            I.af(messageCoreData.q() + 1);
                                            I.J(messageCoreData.C().c() ? messageCoreData.B() : messageCoreData.C());
                                            I.ac(cabgVar4.f.f().toEpochMilli());
                                            MessagesTable.BindData c3 = I.c();
                                            bwdf c4 = PartsTable.c();
                                            c4.z("copyMessageAsANewHiddenOne-parts");
                                            c4.h(new Function() { // from class: caay
                                                @Override // java.util.function.Function
                                                /* renamed from: andThen */
                                                public final /* synthetic */ Function mo448andThen(Function function) {
                                                    return Function$CC.$default$andThen(this, function);
                                                }

                                                @Override // java.util.function.Function
                                                public final Object apply(Object obj3) {
                                                    bwdm bwdmVar = (bwdm) obj3;
                                                    bwdmVar.n(MessageCoreData.this.B());
                                                    return bwdmVar;
                                                }

                                                public final /* synthetic */ Function compose(Function function) {
                                                    return Function$CC.$default$compose(this, function);
                                                }
                                            });
                                            bwav bwavVar = (bwav) c4.b().o();
                                            while (bwavVar.moveToNext()) {
                                                try {
                                                    bvwp x = ((PartsTable.BindData) bwavVar.cO()).x();
                                                    x.J(c3.D());
                                                    x.d();
                                                } catch (Throwable th) {
                                                    try {
                                                        bwavVar.close();
                                                    } catch (Throwable th2) {
                                                        th.addSuppressed(th2);
                                                    }
                                                    throw th;
                                                }
                                            }
                                            bwavVar.close();
                                        }
                                    });
                                    ((akzt) cabgVar3.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 3);
                                    cabgVar3.l.a().A();
                                }
                                return ceyt.i();
                            }
                        }, cabgVar2.k);
                    }
                }, cabgVar.k).e(fedn.class, new emwl() { // from class: cabc
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        fedn fednVar = (fedn) obj;
                        cabg.a.s("Failed to process SIGNAL_FAILURE: ProcessDeliverReceipt failed.", fednVar);
                        ((akzt) cabg.this.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 17);
                        Status status = fednVar.a;
                        if (status != null) {
                            Status.Code code = Status.Code.OK;
                            int ordinal = status.getCode().ordinal();
                            if (ordinal == 1 || ordinal == 4 || ordinal == 8 || ordinal == 10 || ordinal == 13 || ordinal == 14) {
                                return ceyt.m();
                            }
                        }
                        return ceyt.k();
                    }
                }, erpp.a).e(cagb.class, new emwl() { // from class: cabd
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        cabg.a.r("Skipped processing an FTD because Etouffee is not provisioned.");
                        ((akzt) cabg.this.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 13);
                        return ceyt.k();
                    }
                }, erpp.a);
            } catch (eygu e) {
                ((akzt) cabgVar.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 12);
                csjb e2 = cabg.a.e();
                e2.I("Received SIGNAL_FTD, Error while processing proto.");
                e2.M("remoteRegistrationId", str3);
                e2.s(e);
                return elfo.e(ceyt.k());
            }
        }
        final caax caaxVar = this.b;
        faym faymVar2 = ezgqVar.c;
        if (faymVar2 == null) {
            faymVar2 = faym.a;
        }
        awui k3 = k(ezgqVar.d);
        final awui k4 = k(ezgqVar.e);
        String str4 = ezgqVar.d;
        final String str5 = ezgqVar.e;
        final String str6 = faymVar2.d;
        try {
            final ReceiptInfo a2 = cady.a(faymVar2.c);
            csjb c2 = caax.a.c();
            c2.I("Received SIGNAL_FTD");
            c2.A("remoteRegistrationId", cskt.b(str6));
            c2.A("rcsMessageId", a2.getMessageId());
            c2.r();
            if (bzwf.g() && a2.getError() == ReceiptError.OTK_NOT_TARGETED_TO_ME) {
                caax.a.p("FTD is due to OTK not meant for me. Ignore it.");
                return elfo.e(ceyt.i());
            }
            cqoh cqohVar = caaxVar.f;
            cafn cafnVar = caaxVar.c;
            final Instant f = cqohVar.f();
            final cafm a3 = cafnVar.a(caax.a(k3, str4));
            caaxVar.n.b();
            final Scope create2 = Scope.create(caaxVar.e.b());
            final elfl b = ((bzvx) caaxVar.d.b()).b(caax.a(k3, str4));
            final elfl i = b.i(new eroh() { // from class: caau
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    awui awuiVar = k4;
                    String str7 = str5;
                    String a4 = caax.a(awuiVar, str7);
                    String str8 = str6;
                    if (((HandleReceiptResult) cafo.a(((NativeMessageEncryptorV2) obj).handleReceipt(create2, new UserDevice(a4, str8), a2))).getReceiptIsVerifiedFtd()) {
                        return a3.c(enkr.c(new UserDevices(caax.a(awuiVar, str7), enkr.c(str8))));
                    }
                    ((akzt) caax.this.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 18);
                    return elfo.d(new fedn(Status.g.withDescription("getReceiptIsVerifiedFtd is false for an FTD, it was likely not sent by us. Ignoring FTD as invalid.")));
                }
            }, caaxVar.k);
            return elfo.m(i, b).a(new Callable() { // from class: caav
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    NativeMessageEncryptorV2 nativeMessageEncryptorV2 = (NativeMessageEncryptorV2) erqt.q(elfl.this);
                    return new bzvd(!((RecreateFtdSessionResult) cafo.a(nativeMessageEncryptorV2.recreateFtdSession(create2, r1, a2))).getCanReencryptMessageId().isEmpty(), Optional.of(eyee.x(((PrekeyBundle) enjk.l((Iterable) cafo.a((StatusOr) erqt.q(i)))).getIdentityKey())));
                }
            }, caaxVar.k).h(new emwl() { // from class: caar
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    caaw caawVar = (caaw) obj;
                    if (!caawVar.b()) {
                        caax.a.r("SIGNAL_FTD FTD was processed but was not successful.");
                        return ceyt.i();
                    }
                    String str7 = str6;
                    final String str8 = str5;
                    final awui awuiVar = k4;
                    final caax caaxVar2 = caax.this;
                    if (caawVar.a().isEmpty()) {
                        csjb e3 = caax.a.e();
                        e3.I("FTD handler did not provide a new identity. It's an FTD from an existing identity.");
                        e3.A("remoteUserId", cskt.b(caax.a(awuiVar, str8)));
                        e3.A("remoteRegistrationId", cskt.b(str7));
                        e3.r();
                    } else {
                        caaxVar2.j.d(awuiVar, str8, str7, (eyee) caawVar.a().get(), f);
                    }
                    bdhg a4 = bdhg.a(a2.getMessageId());
                    final MessageCoreData w = ((bdmq) caaxVar2.i.b()).w(a4);
                    if (w == null) {
                        csjb e4 = caax.a.e();
                        e4.I("Message not found");
                        e4.h(a4);
                        e4.r();
                        ((akzt) caaxVar2.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 14);
                    } else {
                        caaxVar2.m.d("copyMessageAsANewHiddenOne", new Runnable() { // from class: caaq
                            @Override // java.lang.Runnable
                            public final void run() {
                                final MessageCoreData messageCoreData = w;
                                MessagesTable.BindData b2 = MessagesTable.b(messageCoreData.B());
                                caax caaxVar3 = caax.this;
                                if (b2 == null) {
                                    ((akzt) caaxVar3.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 14);
                                    csjb e5 = caax.a.e();
                                    e5.I("Message did not exist. FTD can't be handled.");
                                    e5.h(messageCoreData.E());
                                    e5.r();
                                    return;
                                }
                                bcyk a5 = ((azwh) caaxVar3.g.b()).a(messageCoreData.z());
                                if (a5 == null) {
                                    ((akzt) caaxVar3.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 15);
                                    csjb e6 = caax.a.e();
                                    e6.I("Conversation does not exist. FTD can't be handled.");
                                    e6.h(messageCoreData.E());
                                    e6.c(messageCoreData.z());
                                    e6.r();
                                    return;
                                }
                                if (caaxVar3.f.f().toEpochMilli() - b2.x() >= ((Long) bzqa.c.e()).longValue()) {
                                    ((akzt) caaxVar3.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 20);
                                    ensk j = caax.b.j();
                                    j.Y(ente.a, "BugleEtouffee");
                                    ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/FtdHandler", "copyMessageAsANewHiddenOne", 415, "FtdHandler.java")).D("FTD ignored because the original message is old. RCS messageId: %s, conversationId: %s", messageCoreData.E().f(), messageCoreData.z().a());
                                    return;
                                }
                                buoy I = b2.I();
                                if (a5.L() == 2) {
                                    String str9 = str8;
                                    awui awuiVar2 = awuiVar;
                                    ffbr ffbrVar = caaxVar3.h;
                                    String a6 = caax.a(awuiVar2, str9);
                                    String m = ((bdrr) ffbrVar.b()).m(a6);
                                    if (TextUtils.isEmpty(m)) {
                                        csjb e7 = caax.a.e();
                                        e7.I("Participant is missing for a message.");
                                        e7.h(messageCoreData.E());
                                        e7.c(messageCoreData.z());
                                        e7.M("remoteUserIdFtdSender", a6);
                                        e7.r();
                                        return;
                                    }
                                    I.u(m);
                                    if (bzwf.d()) {
                                        bdhg E = messageCoreData.E();
                                        csjb c3 = cahm.a.c();
                                        c3.I("Add custom headers");
                                        c3.h(E);
                                        c3.r();
                                        if (!E.i()) {
                                            String str10 = E.b;
                                            clbi a7 = clbi.a();
                                            clbg clbgVar = clbg.ETOUFFEE_NAMESPACE;
                                            str10.getClass();
                                            a7.d(clbgVar, "original-message-id", str10);
                                            a7.d(clbg.ETOUFFEE_NAMESPACE, "recipient", a6);
                                            I.q(a7.c());
                                        }
                                    } else {
                                        caax.a.p("Does not add custom headers.");
                                    }
                                }
                                I.j(null);
                                I.i(null);
                                I.r(Optional.empty());
                                I.ad(bdgr.a);
                                I.x(Optional.of(UUID.randomUUID()));
                                I.U(caaxVar3.p.a());
                                I.ao(4);
                                I.T(-1L);
                                I.w(true);
                                I.af(messageCoreData.q() + 1);
                                I.J(messageCoreData.C().c() ? messageCoreData.B() : messageCoreData.C());
                                I.ac(caaxVar3.f.f().toEpochMilli());
                                MessagesTable.BindData c4 = I.c();
                                bwdf c5 = PartsTable.c();
                                c5.z("copyMessageAsANewHiddenOne");
                                c5.h(new Function() { // from class: caap
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        bwdm bwdmVar = (bwdm) obj2;
                                        bwdmVar.n(MessageCoreData.this.B());
                                        return bwdmVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                bwav bwavVar = (bwav) c5.b().o();
                                while (bwavVar.moveToNext()) {
                                    try {
                                        bvwp x = ((PartsTable.BindData) bwavVar.cO()).x();
                                        x.J(c4.D());
                                        x.b(new Supplier() { // from class: bvwm
                                            @Override // java.util.function.Supplier
                                            public final Object get() {
                                                return new bvwl();
                                            }
                                        }).A();
                                    } catch (Throwable th) {
                                        try {
                                            bwavVar.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                }
                                bwavVar.close();
                            }
                        });
                        ((akzt) caaxVar2.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 3);
                        caaxVar2.l.a().A();
                    }
                    return ceyt.i();
                }
            }, caaxVar.k).e(fedn.class, new emwl() { // from class: caas
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    fedn fednVar = (fedn) obj;
                    caax.a.s("Failed to process SIGNAL_FAILURE: ProcessDeliverReceipt failed.", fednVar);
                    ((akzt) caax.this.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 17);
                    Status status = fednVar.a;
                    if (status != null) {
                        Status.Code code = Status.Code.OK;
                        int ordinal = status.getCode().ordinal();
                        if (ordinal == 1 || ordinal == 4 || ordinal == 8 || ordinal == 10 || ordinal == 13 || ordinal == 14) {
                            return ceyt.m();
                        }
                    }
                    return ceyt.k();
                }
            }, erpp.a).e(cagb.class, new emwl() { // from class: caat
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    caax.a.r("Skipped processing an FTD because Etouffee is not provisioned.");
                    ((akzt) caax.this.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 13);
                    return ceyt.k();
                }
            }, erpp.a);
        } catch (eygu e3) {
            ((akzt) caaxVar.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 12);
            csjb e4 = caax.a.e();
            e4.I("Received SIGNAL_FTD, Error while processing proto.");
            e4.M("remoteRegistrationId", str6);
            e4.s(e3);
            return elfo.e(ceyt.k());
        }
    }
}
