package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.didt;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetFastpairAccountKeyByAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetFastpairAccountKeyByAccountResponse> CREATOR = new didt();
    public final int a;
    public final FastPairAccountKeyParcelable b;

    public GetFastpairAccountKeyByAccountResponse(int i, FastPairAccountKeyParcelable fastPairAccountKeyParcelable) {
        this.a = i;
        this.b = fastPairAccountKeyParcelable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.c(parcel, a);
    }
}
