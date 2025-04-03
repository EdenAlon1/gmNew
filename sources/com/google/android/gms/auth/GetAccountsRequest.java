package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dezr;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetAccountsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetAccountsRequest> CREATOR = new dezr();
    public final String a;
    public final String[] b;

    public GetAccountsRequest(String str, String[] strArr) {
        this.a = str;
        this.b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.C(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }
}
