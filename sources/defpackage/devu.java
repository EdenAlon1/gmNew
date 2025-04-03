package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.GlobalSearchAppCorpusFeatures;
import com.google.android.gms.appdatasearch.GlobalSearchApplication;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class devu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        boolean z = false;
        GlobalSearchApplicationInfo globalSearchApplicationInfo = null;
        GlobalSearchAppCorpusFeatures[] globalSearchAppCorpusFeaturesArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                globalSearchApplicationInfo = (GlobalSearchApplicationInfo) dfxj.n(parcel, readInt, GlobalSearchApplicationInfo.CREATOR);
            } else if (d == 2) {
                globalSearchAppCorpusFeaturesArr = (GlobalSearchAppCorpusFeatures[]) dfxj.J(parcel, readInt, GlobalSearchAppCorpusFeatures.CREATOR);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                z = dfxj.D(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new GlobalSearchApplication(globalSearchApplicationInfo, globalSearchAppCorpusFeaturesArr, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GlobalSearchApplication[i];
    }
}
