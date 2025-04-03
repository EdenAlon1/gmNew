package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.GetStorageStatsCall$PackageStats;
import com.google.android.gms.search.administration.GetStorageStatsCall$Response;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhmu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        Status status = null;
        GetStorageStatsCall$PackageStats[] getStorageStatsCall$PackageStatsArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                status = (Status) dfxj.n(parcel, readInt, Status.CREATOR);
            } else if (d == 2) {
                getStorageStatsCall$PackageStatsArr = (GetStorageStatsCall$PackageStats[]) dfxj.J(parcel, readInt, GetStorageStatsCall$PackageStats.CREATOR);
            } else if (d == 3) {
                j = dfxj.i(parcel, readInt);
            } else if (d == 4) {
                j2 = dfxj.i(parcel, readInt);
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                j3 = dfxj.i(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new GetStorageStatsCall$Response(status, getStorageStatsCall$PackageStatsArr, j, j2, j3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetStorageStatsCall$Response[i];
    }
}
