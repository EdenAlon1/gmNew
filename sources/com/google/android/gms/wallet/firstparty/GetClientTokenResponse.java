package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhxq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GetClientTokenResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetClientTokenResponse> CREATOR = new dhxq();
    public byte[] a;

    public GetClientTokenResponse(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.f(parcel, 2, this.a, false);
        dfxk.c(parcel, a);
    }

    GetClientTokenResponse() {
        this(new byte[0]);
    }
}
