package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.fido.BrowserOptions;
import com.google.android.gms.auth.api.fido.PublicKeyCredentialCreationOptions;
import com.google.android.gms.auth.api.fido.RegistrationOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfci implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        boolean z = false;
        long j = 0;
        int i = 0;
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = null;
        String str = null;
        String str2 = null;
        BrowserOptions browserOptions = null;
        Account account = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 2:
                    publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) dfxj.n(parcel, readInt, PublicKeyCredentialCreationOptions.CREATOR);
                    break;
                case 3:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 4:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 5:
                    browserOptions = (BrowserOptions) dfxj.n(parcel, readInt, BrowserOptions.CREATOR);
                    break;
                case 6:
                    account = (Account) dfxj.n(parcel, readInt, Account.CREATOR);
                    break;
                case 7:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 8:
                    bundle = dfxj.k(parcel, readInt);
                    break;
                case 9:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 10:
                    j = dfxj.i(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new RegistrationOptions(publicKeyCredentialCreationOptions, str, str2, browserOptions, account, i, bundle, Boolean.valueOf(z), j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RegistrationOptions[i];
    }
}
