package com.google.android.gms.search.administration;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfrl;
import defpackage.dfxk;
import defpackage.dhmk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class BundleResponse extends AbstractSafeParcelable implements dfrl {
    public static final Parcelable.Creator<BundleResponse> CREATOR = new dhmk();
    public Status a;
    public Bundle b;

    public BundleResponse() {
    }

    @Override // defpackage.dfrl
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, this.a, i, false);
        dfxk.p(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }

    public BundleResponse(Status status, Bundle bundle) {
        this.a = status;
        this.b = bundle;
    }
}
