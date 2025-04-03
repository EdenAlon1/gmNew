package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhxn;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class GetBuyFlowInitializationTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetBuyFlowInitializationTokenRequest> CREATOR = new dhxn();
    byte[] a;
    byte[] b;

    public GetBuyFlowInitializationTokenRequest(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.f(parcel, 2, this.a, false);
        dfxk.f(parcel, 3, this.b, false);
        dfxk.c(parcel, a);
    }

    GetBuyFlowInitializationTokenRequest() {
        this(null, null);
    }
}
