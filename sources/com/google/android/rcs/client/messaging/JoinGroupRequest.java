package com.google.android.rcs.client.messaging;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfxk;
import defpackage.eibf;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class JoinGroupRequest implements Parcelable {
    public static final Parcelable.Creator<JoinGroupRequest> CREATOR = new eibf();

    public abstract PendingIntent a();

    public abstract com.google.android.rcs.client.messaging.data.Conversation b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.B(parcel, a());
        dfxk.k(parcel, 2, b(), i, false);
        dfxk.c(parcel, a);
    }
}
