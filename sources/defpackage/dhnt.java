package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.global.GetPendingExperimentIdsCall$Response;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhnt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Status status = null;
        int[] iArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                status = (Status) dfxj.n(parcel, readInt, Status.CREATOR);
            } else if (d != 2) {
                dfxj.C(parcel, readInt);
            } else {
                iArr = dfxj.H(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new GetPendingExperimentIdsCall$Response(status, iArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetPendingExperimentIdsCall$Response[i];
    }
}
