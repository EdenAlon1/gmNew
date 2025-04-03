package com.google.android.gms.auth.api.fido;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfbz;
import defpackage.dfca;
import defpackage.dfcb;
import defpackage.dfcd;
import defpackage.dfce;
import defpackage.dfci;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dgoz;
import defpackage.kzi;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RegistrationOptions extends AbstractSafeParcelable implements dfce, dfcb {
    public static final Parcelable.Creator<RegistrationOptions> CREATOR = new dfci();
    public final PublicKeyCredentialCreationOptions a;
    public final String b;
    public final String c;
    public final BrowserOptions d;
    public final Account e;
    public final boolean f;
    public final long g;
    private final dgoz h;
    private final kzi i;

    public RegistrationOptions(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, String str, String str2, BrowserOptions browserOptions, Account account, int i, Bundle bundle, Boolean bool, long j) {
        dgoz b = dgoz.b(i);
        kzi a = bundle == null ? null : dfca.a(bundle);
        dfwv.b(j > 0, "Must provide a valid endTime.");
        dfwv.n(publicKeyCredentialCreationOptions);
        this.a = publicKeyCredentialCreationOptions;
        dfwv.n(str);
        this.b = str;
        dfwv.n(str2);
        this.c = str2;
        this.d = browserOptions;
        this.e = account;
        this.h = b;
        this.i = a;
        this.f = bool.booleanValue();
        this.g = j;
    }

    @Override // defpackage.dfcb
    public final kzi a() {
        return this.i;
    }

    @Override // defpackage.dfce
    public final dgoz b() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RegistrationOptions)) {
            return false;
        }
        RegistrationOptions registrationOptions = (RegistrationOptions) obj;
        return dfwq.a(this.a, registrationOptions.a) && dfwq.a(this.b, registrationOptions.b) && dfwq.a(this.c, registrationOptions.c) && dfwq.a(this.d, registrationOptions.d) && dfwq.a(this.e, registrationOptions.e) && dfwq.a(this.h, registrationOptions.h) && dfwq.a(this.i, registrationOptions.i) && dfwq.a(Boolean.valueOf(this.f), Boolean.valueOf(registrationOptions.f)) && this.g == registrationOptions.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.h, this.i, Boolean.valueOf(this.f), Long.valueOf(this.g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 2, publicKeyCredentialCreationOptions, i, false);
        dfxk.m(parcel, 3, this.b, false);
        dfxk.m(parcel, 4, this.c, false);
        dfxk.k(parcel, 5, this.d, i, false);
        dfxk.k(parcel, 6, this.e, i, false);
        dfxk.i(parcel, 7, dfcd.a(this));
        dfxk.p(parcel, 8, dfbz.a(this));
        dfxk.d(parcel, 9, this.f);
        dfxk.j(parcel, 10, this.g);
        dfxk.c(parcel, a);
    }
}
