package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhwm;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CreateWalletObjectsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreateWalletObjectsRequest> CREATOR = new dhwm();
    LoyaltyWalletObject a;
    OfferWalletObject b;
    GiftCardWalletObject c;
    int d;

    CreateWalletObjectsRequest() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 2, this.a, i, false);
        dfxk.k(parcel, 3, this.b, i, false);
        dfxk.k(parcel, 4, this.c, i, false);
        dfxk.i(parcel, 5, this.d);
        dfxk.c(parcel, a);
    }

    public CreateWalletObjectsRequest(LoyaltyWalletObject loyaltyWalletObject, OfferWalletObject offerWalletObject, GiftCardWalletObject giftCardWalletObject, int i) {
        this.a = loyaltyWalletObject;
        this.b = offerWalletObject;
        this.c = giftCardWalletObject;
        this.d = i;
    }
}
