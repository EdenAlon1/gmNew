package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dibd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AddLocalCapabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AddLocalCapabilityResponse> CREATOR = new dibd();
    public final int a;

    public AddLocalCapabilityResponse(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 2, this.a);
        dfxk.c(parcel, a);
    }
}
