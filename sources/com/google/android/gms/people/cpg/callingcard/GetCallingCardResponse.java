package com.google.android.gms.people.cpg.callingcard;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhim;
import defpackage.emxb;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GetCallingCardResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetCallingCardResponse> CREATOR = new dhim();
    public final CallingCardRequestStatus a;
    public final int b;
    public final Uri c;
    public final String d;
    public final CallingCardMetadata e;

    public GetCallingCardResponse(CallingCardRequestStatus callingCardRequestStatus, int i, Uri uri, String str, CallingCardMetadata callingCardMetadata) {
        this.a = callingCardRequestStatus;
        this.b = i;
        this.c = uri;
        this.d = str;
        this.e = callingCardMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetCallingCardResponse) {
            GetCallingCardResponse getCallingCardResponse = (GetCallingCardResponse) obj;
            if (emxb.a(this.a, getCallingCardResponse.a) && this.b == getCallingCardResponse.b && emxb.a(this.c, getCallingCardResponse.c) && emxb.a(this.d, getCallingCardResponse.d) && emxb.a(this.e, getCallingCardResponse.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CallingCardRequestStatus callingCardRequestStatus = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, callingCardRequestStatus, i, false);
        dfxk.i(parcel, 2, this.b);
        dfxk.k(parcel, 3, this.c, i, false);
        dfxk.m(parcel, 4, this.d, false);
        dfxk.k(parcel, 5, this.e, i, false);
        dfxk.c(parcel, a);
    }
}
