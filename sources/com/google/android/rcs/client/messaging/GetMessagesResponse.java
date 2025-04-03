package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfxk;
import defpackage.eiao;
import defpackage.engw;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class GetMessagesResponse implements Parcelable {
    public static final Parcelable.Creator<GetMessagesResponse> CREATOR = new eiao();

    public abstract MessagingResult a();

    public abstract engw b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, a(), i, false);
        dfxk.n(parcel, 2, b(), false);
        dfxk.c(parcel, a);
    }
}
