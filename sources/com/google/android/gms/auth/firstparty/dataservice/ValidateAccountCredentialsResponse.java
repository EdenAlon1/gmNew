package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dffs;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ValidateAccountCredentialsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ValidateAccountCredentialsResponse> CREATOR = new dffs();
    final int a;
    public final int b;
    public final String c;

    public ValidateAccountCredentialsResponse(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.i(parcel, 2, this.b);
        dfxk.m(parcel, 3, this.c, false);
        dfxk.c(parcel, a);
    }
}
