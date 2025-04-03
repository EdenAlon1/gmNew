package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.internal.DeviceOrientationRequestInternal;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgzh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        DeviceOrientationRequest deviceOrientationRequest = DeviceOrientationRequestInternal.a;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (dfxj.d(readInt) != 1) {
                dfxj.C(parcel, readInt);
            } else {
                deviceOrientationRequest = (DeviceOrientationRequest) dfxj.n(parcel, readInt, DeviceOrientationRequest.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new DeviceOrientationRequestInternal(deviceOrientationRequest);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceOrientationRequestInternal[i];
    }
}
