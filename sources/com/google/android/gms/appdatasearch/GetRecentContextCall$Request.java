package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.devr;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetRecentContextCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetRecentContextCall$Request> CREATOR = new devr();
    public final Account a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public GetRecentContextCall$Request(Account account, boolean z, boolean z2, boolean z3, String str) {
        this.a = account;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, this.a, i, false);
        dfxk.d(parcel, 2, this.b);
        dfxk.d(parcel, 3, this.c);
        dfxk.d(parcel, 4, this.d);
        dfxk.m(parcel, 5, this.e, false);
        dfxk.c(parcel, a);
    }

    public GetRecentContextCall$Request() {
        this(null, false, false, false, null);
    }
}
