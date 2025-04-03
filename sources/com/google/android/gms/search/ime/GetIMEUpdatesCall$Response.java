package com.google.android.gms.search.ime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PIMEUpdateResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfrl;
import defpackage.dfxk;
import defpackage.dhoc;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetIMEUpdatesCall$Response extends AbstractSafeParcelable implements dfrl {
    public static final Parcelable.Creator<GetIMEUpdatesCall$Response> CREATOR = new dhoc();
    public Status a;
    public PIMEUpdateResponse b;

    public GetIMEUpdatesCall$Response() {
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

    public GetIMEUpdatesCall$Response(Status status, PIMEUpdateResponse pIMEUpdateResponse) {
        this.a = status;
        this.b = pIMEUpdateResponse;
    }
}
