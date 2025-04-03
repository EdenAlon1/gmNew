package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.constellation.PhoneNumberVerification;
import com.google.android.gms.constellation.VerifyPhoneNumberResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgad implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        PhoneNumberVerification[] phoneNumberVerificationArr = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                phoneNumberVerificationArr = (PhoneNumberVerification[]) dfxj.J(parcel, readInt, PhoneNumberVerification.CREATOR);
            } else if (d != 2) {
                dfxj.C(parcel, readInt);
            } else {
                bundle = dfxj.k(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new VerifyPhoneNumberResponse(phoneNumberVerificationArr, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new VerifyPhoneNumberResponse[i];
    }
}
