package com.google.android.gms.people.cpg.callingcard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhij;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CallingCardRequestStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CallingCardRequestStatus> CREATOR = new dhij();
    public final int a;

    public CallingCardRequestStatus(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CallingCardRequestStatus) && this.a == ((CallingCardRequestStatus) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, i2);
        dfxk.c(parcel, a);
    }
}
