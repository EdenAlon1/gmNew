package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dffb;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ClearTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClearTokenRequest> CREATOR = new dffb();
    final int a;
    String b;

    public ClearTokenRequest() {
        this.a = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.c(parcel, a);
    }

    public ClearTokenRequest(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
