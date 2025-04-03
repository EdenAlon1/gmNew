package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.ContentUris;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessDeliveryReportAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.altk;
import defpackage.bakr;
import defpackage.baks;
import defpackage.coxk;
import defpackage.cqoh;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.dtuu;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.eogt;
import defpackage.ffbr;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ProcessDeliveryReportAction extends Action<Void> implements Parcelable {
    public final ffbr a;
    public final cqoh b;
    public final altk c;
    private final coxk e;
    private final dtuu f;
    private static final cskc d = cskc.g("BugleDataModel", "ProcessDeliveryReportAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new bakr();

    /* compiled from: PG */
    public interface a {
        baks hX();
    }

    public ProcessDeliveryReportAction(ffbr ffbrVar, cqoh cqohVar, coxk coxkVar, altk altkVar, dtuu dtuuVar, Uri uri, int i) {
        super(eogt.PROCESS_DELIVERY_REPORT_ACTION);
        this.a = ffbrVar;
        this.b = cqohVar;
        this.e = coxkVar;
        this.c = altkVar;
        this.f = dtuuVar;
        this.t.t(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
        this.t.r("status", i);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("ProcessDeliveryReportAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        ekzz f = eleg.f("ProcessDeliveryReportAction.executeAction");
        try {
            final Uri uri = (Uri) this.t.h(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
            final int a2 = this.t.a("status");
            if (ContentUris.parseId(uri) < 0) {
                csjb b = d.b();
                b.I("can't find message.");
                b.A("smsMessageUri", uri);
                b.r();
            } else {
                final long epochMilli = this.b.f().toEpochMilli();
                this.e.R(uri, a2, epochMilli);
                this.f.d("ProcessDeliveryReportAction.executeAction", new Runnable() { // from class: bakq
                    @Override // java.lang.Runnable
                    public final void run() {
                        cskc cskcVar = cpdg.a;
                        ProcessDeliveryReportAction processDeliveryReportAction = ProcessDeliveryReportAction.this;
                        bdmq bdmqVar = (bdmq) processDeliveryReportAction.a.b();
                        Uri uri2 = uri;
                        MessageCoreData y = bdmqVar.y(uri2);
                        if (y != null) {
                            int i = a2;
                            long j = epochMilli;
                            csix.k(uri2.equals(y.u()));
                            bdmq bdmqVar2 = (bdmq) processDeliveryReportAction.a.b();
                            ConversationIdType z = y.z();
                            MessageIdType B = y.B();
                            String[] strArr = MessagesTable.a;
                            buxr buxrVar = new buxr();
                            buxrVar.ap("ProcessDeliveryReportAction#executeAction");
                            buxrVar.U(cpdg.b(true, 2, i));
                            buxrVar.O(j);
                            bdmqVar2.Q(z, B, buxrVar);
                            cqoh cqohVar = processDeliveryReportAction.b;
                            processDeliveryReportAction.c.aq(y, Optional.empty(), eqyl.NOT_RCS, akzn.a(cqohVar));
                        }
                    }
                });
            }
            f.close();
            return null;
        } catch (Throwable th) {
            try {
                f.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessDeliveryReport.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public ProcessDeliveryReportAction(ffbr ffbrVar, cqoh cqohVar, coxk coxkVar, altk altkVar, dtuu dtuuVar, Parcel parcel) {
        super(parcel, eogt.PROCESS_DELIVERY_REPORT_ACTION);
        this.a = ffbrVar;
        this.b = cqohVar;
        this.e = coxkVar;
        this.c = altkVar;
        this.f = dtuuVar;
    }
}
