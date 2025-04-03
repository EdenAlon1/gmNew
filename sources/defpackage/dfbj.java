package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfbj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        byte[] bArr = null;
        PendingIntent pendingIntent = null;
        DeviceMetaData deviceMetaData = null;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    i = dfxj.f(parcel, readInt);
                    hashSet.add(1);
                    break;
                case 2:
                    str = dfxj.t(parcel, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    i2 = dfxj.f(parcel, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    bArr = dfxj.E(parcel, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    pendingIntent = (PendingIntent) dfxj.n(parcel, readInt, PendingIntent.CREATOR);
                    hashSet.add(5);
                    break;
                case 6:
                    deviceMetaData = (DeviceMetaData) dfxj.n(parcel, readInt, DeviceMetaData.CREATOR);
                    hashSet.add(6);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == h) {
            return new AuthenticatorTransferInfo(hashSet, i, str, i2, bArr, pendingIntent, deviceMetaData);
        }
        throw new dfxi(a.h(h, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticatorTransferInfo[i];
    }
}
