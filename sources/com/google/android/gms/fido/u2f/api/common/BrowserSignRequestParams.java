package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dgkw;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class BrowserSignRequestParams extends BrowserRequestParams {
    public static final Parcelable.Creator<BrowserSignRequestParams> CREATOR = new dgkw();
    public final SignRequestParams a;
    public final Uri b;

    public BrowserSignRequestParams(SignRequestParams signRequestParams, Uri uri) {
        dfwv.n(signRequestParams);
        this.a = signRequestParams;
        dfwv.n(uri);
        dfwv.b(uri.getScheme() != null, "origin scheme must be non-empty");
        dfwv.b(uri.getAuthority() != null, "origin authority must be non-empty");
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowserSignRequestParams)) {
            return false;
        }
        BrowserSignRequestParams browserSignRequestParams = (BrowserSignRequestParams) obj;
        return dfwq.a(this.a, browserSignRequestParams.a) && dfwq.a(this.b, browserSignRequestParams.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SignRequestParams signRequestParams = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 2, signRequestParams, i, false);
        dfxk.k(parcel, 3, this.b, i, false);
        dfxk.c(parcel, a);
    }
}
