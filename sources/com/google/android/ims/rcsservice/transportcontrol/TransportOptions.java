package com.google.android.ims.rcsservice.transportcontrol;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dkpa;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class TransportOptions implements Parcelable {
    public static final Parcelable.Creator<TransportOptions> CREATOR = new dkpa();
    public final int a;

    public TransportOptions(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }

    public TransportOptions(Parcel parcel) {
        this.a = parcel.readInt();
    }
}
