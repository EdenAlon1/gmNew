package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfea;
import defpackage.dfwv;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new dfea();

    @Deprecated
    final String a;
    public final GoogleSignInAccount b;

    @Deprecated
    final String c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.b = googleSignInAccount;
        dfwv.m(str, "8.3 and 8.4 SDKs require non-null email");
        this.a = str;
        dfwv.m(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 4, str, false);
        dfxk.k(parcel, 7, this.b, i, false);
        dfxk.m(parcel, 8, this.c, false);
        dfxk.c(parcel, a);
    }
}
