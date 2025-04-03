package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.didq;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetConnectedNodesResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetConnectedNodesResponse> CREATOR = new didq();
    public final int a;
    public final List b;

    public GetConnectedNodesResponse(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 2, this.a);
        dfxk.n(parcel, 3, this.b, false);
        dfxk.c(parcel, a);
    }
}
