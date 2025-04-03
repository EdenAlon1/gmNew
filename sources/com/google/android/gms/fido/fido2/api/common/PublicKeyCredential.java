package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfyk;
import defpackage.dgjv;
import defpackage.eyee;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PublicKeyCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new dgjv();
    public final String a;
    public final String b;
    public final AuthenticatorAttestationResponse c;
    public final AuthenticatorAssertionResponse d;
    public final AuthenticatorErrorResponse e;
    public final AuthenticationExtensionsClientOutputs f;
    public final String g;
    public String h;
    private final eyee i;

    public PublicKeyCredential(String str, String str2, eyee eyeeVar, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3) {
        boolean z = true;
        dfwv.b((authenticatorAttestationResponse != null && authenticatorAssertionResponse == null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse != null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse == null && authenticatorErrorResponse != null), "Must provide a response object.");
        if (authenticatorErrorResponse == null && (str == null || eyeeVar == null)) {
            z = false;
        }
        dfwv.b(z, "Must provide id and rawId if not an error response.");
        this.a = str;
        this.b = str2;
        this.i = eyeeVar;
        this.c = authenticatorAttestationResponse;
        this.d = authenticatorAssertionResponse;
        this.e = authenticatorErrorResponse;
        this.f = authenticationExtensionsClientOutputs;
        this.g = str3;
        this.h = null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        return dfwq.a(this.a, publicKeyCredential.a) && dfwq.a(this.b, publicKeyCredential.b) && dfwq.a(this.i, publicKeyCredential.i) && dfwq.a(this.c, publicKeyCredential.c) && dfwq.a(this.d, publicKeyCredential.d) && dfwq.a(this.e, publicKeyCredential.e) && dfwq.a(this.f, publicKeyCredential.f) && dfwq.a(this.g, publicKeyCredential.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.i, this.d, this.c, this.e, this.f, this.g});
    }

    public final String toString() {
        eyee eyeeVar = this.i;
        byte[] I = eyeeVar == null ? null : eyeeVar.I();
        String str = this.b;
        String str2 = this.a;
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.c;
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.d;
        AuthenticatorErrorResponse authenticatorErrorResponse = this.e;
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.f;
        String str3 = this.g;
        return "PublicKeyCredential{\n id='" + str2 + "', \n type='" + str + "', \n rawId=" + dfyk.c(I) + ", \n registerResponse=" + String.valueOf(authenticatorAttestationResponse) + ", \n signResponse=" + String.valueOf(authenticatorAssertionResponse) + ", \n errorResponse=" + String.valueOf(authenticatorErrorResponse) + ", \n extensionsClientOutputs=" + String.valueOf(authenticationExtensionsClientOutputs) + ", \n authenticatorAttachment='" + str3 + "'}";
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x033a A[Catch: JSONException -> 0x035c, TryCatch #5 {JSONException -> 0x035c, blocks: (B:12:0x000a, B:14:0x0013, B:16:0x001a, B:17:0x0029, B:19:0x002d, B:20:0x0032, B:22:0x0036, B:24:0x003a, B:25:0x003f, B:27:0x0043, B:28:0x0048, B:37:0x033a, B:38:0x033d, B:41:0x0343, B:44:0x034d, B:31:0x009c, B:33:0x0309, B:52:0x032e, B:53:0x0335, B:158:0x0301, B:159:0x0308, B:167:0x0094, B:168:0x009b, B:161:0x0052, B:163:0x007e, B:46:0x0312, B:48:0x0324, B:55:0x00a0, B:56:0x00c3, B:58:0x00ca, B:60:0x00d6, B:62:0x00e3, B:63:0x00dc, B:66:0x00e6, B:68:0x00ef, B:70:0x0109, B:72:0x011a, B:73:0x0120, B:75:0x0124, B:77:0x0136, B:79:0x0154, B:80:0x016d, B:85:0x0194, B:91:0x0294, B:93:0x02a6, B:95:0x01b7, B:97:0x01ce, B:102:0x01e3, B:105:0x0204, B:107:0x0218, B:109:0x021e, B:110:0x023b, B:111:0x0240, B:112:0x0241, B:113:0x0246, B:118:0x0252, B:120:0x0261, B:122:0x026f, B:123:0x0287, B:124:0x028c, B:125:0x028d, B:126:0x0292, B:128:0x02b3, B:129:0x02b8, B:131:0x02ba, B:132:0x02c1, B:133:0x02c2, B:134:0x02c7, B:138:0x02cb, B:139:0x02d2, B:141:0x02d3, B:142:0x02da, B:144:0x02dc, B:145:0x02e3, B:146:0x02e4, B:147:0x02eb, B:149:0x02ed, B:150:0x02f4, B:154:0x02f8, B:155:0x02ff), top: B:11:0x000a, inners: #1, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0343 A[Catch: JSONException -> 0x035c, TRY_ENTER, TryCatch #5 {JSONException -> 0x035c, blocks: (B:12:0x000a, B:14:0x0013, B:16:0x001a, B:17:0x0029, B:19:0x002d, B:20:0x0032, B:22:0x0036, B:24:0x003a, B:25:0x003f, B:27:0x0043, B:28:0x0048, B:37:0x033a, B:38:0x033d, B:41:0x0343, B:44:0x034d, B:31:0x009c, B:33:0x0309, B:52:0x032e, B:53:0x0335, B:158:0x0301, B:159:0x0308, B:167:0x0094, B:168:0x009b, B:161:0x0052, B:163:0x007e, B:46:0x0312, B:48:0x0324, B:55:0x00a0, B:56:0x00c3, B:58:0x00ca, B:60:0x00d6, B:62:0x00e3, B:63:0x00dc, B:66:0x00e6, B:68:0x00ef, B:70:0x0109, B:72:0x011a, B:73:0x0120, B:75:0x0124, B:77:0x0136, B:79:0x0154, B:80:0x016d, B:85:0x0194, B:91:0x0294, B:93:0x02a6, B:95:0x01b7, B:97:0x01ce, B:102:0x01e3, B:105:0x0204, B:107:0x0218, B:109:0x021e, B:110:0x023b, B:111:0x0240, B:112:0x0241, B:113:0x0246, B:118:0x0252, B:120:0x0261, B:122:0x026f, B:123:0x0287, B:124:0x028c, B:125:0x028d, B:126:0x0292, B:128:0x02b3, B:129:0x02b8, B:131:0x02ba, B:132:0x02c1, B:133:0x02c2, B:134:0x02c7, B:138:0x02cb, B:139:0x02d2, B:141:0x02d3, B:142:0x02da, B:144:0x02dc, B:145:0x02e3, B:146:0x02e4, B:147:0x02eb, B:149:0x02ed, B:150:0x02f4, B:154:0x02f8, B:155:0x02ff), top: B:11:0x000a, inners: #1, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a6 A[Catch: JSONException -> 0x0300, TRY_LEAVE, TryCatch #10 {JSONException -> 0x0300, blocks: (B:55:0x00a0, B:56:0x00c3, B:58:0x00ca, B:60:0x00d6, B:62:0x00e3, B:63:0x00dc, B:66:0x00e6, B:68:0x00ef, B:70:0x0109, B:72:0x011a, B:73:0x0120, B:75:0x0124, B:77:0x0136, B:79:0x0154, B:80:0x016d, B:85:0x0194, B:91:0x0294, B:93:0x02a6, B:95:0x01b7, B:97:0x01ce, B:102:0x01e3, B:105:0x0204, B:107:0x0218, B:109:0x021e, B:110:0x023b, B:111:0x0240, B:112:0x0241, B:113:0x0246, B:118:0x0252, B:120:0x0261, B:122:0x026f, B:123:0x0287, B:124:0x028c, B:125:0x028d, B:126:0x0292, B:128:0x02b3, B:129:0x02b8, B:131:0x02ba, B:132:0x02c1, B:133:0x02c2, B:134:0x02c7, B:138:0x02cb, B:139:0x02d2, B:141:0x02d3, B:142:0x02da, B:144:0x02dc, B:145:0x02e3, B:146:0x02e4, B:147:0x02eb, B:149:0x02ed, B:150:0x02f4, B:154:0x02f8, B:155:0x02ff), top: B:54:0x00a0, outer: #5, inners: #2, #4, #9 }] */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(android.os.Parcel r27, int r28) {
        /*
            Method dump skipped, instructions count: 953
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.writeToParcel(android.os.Parcel, int):void");
    }
}
