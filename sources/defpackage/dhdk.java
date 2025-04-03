package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdd.FileGroupWithDownloadStatus;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhdk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 2) {
                str2 = dfxj.t(parcel, readInt);
            } else if (d == 3) {
                z = dfxj.D(parcel, readInt);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                i = dfxj.f(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new FileGroupWithDownloadStatus(str, str2, i, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FileGroupWithDownloadStatus[i];
    }
}
