package com.google.android.apps.messaging.shared.datamodel.data.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bcyn;
import defpackage.eolm;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class DeviceData implements Parcelable {
    public static final Parcelable.Creator<DeviceData> CREATOR = new bcyn();
    public final eolm a;
    public boolean b;
    public boolean c;
    public boolean d;

    public DeviceData(eolm eolmVar) {
        this.a = eolmVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.f);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
    }

    public DeviceData(Parcel parcel) {
        eolm b = eolm.b(parcel.readInt());
        this.a = b == null ? eolm.UNKNOWN_BUGLE_DEVICE_TYPE : b;
        this.b = parcel.readInt() != 0;
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt() != 0;
    }
}
