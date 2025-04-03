package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfdg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        PublicKeyCredential publicKeyCredential = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 2:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 3:
                    str3 = dfxj.t(parcel, readInt);
                    break;
                case 4:
                    str4 = dfxj.t(parcel, readInt);
                    break;
                case 5:
                    uri = (Uri) dfxj.n(parcel, readInt, Uri.CREATOR);
                    break;
                case 6:
                    str5 = dfxj.t(parcel, readInt);
                    break;
                case 7:
                    str6 = dfxj.t(parcel, readInt);
                    break;
                case 8:
                    str7 = dfxj.t(parcel, readInt);
                    break;
                case 9:
                    publicKeyCredential = (PublicKeyCredential) dfxj.n(parcel, readInt, PublicKeyCredential.CREATOR);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new SignInCredential(str, str2, str3, str4, uri, str5, str6, str7, publicKeyCredential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInCredential[i];
    }
}
