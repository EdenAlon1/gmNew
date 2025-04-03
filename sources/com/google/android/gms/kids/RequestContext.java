package com.google.android.gms.kids;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dgsr;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RequestContext extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RequestContext> CREATOR = new dgsr();
    public String a;
    public int b;
    public Uri[] c;

    public RequestContext() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RequestContext) {
            RequestContext requestContext = (RequestContext) obj;
            if (dfwq.a(this.a, requestContext.a) && dfwq.a(Integer.valueOf(this.b), Integer.valueOf(requestContext.b)) && Arrays.equals(this.c, requestContext.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(Arrays.hashCode(this.c))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, this.a, false);
        dfxk.i(parcel, 2, this.b);
        dfxk.E(parcel, 3, this.c, i);
        dfxk.c(parcel, a);
    }

    public RequestContext(String str, int i, Uri[] uriArr) {
        this.a = str;
        this.b = i;
        this.c = uriArr;
    }
}
