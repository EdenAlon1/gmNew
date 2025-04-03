package com.google.android.gms.auth.frp;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfhp;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FrpUnlockRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FrpUnlockRequest> CREATOR = new dfhp();
    public final String a;
    public final Account b;

    public FrpUnlockRequest(String str, Account account) {
        this.a = str;
        this.b = account;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.c(parcel, a);
    }
}
