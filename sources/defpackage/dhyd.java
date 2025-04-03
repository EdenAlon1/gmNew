package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.fragment.WalletFragmentInitParams;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhyd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        MaskedWallet maskedWallet = null;
        int i = -1;
        MaskedWalletRequest maskedWalletRequest = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 3) {
                maskedWalletRequest = (MaskedWalletRequest) dfxj.n(parcel, readInt, MaskedWalletRequest.CREATOR);
            } else if (d == 4) {
                i = dfxj.f(parcel, readInt);
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                maskedWallet = (MaskedWallet) dfxj.n(parcel, readInt, MaskedWallet.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new WalletFragmentInitParams(str, maskedWalletRequest, i, maskedWallet);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new WalletFragmentInitParams[i];
    }
}
