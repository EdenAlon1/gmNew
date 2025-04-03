package com.google.android.gms.kids;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dgss;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class TrustedContactsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TrustedContactsRequest> CREATOR = new dgss();
    public IndividualContactRequest[] a;
    public RequestContext b;

    public TrustedContactsRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TrustedContactsRequest) {
            TrustedContactsRequest trustedContactsRequest = (TrustedContactsRequest) obj;
            if (Arrays.equals(this.a, trustedContactsRequest.a) && dfwq.a(this.b, trustedContactsRequest.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.E(parcel, 1, this.a, i);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.c(parcel, a);
    }

    public TrustedContactsRequest(IndividualContactRequest[] individualContactRequestArr, RequestContext requestContext) {
        this.a = individualContactRequestArr;
        this.b = requestContext;
    }
}
