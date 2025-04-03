package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsDevicePublicKeyOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsPrfOutputs;
import com.google.android.gms.fido.fido2.api.common.UvmEntries;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgir implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        UvmEntries uvmEntries = null;
        AuthenticationExtensionsDevicePublicKeyOutputs authenticationExtensionsDevicePublicKeyOutputs = null;
        AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = null;
        AuthenticationExtensionsPrfOutputs authenticationExtensionsPrfOutputs = null;
        String str = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                uvmEntries = (UvmEntries) dfxj.n(parcel, readInt, UvmEntries.CREATOR);
            } else if (d == 2) {
                authenticationExtensionsDevicePublicKeyOutputs = (AuthenticationExtensionsDevicePublicKeyOutputs) dfxj.n(parcel, readInt, AuthenticationExtensionsDevicePublicKeyOutputs.CREATOR);
            } else if (d == 3) {
                authenticationExtensionsCredPropsOutputs = (AuthenticationExtensionsCredPropsOutputs) dfxj.n(parcel, readInt, AuthenticationExtensionsCredPropsOutputs.CREATOR);
            } else if (d == 4) {
                authenticationExtensionsPrfOutputs = (AuthenticationExtensionsPrfOutputs) dfxj.n(parcel, readInt, AuthenticationExtensionsPrfOutputs.CREATOR);
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                str = dfxj.t(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new AuthenticationExtensionsClientOutputs(uvmEntries, authenticationExtensionsDevicePublicKeyOutputs, authenticationExtensionsCredPropsOutputs, authenticationExtensionsPrfOutputs, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticationExtensionsClientOutputs[i];
    }
}
