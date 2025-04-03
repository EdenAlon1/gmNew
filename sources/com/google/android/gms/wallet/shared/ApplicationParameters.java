package com.google.android.gms.wallet.shared;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import defpackage.dfxk;
import defpackage.dhyg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ApplicationParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApplicationParameters> CREATOR = new dhyg();
    final int a;
    Account b;
    Bundle c;
    final boolean d;
    final int e;
    WalletCustomTheme f;
    final int g;
    double h;
    double i;
    final int j;
    final int k;

    ApplicationParameters() {
        this.d = false;
        this.a = 1;
        this.e = 1;
        this.g = 0;
        this.j = 0;
        this.k = -1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 2, this.a);
        dfxk.k(parcel, 3, this.b, i, false);
        dfxk.p(parcel, 4, this.c);
        dfxk.d(parcel, 5, this.d);
        dfxk.i(parcel, 6, this.e);
        dfxk.k(parcel, 7, this.f, i, false);
        dfxk.i(parcel, 8, this.g);
        dfxk.g(parcel, 9, this.h);
        dfxk.g(parcel, 10, this.i);
        dfxk.i(parcel, 11, this.j);
        dfxk.i(parcel, 12, this.k);
        dfxk.c(parcel, a);
    }

    public ApplicationParameters(int i, Account account, Bundle bundle, boolean z, int i2, WalletCustomTheme walletCustomTheme, int i3, double d, double d2, int i4, int i5) {
        this.a = i;
        this.b = account;
        this.c = bundle;
        this.d = z;
        this.e = i2;
        this.f = walletCustomTheme;
        this.g = i3;
        this.h = d;
        this.i = d2;
        this.j = i4;
        this.k = i5;
    }
}
