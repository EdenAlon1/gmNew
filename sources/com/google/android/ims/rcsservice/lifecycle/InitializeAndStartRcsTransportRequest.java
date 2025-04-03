package com.google.android.ims.rcsservice.lifecycle;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.dkor;
import defpackage.ezjz;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class InitializeAndStartRcsTransportRequest implements Parcelable {
    public static final Parcelable.Creator<InitializeAndStartRcsTransportRequest> CREATOR = new dkor();

    public abstract ezjz a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ProtoParsers.i(parcel, a());
    }
}
