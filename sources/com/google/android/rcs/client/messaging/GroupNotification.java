package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.eiaz;
import defpackage.eijb;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public abstract class GroupNotification implements Parcelable {
    public static final Parcelable.Creator<GroupNotification> CREATOR = new eiaz();

    public abstract Conversation a();

    public abstract GroupInformation b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        eijb.q(parcel, 1, a(), i);
        eijb.q(parcel, 2, b(), i);
        eijb.l(parcel);
    }
}
