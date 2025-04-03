package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.CableAuthenticationData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgje implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        long j = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                j = dfxj.i(parcel, readInt);
            } else if (d == 2) {
                bArr = dfxj.E(parcel, readInt);
            } else if (d == 3) {
                bArr2 = dfxj.E(parcel, readInt);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                bArr3 = dfxj.E(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new CableAuthenticationData(j, bArr, bArr2, bArr3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CableAuthenticationData[i];
    }
}
