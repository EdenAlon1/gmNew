package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import com.google.android.gms.appdatasearch.ScoringConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dewj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        Feature[] featureArr = null;
        String str4 = null;
        ScoringConfig scoringConfig = null;
        boolean z = false;
        boolean z2 = false;
        int i = 1;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 11) {
                str4 = dfxj.t(parcel, readInt);
            } else if (d != 12) {
                switch (d) {
                    case 1:
                        str = dfxj.t(parcel, readInt);
                        break;
                    case 2:
                        str2 = dfxj.t(parcel, readInt);
                        break;
                    case 3:
                        z = dfxj.D(parcel, readInt);
                        break;
                    case 4:
                        i = dfxj.f(parcel, readInt);
                        break;
                    case 5:
                        z2 = dfxj.D(parcel, readInt);
                        break;
                    case 6:
                        str3 = dfxj.t(parcel, readInt);
                        break;
                    case 7:
                        featureArr = (Feature[]) dfxj.J(parcel, readInt, Feature.CREATOR);
                        break;
                    default:
                        dfxj.C(parcel, readInt);
                        break;
                }
            } else {
                scoringConfig = (ScoringConfig) dfxj.n(parcel, readInt, ScoringConfig.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new RegisterSectionInfo(str, str2, z, i, z2, str3, featureArr, str4, scoringConfig);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RegisterSectionInfo[i];
    }
}
