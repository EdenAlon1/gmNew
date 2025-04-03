package com.google.android.gms.time.trustedtime.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.time.dto.ParcelableDuration;
import defpackage.dfxk;
import defpackage.dhsq;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ParcelableClockAdjustmentPeriod extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ParcelableClockAdjustmentPeriod> CREATOR = new dhsq();
    public final ParcelableDuration a;
    public final ParcelableDuration b;
    public final ParcelableDuration c;
    public final ParcelableDuration d;

    public ParcelableClockAdjustmentPeriod(ParcelableDuration parcelableDuration, ParcelableDuration parcelableDuration2, ParcelableDuration parcelableDuration3, ParcelableDuration parcelableDuration4) {
        if (parcelableDuration3.a == 0 && parcelableDuration3.b == 0) {
            throw new IllegalArgumentException("deltaClock == 0");
        }
        if (parcelableDuration4.a < 0) {
            throw new IllegalArgumentException("deltaClockError must not be negative");
        }
        parcelableDuration.getClass();
        this.a = parcelableDuration;
        parcelableDuration2.getClass();
        this.b = parcelableDuration2;
        parcelableDuration3.getClass();
        this.c = parcelableDuration3;
        parcelableDuration4.getClass();
        this.d = parcelableDuration4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ParcelableClockAdjustmentPeriod parcelableClockAdjustmentPeriod = (ParcelableClockAdjustmentPeriod) obj;
            if (this.a.equals(parcelableClockAdjustmentPeriod.a) && this.b.equals(parcelableClockAdjustmentPeriod.b) && this.c.equals(parcelableClockAdjustmentPeriod.c) && this.d.equals(parcelableClockAdjustmentPeriod.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        ParcelableDuration parcelableDuration = this.d;
        ParcelableDuration parcelableDuration2 = this.c;
        ParcelableDuration parcelableDuration3 = this.b;
        return "ParcelableClockAdjustmentPeriod{beginRelativePhysical=" + this.a.toString() + ", durationPhysical=" + parcelableDuration3.toString() + ", deltaClock=" + parcelableDuration2.toString() + ", deltaClockError=" + parcelableDuration.toString() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelableDuration parcelableDuration = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, parcelableDuration, i, false);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.k(parcel, 3, this.c, i, false);
        dfxk.k(parcel, 4, this.d, i, false);
        dfxk.c(parcel, a);
    }
}
