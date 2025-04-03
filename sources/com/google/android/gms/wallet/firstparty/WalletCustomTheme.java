package com.google.android.gms.wallet.firstparty;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhxu;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class WalletCustomTheme extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WalletCustomTheme> CREATOR = new dhxu();
    final int a;
    final int b;
    final int c;
    final Bundle d;
    final String e;

    public WalletCustomTheme(int i, Bundle bundle, String str, int i2, int i3) {
        this.d = bundle;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 2, this.a);
        dfxk.p(parcel, 3, this.d);
        dfxk.m(parcel, 4, this.e, false);
        dfxk.i(parcel, 5, this.b);
        dfxk.i(parcel, 6, this.c);
        dfxk.c(parcel, a);
    }

    public WalletCustomTheme() {
        this.b = 0;
        this.c = 0;
        this.a = 0;
        this.d = new Bundle();
        this.e = "";
    }
}
