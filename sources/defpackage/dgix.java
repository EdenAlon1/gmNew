package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgix implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        String[] strArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                bArr = dfxj.E(parcel, readInt);
            } else if (d == 3) {
                bArr2 = dfxj.E(parcel, readInt);
            } else if (d == 4) {
                bArr3 = dfxj.E(parcel, readInt);
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                strArr = dfxj.K(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        dfwv.n(bArr);
        eyee x = eyee.x(bArr);
        dfwv.n(bArr2);
        eyee x2 = eyee.x(bArr2);
        dfwv.n(bArr3);
        return new AuthenticatorAttestationResponse(x, x2, eyee.x(bArr3), strArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticatorAttestationResponse[i];
    }
}
