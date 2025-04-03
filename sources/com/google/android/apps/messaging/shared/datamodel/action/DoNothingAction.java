package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.badr;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.eogt;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class DoNothingAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<DoNothingAction> CREATOR = new badr();

    public DoNothingAction() {
        super(eogt.DO_NOTHING_ACTION);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("DoNothingAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public DoNothingAction(Parcel parcel) {
        super(parcel, eogt.DO_NOTHING_ACTION);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
