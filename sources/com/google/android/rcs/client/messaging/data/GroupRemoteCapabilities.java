package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfxk;
import defpackage.eifz;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class GroupRemoteCapabilities implements Parcelable {
    public static final Parcelable.Creator<GroupRemoteCapabilities> CREATOR = new eifz();

    public abstract Optional a();

    public abstract Optional b();

    public abstract boolean c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.d(parcel, 1, c());
        if (b().isPresent()) {
            dfxk.d(parcel, 2, ((Boolean) b().get()).booleanValue());
        }
        if (a().isPresent()) {
            dfxk.d(parcel, 3, ((Boolean) a().get()).booleanValue());
        }
        dfxk.c(parcel, a);
    }
}
