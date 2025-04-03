package com.google.android.gms.wallet.fragment;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhyf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class WalletFragmentStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WalletFragmentStyle> CREATOR = new dhyf();
    final Bundle a;
    int b;

    public WalletFragmentStyle(Bundle bundle, int i) {
        this.a = bundle;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.p(parcel, 2, this.a);
        dfxk.i(parcel, 3, this.b);
        dfxk.c(parcel, a);
    }

    public WalletFragmentStyle() {
        Bundle bundle = new Bundle();
        this.a = bundle;
        bundle.putInt("buyButtonAppearanceDefault", 4);
        bundle.putInt("maskedWalletDetailsLogoImageTypeDefault", 3);
    }
}
