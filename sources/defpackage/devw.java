package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.GlobalSearchCorpusConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class devw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int[] iArr = null;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                iArr = dfxj.H(parcel, readInt);
            } else if (d != 2) {
                dfxj.C(parcel, readInt);
            } else {
                featureArr = (Feature[]) dfxj.J(parcel, readInt, Feature.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new GlobalSearchCorpusConfig(iArr, featureArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GlobalSearchCorpusConfig[i];
    }
}
