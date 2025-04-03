package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.bajq;
import defpackage.bans;
import defpackage.bbfo;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.eogt;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ProcessPendingMessagesAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new bans();

    /* compiled from: PG */
    public interface a {
        bbfo bh();
    }

    public ProcessPendingMessagesAction() {
        super(eogt.PROCESS_PENDING_MESSAGES_ACTION);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("ProcessPendingMessagesAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        bajq.d(this.t.b("reason", 0), this);
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessPendingMessages.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public ProcessPendingMessagesAction(Parcel parcel) {
        super(parcel, eogt.PROCESS_PENDING_MESSAGES_ACTION);
    }

    public ProcessPendingMessagesAction(int i) {
        super(defpackage.a.h(i, "ProcessPendingMessagesActionKey_"), eogt.PROCESS_PENDING_MESSAGES_ACTION);
        this.t.r("reason", i);
    }
}
