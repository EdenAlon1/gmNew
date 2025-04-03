package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dfyk;
import defpackage.dgja;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class BrowserPublicKeyCredentialCreationOptions extends BrowserRequestOptions {
    public static final Parcelable.Creator<BrowserPublicKeyCredentialCreationOptions> CREATOR = new dgja();
    public final PublicKeyCredentialCreationOptions a;
    public final Uri b;
    public final byte[] c;
    public final Bundle d;

    public BrowserPublicKeyCredentialCreationOptions(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, Uri uri, byte[] bArr, Bundle bundle) {
        dfwv.n(publicKeyCredentialCreationOptions);
        this.a = publicKeyCredentialCreationOptions;
        dfwv.n(uri);
        dfwv.b(uri.getScheme() != null, "origin scheme must be non-empty");
        dfwv.b(uri.getAuthority() != null, "origin authority must be non-empty");
        this.b = uri;
        dfwv.b(bArr == null || bArr.length == 32, "clientDataHash must be 32 bytes long");
        this.c = bArr;
        this.d = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialCreationOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions = (BrowserPublicKeyCredentialCreationOptions) obj;
        return dfwq.a(this.a, browserPublicKeyCredentialCreationOptions.a) && dfwq.a(this.b, browserPublicKeyCredentialCreationOptions.b) && dfwq.a(this.d, browserPublicKeyCredentialCreationOptions.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d});
    }

    public final String toString() {
        Bundle bundle = this.d;
        byte[] bArr = this.c;
        Uri uri = this.b;
        return "BrowserPublicKeyCredentialCreationOptions{\n publicKeyCredentialCreationOptions=" + this.a.toString() + ", \n origin=" + String.valueOf(uri) + ", \n clientDataHash=" + dfyk.c(bArr) + ", \n chromeParameters=" + String.valueOf(bundle) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 2, publicKeyCredentialCreationOptions, i, false);
        dfxk.k(parcel, 3, this.b, i, false);
        dfxk.f(parcel, 4, this.c, false);
        dfxk.p(parcel, 5, this.d);
        dfxk.c(parcel, a);
    }
}
