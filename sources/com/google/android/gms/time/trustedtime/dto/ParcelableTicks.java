package com.google.android.gms.time.trustedtime.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhsr;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ParcelableTicks extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ParcelableTicks> CREATOR = new dhsr();
    public final int a;
    public final long b;

    public ParcelableTicks(int i, long j) {
        if (i != 1) {
            throw new IllegalArgumentException("Invalid ticker type. Refer to @TickerType to see all the valid cases.");
        }
        this.a = 1;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParcelableTicks)) {
            return false;
        }
        ParcelableTicks parcelableTicks = (ParcelableTicks) obj;
        int i = parcelableTicks.a;
        return this.b == parcelableTicks.b;
    }

    public final int hashCode() {
        return Objects.hash(1, Long.valueOf(this.b));
    }

    public final String toString() {
        return "ParcelableTicks{tickerType=1, value=" + this.b + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, 1);
        dfxk.j(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }
}
