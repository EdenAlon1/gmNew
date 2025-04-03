package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfeu;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AccountRemovalRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountRemovalRequest> CREATOR = new dfeu();
    final int a;

    @Deprecated
    String b;
    Account c;

    public AccountRemovalRequest() {
        this.a = 2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.k(parcel, 3, this.c, i, false);
        dfxk.c(parcel, a);
    }

    public AccountRemovalRequest(int i, String str, Account account) {
        this.a = i;
        this.b = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.c = account;
        } else {
            this.c = new Account(str, "com.google");
        }
    }
}
