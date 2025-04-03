package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfrl;
import defpackage.dfxk;
import defpackage.dhmu;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetStorageStatsCall$Response extends AbstractSafeParcelable implements dfrl {
    public static final Parcelable.Creator<GetStorageStatsCall$Response> CREATOR = new dhmu();
    public Status a;
    public GetStorageStatsCall$PackageStats[] b;
    public long c;
    public long d;
    public long e;

    public GetStorageStatsCall$Response() {
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
        dfxk.j(parcel, 3, this.c);
        dfxk.j(parcel, 4, this.d);
        dfxk.j(parcel, 5, this.e);
        dfxk.c(parcel, a);
    }

    public GetStorageStatsCall$Response(Status status, GetStorageStatsCall$PackageStats[] getStorageStatsCall$PackageStatsArr, long j, long j2, long j3) {
        this.a = status;
        this.b = getStorageStatsCall$PackageStatsArr;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }
}
