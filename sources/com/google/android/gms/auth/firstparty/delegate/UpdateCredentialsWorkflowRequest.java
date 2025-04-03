package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfgb;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class UpdateCredentialsWorkflowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UpdateCredentialsWorkflowRequest> CREATOR = new dfgb();
    final int a;

    @Deprecated
    String b;
    AppDescription c;
    final Bundle d;
    Account e;
    AccountAuthenticatorResponse f;

    public UpdateCredentialsWorkflowRequest() {
        this.a = 3;
        this.d = new Bundle();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.k(parcel, 3, this.c, i, false);
        dfxk.p(parcel, 4, this.d);
        dfxk.k(parcel, 5, this.e, i, false);
        dfxk.k(parcel, 6, this.f, i, false);
        dfxk.c(parcel, a);
    }

    public UpdateCredentialsWorkflowRequest(int i, String str, AppDescription appDescription, Bundle bundle, Account account, AccountAuthenticatorResponse accountAuthenticatorResponse) {
        this.a = i;
        this.b = str;
        this.c = appDescription;
        this.d = bundle;
        if (account != null || TextUtils.isEmpty(str)) {
            this.e = account;
        } else {
            this.e = new Account(str, "com.google");
        }
        this.f = accountAuthenticatorResponse;
    }
}
