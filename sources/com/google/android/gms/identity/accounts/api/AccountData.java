package com.google.android.gms.identity.accounts.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dgoy;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AccountData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountData> CREATOR = new dgoy();
    public final String a;
    public final String b;

    public AccountData(String str, String str2) {
        dfwv.m(str, "Account name must not be empty.");
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.c(parcel, a);
    }
}
