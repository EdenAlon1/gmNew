package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.bbam;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.eogt;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class UpdateParticipantRcsAvailableAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new bbam();

    private UpdateParticipantRcsAvailableAction() {
        super(eogt.UPDATE_PARTICIPANT_RCS_AVAILABLE_ACTION);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("UpdateParticipantRcsAvailableAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateParticipantRcsAvailable.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public UpdateParticipantRcsAvailableAction(Parcel parcel) {
        super(parcel, eogt.UPDATE_PARTICIPANT_RCS_AVAILABLE_ACTION);
    }
}
