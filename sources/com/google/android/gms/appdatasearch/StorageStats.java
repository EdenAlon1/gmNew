package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dewu;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class StorageStats extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StorageStats> CREATOR = new dewu();
    public final RegisteredPackageInfo[] a;
    public final long b;
    public final long c;
    public final long d;

    public StorageStats(RegisteredPackageInfo[] registeredPackageInfoArr, long j, long j2, long j3) {
        this.a = registeredPackageInfoArr;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.E(parcel, 1, this.a, i);
        dfxk.j(parcel, 2, this.b);
        dfxk.j(parcel, 3, this.c);
        dfxk.j(parcel, 4, this.d);
        dfxk.c(parcel, a);
    }
}
