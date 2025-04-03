package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.TraceId;
import defpackage.dfxk;
import defpackage.ehyp;
import defpackage.eiam;
import defpackage.eian;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class GetMessagesRequest implements Parcelable {
    public static final GetMessagesRequest a = c().a();
    public static final Parcelable.Creator<GetMessagesRequest> CREATOR = new eiam();

    public static eian c() {
        ehyp ehypVar = new ehyp();
        ehypVar.b(-1);
        ehypVar.c(TraceId.b().d());
        return ehypVar;
    }

    public abstract int a();

    public abstract TraceId b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = dfxk.a(parcel);
        dfxk.i(parcel, 1, a());
        dfxk.k(parcel, 2, b(), i, false);
        dfxk.c(parcel, a2);
    }
}
