package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfag;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class HasCapabilitiesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<HasCapabilitiesRequest> CREATOR = new dfag();
    public final Account a;
    public final String[] b;
    public Bundle c;

    public HasCapabilitiesRequest(Account account, String[] strArr, Bundle bundle) {
        this.a = account;
        this.b = strArr;
        this.c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, account, i, false);
        dfxk.C(parcel, 2, this.b);
        dfxk.p(parcel, 3, this.c);
        dfxk.c(parcel, a);
    }
}
