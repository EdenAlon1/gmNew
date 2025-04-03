package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.RegisteredPackageInfo;
import com.google.android.gms.appdatasearch.StorageStats;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dewu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        RegisteredPackageInfo[] registeredPackageInfoArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                registeredPackageInfoArr = (RegisteredPackageInfo[]) dfxj.J(parcel, readInt, RegisteredPackageInfo.CREATOR);
            } else if (d == 2) {
                j = dfxj.i(parcel, readInt);
            } else if (d == 3) {
                j2 = dfxj.i(parcel, readInt);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                j3 = dfxj.i(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new StorageStats(registeredPackageInfoArr, j, j2, j3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new StorageStats[i];
    }
}
