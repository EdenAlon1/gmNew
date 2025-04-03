package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dgiy;
import defpackage.dgjj;
import defpackage.emwz;
import defpackage.emxa;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AuthenticatorErrorResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new dgiy();
    public final ErrorCode a;
    public final String b;
    public final int c;

    public AuthenticatorErrorResponse(int i, String str, int i2) {
        try {
            this.a = ErrorCode.a(i);
            this.b = str;
            this.c = i2;
        } catch (dgjj e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        return dfwq.a(this.a, authenticatorErrorResponse.a) && dfwq.a(this.b, authenticatorErrorResponse.b) && dfwq.a(Integer.valueOf(this.c), Integer.valueOf(authenticatorErrorResponse.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.f("errorCode", this.a.m);
        String str = this.b;
        if (str != null) {
            b.b("errorMessage", str);
        }
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 2, this.a.m);
        dfxk.m(parcel, 3, this.b, false);
        dfxk.i(parcel, 4, this.c);
        dfxk.c(parcel, a);
    }
}
