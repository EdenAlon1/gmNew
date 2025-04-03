package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgjy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        byte[] bArr = null;
        Double d = null;
        String str = null;
        ArrayList arrayList = null;
        Integer num = null;
        TokenBinding tokenBinding = null;
        String str2 = null;
        AuthenticationExtensions authenticationExtensions = null;
        Long l = null;
        String str3 = null;
        ResultReceiver resultReceiver = null;
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
                    str = dfxj.t(parcel, readInt);
                    break;
                case 5:
                    arrayList = dfxj.z(parcel, readInt, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case 6:
                    num = dfxj.r(parcel, readInt);
                    break;
                case 7:
                    tokenBinding = (TokenBinding) dfxj.n(parcel, readInt, TokenBinding.CREATOR);
                    break;
                case 8:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 9:
                    authenticationExtensions = (AuthenticationExtensions) dfxj.n(parcel, readInt, AuthenticationExtensions.CREATOR);
                    break;
                case 10:
                    l = dfxj.s(parcel, readInt);
                    break;
                case 11:
                    str3 = dfxj.t(parcel, readInt);
                    break;
                case 12:
                    resultReceiver = (ResultReceiver) dfxj.n(parcel, readInt, ResultReceiver.CREATOR);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new PublicKeyCredentialRequestOptions(bArr, d, str, arrayList, num, tokenBinding, str2, authenticationExtensions, l, str3, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PublicKeyCredentialRequestOptions[i];
    }
}
