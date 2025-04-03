package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfrl;
import defpackage.dfxk;
import defpackage.dhmw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RequestAppIndexingUpdateIndexCall$Response extends AbstractSafeParcelable implements dfrl {
    public static final Parcelable.Creator<RequestAppIndexingUpdateIndexCall$Response> CREATOR = new dhmw();
    public final Status a;
    public final long b;

    public RequestAppIndexingUpdateIndexCall$Response(Status status, long j) {
        this.a = status;
        this.b = j;
    }

    @Override // defpackage.dfrl
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, this.a, i, false);
        dfxk.j(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }
}
