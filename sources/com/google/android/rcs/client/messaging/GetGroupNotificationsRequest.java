package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfxk;
import defpackage.ehyn;
import defpackage.eiai;
import defpackage.eiaj;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class GetGroupNotificationsRequest implements Parcelable {
    public static final GetGroupNotificationsRequest a = b().a();
    public static final Parcelable.Creator<GetGroupNotificationsRequest> CREATOR = new eiai();

    public static eiaj b() {
        ehyn ehynVar = new ehyn();
        ehynVar.b(-1);
        return ehynVar;
    }

    public abstract int a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = dfxk.a(parcel);
        dfxk.i(parcel, 1, a());
        dfxk.c(parcel, a2);
    }
}
