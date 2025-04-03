package com.google.android.gms.duokit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dgez;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GetApiAvailabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetApiAvailabilityResponse> CREATOR = new dgez();
    public int a;

    public GetApiAvailabilityResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetApiAvailabilityResponse) {
            return dfwq.a(Integer.valueOf(this.a), Integer.valueOf(((GetApiAvailabilityResponse) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.c(parcel, a);
    }

    public GetApiAvailabilityResponse(int i) {
        this.a = i;
    }
}
