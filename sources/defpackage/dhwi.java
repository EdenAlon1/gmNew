package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.CardInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhwi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        UserAddress userAddress = null;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 2) {
                str2 = dfxj.t(parcel, readInt);
            } else if (d == 3) {
                str3 = dfxj.t(parcel, readInt);
            } else if (d == 4) {
                i = dfxj.f(parcel, readInt);
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                userAddress = (UserAddress) dfxj.n(parcel, readInt, UserAddress.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new CardInfo(str, str2, str3, i, userAddress);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CardInfo[i];
    }
}
