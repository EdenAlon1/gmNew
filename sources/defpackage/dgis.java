package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.CableAuthenticationExtension;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyExtension;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleMultiAssertionExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleSessionIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleSilentVerificationExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleTunnelServerIdExtension;
import com.google.android.gms.fido.fido2.api.common.HmacSecretExtension;
import com.google.android.gms.fido.fido2.api.common.PaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PrfExtension;
import com.google.android.gms.fido.fido2.api.common.SimpleTransactionAuthorizationExtension;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgis implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        FidoAppIdExtension fidoAppIdExtension = null;
        CableAuthenticationExtension cableAuthenticationExtension = null;
        UserVerificationMethodExtension userVerificationMethodExtension = null;
        GoogleMultiAssertionExtension googleMultiAssertionExtension = null;
        GoogleSessionIdExtension googleSessionIdExtension = null;
        GoogleSilentVerificationExtension googleSilentVerificationExtension = null;
        DevicePublicKeyExtension devicePublicKeyExtension = null;
        GoogleTunnelServerIdExtension googleTunnelServerIdExtension = null;
        GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = null;
        PrfExtension prfExtension = null;
        SimpleTransactionAuthorizationExtension simpleTransactionAuthorizationExtension = null;
        HmacSecretExtension hmacSecretExtension = null;
        PaymentExtension paymentExtension = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 2:
                    fidoAppIdExtension = (FidoAppIdExtension) dfxj.n(parcel, readInt, FidoAppIdExtension.CREATOR);
                    break;
                case 3:
                    cableAuthenticationExtension = (CableAuthenticationExtension) dfxj.n(parcel, readInt, CableAuthenticationExtension.CREATOR);
                    break;
                case 4:
                    userVerificationMethodExtension = (UserVerificationMethodExtension) dfxj.n(parcel, readInt, UserVerificationMethodExtension.CREATOR);
                    break;
                case 5:
                    googleMultiAssertionExtension = (GoogleMultiAssertionExtension) dfxj.n(parcel, readInt, GoogleMultiAssertionExtension.CREATOR);
                    break;
                case 6:
                    googleSessionIdExtension = (GoogleSessionIdExtension) dfxj.n(parcel, readInt, GoogleSessionIdExtension.CREATOR);
                    break;
                case 7:
                    googleSilentVerificationExtension = (GoogleSilentVerificationExtension) dfxj.n(parcel, readInt, GoogleSilentVerificationExtension.CREATOR);
                    break;
                case 8:
                    devicePublicKeyExtension = (DevicePublicKeyExtension) dfxj.n(parcel, readInt, DevicePublicKeyExtension.CREATOR);
                    break;
                case 9:
                    googleTunnelServerIdExtension = (GoogleTunnelServerIdExtension) dfxj.n(parcel, readInt, GoogleTunnelServerIdExtension.CREATOR);
                    break;
                case 10:
                    googleThirdPartyPaymentExtension = (GoogleThirdPartyPaymentExtension) dfxj.n(parcel, readInt, GoogleThirdPartyPaymentExtension.CREATOR);
                    break;
                case 11:
                    prfExtension = (PrfExtension) dfxj.n(parcel, readInt, PrfExtension.CREATOR);
                    break;
                case 12:
                    simpleTransactionAuthorizationExtension = (SimpleTransactionAuthorizationExtension) dfxj.n(parcel, readInt, SimpleTransactionAuthorizationExtension.CREATOR);
                    break;
                case 13:
                    hmacSecretExtension = (HmacSecretExtension) dfxj.n(parcel, readInt, HmacSecretExtension.CREATOR);
                    break;
                case 14:
                    paymentExtension = (PaymentExtension) dfxj.n(parcel, readInt, PaymentExtension.CREATOR);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new AuthenticationExtensions(fidoAppIdExtension, cableAuthenticationExtension, userVerificationMethodExtension, googleMultiAssertionExtension, googleSessionIdExtension, googleSilentVerificationExtension, devicePublicKeyExtension, googleTunnelServerIdExtension, googleThirdPartyPaymentExtension, prfExtension, simpleTransactionAuthorizationExtension, hmacSecretExtension, paymentExtension);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticationExtensions[i];
    }
}
