package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.fido.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfcg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        UserVerificationRequirement userVerificationRequirement = null;
        byte[] bArr = null;
        String str = null;
        Double d = null;
        String str2 = null;
        ArrayList arrayList = null;
        TokenBinding tokenBinding = null;
        AuthenticationExtensions authenticationExtensions = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 2:
                    bArr = dfxj.E(parcel, readInt);
                    break;
                case 3:
                    d = dfxj.p(parcel, readInt);
                    break;
                case 4:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 5:
                    arrayList = dfxj.z(parcel, readInt, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case 6:
                    tokenBinding = (TokenBinding) dfxj.n(parcel, readInt, TokenBinding.CREATOR);
                    break;
                case 7:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 8:
                    authenticationExtensions = (AuthenticationExtensions) dfxj.n(parcel, readInt, AuthenticationExtensions.CREATOR);
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
                userVerificationRequirement = UserVerificationRequirement.a(str);
            } catch (dgkm e) {
                throw new IllegalArgumentException(e);
            }
        }
        return new PublicKeyCredentialRequestOptions(x, d, str2, arrayList, tokenBinding, userVerificationRequirement, authenticationExtensions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PublicKeyCredentialRequestOptions[i];
    }
}
