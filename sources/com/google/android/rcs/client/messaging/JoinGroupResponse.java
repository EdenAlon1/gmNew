package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfxk;
import defpackage.eibg;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class JoinGroupResponse implements Parcelable {
    public static final Parcelable.Creator<JoinGroupResponse> CREATOR = new eibg();

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
