package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import defpackage.baxk;
import defpackage.bbcg;
import defpackage.bbgg;
import defpackage.bcyb;
import defpackage.bdgq;
import defpackage.bdhb;
import defpackage.bskq;
import defpackage.bsob;
import defpackage.bsom;
import defpackage.buxo;
import defpackage.cluu;
import defpackage.clws;
import defpackage.csix;
import defpackage.csux;
import defpackage.dtvz;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.emyl;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ensk;
import defpackage.ente;
import defpackage.eogt;
import defpackage.eooi;
import j$.util.function.Function$CC;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class SendReportAction extends Action<Void> implements Parcelable {
    private final bbgg e;
    private final clws f;
    private final cluu g;
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/datamodel/action/SendReportAction");
    static final long[] a = {TimeUnit.SECONDS.toMillis(1), TimeUnit.SECONDS.toMillis(5), TimeUnit.SECONDS.toMillis(10), TimeUnit.SECONDS.toMillis(20), TimeUnit.SECONDS.toMillis(40), TimeUnit.SECONDS.toMillis(80), TimeUnit.SECONDS.toMillis(160), TimeUnit.SECONDS.toMillis(320), TimeUnit.SECONDS.toMillis(640), TimeUnit.SECONDS.toMillis(1280)};
    private static long c = -1;
    private static final Object d = new Object();
    public static final Parcelable.Creator<Action<Void>> CREATOR = new baxk();

    /* compiled from: PG */
    public interface a {
        bbgg bu();
    }

    public SendReportAction(bbgg bbggVar, clws clwsVar, cluu cluuVar, Parcel parcel) {
        super(parcel, eogt.SEND_REPORT_ACTION);
        this.e = bbggVar;
        this.f = clwsVar;
        this.g = cluuVar;
    }

    static long h() {
        synchronized (d) {
            long[] jArr = a;
            int length = jArr.length;
            for (int i = 0; i < 10; i++) {
                long j = jArr[i];
                if (j > c) {
                    c = j;
                    return j;
                }
            }
            return c;
        }
    }

    public static void m() {
        synchronized (d) {
            c = -1L;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("SendReportAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        w();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.SendReport.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fR() {
        int i;
        if (this.f.j().isEmpty()) {
            ensk f = b.f();
            f.Y(ente.a, "BugleDataModel");
            ((enrr) ((enrr) f).h("com/google/android/apps/messaging/shared/datamodel/action/SendReportAction", "getPreconditionsResult", 150, "SendReportAction.java")).q("RCS is not enabled on any identity. Cannot send delivery reports.");
            this.e.e(eooi.ALL_IDENTITIES_READY_TO_SEND_AND_RECEIVE).y(EnergyProfile.EVCONNECTOR_TYPE_OTHER, h());
            i = 3;
        } else {
            i = 0;
        }
        Bundle bundle = new Bundle(1);
        bundle.putInt("result", i);
        if (i != 0) {
            return bundle;
        }
        bbcg bbcgVar = this.t;
        int a2 = bbcgVar.a("action_type");
        final eooi b2 = eooi.b(bbcgVar.b("bugle_message_source", eooi.UNKNOWN_BUGLE_MESSAGE_SOURCE.J));
        b2.getClass();
        ensk f2 = b.f();
        f2.Y(ente.a, "BugleDataModel");
        ((enrr) ((enrr) f2).h("com/google/android/apps/messaging/shared/datamodel/action/SendReportAction", "doBackgroundWork", 193, "SendReportAction.java")).r("Running SendReportAction with actionType %d", a2);
        if (a2 == 1) {
            final MessageIdType b3 = bdhb.b(this.t.l("message_id"));
            csix.k(!b3.c());
            final cluu cluuVar = this.g;
            ekzz f3 = eleg.f("SendReportAction#sendMessageReportInternal");
            try {
                enrr enrrVar = (enrr) cluu.a.e();
                enrrVar.Y(csux.b, b3);
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForMessage", 177, "RcsReportSender.java")).q("Try to send DELIVERY/DISPLAY report for message.");
                boolean booleanValue = ((Boolean) cluuVar.b.b(new emyl() { // from class: clur
                    @Override // defpackage.emyl
                    public final Object get() {
                        cluu cluuVar2 = cluu.this;
                        Set j = cluuVar2.c.j();
                        bskq[] bskqVarArr = bcyb.a;
                        buxo d2 = MessagesTable.d();
                        d2.z("getUnsentMessageQuery");
                        d2.k(bcyb.b);
                        final MessageIdType messageIdType = b3;
                        d2.h(new Function() { // from class: bcxw
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                buxz buxzVar = (buxz) obj;
                                bskq[] bskqVarArr2 = bcyb.a;
                                buxzVar.q(MessageIdType.this);
                                return buxzVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bcyb.a(j, d2);
                        bcyb.b(d2);
                        bsob e = bsom.e();
                        e.c(bcyb.a);
                        d2.D(dtvz.i(e.b(), bsom.c.a, MessagesTable.c.b).g());
                        return Boolean.valueOf(cluuVar2.d(d2.b().y(), b2));
                    }
                })).booleanValue();
                f3.close();
                k(booleanValue);
                return bundle;
            } catch (Throwable th) {
                try {
                    f3.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (a2 != 2) {
            if (a2 == 3) {
                m();
                k(this.g.c(b2));
                return bundle;
            }
            if (a2 != 4) {
                throw new IllegalArgumentException(defpackage.a.h(a2, "Unexpected action type: "));
            }
            l(this.g.c(b2), true);
            return bundle;
        }
        final ConversationIdType b4 = bdgq.b(this.t.l("conversation_id"));
        csix.k(!b4.b());
        cluu cluuVar2 = this.g;
        enrr enrrVar2 = (enrr) cluu.a.e();
        enrrVar2.Y(csux.p, b4);
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForConversation", 162, "RcsReportSender.java")).q("Try to send DELIVERY/DISPLAY reports for conversation.");
        Set j = cluuVar2.c.j();
        bskq[] bskqVarArr = bcyb.a;
        buxo d2 = MessagesTable.d();
        d2.z("getAllUnsentMessagesForConversationQuery");
        d2.k(bcyb.b);
        d2.h(new Function() { // from class: bcya
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                bskq[] bskqVarArr2 = bcyb.a;
                buxzVar.m(ConversationIdType.this);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bcyb.a(j, d2);
        bcyb.b(d2);
        bsob e = bsom.e();
        e.c(bcyb.a);
        d2.D(dtvz.i(e.b(), bsom.c.a, MessagesTable.c.b).g());
        k(cluuVar2.d(d2.b().y(), b2));
        return bundle;
    }

    public final void k(boolean z) {
        l(z, false);
    }

    public final void l(boolean z, boolean z2) {
        long j;
        if (z) {
            ensk e = b.e();
            e.Y(ente.a, "BugleDataModel");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/datamodel/action/SendReportAction", "handleResult", 236, "SendReportAction.java")).q("DELIVERY/DISPLAY report(s) successfully sent.");
            m();
            return;
        }
        if (!z2) {
            synchronized (d) {
                j = c;
            }
            if (j != -1) {
                return;
            }
        }
        this.e.e(eooi.REPORT_SEND_FAILURE).y(EnergyProfile.EVCONNECTOR_TYPE_OTHER, h());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public SendReportAction(bbgg bbggVar, clws clwsVar, cluu cluuVar, MessageIdType messageIdType, ConversationIdType conversationIdType, int i, eooi eooiVar) {
        super(eogt.SEND_REPORT_ACTION);
        this.e = bbggVar;
        this.f = clwsVar;
        this.g = cluuVar;
        this.t.r("bugle_message_source", eooiVar.J);
        if (i == 1) {
            this.t.r("action_type", 1);
            if (messageIdType.c()) {
                return;
            }
            this.t.v("message_id", messageIdType.b());
            return;
        }
        if (i == 2) {
            this.t.r("action_type", 2);
            if (conversationIdType.b()) {
                return;
            }
            this.t.v("conversation_id", conversationIdType.a());
            return;
        }
        if (i == 3) {
            this.t.r("action_type", 3);
        } else {
            if (i != 4) {
                return;
            }
            this.t.r("action_type", 4);
        }
    }
}
