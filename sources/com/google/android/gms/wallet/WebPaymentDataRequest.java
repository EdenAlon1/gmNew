package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhxi;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class WebPaymentDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebPaymentDataRequest> CREATOR = new dhxi();
    Cart a;
    String b;
    String c;
    byte[] d;
    Bundle e;

    private WebPaymentDataRequest() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 2, this.a, i, false);
        dfxk.m(parcel, 3, this.b, false);
        dfxk.m(parcel, 4, this.c, false);
        dfxk.p(parcel, 5, this.e);
        dfxk.f(parcel, 6, this.d, false);
        dfxk.c(parcel, a);
    }

    public WebPaymentDataRequest(Cart cart, String str, String str2, byte[] bArr, Bundle bundle) {
        this.a = cart;
        this.b = str;
        this.c = str2;
        this.d = bArr;
        this.e = bundle;
    }
}
