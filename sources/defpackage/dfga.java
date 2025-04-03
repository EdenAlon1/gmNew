package defpackage;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.delegate.TokenWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfga implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Bundle bundle = new Bundle();
        boolean z = true;
        String str = null;
        String str2 = null;
        FACLConfig fACLConfig = null;
        PACLConfig pACLConfig = null;
        AppDescription appDescription = null;
        Account account = null;
        AccountAuthenticatorResponse accountAuthenticatorResponse = null;
        boolean z2 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 2:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 3:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 4:
                    bundle = dfxj.k(parcel, readInt);
                    break;
                case 5:
                    fACLConfig = (FACLConfig) dfxj.n(parcel, readInt, FACLConfig.CREATOR);
                    break;
                case 6:
                    pACLConfig = (PACLConfig) dfxj.n(parcel, readInt, PACLConfig.CREATOR);
                    break;
                case 7:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 8:
                    appDescription = (AppDescription) dfxj.n(parcel, readInt, AppDescription.CREATOR);
                    break;
                case 9:
                    account = (Account) dfxj.n(parcel, readInt, Account.CREATOR);
                    break;
                case 10:
                    accountAuthenticatorResponse = (AccountAuthenticatorResponse) dfxj.n(parcel, readInt, AccountAuthenticatorResponse.CREATOR);
                    break;
                case 11:
                    z = dfxj.D(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new TokenWorkflowRequest(str, str2, bundle, fACLConfig, pACLConfig, z2, appDescription, account, accountAuthenticatorResponse, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenWorkflowRequest[i];
    }
}
