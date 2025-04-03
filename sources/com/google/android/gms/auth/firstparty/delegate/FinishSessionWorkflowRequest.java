package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dffx;
import defpackage.dfwv;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FinishSessionWorkflowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FinishSessionWorkflowRequest> CREATOR = new dffx();
    public final int a;
    public final AppDescription b;
    public final String c;
    public final AccountAuthenticatorResponse d;
    private final Bundle e;

    public FinishSessionWorkflowRequest(int i, Bundle bundle, AppDescription appDescription, String str, AccountAuthenticatorResponse accountAuthenticatorResponse) {
        this.a = i;
        dfwv.o(bundle, "sessionBundle cannot be null");
        this.e = bundle;
        dfwv.o(appDescription, "callingAppDescription cannot be null");
        this.b = appDescription;
        dfwv.m(str, "accountType must be provided");
        this.c = str;
        this.d = accountAuthenticatorResponse;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.p(parcel, 2, new Bundle(this.e));
        dfxk.k(parcel, 3, this.b, i, false);
        dfxk.m(parcel, 4, this.c, false);
        dfxk.k(parcel, 5, this.d, i, false);
        dfxk.c(parcel, a);
    }
}
