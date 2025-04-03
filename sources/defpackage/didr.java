package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.DataItemParcelable;
import com.google.android.gms.wearable.internal.GetDataItemResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class didr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        DataItemParcelable dataItemParcelable = null;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                i = dfxj.f(parcel, readInt);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                dataItemParcelable = (DataItemParcelable) dfxj.n(parcel, readInt, DataItemParcelable.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new GetDataItemResponse(i, dataItemParcelable);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetDataItemResponse[i];
    }
}
