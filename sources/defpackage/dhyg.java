package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.shared.ApplicationParameters;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhyg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        boolean z = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        Account account = null;
        Bundle bundle = null;
        WalletCustomTheme walletCustomTheme = null;
        int i4 = 1;
        int i5 = 1;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 2:
                    i4 = dfxj.f(parcel, readInt);
                    break;
                case 3:
                    account = (Account) dfxj.n(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    bundle = dfxj.k(parcel, readInt);
                    break;
                case 5:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 6:
                    i5 = dfxj.f(parcel, readInt);
                    break;
                case 7:
                    walletCustomTheme = (WalletCustomTheme) dfxj.n(parcel, readInt, WalletCustomTheme.CREATOR);
                    break;
                case 8:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 9:
                    d = dfxj.b(parcel, readInt);
                    break;
                case 10:
                    d2 = dfxj.b(parcel, readInt);
                    break;
                case 11:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 12:
                    i3 = dfxj.f(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new ApplicationParameters(i4, account, bundle, z, i5, walletCustomTheme, i, d, d2, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ApplicationParameters[i];
    }
}
