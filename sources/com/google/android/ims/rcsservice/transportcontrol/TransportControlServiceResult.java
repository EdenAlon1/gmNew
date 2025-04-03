package com.google.android.ims.rcsservice.transportcontrol;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dkoz;
import defpackage.dvvu;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class TransportControlServiceResult extends dvvu {
    public static final Parcelable.Creator<TransportControlServiceResult> CREATOR = new dkoz();

    public TransportControlServiceResult(int i) {
        this.code = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.code);
    }

    public TransportControlServiceResult(Parcel parcel) {
        this.code = parcel.readInt();
    }
}
