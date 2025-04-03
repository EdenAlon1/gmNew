package com.google.android.gms.auth.api.fido;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement;
import defpackage.dfcg;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dfyk;
import defpackage.engw;
import defpackage.eyee;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PublicKeyCredentialRequestOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialRequestOptions> CREATOR = new dfcg();
    public final Double a;
    public final String b;
    public final engw c;
    public final TokenBinding d;
    public final AuthenticationExtensions e;
    private final eyee f;
    private final UserVerificationRequirement g;

    public PublicKeyCredentialRequestOptions(eyee eyeeVar, Double d, String str, List list, TokenBinding tokenBinding, UserVerificationRequirement userVerificationRequirement, AuthenticationExtensions authenticationExtensions) {
        this.f = eyeeVar;
        this.a = d;
        dfwv.l(str);
        this.b = str;
        this.c = list == null ? null : engw.n(list);
        this.d = tokenBinding;
        this.g = userVerificationRequirement;
        this.e = authenticationExtensions;
    }

    public final boolean equals(Object obj) {
        engw engwVar;
        engw engwVar2;
        if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        return dfwq.a(this.f, publicKeyCredentialRequestOptions.f) && dfwq.a(this.a, publicKeyCredentialRequestOptions.a) && dfwq.a(this.b, publicKeyCredentialRequestOptions.b) && (((engwVar = this.c) == null && publicKeyCredentialRequestOptions.c == null) || (engwVar != null && (engwVar2 = publicKeyCredentialRequestOptions.c) != null && engwVar.containsAll(engwVar2) && publicKeyCredentialRequestOptions.c.containsAll(this.c))) && dfwq.a(this.d, publicKeyCredentialRequestOptions.d) && dfwq.a(this.g, publicKeyCredentialRequestOptions.g) && dfwq.a(this.e, publicKeyCredentialRequestOptions.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f, this.a, this.b, this.c, this.d, this.g, this.e});
    }

    public final String toString() {
        return String.format(Locale.US, "PublicKeyCredentialCreationOptions: {\nchallenge: %s\ntimeoutSeconds: %s\nrpId: %s\nallowList: %s\ntokenBinding: %s\nauthenticationExtensions :%s}", dfyk.c(this.f.I()), this.a, this.b, this.c, this.d, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        eyee eyeeVar = this.f;
        int a = dfxk.a(parcel);
        dfxk.f(parcel, 2, eyeeVar.I(), false);
        dfxk.r(parcel, 3, this.a);
        dfxk.m(parcel, 4, this.b, false);
        dfxk.n(parcel, 5, this.c, false);
        dfxk.k(parcel, 6, this.d, i, false);
        UserVerificationRequirement userVerificationRequirement = this.g;
        dfxk.m(parcel, 7, userVerificationRequirement == null ? null : userVerificationRequirement.d, false);
        dfxk.k(parcel, 8, this.e, i, false);
        dfxk.c(parcel, a);
    }
}
