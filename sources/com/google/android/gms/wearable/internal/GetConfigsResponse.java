package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import defpackage.dfxk;
import defpackage.didp;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetConfigsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetConfigsResponse> CREATOR = new didp();
    public final int a;
    public final ConnectionConfiguration[] b;

    public GetConfigsResponse(int i, ConnectionConfiguration[] connectionConfigurationArr) {
        this.a = i;
        this.b = connectionConfigurationArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 2, this.a);
        dfxk.E(parcel, 3, this.b, i);
        dfxk.c(parcel, a);
    }
}
