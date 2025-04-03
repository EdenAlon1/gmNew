package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euog implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        euoe euoeVar = null;
        String str5 = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 2:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 3:
                    str3 = dfxj.t(parcel, readInt);
                    break;
                case 4:
                    str4 = dfxj.t(parcel, readInt);
                    break;
                case 5:
                    euoeVar = (euoe) dfxj.n(parcel, readInt, euoe.CREATOR);
                    break;
                case 6:
                    str5 = dfxj.t(parcel, readInt);
                    break;
                case 7:
                    bundle = dfxj.k(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new euof(str, str2, str3, str4, euoeVar, str5, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new euof[i];
    }
}
