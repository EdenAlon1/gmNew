package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dffp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Bundle bundle = new Bundle();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        boolean z4 = false;
        int i2 = 0;
        int i3 = 0;
        boolean z5 = true;
        boolean z6 = true;
        String str = null;
        String str2 = null;
        FACLConfig fACLConfig = null;
        PACLConfig pACLConfig = null;
        AppDescription appDescription = null;
        CaptchaSolution captchaSolution = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        long j = 0;
        String str8 = "com.google";
        String str9 = "UNKNOWN";
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
                    z = dfxj.D(parcel, readInt);
                    break;
                case 8:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 9:
                    str9 = dfxj.t(parcel, readInt);
                    break;
                case 10:
                    appDescription = (AppDescription) dfxj.n(parcel, readInt, AppDescription.CREATOR);
                    break;
                case 11:
                    captchaSolution = (CaptchaSolution) dfxj.n(parcel, readInt, CaptchaSolution.CREATOR);
                    break;
                case 12:
                default:
                    dfxj.C(parcel, readInt);
                    break;
                case 13:
                    z3 = dfxj.D(parcel, readInt);
                    break;
                case 14:
                    z5 = dfxj.D(parcel, readInt);
                    break;
                case 15:
                    str8 = dfxj.t(parcel, readInt);
                    break;
                case 16:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 17:
                    str3 = dfxj.t(parcel, readInt);
                    break;
                case 18:
                    str4 = dfxj.t(parcel, readInt);
                    break;
                case 19:
                    str5 = dfxj.t(parcel, readInt);
                    break;
                case 20:
                    j = dfxj.i(parcel, readInt);
                    break;
                case 21:
                    z4 = dfxj.D(parcel, readInt);
                    break;
                case 22:
                    str6 = dfxj.t(parcel, readInt);
                    break;
                case 23:
                    str7 = dfxj.t(parcel, readInt);
                    break;
                case 24:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 25:
                    z6 = dfxj.D(parcel, readInt);
                    break;
                case 26:
                    i3 = dfxj.f(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new TokenRequest(str, str2, bundle, fACLConfig, pACLConfig, z, z2, str9, appDescription, captchaSolution, z3, z5, str8, i, str3, str4, str5, j, z4, str6, str7, i2, z6, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenRequest[i];
    }
}
