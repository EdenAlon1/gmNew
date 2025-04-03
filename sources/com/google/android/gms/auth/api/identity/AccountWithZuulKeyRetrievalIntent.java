package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfcj;
import defpackage.dfwv;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AccountWithZuulKeyRetrievalIntent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountWithZuulKeyRetrievalIntent> CREATOR = new dfcj();
    public final Account a;
    public final PendingIntent b;

    public AccountWithZuulKeyRetrievalIntent(Account account, PendingIntent pendingIntent) {
        dfwv.n(account);
        this.a = account;
        dfwv.n(pendingIntent);
        this.b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, account, i, false);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.c(parcel, a);
    }
}
