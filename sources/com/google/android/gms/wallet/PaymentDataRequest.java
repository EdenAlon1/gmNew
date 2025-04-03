package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhxb;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PaymentDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentDataRequest> CREATOR = new dhxb();
    boolean a;
    boolean b;
    CardRequirements c;
    boolean d;
    ShippingAddressRequirements e;
    ArrayList f;
    PaymentMethodTokenizationParameters g;
    TransactionInfo h;
    final boolean i;
    String j;
    byte[] k;
    Bundle l;

    private PaymentDataRequest() {
        this.i = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.d(parcel, 1, this.a);
        dfxk.d(parcel, 2, this.b);
        dfxk.k(parcel, 3, this.c, i, false);
        dfxk.d(parcel, 4, this.d);
        dfxk.k(parcel, 5, this.e, i, false);
        dfxk.w(parcel, 6, this.f);
        dfxk.k(parcel, 7, this.g, i, false);
        dfxk.k(parcel, 8, this.h, i, false);
        dfxk.d(parcel, 9, this.i);
        dfxk.m(parcel, 10, this.j, false);
        dfxk.p(parcel, 11, this.l);
        dfxk.f(parcel, 12, this.k, false);
        dfxk.c(parcel, a);
    }

    public PaymentDataRequest(boolean z, boolean z2, CardRequirements cardRequirements, boolean z3, ShippingAddressRequirements shippingAddressRequirements, ArrayList arrayList, PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, TransactionInfo transactionInfo, boolean z4, String str, byte[] bArr, Bundle bundle) {
        this.a = z;
        this.b = z2;
        this.c = cardRequirements;
        this.d = z3;
        this.e = shippingAddressRequirements;
        this.f = arrayList;
        this.g = paymentMethodTokenizationParameters;
        this.h = transactionInfo;
        this.i = z4;
        this.j = str;
        this.k = bArr;
        this.l = bundle;
    }
}
