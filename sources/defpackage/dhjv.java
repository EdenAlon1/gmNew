package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Flag;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhjv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Flag[] flagArr = null;
        int i = 0;
        String[] strArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 3) {
                flagArr = (Flag[]) dfxj.J(parcel, readInt, Flag.CREATOR);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                strArr = dfxj.K(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new Configuration(i, flagArr, strArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Configuration[i];
    }
}
