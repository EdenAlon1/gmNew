package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dfyk;
import defpackage.dgju;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PublicKeyCredentialCreationOptions extends RequestOptions {
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new dgju();
    public final PublicKeyCredentialRpEntity a;
    public final PublicKeyCredentialUserEntity b;
    public final byte[] c;
    public final List d;
    public final Double e;
    public final List f;
    public final AuthenticatorSelectionCriteria g;
    public final Integer h;
    public final TokenBinding i;
    public final AuthenticationExtensions j;
    public final String k;
    public ResultReceiver l;
    public final List m;
    private final AttestationConveyancePreference n;

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1 A[Catch: JSONException -> 0x0208, TryCatch #2 {JSONException -> 0x0208, blocks: (B:19:0x0032, B:21:0x0042, B:22:0x0048, B:24:0x006d, B:25:0x0073, B:26:0x0091, B:28:0x0097, B:30:0x009b, B:33:0x009f, B:36:0x00a7, B:37:0x00bb, B:39:0x00c1, B:41:0x00c8, B:45:0x00b9, B:52:0x00cf, B:54:0x00d7, B:55:0x00eb, B:57:0x00f1, B:58:0x00fb, B:60:0x0101, B:63:0x0114, B:65:0x011a, B:67:0x0124, B:68:0x012a, B:70:0x0130, B:71:0x0136, B:73:0x013c, B:74:0x0146, B:76:0x014c, B:77:0x0152, B:78:0x015c, B:80:0x0162, B:81:0x016f, B:102:0x0177, B:84:0x0190, B:86:0x0196, B:87:0x01a0, B:89:0x01a6, B:92:0x01b5, B:95:0x01c0, B:99:0x01bc, B:106:0x0183), top: B:18:0x0032, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PublicKeyCredentialCreationOptions(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity r33, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity r34, byte[] r35, java.util.List r36, java.lang.Double r37, java.util.List r38, com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria r39, java.lang.Integer r40, com.google.android.gms.fido.fido2.api.common.TokenBinding r41, java.lang.String r42, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r43, java.lang.String r44, android.os.ResultReceiver r45, java.util.List r46) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.<init>(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity, byte[], java.util.List, java.lang.Double, java.util.List, com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria, java.lang.Integer, com.google.android.gms.fido.fido2.api.common.TokenBinding, java.lang.String, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions, java.lang.String, android.os.ResultReceiver, java.util.List):void");
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        List list3;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        if (dfwq.a(this.a, publicKeyCredentialCreationOptions.a) && dfwq.a(this.b, publicKeyCredentialCreationOptions.b) && Arrays.equals(this.c, publicKeyCredentialCreationOptions.c) && dfwq.a(this.e, publicKeyCredentialCreationOptions.e) && this.d.containsAll(publicKeyCredentialCreationOptions.d) && publicKeyCredentialCreationOptions.d.containsAll(this.d) && ((((list = this.f) == null && publicKeyCredentialCreationOptions.f == null) || (list != null && (list2 = publicKeyCredentialCreationOptions.f) != null && list.containsAll(list2) && publicKeyCredentialCreationOptions.f.containsAll(this.f))) && dfwq.a(this.g, publicKeyCredentialCreationOptions.g) && dfwq.a(this.h, publicKeyCredentialCreationOptions.h) && dfwq.a(this.i, publicKeyCredentialCreationOptions.i) && dfwq.a(this.n, publicKeyCredentialCreationOptions.n) && dfwq.a(this.j, publicKeyCredentialCreationOptions.j) && dfwq.a(this.k, publicKeyCredentialCreationOptions.k))) {
            List list4 = this.m;
            if (list4 == null && publicKeyCredentialCreationOptions.m == null) {
                return true;
            }
            return list4 != null && (list3 = publicKeyCredentialCreationOptions.m) != null && list4.containsAll(list3) && publicKeyCredentialCreationOptions.m.containsAll(this.m);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e, this.f, this.g, this.h, this.i, this.n, this.j, this.k, this.m});
    }

    public final String toString() {
        List list = this.m;
        AuthenticationExtensions authenticationExtensions = this.j;
        AttestationConveyancePreference attestationConveyancePreference = this.n;
        TokenBinding tokenBinding = this.i;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.g;
        List list2 = this.f;
        List list3 = this.d;
        byte[] bArr = this.c;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.b;
        return "PublicKeyCredentialCreationOptions{\n rp=" + this.a.toString() + ", \n user=" + publicKeyCredentialUserEntity.toString() + ", \n challenge=" + dfyk.c(bArr) + ", \n parameters=" + list3.toString() + ", \n timeoutSeconds=" + this.e + ", \n excludeList=" + String.valueOf(list2) + ", \n authenticatorSelection=" + String.valueOf(authenticatorSelectionCriteria) + ", \n requestId=" + this.h + ", \n tokenBinding=" + String.valueOf(tokenBinding) + ", \n attestationConveyancePreference=" + String.valueOf(attestationConveyancePreference) + ", \n authenticationExtensions=" + String.valueOf(authenticationExtensions) + ", \n attestationFormats=" + String.valueOf(list) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 2, publicKeyCredentialRpEntity, i, false);
        dfxk.k(parcel, 3, this.b, i, false);
        dfxk.f(parcel, 4, this.c, false);
        dfxk.n(parcel, 5, this.d, false);
        dfxk.r(parcel, 6, this.e);
        dfxk.n(parcel, 7, this.f, false);
        dfxk.k(parcel, 8, this.g, i, false);
        dfxk.x(parcel, 9, this.h);
        dfxk.k(parcel, 10, this.i, i, false);
        AttestationConveyancePreference attestationConveyancePreference = this.n;
        dfxk.m(parcel, 11, attestationConveyancePreference == null ? null : attestationConveyancePreference.d, false);
        dfxk.k(parcel, 12, this.j, i, false);
        dfxk.m(parcel, 13, this.k, false);
        dfxk.k(parcel, 14, this.l, i, false);
        dfxk.D(parcel, 15, this.m);
        dfxk.c(parcel, a);
    }
}
