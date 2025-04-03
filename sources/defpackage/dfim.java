package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.proximity.ConnectionInfo;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfim implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        RemoteDevice remoteDevice = null;
        Role[] roleArr = null;
        byte[] bArr = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                remoteDevice = (RemoteDevice) dfxj.n(parcel, readInt, RemoteDevice.CREATOR);
            } else if (d == 2) {
                roleArr = (Role[]) dfxj.J(parcel, readInt, Role.CREATOR);
            } else if (d == 3) {
                i2 = dfxj.f(parcel, readInt);
            } else if (d == 4) {
                bArr = dfxj.E(parcel, readInt);
            } else if (d != 1000) {
                dfxj.C(parcel, readInt);
            } else {
                i = dfxj.f(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new ConnectionInfo(i, remoteDevice, roleArr, i2, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionInfo[i];
    }
}
