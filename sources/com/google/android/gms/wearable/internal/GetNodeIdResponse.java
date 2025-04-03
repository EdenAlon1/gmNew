package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.didx;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetNodeIdResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetNodeIdResponse> CREATOR = new didx();
    public final int a;
    public final String b;

    public GetNodeIdResponse(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 2, this.a);
        dfxk.m(parcel, 3, this.b, false);
        dfxk.c(parcel, a);
    }
}
