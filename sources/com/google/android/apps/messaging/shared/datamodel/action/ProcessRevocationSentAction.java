package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import defpackage.baoc;
import defpackage.baod;
import defpackage.bdhg;
import defpackage.bdmq;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.eogt;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ProcessRevocationSentAction extends Action<Void> {
    private final ffbr b;
    private static final cskc a = cskc.g("BugleDataModel", "ProcessRevocationSentAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new baoc();

    /* compiled from: PG */
    public interface a {
        baod id();
    }

    public ProcessRevocationSentAction(ffbr ffbrVar, Parcel parcel) {
        super(parcel, eogt.PROCESS_REVOCATION_SENT_ACTION);
        this.b = ffbrVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("ProcessRevocationSentAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        bdhg b = bdhg.b(this.t.f(), "rcs_message_id");
        MessageCoreData w = ((bdmq) this.b.b()).w(b);
        if (w == null) {
            csjb e = a.e();
            e.I("Revocation sent but message is missing.");
            e.A("rcsMessageId ", b);
            e.r();
            return null;
        }
        if (w.k() != 15) {
            csjb e2 = a.e();
            e2.I("Revocation sent, but message is not pending revocation.");
            e2.A("rcsMessageId", b);
            e2.y("status", w.k());
            e2.r();
            return null;
        }
        w.aZ(w.r());
        ((bdmq) this.b.b()).T(w);
        csjb c = a.c();
        c.I("Revocation sent for message");
        c.d(w.B());
        c.h(b);
        c.r();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessRevocationSent.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public ProcessRevocationSentAction(ffbr ffbrVar, bdhg bdhgVar) {
        super(eogt.PROCESS_REVOCATION_SENT_ACTION);
        if (bdhg.l(bdhgVar)) {
            bdhg.h(this.t.f(), "rcs_message_id", bdhgVar);
        }
        this.b = ffbrVar;
    }
}
