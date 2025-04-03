package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyExtension;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgjg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (dfxj.d(readInt) != 1) {
                dfxj.C(parcel, readInt);
            } else {
                dfxj.D(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new DevicePublicKeyExtension();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DevicePublicKeyExtension[i];
    }
}
