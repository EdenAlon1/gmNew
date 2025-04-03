package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.search.administration.AppIndexingUserActionInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhmj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        long j = 0;
        euof euofVar = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 2) {
                j = dfxj.i(parcel, readInt);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                euofVar = (euof) dfxj.n(parcel, readInt, euof.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new AppIndexingUserActionInfo(str, j, euofVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AppIndexingUserActionInfo[i];
    }
}
