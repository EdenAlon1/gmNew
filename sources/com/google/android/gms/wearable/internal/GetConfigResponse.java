package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import defpackage.dfxk;
import defpackage.dido;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class GetConfigResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetConfigResponse> CREATOR = new dido();
    public final int a;
    public final ConnectionConfiguration b;

    public GetConfigResponse(int i, ConnectionConfiguration connectionConfiguration) {
        this.a = i;
        this.b = connectionConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 2, this.a);
        dfxk.k(parcel, 3, this.b, i, false);
        dfxk.c(parcel, a);
    }
}
