package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.time.dto.ParcelableDuration;
import com.google.android.gms.time.trustedtime.dto.ParcelableClockAdjustmentPeriod;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhsq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        ParcelableDuration parcelableDuration = null;
        ParcelableDuration parcelableDuration2 = null;
        ParcelableDuration parcelableDuration3 = null;
        ParcelableDuration parcelableDuration4 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                parcelableDuration = (ParcelableDuration) dfxj.n(parcel, readInt, ParcelableDuration.CREATOR);
            } else if (d == 2) {
                parcelableDuration2 = (ParcelableDuration) dfxj.n(parcel, readInt, ParcelableDuration.CREATOR);
            } else if (d == 3) {
                parcelableDuration3 = (ParcelableDuration) dfxj.n(parcel, readInt, ParcelableDuration.CREATOR);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                parcelableDuration4 = (ParcelableDuration) dfxj.n(parcel, readInt, ParcelableDuration.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new ParcelableClockAdjustmentPeriod(parcelableDuration, parcelableDuration2, parcelableDuration3, parcelableDuration4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableClockAdjustmentPeriod[i];
    }
}
