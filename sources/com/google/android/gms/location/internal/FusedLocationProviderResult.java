package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfrl;
import defpackage.dfxk;
import defpackage.dgzj;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FusedLocationProviderResult extends AbstractSafeParcelable implements dfrl {
    public static final Parcelable.Creator<FusedLocationProviderResult> CREATOR = new dgzj();
    public final Status a;

    public FusedLocationProviderResult(Status status) {
        this.a = status;
    }

    @Override // defpackage.dfrl
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, status, i, false);
        dfxk.c(parcel, a);
    }
}
