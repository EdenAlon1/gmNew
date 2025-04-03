package com.google.android.rcs.client.lifecycle;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dvvu;
import defpackage.ehxq;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class RcsEngineLifecycleServiceResult extends dvvu {
    public static final Parcelable.Creator<RcsEngineLifecycleServiceResult> CREATOR = new ehxq();

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
