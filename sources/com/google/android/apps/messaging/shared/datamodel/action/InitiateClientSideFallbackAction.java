package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.InitiateClientSideFallbackAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import defpackage.akzt;
import defpackage.altk;
import defpackage.aqgn;
import defpackage.bafv;
import defpackage.bafw;
import defpackage.bajq;
import defpackage.bbcg;
import defpackage.bdhb;
import defpackage.bdjs;
import defpackage.bdmq;
import defpackage.bdmr;
import defpackage.byyw;
import defpackage.ckds;
import defpackage.cqoh;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.csux;
import defpackage.cvlf;
import defpackage.dtuu;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.emyl;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ensk;
import defpackage.ente;
import defpackage.eogt;
import defpackage.eokl;
import defpackage.ffbr;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class InitiateClientSideFallbackAction extends Action<Boolean> {
    public final ffbr b;
    public final cqoh c;
    public final altk d;
    public final akzt e;
    public final ckds f;
    public final bdmr g;
    private final cvlf i;
    private final dtuu j;
    private static final enru h = enru.c("com/google/android/apps/messaging/shared/datamodel/action/InitiateClientSideFallbackAction");
    public static final cskc a = cskc.g("BugleAction", "InitiateClientSideFallbackAction");
    public static final Parcelable.Creator<Action<Boolean>> CREATOR = new bafv();

    /* compiled from: PG */
    public interface a {
        bafw hQ();
    }

    public InitiateClientSideFallbackAction(ffbr ffbrVar, cqoh cqohVar, altk altkVar, akzt akztVar, cvlf cvlfVar, ckds ckdsVar, dtuu dtuuVar, bdmr bdmrVar, Parcel parcel) {
        super(parcel, eogt.INITIATE_CLIENT_SIDE_FALLBACK_ACTION);
        this.b = ffbrVar;
        this.c = cqohVar;
        this.d = altkVar;
        this.e = akztVar;
        this.i = cvlfVar;
        this.f = ckdsVar;
        this.j = dtuuVar;
        this.g = bdmrVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("InitiateClientSideFallbackAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        byyw byywVar;
        final MessageIdType b = bdhb.b(this.t.l("message_id"));
        bbcg bbcgVar = this.t;
        final int a2 = bbcgVar.a("sub_id");
        eokl eoklVar = (eokl) Optional.ofNullable(eokl.b(bbcgVar.a("latch_change_reason"))).orElse(eokl.UNKNOWN_LATCH_REASON);
        if (eoklVar == eokl.UNKNOWN_LATCH_REASON) {
            ensk j = h.j();
            j.Y(ente.a, "BugleAction");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/action/InitiateClientSideFallbackAction", "getFallbackReason", 267, "InitiateClientSideFallbackAction.java")).q("Unknown latch reason");
            byywVar = byyw.UNKNOWN;
        } else {
            byywVar = eoklVar == eokl.EMERGENCY_RCS_PROTOCOL_DETERMINATION_MESSAGE_FAILED ? byyw.CFS_AUTO_FALLBACK_ON_EMERGENCY_PROTOCOL_DETERMINATION_MESSAGE : aqgn.a(eoklVar) ? byyw.CFS_MANUAL_FALLBACK_ON_NOT_DELIVERED : byyw.CFS_AUTO_FALLBACK_ON_OUTGOING_FAILURE;
        }
        final MessageCoreData v = ((bdmq) this.b.b()).v(b);
        if (v == null) {
            csjb e = a.e();
            e.d(b);
            e.I("doesn't exist, cant manually fallback.");
            e.r();
            return Boolean.FALSE;
        }
        if (!v.cX()) {
            ensk j2 = h.j();
            j2.Y(ente.a, "BugleAction");
            enrr enrrVar = (enrr) j2;
            enrrVar.Y(csux.b, b);
            enrrVar.Y(csux.f, v.E());
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/action/InitiateClientSideFallbackAction", "executeAction", 168, "InitiateClientSideFallbackAction.java")).q("Cannot fallback non-RCS message");
            return Boolean.FALSE;
        }
        if (bdjs.o(v.k())) {
            csjb a3 = a.a();
            a3.d(b);
            a3.I("message has been delivered, should not fallback");
            a3.r();
            return Boolean.FALSE;
        }
        final byyw byywVar2 = byywVar;
        if (!((Boolean) this.j.c("InitiateClientSideFallbackAction#executeAction", new emyl() { // from class: bafu
            @Override // defpackage.emyl
            public final Object get() {
                InitiateClientSideFallbackAction initiateClientSideFallbackAction = InitiateClientSideFallbackAction.this;
                bdmr bdmrVar = initiateClientSideFallbackAction.g;
                cqoh cqohVar = initiateClientSideFallbackAction.c;
                MessageCoreData messageCoreData = v;
                int i = a2;
                if (!initiateClientSideFallbackAction.f.N(messageCoreData, bdmrVar.a(messageCoreData, i), i, cqohVar.f().toEpochMilli())) {
                    return Boolean.FALSE;
                }
                byyw byywVar3 = byywVar2;
                MessageIdType messageIdType = b;
                csjb a4 = InitiateClientSideFallbackAction.a.a();
                a4.d(messageIdType);
                a4.A("fallback reason", byywVar3);
                a4.r();
                bdmq bdmqVar = (bdmq) initiateClientSideFallbackAction.b.b();
                ConversationIdType z = messageCoreData.z();
                String[] strArr = MessagesTable.a;
                buxr buxrVar = new buxr();
                buxrVar.ap("InitiateClientSideFallbackAction#executeAction");
                int intValue = MessagesTable.g().intValue();
                int intValue2 = MessagesTable.g().intValue();
                if (intValue2 < 58710) {
                    dtub.w("fallback_reason", intValue2);
                }
                if (intValue >= 58710) {
                    if (byywVar3 == null) {
                        buxrVar.a.putNull("fallback_reason");
                    } else {
                        buxrVar.a.put("fallback_reason", Integer.valueOf(byywVar3.ordinal()));
                    }
                }
                bdmqVar.U(z, messageIdType, buxrVar);
                if (byyw.CFS_MANUAL_FALLBACK_ON_NOT_DELIVERED.equals(byywVar3)) {
                    ((MessageData) messageCoreData).k.q();
                    initiateClientSideFallbackAction.e.c("Bugle.Rcs.Chat.Message.Fallback.Manual.Counts");
                }
                ((MessageData) messageCoreData).k.t();
                initiateClientSideFallbackAction.d.ag(messageCoreData);
                return Boolean.TRUE;
            }
        })).booleanValue()) {
            return Boolean.FALSE;
        }
        bajq.d(7, this);
        this.i.b(v.z(), eoklVar);
        return Boolean.TRUE;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.InitiateClientSideFallback.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public InitiateClientSideFallbackAction(ffbr ffbrVar, cqoh cqohVar, altk altkVar, akzt akztVar, cvlf cvlfVar, ckds ckdsVar, dtuu dtuuVar, bdmr bdmrVar, MessageIdType messageIdType, int i, eokl eoklVar) {
        super(eogt.INITIATE_CLIENT_SIDE_FALLBACK_ACTION);
        this.b = ffbrVar;
        this.c = cqohVar;
        this.d = altkVar;
        this.e = akztVar;
        this.i = cvlfVar;
        this.f = ckdsVar;
        this.j = dtuuVar;
        this.g = bdmrVar;
        this.t.v("message_id", messageIdType.b());
        this.t.r("sub_id", i);
        this.t.r("latch_change_reason", eoklVar.k);
    }
}
