package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfxk;
import defpackage.eidc;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class UpdateGroupResponse implements Parcelable {
    public static final Parcelable.Creator<UpdateGroupResponse> CREATOR = new eidc();

    public abstract MessagingResult a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, a(), i, false);
        dfxk.c(parcel, a);
    }
}
