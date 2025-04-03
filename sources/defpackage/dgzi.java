package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.internal.DeviceOrientationRequestInternal;
import com.google.android.gms.location.internal.DeviceOrientationRequestUpdateData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgzi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        DeviceOrientationRequestInternal deviceOrientationRequestInternal = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        int i = 1;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 2) {
                deviceOrientationRequestInternal = (DeviceOrientationRequestInternal) dfxj.n(parcel, readInt, DeviceOrientationRequestInternal.CREATOR);
            } else if (d == 3) {
                iBinder = dfxj.l(parcel, readInt);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                iBinder2 = dfxj.l(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new DeviceOrientationRequestUpdateData(i, deviceOrientationRequestInternal, iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceOrientationRequestUpdateData[i];
    }
}
