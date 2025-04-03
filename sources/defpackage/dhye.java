package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;
import com.google.android.gms.wallet.fragment.WalletFragmentStyle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhye implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 1;
        int i2 = 0;
        WalletFragmentStyle walletFragmentStyle = null;
        int i3 = 1;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 3) {
                i2 = dfxj.f(parcel, readInt);
            } else if (d == 4) {
                walletFragmentStyle = (WalletFragmentStyle) dfxj.n(parcel, readInt, WalletFragmentStyle.CREATOR);
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                i3 = dfxj.f(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new WalletFragmentOptions(i, i2, walletFragmentStyle, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new WalletFragmentOptions[i];
    }
}
