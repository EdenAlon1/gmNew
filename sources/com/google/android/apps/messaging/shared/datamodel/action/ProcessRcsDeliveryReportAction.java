package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;
import defpackage.banz;
import defpackage.baoa;
import defpackage.baob;
import defpackage.bbcg;
import defpackage.bdhg;
import defpackage.cldf;
import defpackage.cpex;
import defpackage.cskc;
import defpackage.ctzs;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.eogt;
import defpackage.eopq;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ProcessRcsDeliveryReportAction extends Action<Void> {
    private final baoa b;
    private static final cskc a = cskc.g("BugleDataModel", "ProcessRcsDeliveryReportAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new banz();

    /* compiled from: PG */
    public interface a {
        baob ic();
    }

    public ProcessRcsDeliveryReportAction(baoa baoaVar, Parcel parcel) {
        super(parcel, eogt.PROCESS_RCS_DELIVERY_REPORT_ACTION);
        this.b = baoaVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("ProcessRcsDeliveryReportAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessRcsDeliveryReport.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final elfl e() {
        a.p("Executing ProcessRcsDeliveryReportAction");
        ChatSessionMessageEvent chatSessionMessageEvent = (ChatSessionMessageEvent) this.t.h("chat_message_event");
        bbcg bbcgVar = this.t;
        return ((cldf) this.b.a.b()).a(chatSessionMessageEvent, bbcgVar.y("etouffee_report"), bdhg.a(bbcgVar.l("imdn_rcs_message_id")), ctzs.a(this.t.A("chat.extra.logData")));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ProcessRcsDeliveryReportAction(defpackage.baoa r8, com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent r9, java.lang.String r10) {
        /*
            r7 = this;
            eopq r0 = defpackage.eopq.a
            eyfq r0 = r0.createBuilder()
            eoop r0 = (defpackage.eoop) r0
            eqyl r1 = defpackage.eqyl.RCS_LEGACY
            r0.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r2 = r0.instance
            eopq r2 = (defpackage.eopq) r2
            int r1 = r1.h
            r2.aa = r1
            int r1 = r2.c
            r3 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 | r3
            r2.c = r1
            eyfy r0 = r0.build()
            r6 = r0
            eopq r6 = (defpackage.eopq) r6
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.ProcessRcsDeliveryReportAction.<init>(baoa, com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent, java.lang.String):void");
    }

    public ProcessRcsDeliveryReportAction(baoa baoaVar, ChatSessionMessageEvent chatSessionMessageEvent, String str, eopq eopqVar) {
        this(baoaVar, chatSessionMessageEvent, false, str, eopqVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ProcessRcsDeliveryReportAction(defpackage.baoa r8, com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent r9, boolean r10, java.lang.String r11) {
        /*
            r7 = this;
            eopq r0 = defpackage.eopq.a
            eyfq r0 = r0.createBuilder()
            eoop r0 = (defpackage.eoop) r0
            eqyl r1 = defpackage.eqyl.RCS_LEGACY
            r0.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r2 = r0.instance
            eopq r2 = (defpackage.eopq) r2
            int r1 = r1.h
            r2.aa = r1
            int r1 = r2.c
            r3 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 | r3
            r2.c = r1
            eyfy r0 = r0.build()
            r6 = r0
            eopq r6 = (defpackage.eopq) r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.ProcessRcsDeliveryReportAction.<init>(baoa, com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent, boolean, java.lang.String):void");
    }

    public ProcessRcsDeliveryReportAction(baoa baoaVar, ChatSessionMessageEvent chatSessionMessageEvent, boolean z, String str, eopq eopqVar) {
        super(eogt.PROCESS_RCS_DELIVERY_REPORT_ACTION);
        this.b = baoaVar;
        this.t.t("chat_message_event", chatSessionMessageEvent);
        this.t.p("etouffee_report", z);
        this.t.q("chat.extra.logData", eopqVar.toByteArray());
        if (((Boolean) cpex.d.e()).booleanValue()) {
            this.t.v("imdn_rcs_message_id", str);
        }
    }
}
