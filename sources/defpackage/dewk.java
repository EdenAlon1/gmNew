package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.RegisteredPackageInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dewk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        long j = 0;
        long j2 = 0;
        boolean z = false;
        String str = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 2) {
                j = dfxj.i(parcel, readInt);
            } else if (d == 3) {
                z = dfxj.D(parcel, readInt);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                j2 = dfxj.i(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new RegisteredPackageInfo(str, j, z, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RegisteredPackageInfo[i];
    }
}
