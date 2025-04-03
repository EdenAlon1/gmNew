package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dfyk;
import defpackage.dgjb;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class BrowserPublicKeyCredentialRequestOptions extends BrowserRequestOptions {
    public static final Parcelable.Creator<BrowserPublicKeyCredentialRequestOptions> CREATOR = new dgjb();
    public final PublicKeyCredentialRequestOptions a;
    public final Uri b;
    public final byte[] c;

    public BrowserPublicKeyCredentialRequestOptions(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, Uri uri, byte[] bArr) {
        dfwv.n(publicKeyCredentialRequestOptions);
        this.a = publicKeyCredentialRequestOptions;
        dfwv.n(uri);
        dfwv.b(uri.getScheme() != null, "origin scheme must be non-empty");
        dfwv.b(uri.getAuthority() != null, "origin authority must be non-empty");
        this.b = uri;
        dfwv.b(bArr == null || bArr.length == 32, "clientDataHash must be 32 bytes long");
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialRequestOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = (BrowserPublicKeyCredentialRequestOptions) obj;
        return dfwq.a(this.a, browserPublicKeyCredentialRequestOptions.a) && dfwq.a(this.b, browserPublicKeyCredentialRequestOptions.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        byte[] bArr = this.c;
        Uri uri = this.b;
        return "BrowserPublicKeyCredentialRequestOptions{\n publicKeyCredentialRequestOptions=" + this.a.toString() + ", \n origin=" + String.valueOf(uri) + ", \n clientDataHash=" + dfyk.c(bArr) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 2, publicKeyCredentialRequestOptions, i, false);
        dfxk.k(parcel, 3, this.b, i, false);
        dfxk.f(parcel, 4, this.c, false);
        dfxk.c(parcel, a);
    }
}
