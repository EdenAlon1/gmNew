package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfrl;
import defpackage.dfxk;
import defpackage.dhnt;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetPendingExperimentIdsCall$Response extends AbstractSafeParcelable implements dfrl {
    public static final Parcelable.Creator<GetPendingExperimentIdsCall$Response> CREATOR = new dhnt();
    public Status a;
    public int[] b;

    public GetPendingExperimentIdsCall$Response() {
    }

    @Override // defpackage.dfrl
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, this.a, i, false);
        dfxk.v(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }

    public GetPendingExperimentIdsCall$Response(Status status, int[] iArr) {
        this.a = status;
        this.b = iArr;
    }
}
