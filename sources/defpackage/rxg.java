package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rxg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        expv expvVar = null;
        rwh rwhVar = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                expvVar = (expv) dfxj.n(parcel, readInt, expv.CREATOR);
            } else if (d != 2) {
                dfxj.C(parcel, readInt);
            } else {
                rwhVar = (rwh) dfxj.n(parcel, readInt, rwh.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new rxf(expvVar, rwhVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new rxf[i];
    }
}
