package com.google.android.gms.auth.api.fido;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import defpackage.dfcf;
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
public class PublicKeyCredentialCreationOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new dfcf();
    public final PublicKeyCredentialRpEntity a;
    public final PublicKeyCredentialUserEntity b;
    public final engw c;
    public final Double d;
    public final engw e;
    public final AuthenticatorSelectionCriteria f;
    public final TokenBinding g;
    public final AuthenticationExtensions h;
    public final engw i;
    private final eyee j;
    private final AttestationConveyancePreference k;

    public PublicKeyCredentialCreationOptions(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, eyee eyeeVar, List list, Double d, List list2, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, TokenBinding tokenBinding, AttestationConveyancePreference attestationConveyancePreference, AuthenticationExtensions authenticationExtensions, List list3) {
        dfwv.o(publicKeyCredentialRpEntity, "relying party entity shouldn't be null");
        this.a = publicKeyCredentialRpEntity;
        dfwv.o(publicKeyCredentialUserEntity, "user entity shouldn't be null");
        this.b = publicKeyCredentialUserEntity;
        this.j = eyeeVar;
        dfwv.o(list, "parameters shouldn't be null");
        this.c = engw.n(list);
        this.d = d;
        this.e = list2 == null ? null : engw.n(list2);
        this.f = authenticatorSelectionCriteria;
        this.g = tokenBinding;
        this.k = attestationConveyancePreference;
        this.h = authenticationExtensions;
        this.i = list3 != null ? engw.n(list3) : null;
    }

    public final String a() {
        AttestationConveyancePreference attestationConveyancePreference = this.k;
        if (attestationConveyancePreference == null) {
            return null;
        }
        return attestationConveyancePreference.d;
    }

    public final boolean equals(Object obj) {
        engw engwVar;
        engw engwVar2;
        engw engwVar3;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        if (dfwq.a(this.a, publicKeyCredentialCreationOptions.a) && dfwq.a(this.b, publicKeyCredentialCreationOptions.b) && dfwq.a(this.j, publicKeyCredentialCreationOptions.j) && dfwq.a(this.d, publicKeyCredentialCreationOptions.d) && this.c.containsAll(publicKeyCredentialCreationOptions.c) && publicKeyCredentialCreationOptions.c.containsAll(this.c) && ((((engwVar = this.e) == null && publicKeyCredentialCreationOptions.e == null) || (engwVar != null && (engwVar2 = publicKeyCredentialCreationOptions.e) != null && engwVar.containsAll(engwVar2) && publicKeyCredentialCreationOptions.e.containsAll(this.e))) && dfwq.a(this.f, publicKeyCredentialCreationOptions.f) && dfwq.a(this.g, publicKeyCredentialCreationOptions.g) && dfwq.a(this.k, publicKeyCredentialCreationOptions.k) && dfwq.a(this.h, publicKeyCredentialCreationOptions.h))) {
            engw engwVar4 = this.i;
            if (engwVar4 == null && publicKeyCredentialCreationOptions.i == null) {
                return true;
            }
            return engwVar4 != null && (engwVar3 = publicKeyCredentialCreationOptions.i) != null && engwVar4.containsAll(engwVar3) && publicKeyCredentialCreationOptions.i.containsAll(this.i);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.j, this.c, this.d, this.e, this.f, this.g, this.k, this.h, this.i});
    }

    public final String toString() {
        return String.format(Locale.US, "PublicKeyCredentialCreationOptions: {\nrp: %s\nuser: %s\nchallenge: %s\ntimeoutSeconds: %s\nparameters: %s\nexcludeList: %s\nauthenticatorSelection: %s\ntokenBinding: %s\nattestationConveyancePreference: %s\nauthenticationExtensions :%s\nattestationFormats: %s}", this.a, this.b, dfyk.c(this.j.I()), this.d, this.c, this.e, this.f, this.g, a(), this.h, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 2, publicKeyCredentialRpEntity, i, false);
        dfxk.k(parcel, 3, this.b, i, false);
        dfxk.f(parcel, 4, this.j.I(), false);
        dfxk.n(parcel, 5, this.c, false);
        dfxk.r(parcel, 6, this.d);
        dfxk.n(parcel, 7, this.e, false);
        dfxk.k(parcel, 8, this.f, i, false);
        dfxk.k(parcel, 9, this.g, i, false);
        dfxk.m(parcel, 10, a(), false);
        dfxk.k(parcel, 11, this.h, i, false);
        dfxk.D(parcel, 12, this.i);
        dfxk.c(parcel, a);
    }
}
