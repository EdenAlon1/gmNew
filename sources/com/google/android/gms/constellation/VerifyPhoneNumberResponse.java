package com.google.android.gms.constellation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dgad;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class VerifyPhoneNumberResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VerifyPhoneNumberResponse> CREATOR = new dgad();
    public final PhoneNumberVerification[] a;
    public final Bundle b;

    public VerifyPhoneNumberResponse(PhoneNumberVerification[] phoneNumberVerificationArr, Bundle bundle) {
        this.a = phoneNumberVerificationArr;
        this.b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PhoneNumberVerification[] phoneNumberVerificationArr = this.a;
        int a = dfxk.a(parcel);
        dfxk.E(parcel, 1, phoneNumberVerificationArr, i);
        dfxk.p(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }
}
