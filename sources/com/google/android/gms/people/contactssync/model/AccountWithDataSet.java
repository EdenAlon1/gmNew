package com.google.android.gms.people.contactssync.model;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhhm;
import defpackage.emxb;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AccountWithDataSet extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountWithDataSet> CREATOR = new dhhm();
    public final Account a;
    public final String b;

    @Deprecated
    private final boolean c;

    public AccountWithDataSet(Account account, String str, boolean z) {
        this.a = account;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountWithDataSet)) {
            return false;
        }
        AccountWithDataSet accountWithDataSet = (AccountWithDataSet) obj;
        return this.c == accountWithDataSet.c && emxb.a(this.a, accountWithDataSet.a) && emxb.a(this.b, accountWithDataSet.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, account, i, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.d(parcel, 3, this.a == null);
        dfxk.c(parcel, a);
    }
}
