package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$CorpusInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhno implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        Bundle bundle = null;
        boolean z = false;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 2) {
                featureArr = (Feature[]) dfxj.J(parcel, readInt, Feature.CREATOR);
            } else if (d == 3) {
                z = dfxj.D(parcel, readInt);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                bundle = dfxj.k(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new GetGlobalSearchSourcesCall$CorpusInfo(str, featureArr, z, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetGlobalSearchSourcesCall$CorpusInfo[i];
    }
}
