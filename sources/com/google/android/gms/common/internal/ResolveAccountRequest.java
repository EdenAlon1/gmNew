package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwx;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ResolveAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountRequest> CREATOR = new dfwx();
    final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    public ResolveAccountRequest(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.i(parcel, 3, this.c);
        dfxk.k(parcel, 4, this.d, i, false);
        dfxk.c(parcel, a);
    }
}
