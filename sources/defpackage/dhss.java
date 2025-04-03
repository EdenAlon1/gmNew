package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.time.dto.ParcelableDuration;
import com.google.android.gms.time.dto.ParcelableInstant;
import com.google.android.gms.time.trustedtime.dto.ParcelableClockAdjustmentPeriod;
import com.google.android.gms.time.trustedtime.dto.ParcelableTicks;
import com.google.android.gms.time.trustedtime.dto.TimeSignalResult;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhss implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        ParcelableDuration parcelableDuration = null;
        ParcelableInstant parcelableInstant = null;
        ParcelableTicks parcelableTicks = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                parcelableDuration = (ParcelableDuration) dfxj.n(parcel, readInt, ParcelableDuration.CREATOR);
            } else if (d == 2) {
                parcelableInstant = (ParcelableInstant) dfxj.n(parcel, readInt, ParcelableInstant.CREATOR);
            } else if (d == 3) {
                parcelableTicks = (ParcelableTicks) dfxj.n(parcel, readInt, ParcelableTicks.CREATOR);
            } else if (d == 4) {
                arrayList = dfxj.z(parcel, readInt, ParcelableClockAdjustmentPeriod.CREATOR);
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                arrayList2 = dfxj.z(parcel, readInt, ParcelableClockAdjustmentPeriod.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new TimeSignalResult(parcelableDuration, parcelableInstant, parcelableTicks, arrayList, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TimeSignalResult[i];
    }
}
