package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dffn;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PasswordCheckResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PasswordCheckResponse> CREATOR = new dffn();
    final String a;
    final String b;
    final String c;

    public PasswordCheckResponse(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 2, str, false);
        dfxk.m(parcel, 3, this.b, false);
        dfxk.m(parcel, 4, this.c, false);
        dfxk.c(parcel, a);
    }
}
