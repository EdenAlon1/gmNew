package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverride;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhkg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        boolean z = false;
        String str = null;
        String str2 = null;
        Flag flag = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 3) {
                str2 = dfxj.t(parcel, readInt);
            } else if (d == 4) {
                flag = (Flag) dfxj.n(parcel, readInt, Flag.CREATOR);
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                z = dfxj.D(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new FlagOverride(str, str2, flag, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FlagOverride[i];
    }
}
