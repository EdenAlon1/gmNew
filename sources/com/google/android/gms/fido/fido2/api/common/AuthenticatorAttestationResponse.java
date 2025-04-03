package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dgix;
import defpackage.emwz;
import defpackage.emxa;
import defpackage.eoeg;
import defpackage.eyee;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new dgix();
    public final eyee a;
    public final eyee b;
    public final String[] c;
    private final eyee d;

    public AuthenticatorAttestationResponse(eyee eyeeVar, eyee eyeeVar2, eyee eyeeVar3, String[] strArr) {
        this.d = eyeeVar;
        this.a = eyeeVar2;
        this.b = eyeeVar3;
        dfwv.n(strArr);
        this.c = strArr;
    }

    public final byte[] a() {
        return this.b.I();
    }

    public final byte[] b() {
        return this.a.I();
    }

    @Deprecated
    public final byte[] c() {
        return this.d.I();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return dfwq.a(this.d, authenticatorAttestationResponse.d) && dfwq.a(this.a, authenticatorAttestationResponse.a) && dfwq.a(this.b, authenticatorAttestationResponse.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b}))});
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("keyHandle", eoeg.h.j(c()));
        b.b("clientDataJSON", eoeg.h.j(b()));
        b.b("attestationObject", eoeg.h.j(a()));
        b.b("transports", Arrays.toString(this.c));
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.f(parcel, 2, c(), false);
        dfxk.f(parcel, 3, b(), false);
        dfxk.f(parcel, 4, a(), false);
        dfxk.C(parcel, 5, this.c);
        dfxk.c(parcel, a);
    }
}
