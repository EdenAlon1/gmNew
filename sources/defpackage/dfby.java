package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.fido.AuthenticationOptions;
import com.google.android.gms.auth.api.fido.BrowserOptions;
import com.google.android.gms.auth.api.fido.PublicKeyCredentialRequestOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfby implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        long j = 0;
        int i = 0;
        boolean z = false;
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = null;
        String str = null;
        String str2 = null;
        BrowserOptions browserOptions = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 2:
                    publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) dfxj.n(parcel, readInt, PublicKeyCredentialRequestOptions.CREATOR);
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
                    i = dfxj.f(parcel, readInt);
                    break;
                case 7:
                    bundle = dfxj.k(parcel, readInt);
                    break;
                case 8:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 9:
                    j = dfxj.i(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new AuthenticationOptions(publicKeyCredentialRequestOptions, str, str2, browserOptions, i, bundle, z, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticationOptions[i];
    }
}
