package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import defpackage.dfxk;
import defpackage.dhyd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class WalletFragmentInitParams extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<WalletFragmentInitParams> CREATOR = new dhyd();
    public String a;
    public MaskedWalletRequest b;
    public final int c;
    public MaskedWallet d;

    private WalletFragmentInitParams() {
        this.c = -1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 2, this.a, false);
        dfxk.k(parcel, 3, this.b, i, false);
        dfxk.i(parcel, 4, this.c);
        dfxk.k(parcel, 5, this.d, i, false);
        dfxk.c(parcel, a);
    }

    public WalletFragmentInitParams(String str, MaskedWalletRequest maskedWalletRequest, int i, MaskedWallet maskedWallet) {
        this.a = str;
        this.b = maskedWalletRequest;
        this.c = i;
        this.d = maskedWallet;
    }
}
