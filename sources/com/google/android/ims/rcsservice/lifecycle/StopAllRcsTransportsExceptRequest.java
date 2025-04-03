package com.google.android.ims.rcsservice.lifecycle;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.dkos;
import defpackage.ezkd;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class StopAllRcsTransportsExceptRequest implements Parcelable {
    public static final Parcelable.Creator<StopAllRcsTransportsExceptRequest> CREATOR = new dkos();

    public abstract ezkd a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ProtoParsers.i(parcel, a());
    }
}
