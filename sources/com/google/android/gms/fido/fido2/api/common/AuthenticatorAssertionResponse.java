package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dgiw;
import defpackage.emwz;
import defpackage.emxa;
import defpackage.eoeg;
import defpackage.eyee;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new dgiw();
    public final eyee a;
    private final eyee b;
    private final eyee c;
    private final eyee d;
    private final eyee e;

    public AuthenticatorAssertionResponse(eyee eyeeVar, eyee eyeeVar2, eyee eyeeVar3, eyee eyeeVar4, eyee eyeeVar5) {
        this.b = eyeeVar;
        this.c = eyeeVar2;
        this.d = eyeeVar3;
        this.e = eyeeVar4;
        this.a = eyeeVar5;
    }

    public final byte[] a() {
        return this.d.I();
    }

    public final byte[] b() {
        return this.c.I();
    }

    @Deprecated
    public final byte[] c() {
        return this.b.I();
    }

    public final byte[] d() {
        return this.e.I();
    }

    public final byte[] e() {
        eyee eyeeVar = this.a;
        if (eyeeVar == null) {
            return null;
        }
        return eyeeVar.I();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        return dfwq.a(this.b, authenticatorAssertionResponse.b) && dfwq.a(this.c, authenticatorAssertionResponse.c) && dfwq.a(this.d, authenticatorAssertionResponse.d) && dfwq.a(this.e, authenticatorAssertionResponse.e) && dfwq.a(this.a, authenticatorAssertionResponse.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e})), Integer.valueOf(Arrays.hashCode(new Object[]{this.a}))});
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("keyHandle", eoeg.h.j(c()));
        b.b("clientDataJSON", eoeg.h.j(b()));
        b.b("authenticatorData", eoeg.h.j(a()));
        b.b("signature", eoeg.h.j(d()));
        byte[] e = e();
        if (e != null) {
            b.b("userHandle", eoeg.h.j(e));
        }
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.f(parcel, 2, c(), false);
        dfxk.f(parcel, 3, b(), false);
        dfxk.f(parcel, 4, a(), false);
        dfxk.f(parcel, 5, d(), false);
        dfxk.f(parcel, 6, e(), false);
        dfxk.c(parcel, a);
    }
}
