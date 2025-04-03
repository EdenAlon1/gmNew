package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhxt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        byte[] bArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (dfxj.d(readInt) != 1) {
                dfxj.C(parcel, readInt);
            } else {
                bArr = dfxj.E(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new SetUpBiometricAuthenticationKeysResponse(bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SetUpBiometricAuthenticationKeysResponse[i];
    }
}
