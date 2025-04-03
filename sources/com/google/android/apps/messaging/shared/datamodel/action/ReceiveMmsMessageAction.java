package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import defpackage.axol;
import defpackage.bapj;
import defpackage.bapk;
import defpackage.bapv;
import defpackage.baqq;
import defpackage.bara;
import defpackage.barb;
import defpackage.bbcg;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.eogt;
import defpackage.ffhe;
import defpackage.ffsm;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ReceiveMmsMessageAction extends Action<MessageCoreData> implements Parcelable {
    public static final Parcelable.Creator<Action<MessageCoreData>> CREATOR = new bapj();
    private final barb a;

    /* compiled from: PG */
    public interface a {
        bapk ig();
    }

    public ReceiveMmsMessageAction(int i, byte[] bArr, long j, int i2, int i3, barb barbVar) {
        super(eogt.RECEIVE_MMS_MESSAGE_ACTION);
        this.a = barbVar;
        this.t.r("sub_id", i);
        this.t.q("push_data", bArr);
        this.t.s("message_logging_id", j);
        this.t.r("mcc_mnc", i2);
        this.t.r("carrier_id", i3);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("ReceiveMmsMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ReceiveMmsMessage.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final elfl e() {
        elfl c;
        bara a2 = this.a.a(this);
        bbcg bbcgVar = this.t;
        bbcgVar.getClass();
        c = axol.c(a2.H, ffhe.a, ffsm.a, new baqq(a2, bbcgVar, null));
        return c;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final elfl fS() {
        elfl c;
        bara a2 = this.a.a(this);
        bbcg bbcgVar = this.t;
        bbcgVar.getClass();
        c = axol.c(a2.H, ffhe.a, ffsm.a, new bapv(a2, bbcgVar, null));
        return c;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final boolean fV() {
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public ReceiveMmsMessageAction(Parcel parcel, barb barbVar) {
        super(parcel, eogt.RECEIVE_MMS_MESSAGE_ACTION);
        this.a = barbVar;
    }
}
