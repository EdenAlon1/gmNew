package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfrl;
import defpackage.dfxk;
import defpackage.dhmr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetAppIndexingPackagesCall$Response extends AbstractSafeParcelable implements dfrl {
    public static final Parcelable.Creator<GetAppIndexingPackagesCall$Response> CREATOR = new dhmr();
    public final Status a;
    public final String[] b;
    public final String[] c;

    public GetAppIndexingPackagesCall$Response(Status status, String[] strArr, String[] strArr2) {
        this.a = status;
        this.b = strArr;
        this.c = strArr2;
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
        dfxk.C(parcel, 2, this.b);
        dfxk.C(parcel, 3, this.c);
        dfxk.c(parcel, a);
    }
}
