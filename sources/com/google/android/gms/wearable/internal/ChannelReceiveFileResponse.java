package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dibx;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ChannelReceiveFileResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ChannelReceiveFileResponse> CREATOR = new dibx();
    public final int a;

    public ChannelReceiveFileResponse(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 2, this.a);
        dfxk.c(parcel, a);
    }
}
