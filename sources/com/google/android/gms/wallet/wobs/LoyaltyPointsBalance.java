package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhym;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LoyaltyPointsBalance extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyPointsBalance> CREATOR = new dhym();
    final int a;
    String b;
    final double c;
    String d;
    long e;
    final int f;

    LoyaltyPointsBalance() {
        this.f = -1;
        this.a = -1;
        this.c = -1.0d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 2, this.a);
        dfxk.m(parcel, 3, this.b, false);
        dfxk.g(parcel, 4, this.c);
        dfxk.m(parcel, 5, this.d, false);
        dfxk.j(parcel, 6, this.e);
        dfxk.i(parcel, 7, this.f);
        dfxk.c(parcel, a);
    }

    public LoyaltyPointsBalance(int i, String str, double d, String str2, long j, int i2) {
        this.a = i;
        this.b = str;
        this.c = d;
        this.d = str2;
        this.e = j;
        this.f = i2;
    }
}
