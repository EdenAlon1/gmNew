package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dffe;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DeviceManagementInfoResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceManagementInfoResponse> CREATOR = new dffe();
    final int a;
    public final String b;
    public final boolean c;

    public DeviceManagementInfoResponse(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.d(parcel, 3, this.c);
        dfxk.c(parcel, a);
    }
}
