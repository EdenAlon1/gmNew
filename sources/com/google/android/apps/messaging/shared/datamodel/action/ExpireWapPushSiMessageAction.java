package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.badu;
import defpackage.badw;
import defpackage.badx;
import defpackage.cqoh;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.eogt;
import java.text.SimpleDateFormat;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ExpireWapPushSiMessageAction extends Action<Void> {
    private final cqoh b;
    private final badw c;
    private final badx d;
    public static final cskc a = cskc.g("BugleDataModel", "ExpireWapPushSiMessageAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new badu();

    /* compiled from: PG */
    public interface a {
        badx hI();
    }

    public ExpireWapPushSiMessageAction(cqoh cqohVar, badx badxVar, badw badwVar) {
        super(eogt.EXPIRE_WAP_PUSH_SI_MESSAGE_ACTION);
        this.b = cqohVar;
        this.d = badxVar;
        this.c = badwVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("ExpireWapPushSiMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        cskc cskcVar = a;
        cskcVar.p("executeAction.");
        long a2 = this.c.a();
        if (a2 <= 0) {
            return null;
        }
        badx badxVar = this.d;
        cqoh cqohVar = this.b;
        Action a3 = badxVar.a();
        long epochMilli = a2 - cqohVar.f().toEpochMilli();
        a3.y(111, epochMilli >= 0 ? epochMilli : 0L);
        if (!cskcVar.t(4)) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd,yyyy HH:mm");
        csjb c = cskcVar.c();
        c.I("scheduled next expiring action at");
        c.I(simpleDateFormat.format(Long.valueOf(a2)));
        c.r();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ExpireWapPushSiMessage.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public ExpireWapPushSiMessageAction(cqoh cqohVar, badx badxVar, badw badwVar, Parcel parcel) {
        super(parcel, eogt.EXPIRE_WAP_PUSH_SI_MESSAGE_ACTION);
        this.b = cqohVar;
        this.d = badxVar;
        this.c = badwVar;
    }
}
