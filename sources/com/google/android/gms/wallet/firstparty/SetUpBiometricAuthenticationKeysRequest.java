package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhxs;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SetUpBiometricAuthenticationKeysRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetUpBiometricAuthenticationKeysRequest> CREATOR = new dhxs();
    byte[] a;

    public SetUpBiometricAuthenticationKeysRequest(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.f(parcel, 1, this.a, false);
        dfxk.c(parcel, a);
    }

    public SetUpBiometricAuthenticationKeysRequest() {
        this(null);
    }
}
