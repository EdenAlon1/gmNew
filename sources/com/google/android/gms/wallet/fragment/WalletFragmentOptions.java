package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhye;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class WalletFragmentOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<WalletFragmentOptions> CREATOR = new dhye();
    public final int a;
    public int b;
    public final WalletFragmentStyle c;
    public int d;

    public WalletFragmentOptions(int i, int i2, WalletFragmentStyle walletFragmentStyle, int i3) {
        this.a = i;
        this.b = i2;
        this.c = walletFragmentStyle;
        this.d = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 2, this.a);
        dfxk.i(parcel, 3, this.b);
        dfxk.k(parcel, 4, this.c, i, false);
        dfxk.i(parcel, 5, this.d);
        dfxk.c(parcel, a);
    }

    private WalletFragmentOptions() {
        this.a = 3;
        this.c = new WalletFragmentStyle();
    }
}
