package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.fido.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfcf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        AttestationConveyancePreference attestationConveyancePreference = null;
        byte[] bArr = null;
        String str = null;
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = null;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = null;
        ArrayList arrayList = null;
        Double d = null;
        ArrayList arrayList2 = null;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = null;
        TokenBinding tokenBinding = null;
        AuthenticationExtensions authenticationExtensions = null;
        ArrayList arrayList3 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 2:
                    publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) dfxj.n(parcel, readInt, PublicKeyCredentialRpEntity.CREATOR);
                    break;
                case 3:
                    publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) dfxj.n(parcel, readInt, PublicKeyCredentialUserEntity.CREATOR);
                    break;
                case 4:
                    bArr = dfxj.E(parcel, readInt);
                    break;
                case 5:
                    arrayList = dfxj.z(parcel, readInt, PublicKeyCredentialParameters.CREATOR);
                    break;
                case 6:
                    d = dfxj.p(parcel, readInt);
                    break;
                case 7:
                    arrayList2 = dfxj.z(parcel, readInt, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case 8:
                    authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) dfxj.n(parcel, readInt, AuthenticatorSelectionCriteria.CREATOR);
                    break;
                case 9:
                    tokenBinding = (TokenBinding) dfxj.n(parcel, readInt, TokenBinding.CREATOR);
                    break;
                case 10:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 11:
                    authenticationExtensions = (AuthenticationExtensions) dfxj.n(parcel, readInt, AuthenticationExtensions.CREATOR);
                    break;
                case 12:
                    arrayList3 = dfxj.y(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        eyee x = eyee.x(bArr);
        if (str != null) {
            try {
                attestationConveyancePreference = AttestationConveyancePreference.a(str);
            } catch (dgiq e) {
                throw new IllegalArgumentException(e);
            }
        }
        return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, x, arrayList, d, arrayList2, authenticatorSelectionCriteria, tokenBinding, attestationConveyancePreference, authenticationExtensions, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PublicKeyCredentialCreationOptions[i];
    }
}
