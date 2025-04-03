package com.google.android.gms.people.identity.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhio;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AccountToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountToken> CREATOR = new dhio();
    public final String a;
    public final String b;

    public AccountToken(String str, String str2) {
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
