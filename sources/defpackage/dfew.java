package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfew implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        AppDescription appDescription = null;
        CaptchaSolution captchaSolution = null;
        AccountCredentials accountCredentials = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 2:
                    appDescription = (AppDescription) dfxj.n(parcel, readInt, AppDescription.CREATOR);
                    break;
                case 3:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 4:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 5:
                    captchaSolution = (CaptchaSolution) dfxj.n(parcel, readInt, CaptchaSolution.CREATOR);
                    break;
                case 6:
                    accountCredentials = (AccountCredentials) dfxj.n(parcel, readInt, AccountCredentials.CREATOR);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new AccountSignInRequest(i, appDescription, z, z2, captchaSolution, accountCredentials);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountSignInRequest[i];
    }
}
