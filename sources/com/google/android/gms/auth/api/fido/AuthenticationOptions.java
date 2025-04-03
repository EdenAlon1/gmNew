package com.google.android.gms.auth.api.fido;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfby;
import defpackage.dfbz;
import defpackage.dfca;
import defpackage.dfcb;
import defpackage.dfcd;
import defpackage.dfce;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dgoz;
import defpackage.kzi;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AuthenticationOptions extends AbstractSafeParcelable implements dfce, dfcb {
    public static final Parcelable.Creator<AuthenticationOptions> CREATOR = new dfby();
    public final PublicKeyCredentialRequestOptions a;
    public final String b;
    public final String c;
    public final BrowserOptions d;
    public final boolean e;
    public final long f;
    private final dgoz g;
    private final kzi h;

    public AuthenticationOptions(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, String str, String str2, BrowserOptions browserOptions, int i, Bundle bundle, boolean z, long j) {
        dgoz b = dgoz.b(i);
        kzi a = bundle == null ? null : dfca.a(bundle);
        dfwv.b(j > 0, "Must provide a valid endTime.");
        dfwv.n(publicKeyCredentialRequestOptions);
        this.a = publicKeyCredentialRequestOptions;
        dfwv.n(str);
        this.b = str;
        dfwv.n(str2);
        this.c = str2;
        this.d = browserOptions;
        this.g = b;
        this.h = a;
        this.e = z;
        this.f = j;
    }

    @Override // defpackage.dfcb
    public final kzi a() {
        return this.h;
    }

    @Override // defpackage.dfce
    public final dgoz b() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationOptions)) {
            return false;
        }
        AuthenticationOptions authenticationOptions = (AuthenticationOptions) obj;
        return dfwq.a(this.a, authenticationOptions.a) && dfwq.a(this.b, authenticationOptions.b) && dfwq.a(this.c, authenticationOptions.c) && dfwq.a(this.d, authenticationOptions.d) && dfwq.a(this.g, authenticationOptions.g) && dfwq.a(this.h, authenticationOptions.h) && dfwq.a(Boolean.valueOf(this.e), Boolean.valueOf(authenticationOptions.e)) && this.f == authenticationOptions.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.g, this.h, Boolean.valueOf(this.e), Long.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 2, publicKeyCredentialRequestOptions, i, false);
        dfxk.m(parcel, 3, this.b, false);
        dfxk.m(parcel, 4, this.c, false);
        dfxk.k(parcel, 5, this.d, i, false);
        dfxk.i(parcel, 6, dfcd.a(this));
        dfxk.p(parcel, 7, dfbz.a(this));
        dfxk.d(parcel, 8, this.e);
        dfxk.j(parcel, 9, this.f);
        dfxk.c(parcel, a);
    }
}
