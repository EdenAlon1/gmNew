package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfrl;
import defpackage.dfxk;
import defpackage.dhnr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetGlobalSearchSourcesCall$Response extends AbstractSafeParcelable implements dfrl {
    public static final Parcelable.Creator<GetGlobalSearchSourcesCall$Response> CREATOR = new dhnr();
    public Status a;
    public GetGlobalSearchSourcesCall$GlobalSearchSource[] b;

    public GetGlobalSearchSourcesCall$Response() {
    }

    @Override // defpackage.dfrl
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, this.a, i, false);
        dfxk.E(parcel, 2, this.b, i);
        dfxk.c(parcel, a);
    }

    public GetGlobalSearchSourcesCall$Response(Status status, GetGlobalSearchSourcesCall$GlobalSearchSource[] getGlobalSearchSourcesCall$GlobalSearchSourceArr) {
        this.a = status;
        this.b = getGlobalSearchSourcesCall$GlobalSearchSourceArr;
    }
}
