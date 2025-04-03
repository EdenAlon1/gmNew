package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cluu {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender");
    public final dtuu b;
    public final clws c;
    private final ctyx d;
    private final Context e;
    private final ffbr f;
    private final ffbr g;
    private final avkk h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private final errl r;

    public cluu(ctyx ctyxVar, Context context, ffbr ffbrVar, ffbr ffbrVar2, avkk avkkVar, dtuu dtuuVar, clws clwsVar, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, errl errlVar) {
        this.d = ctyxVar;
        this.e = context;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.h = avkkVar;
        this.b = dtuuVar;
        this.c = clwsVar;
        this.i = ffbrVar3;
        this.j = ffbrVar4;
        this.k = ffbrVar5;
        this.l = ffbrVar6;
        this.m = ffbrVar7;
        this.n = ffbrVar8;
        this.o = ffbrVar9;
        this.p = ffbrVar10;
        this.q = ffbrVar11;
        this.r = errlVar;
    }

    static final void e(MessageIdType messageIdType) {
        g().e(messageIdType);
    }

    private static awzn f(int i) {
        if (i == 1) {
            return awzn.DELIVERY;
        }
        if (i != 3) {
            if (i == 10) {
                return awzn.DISPLAYED;
            }
            throw new IllegalArgumentException(a.h(i, "Unsupported report type: "));
        }
        if (augy.a()) {
            return awzn.DELIVERY_FAILED;
        }
        if (!augq.a()) {
            throw new IllegalArgumentException(a.h(i, "Unsupported report type: "));
        }
        ((enrr) ((enrr) a.j()).h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "toReceiptType", 522, "RcsReportSender.java")).q("Unsupported negative delivery report as the flag is off");
        return awzn.UNKNOWN_RECEIPT_TYPE;
    }

    private static buxr g() {
        String[] strArr = MessagesTable.a;
        buxr buxrVar = new buxr();
        buxrVar.ap("getIncrementReportCounterUpdateBuilder");
        buxrVar.ag("report_attempt_acounter", dtzk.a(MessagesTable.c.U));
        return buxrVar;
    }

    private final clut h(final MessageCoreData messageCoreData, awui awuiVar, int i, bseh bsehVar, final int i2, eooi eooiVar) {
        awwf awwfVar;
        ((altk) this.g.b()).B(messageCoreData.E(), messageCoreData, i2, this.h.a(), eooiVar);
        if (!((autd) this.m.b()).a()) {
            try {
                coww cowwVar = (coww) this.j.b();
                int ordinal = ((cowx) axol.a(ffra.b(cowwVar.a, ekxi.a(ffhe.a), ffsm.a, new cowu(null, cowwVar, messageCoreData, i, i2))).get()).ordinal();
                if (ordinal == 0) {
                    return clut.SUCCEEDED;
                }
                if (ordinal == 1) {
                    return clut.FAILED;
                }
                if (ordinal == 2) {
                    return clut.SKIPPED;
                }
                throw new IllegalArgumentException("Unknown RcsMessageReceiptSenderWrapperResult");
            } catch (InterruptedException | ExecutionException e) {
                avkb avkbVar = new avkb("Failed to get the send message receipt future result.", e);
                axnw.d(avkbVar);
                throw avkbVar;
            }
        }
        if (awuiVar == null) {
            if (!messageCoreData.ae().isPresent() || ((aoku) messageCoreData.ae().get()).x()) {
                ParticipantsTable.BindData b = ((bdrr) this.o.b()).b(messageCoreData.J().W());
                b.getClass();
                avkc avkcVar = (avkc) this.n.b();
                String U = b.U();
                U.getClass();
                awuiVar = avkcVar.a(U, false);
            } else {
                awuiVar = (awui) ((aoku) messageCoreData.ae().get()).e().get();
            }
        }
        if (bsehVar == null) {
            bsehVar = bsom.b(messageCoreData.z());
        }
        bsehVar.getClass();
        if (byyr.d(bsehVar.k())) {
            String ad = bsehVar.ad();
            String ac = bsehVar.ac();
            if (ad == null || ac == null) {
                enrr enrrVar = (enrr) a.j();
                enrrVar.Y(csux.f, messageCoreData.E());
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportWithPipeline", 458, "RcsReportSender.java")).q("RCS group does not have valid global identifiers and we are using ChatAPI.");
                eqxh eqxhVar = (eqxh) eqxi.a.createBuilder();
                eqxj eqxjVar = (eqxj) eqxk.a.createBuilder();
                eqxjVar.copyOnWrite();
                eqxk eqxkVar = (eqxk) eqxjVar.instance;
                eqxkVar.e = 1;
                eqxkVar.b |= 4;
                eqww eqwwVar = eqww.CHAT_API_INVALID_REMOTE_PARTICIPANT;
                eqxjVar.copyOnWrite();
                eqxk eqxkVar2 = (eqxk) eqxjVar.instance;
                eqxkVar2.f = eqwwVar.C;
                eqxkVar2.b |= 8;
                eqxhVar.copyOnWrite();
                eqxi eqxiVar = (eqxi) eqxhVar.instance;
                eqxk eqxkVar3 = (eqxk) eqxjVar.build();
                eqxkVar3.getClass();
                eqxiVar.c = eqxkVar3;
                eqxiVar.b |= 1;
                ((altk) this.g.b()).D(messageCoreData.E(), messageCoreData, i2, (eqxi) eqxhVar.build(), this.h.a());
                return clut.FAILED;
            }
            awwfVar = ((avkf) this.l.b()).a(ad, ac);
        } else {
            awwfVar = null;
        }
        try {
            if (((augx) this.p.b()).a()) {
                return (clut) ((cjni) this.k.b()).b(messageCoreData, awuiVar, f(i2), awwfVar).h(new emwl() { // from class: clup
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return cluu.this.a(messageCoreData, i2, (ckdq) obj);
                    }
                }, this.r).get();
            }
            awzn f = f(i2);
            if (!((augp) this.q.b()).a() || f != awzn.UNKNOWN_RECEIPT_TYPE) {
                return (clut) ((cjni) this.k.b()).b(messageCoreData, awuiVar, f, awwfVar).h(new emwl() { // from class: cluq
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return cluu.this.a(messageCoreData, i2, (ckdq) obj);
                    }
                }, this.r).get();
            }
            enrr enrrVar2 = (enrr) a.j();
            enrrVar2.Y(csux.f, messageCoreData.E());
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportWithPipeline", 485, "RcsReportSender.java")).q("Not sending report for unknown receipt type");
            return clut.SUCCEEDED;
        } catch (InterruptedException | ExecutionException e2) {
            avkb avkbVar2 = new avkb("Failed to get the send message receipt future result.", e2);
            axnw.d(avkbVar2);
            throw avkbVar2;
        }
    }

    private final clut i(MessageCoreData messageCoreData, awui awuiVar, boolean z, int i, bseh bsehVar, eooi eooiVar) {
        ConversationIdType z2 = messageCoreData.z();
        MessageIdType B = messageCoreData.B();
        bdhg E = messageCoreData.E();
        byzg L = messageCoreData.L();
        if (L.equals(byzg.NOT_SENT)) {
            int i2 = 1;
            if (((augx) this.p.b()).a()) {
                if (messageCoreData.k() == 116) {
                    i2 = 3;
                }
            } else if (messageCoreData.k() == 116) {
                enrr enrrVar = (enrr) a.j();
                enrrVar.Y(csux.f, messageCoreData.E());
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "getDeliveryReportType", 389, "RcsReportSender.java")).q("Skip sending delivery report for unknown content type messages as the flag is off");
                i2 = 0;
            }
            int i3 = i2;
            if (i3 == 0) {
                enrr enrrVar2 = (enrr) a.e();
                enrrVar2.Y(csux.f, E);
                ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForMessageInternal", 305, "RcsReportSender.java")).q("Skip sending both delivery and display reports.");
                return clut.SUCCEEDED;
            }
            enru enruVar = a;
            enrr enrrVar3 = (enrr) enruVar.e();
            enrrVar3.Y(csux.f, E);
            ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForMessageInternal", 311, "RcsReportSender.java")).q("Try to send delivery report.");
            clut h = h(messageCoreData, awuiVar, i, bsehVar, i3, eooiVar);
            enrr enrrVar4 = (enrr) enruVar.h();
            enrrVar4.Y(csux.f, E);
            ((enrr) enrrVar4.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForMessageInternal", 318, "RcsReportSender.java")).t("Finished queuing delivery report. result: %s", h);
            if (!h.a()) {
                e(B);
                return h;
            }
            buxr g = g();
            g.ap("updateDeliveryReportStatusSent");
            g.x(byzg.SENT);
            ((bdmq) this.f.b()).Q(z2, B, g);
        } else if (L.equals(byzg.NOT_REQUESTED)) {
            enrr enrrVar5 = (enrr) a.h();
            enrrVar5.Y(csux.f, E);
            ((enrr) enrrVar5.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForMessageInternal", 334, "RcsReportSender.java")).q("Delivery report is not requested.");
        }
        byzg M = messageCoreData.M();
        Context context = this.e;
        ctyx ctyxVar = this.d;
        Resources resources = context.getResources();
        if (ctyxVar.q(resources.getString(R.string.send_seen_report_rcs_pref_key), resources.getBoolean(R.bool.send_seen_report_rcs_pref_default)) && !z && messageCoreData.cO() && M.equals(byzg.NOT_SENT)) {
            enru enruVar2 = a;
            enrr enrrVar6 = (enrr) enruVar2.e();
            enrrVar6.Y(csux.f, E);
            ((enrr) enrrVar6.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForMessageInternal", 345, "RcsReportSender.java")).q("Try to send display report.");
            clut h2 = h(messageCoreData, awuiVar, i, bsehVar, 10, eooiVar);
            enrr enrrVar7 = (enrr) enruVar2.h();
            enrrVar7.Y(csux.f, E);
            ((enrr) enrrVar7.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForMessageInternal", 357, "RcsReportSender.java")).t("Finished queuing display report. result: %s", h2);
            if (!h2.a()) {
                e(B);
                return h2;
            }
            buxr g2 = g();
            g2.ap("updateReadReportStatusSent");
            g2.y(byzg.SENT);
            ((bdmq) this.f.b()).Q(z2, B, g2);
        } else if (M.equals(byzg.NOT_REQUESTED)) {
            enrr enrrVar8 = (enrr) a.h();
            enrrVar8.Y(csux.f, E);
            ((enrr) enrrVar8.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForMessageInternal", 371, "RcsReportSender.java")).q("Read report is not requested.");
        }
        return clut.SUCCEEDED;
    }

    public final clut a(MessageCoreData messageCoreData, int i, ckdq ckdqVar) {
        if (ckdqVar.a) {
            return clut.SUCCEEDED;
        }
        ((altk) this.g.b()).D(messageCoreData.E(), messageCoreData, i, ckdqVar.b, ckdqVar.c);
        if (ckdqVar.b != null) {
            enrr enrrVar = (enrr) a.j();
            enrrVar.Y(csux.f, messageCoreData.E());
            enrr enrrVar2 = (enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "logSendRcsReportApiResult", 567, "RcsReportSender.java");
            eqxk eqxkVar = ckdqVar.b.c;
            if (eqxkVar == null) {
                eqxkVar = eqxk.a;
            }
            Integer valueOf = Integer.valueOf(eqxkVar.c);
            eqxk eqxkVar2 = ckdqVar.b.c;
            if (eqxkVar2 == null) {
                eqxkVar2 = eqxk.a;
            }
            int a2 = eqxc.a(eqxkVar2.d);
            if (a2 == 0) {
                a2 = 1;
            }
            Integer valueOf2 = Integer.valueOf(a2 - 1);
            eqxk eqxkVar3 = ckdqVar.b.c;
            if (eqxkVar3 == null) {
                eqxkVar3 = eqxk.a;
            }
            int a3 = eqxe.a(eqxkVar3.e);
            if (a3 == 0) {
                a3 = 1;
            }
            Integer valueOf3 = Integer.valueOf(a3 - 1);
            eqxk eqxkVar4 = ckdqVar.b.c;
            if (eqxkVar4 == null) {
                eqxkVar4 = eqxk.a;
            }
            eqww b = eqww.b(eqxkVar4.f);
            if (b == null) {
                b = eqww.CHAT_API_ERROR_CAUSE_UNKNOWN;
            }
            Integer valueOf4 = Integer.valueOf(b.C);
            eqxk eqxkVar5 = ckdqVar.b.c;
            if (eqxkVar5 == null) {
                eqxkVar5 = eqxk.a;
            }
            eqwy b2 = eqwy.b(eqxkVar5.g);
            if (b2 == null) {
                b2 = eqwy.CHAT_API_UNKNOWN;
            }
            Integer valueOf5 = Integer.valueOf(b2.f);
            eqxk eqxkVar6 = ckdqVar.b.c;
            if (eqxkVar6 == null) {
                eqxkVar6 = eqxk.a;
            }
            enrrVar2.M("Failed to send report: [JibeServiceResultCode:%s, ExceptionType:%s, PointOfFailure:%s, ChatApiSenderError:%s, ChatApiStatus:%s, ChatApiReceiverError:%s]", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, Integer.valueOf((eqwu.a(eqxkVar6.h) != 0 ? r9 : 1) - 1));
        } else {
            enrr enrrVar3 = (enrr) a.j();
            enrrVar3.Y(csux.f, messageCoreData.E());
            ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "logSendRcsReportApiResult", 581, "RcsReportSender.java")).q("Failed to send report: and no diagnostics");
        }
        return clut.FAILED;
    }

    public final void b(MessageCoreData messageCoreData, awui awuiVar, boolean z, eooi eooiVar) {
        ekzz f = eleg.f("SendReportAction#sendReportsForNewMessage");
        try {
            enru enruVar = a;
            enrr enrrVar = (enrr) enruVar.h();
            enrrVar.Y(csux.f, messageCoreData.E());
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForNewMessage", 207, "RcsReportSender.java")).q("Starting sending reports for new message");
            clut i = i(messageCoreData, awuiVar, false, true != z ? 0 : 2, null, eooiVar);
            enrr enrrVar2 = (enrr) enruVar.h();
            enrrVar2.Y(csux.f, messageCoreData.E());
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForNewMessage", 226, "RcsReportSender.java")).t("Finished queuing reports for new message. Result: %s", i);
            f.close();
        } finally {
        }
    }

    public final boolean c(eooi eooiVar) {
        ((enrr) ((enrr) a.e()).h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendAllUnsentReports", 148, "RcsReportSender.java")).q("Try to resend all unsent reports.");
        Set j = this.c.j();
        bskq[] bskqVarArr = bcyb.a;
        buxo d = MessagesTable.d();
        d.z("getAllUnsentMessagesQuery");
        d.k(bcyb.b);
        bcyb.a(j, d);
        bcyb.b(d);
        bsob e = bsom.e();
        e.c(bcyb.a);
        d.D(dtvz.i(e.b(), bsom.c.a, MessagesTable.c.b).g());
        return d(d.b().y(), eooiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(engw engwVar, eooi eooiVar) {
        boolean z = true;
        for (int i = 0; i < ((enou) engwVar).c; i++) {
            MessagesTable.BindData bindData = (MessagesTable.BindData) engwVar.get(i);
            bdhg G = bindData.G();
            Optional flatMap = Optional.ofNullable(bindData.X()).flatMap(new Function() { // from class: clus
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ParticipantsTable.h((String) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            if (flatMap.isEmpty()) {
                enrr enrrVar = (enrr) a.j();
                enrrVar.Y(csux.f, bindData.G());
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "getParticipantData", 826, "RcsReportSender.java")).q("Can't find sender.");
            }
            if (!flatMap.isEmpty()) {
                boolean Y = ((ParticipantsTable.BindData) flatMap.get()).Y();
                bseh[] bsehVarArr = (bseh[]) bindData.aG("conversations", new bseh[0]);
                if (bsehVarArr.length == 0) {
                    enrr enrrVar2 = (enrr) a.j();
                    enrrVar2.Y(csux.f, G);
                    ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForMessageListInternal", 250, "RcsReportSender.java")).q("Can't find conversation.");
                } else {
                    bseh bsehVar = bsehVarArr[0];
                    if (byyr.e(bsehVar.k())) {
                        enrr enrrVar3 = (enrr) a.j();
                        enrrVar3.Y(csux.f, G);
                        ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForMessageListInternal", 260, "RcsReportSender.java")).q("Unexpected conversation type");
                    } else {
                        MessageCoreData a2 = ((byzp) this.i.b()).a();
                        a2.aM(bindData);
                        clut i2 = i(a2, null, Y, bsehVar.k(), bsehVar, eooiVar);
                        z &= i2.a();
                        if (i2 == clut.FAILED) {
                            return z;
                        }
                    }
                }
            }
        }
        return z;
    }
}
