package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.dfxk;
import defpackage.dhxa;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PaymentData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentData> CREATOR = new dhxa();
    String a;
    CardInfo b;
    UserAddress c;
    PaymentMethodToken d;
    String e;
    Bundle f;
    String g;
    Bundle h;

    private PaymentData() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, this.a, false);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.k(parcel, 3, this.c, i, false);
        dfxk.k(parcel, 4, this.d, i, false);
        dfxk.m(parcel, 5, this.e, false);
        dfxk.p(parcel, 6, this.f);
        dfxk.m(parcel, 7, this.g, false);
        dfxk.p(parcel, 8, this.h);
        dfxk.c(parcel, a);
    }

    public PaymentData(String str, CardInfo cardInfo, UserAddress userAddress, PaymentMethodToken paymentMethodToken, String str2, Bundle bundle, String str3, Bundle bundle2) {
        this.a = str;
        this.b = cardInfo;
        this.c = userAddress;
        this.d = paymentMethodToken;
        this.e = str2;
        this.f = bundle;
        this.g = str3;
        this.h = bundle2;
    }
}
