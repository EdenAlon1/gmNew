package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfcw;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.emwz;
import defpackage.emxa;
import defpackage.engw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalSignInCredentialWrapper extends AbstractSafeParcelable implements Comparable<InternalSignInCredentialWrapper> {
    public static final Parcelable.Creator<InternalSignInCredentialWrapper> CREATOR = new dfcw();
    public final Account a;
    public final SignInCredential b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final boolean f;
    public final long g;
    public final String h;
    public final boolean i;
    public final Intent j;
    private final List k;

    static {
        new Scope("profile");
        new Scope("email");
        new Scope("openid");
        new Scope("https://www.googleapis.com/auth/userinfo.profile");
        new Scope("https://www.googleapis.com/auth/userinfo.email");
    }

    public InternalSignInCredentialWrapper(Account account, SignInCredential signInCredential, List list, boolean z, boolean z2, long j, boolean z3, long j2, String str, boolean z4, Intent intent) {
        this.a = account;
        dfwv.n(signInCredential);
        this.b = signInCredential;
        if (!TextUtils.isEmpty(signInCredential.f)) {
            dfwv.b(list.isEmpty(), "Password credentials should have empty granted-scopes list");
            dfwv.b(!z, "Converted credentials should not contain the original password");
        }
        dfwv.n(list);
        this.k = engw.n(list);
        this.c = z;
        this.d = z2;
        this.e = j;
        this.f = z3;
        this.g = j2;
        this.h = str;
        this.i = z4;
        this.j = intent;
    }

    private final int a() {
        int i = this.d ? 100000 : this.b.f == null ? 1000 : this.a != null ? 100 : 0;
        SignInCredential signInCredential = this.b;
        int i2 = true != TextUtils.isEmpty(signInCredential.b) ? 2 : 1;
        if (!TextUtils.isEmpty(signInCredential.c)) {
            i2++;
        }
        if (!TextUtils.isEmpty(signInCredential.d)) {
            i2++;
        }
        Uri uri = signInCredential.e;
        if (uri != null && !Uri.EMPTY.equals(uri)) {
            i2++;
        }
        return i + i2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(InternalSignInCredentialWrapper internalSignInCredentialWrapper) {
        InternalSignInCredentialWrapper internalSignInCredentialWrapper2 = internalSignInCredentialWrapper;
        int a = a();
        int a2 = internalSignInCredentialWrapper2.a();
        return a == a2 ? Long.compare(this.g, internalSignInCredentialWrapper2.g) : Integer.compare(a, a2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InternalSignInCredentialWrapper)) {
            return false;
        }
        InternalSignInCredentialWrapper internalSignInCredentialWrapper = (InternalSignInCredentialWrapper) obj;
        return dfwq.a(this.a, internalSignInCredentialWrapper.a) && dfwq.a(this.b, internalSignInCredentialWrapper.b) && dfwq.a(this.k, internalSignInCredentialWrapper.k) && this.c == internalSignInCredentialWrapper.c && this.d == internalSignInCredentialWrapper.d && this.e == internalSignInCredentialWrapper.e && this.f == internalSignInCredentialWrapper.f && this.g == internalSignInCredentialWrapper.g && dfwq.a(this.h, internalSignInCredentialWrapper.h) && this.i == internalSignInCredentialWrapper.i && dfwq.a(this.j, internalSignInCredentialWrapper.j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.k, Boolean.valueOf(this.c), Boolean.valueOf(this.d), Long.valueOf(this.e), Boolean.valueOf(this.f), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), this.j});
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("owningAccount", this.a);
        b.b("signInCredential", this.b);
        b.b("grantedScopes", this.k);
        b.h("representsConvertedCredential", this.c);
        b.h("representsLinkedThirdPartyAccount", this.d);
        b.g("linkingTimeInMillis", this.e);
        b.h("autoSelectSupportedByAppAndAccount", this.f);
        b.g("lastUsedTimeMillis", this.g);
        b.b("originalAffiliation", this.h);
        b.h("isUnicornAccount", this.i);
        b.b("fullScreenConsentFlowIntent", this.j);
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, account, i, false);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.n(parcel, 3, new ArrayList(this.k), false);
        dfxk.d(parcel, 4, this.c);
        dfxk.d(parcel, 5, this.d);
        dfxk.j(parcel, 6, this.e);
        dfxk.d(parcel, 7, this.f);
        dfxk.j(parcel, 8, this.g);
        dfxk.m(parcel, 9, this.h, false);
        dfxk.d(parcel, 10, this.i);
        dfxk.k(parcel, 11, this.j, i, false);
        dfxk.c(parcel, a);
    }
}
