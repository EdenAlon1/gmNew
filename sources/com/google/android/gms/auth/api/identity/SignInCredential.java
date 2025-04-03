package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import defpackage.dfdg;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInCredential> CREATOR = new dfdg();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public final String f;
    public final String g;
    public final String h;
    public final PublicKeyCredential i;

    public SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, PublicKeyCredential publicKeyCredential) {
        dfwv.n(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = publicKeyCredential;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        return dfwq.a(this.a, signInCredential.a) && dfwq.a(this.b, signInCredential.b) && dfwq.a(this.c, signInCredential.c) && dfwq.a(this.d, signInCredential.d) && dfwq.a(this.e, signInCredential.e) && dfwq.a(this.f, signInCredential.f) && dfwq.a(this.g, signInCredential.g) && dfwq.a(this.h, signInCredential.h) && dfwq.a(this.i, signInCredential.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.m(parcel, 3, this.c, false);
        dfxk.m(parcel, 4, this.d, false);
        dfxk.k(parcel, 5, this.e, i, false);
        dfxk.m(parcel, 6, this.f, false);
        dfxk.m(parcel, 7, this.g, false);
        dfxk.m(parcel, 8, this.h, false);
        dfxk.k(parcel, 9, this.i, i, false);
        dfxk.c(parcel, a);
    }
}
