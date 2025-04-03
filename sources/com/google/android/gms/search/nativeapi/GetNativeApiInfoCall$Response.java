package com.google.android.gms.search.nativeapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.NativeApiInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfrl;
import defpackage.dfxk;
import defpackage.dhoe;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetNativeApiInfoCall$Response extends AbstractSafeParcelable implements dfrl {
    public static final Parcelable.Creator<GetNativeApiInfoCall$Response> CREATOR = new dhoe();
    public Status a;
    public NativeApiInfo b;

    public GetNativeApiInfoCall$Response() {
    }

    @Override // defpackage.dfrl
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, this.a, i, false);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.c(parcel, a);
    }

    public GetNativeApiInfoCall$Response(Status status, NativeApiInfo nativeApiInfo) {
        this.a = status;
        this.b = nativeApiInfo;
    }
}
