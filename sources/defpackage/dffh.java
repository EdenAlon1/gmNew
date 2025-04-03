package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.GoogleAccountSetupRequest;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dffh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Bundle bundle = new Bundle();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        AppDescription appDescription = null;
        AccountCredentials accountCredentials = null;
        CaptchaSolution captchaSolution = null;
        String str6 = null;
        String str7 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 2:
                    bundle = dfxj.k(parcel, readInt);
                    break;
                case 3:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 4:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 5:
                    z3 = dfxj.D(parcel, readInt);
                    break;
                case 6:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 7:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 8:
                    str3 = dfxj.t(parcel, readInt);
                    break;
                case 9:
                    str4 = dfxj.t(parcel, readInt);
                    break;
                case 10:
                    z4 = dfxj.D(parcel, readInt);
                    break;
                case 11:
                    z5 = dfxj.D(parcel, readInt);
                    break;
                case 12:
                    z6 = dfxj.D(parcel, readInt);
                    break;
                case 13:
                    str5 = dfxj.t(parcel, readInt);
                    break;
                case 14:
                    appDescription = (AppDescription) dfxj.n(parcel, readInt, AppDescription.CREATOR);
                    break;
                case 15:
                    accountCredentials = (AccountCredentials) dfxj.n(parcel, readInt, AccountCredentials.CREATOR);
                    break;
                case 16:
                    captchaSolution = (CaptchaSolution) dfxj.n(parcel, readInt, CaptchaSolution.CREATOR);
                    break;
                case 17:
                    str6 = dfxj.t(parcel, readInt);
                    break;
                case 18:
                    str7 = dfxj.t(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new GoogleAccountSetupRequest(i, bundle, z, z2, z3, str, str2, str3, str4, z4, z5, z6, str5, appDescription, accountCredentials, captchaSolution, str6, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleAccountSetupRequest[i];
    }
}
