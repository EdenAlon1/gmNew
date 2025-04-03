package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dica;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CloseChannelResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CloseChannelResponse> CREATOR = new dica();
    public final int a;

    public CloseChannelResponse(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 2, this.a);
        dfxk.c(parcel, a);
    }
}
