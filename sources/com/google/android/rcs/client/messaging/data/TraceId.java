package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfxk;
import defpackage.eiew;
import defpackage.eihl;
import defpackage.eihm;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class TraceId implements Parcelable {
    public static final Parcelable.Creator<TraceId> CREATOR = new eihl();

    public static eihm b() {
        eiew eiewVar = new eiew();
        eiewVar.c("");
        return eiewVar;
    }

    public abstract String a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, a(), false);
        dfxk.c(parcel, a);
    }
}
