package com.google.android.ims.rcs.engine;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dkes;
import defpackage.dvvu;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class RcsEngineLifecycleServiceResult extends dvvu {
    public static final Parcelable.Creator<RcsEngineLifecycleServiceResult> CREATOR = new dkes();

    public RcsEngineLifecycleServiceResult(int i) {
        this.code = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.code);
    }

    public RcsEngineLifecycleServiceResult(Parcel parcel) {
        this.code = parcel.readInt();
    }
}
