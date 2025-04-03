package com.google.android.gms.auth.api.accounttransfer.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfbl;
import defpackage.dfwv;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DeviceMetaDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceMetaDataRequest> CREATOR = new dfbl();
    public final String a;

    public DeviceMetaDataRequest(String str) {
        dfwv.n(str);
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, 1);
        dfxk.m(parcel, 2, this.a, false);
        dfxk.c(parcel, a);
    }
}
