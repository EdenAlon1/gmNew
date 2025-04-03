package com.google.android.gms.people.cpg.callingcard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhil;
import defpackage.emxb;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CreateCallingCardResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreateCallingCardResponse> CREATOR = new dhil();
    public final CallingCardRequestStatus a;
    public final CallingCardIdentifier b;

    public CreateCallingCardResponse(CallingCardRequestStatus callingCardRequestStatus, CallingCardIdentifier callingCardIdentifier) {
        this.a = callingCardRequestStatus;
        this.b = callingCardIdentifier;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreateCallingCardResponse) {
            CreateCallingCardResponse createCallingCardResponse = (CreateCallingCardResponse) obj;
            if (emxb.a(this.a, createCallingCardResponse.a) && emxb.a(this.b, createCallingCardResponse.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CallingCardRequestStatus callingCardRequestStatus = this.a;
        int i2 = i | 1;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, callingCardRequestStatus, i2, false);
        dfxk.k(parcel, 2, this.b, i2, false);
        dfxk.c(parcel, a);
    }
}
