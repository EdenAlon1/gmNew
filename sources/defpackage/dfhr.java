package defpackage;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.frp.PersistentDeviceOwnerState;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfhr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        ComponentName componentName = null;
        String str = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                componentName = (ComponentName) dfxj.n(parcel, readInt, ComponentName.CREATOR);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                str = dfxj.t(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new PersistentDeviceOwnerState(componentName, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PersistentDeviceOwnerState[i];
    }
}
