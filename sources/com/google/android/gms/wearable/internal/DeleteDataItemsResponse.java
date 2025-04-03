package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.didc;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DeleteDataItemsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeleteDataItemsResponse> CREATOR = new didc();
    public final int a;
    public final int b;

    public DeleteDataItemsResponse(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 2, this.a);
        dfxk.i(parcel, 3, this.b);
        dfxk.c(parcel, a);
    }
}
