package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dgkv;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class BrowserRegisterRequestParams extends BrowserRequestParams {
    public static final Parcelable.Creator<BrowserRegisterRequestParams> CREATOR = new dgkv();
    public final RegisterRequestParams a;
    public final Uri b;

    public BrowserRegisterRequestParams(RegisterRequestParams registerRequestParams, Uri uri) {
        dfwv.n(registerRequestParams);
        this.a = registerRequestParams;
        dfwv.n(uri);
        dfwv.b(uri.getScheme() != null, "origin scheme must be non-empty");
        dfwv.b(uri.getAuthority() != null, "origin authority must be non-empty");
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowserRegisterRequestParams)) {
            return false;
        }
        BrowserRegisterRequestParams browserRegisterRequestParams = (BrowserRegisterRequestParams) obj;
        return dfwq.a(this.a, browserRegisterRequestParams.a) && dfwq.a(this.b, browserRegisterRequestParams.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        RegisterRequestParams registerRequestParams = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 2, registerRequestParams, i, false);
        dfxk.k(parcel, 3, this.b, i, false);
        dfxk.c(parcel, a);
    }
}
