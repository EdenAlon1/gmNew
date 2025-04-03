package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhdz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Long l = null;
        int i = 0;
        Long l2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 2) {
                l = dfxj.s(parcel, readInt);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                l2 = dfxj.s(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new TimeSeriesFootprintsSubscriptionFilter(i, l, l2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TimeSeriesFootprintsSubscriptionFilter[i];
    }
}
