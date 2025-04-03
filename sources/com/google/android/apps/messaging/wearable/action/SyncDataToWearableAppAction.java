package com.google.android.apps.messaging.wearable.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import defpackage.defc;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.eogt;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class SyncDataToWearableAppAction extends ThrottledAction {
    public static final Parcelable.Creator<SyncDataToWearableAppAction> CREATOR = new defc();

    private SyncDataToWearableAppAction() {
        super(eogt.SYNC_DATA_TO_WEARABLE_APP_ACTION);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.SyncDataToWearableApp.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final int f() {
        return 110;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final long g() {
        return 1L;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final String h() {
        return "SyncDataToWearableAppAction";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final elfl k() {
        return elfo.e(null);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public SyncDataToWearableAppAction(Parcel parcel) {
        super(parcel, eogt.SYNC_DATA_TO_WEARABLE_APP_ACTION);
    }
}
