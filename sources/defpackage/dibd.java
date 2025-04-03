package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.AddLocalCapabilityResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dibd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (dfxj.d(readInt) != 2) {
                dfxj.C(parcel, readInt);
            } else {
                i = dfxj.f(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new AddLocalCapabilityResponse(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AddLocalCapabilityResponse[i];
    }
}
