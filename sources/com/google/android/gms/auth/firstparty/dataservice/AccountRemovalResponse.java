package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfev;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AccountRemovalResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountRemovalResponse> CREATOR = new dfev();
    final int a;
    final String b;

    public AccountRemovalResponse(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.c(parcel, a);
    }
}
